/**
 * Copyright (c) 2018 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
package org.yakindu.sct.simulation.core.sexec.interpreter;

import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.yakindu.base.expressions.interpreter.IOperationMockup;
import org.yakindu.base.types.Operation;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.inject.Singleton;

/**
 * 
 * @author jonathan thoene - Initial contribution and API
 * 
 */
@Singleton
public class DefaultOperationMockup implements IOperationMockup {
	
	protected MockReturnMap mockReturn = new MockReturnMap();
	protected Multimap<String, List<Object>> verifyCalls = ArrayListMultimap.create();
	
	@Override
	public boolean canExecute(Operation definition, Object[] parameter) {
		return true;
	}

	@Override
	public Object execute(Operation definition, Object[] parameter) {
		verifyCalls.put(definition.getName(), asList(parameter));
		return mockReturn.get(definition.getName(), asList(parameter));
	}

	public boolean wasCalled(String operation, List<Object> parameters, int times) {
		Collection<List<Object>> calledParameters = verifyCalls.get(operation);
		if (calledParameters != null && !calledParameters.isEmpty()) {
			if (!calledParameters.contains(parameters) && !parameters.isEmpty()) {
				return false;
			} 
		} else {
			return false;
		}
		if (parameters.isEmpty()) {
			if (calledParameters.size()< times) {
				return false;
			}
		} else {
			if (getCallCoutForParams(calledParameters, parameters) < times) {
				return false;
			}
		}
		return true;
	}
	
	public void mockReturnValue(String operation, List<Object> params, Object value) {
		mockReturn.put(operation, params, value);
	}
	
	public void reset() {
		mockReturn = new MockReturnMap();
		verifyCalls = ArrayListMultimap.create();
	}
	
	protected int getCallCoutForParams(Collection<List<Object>> calledParameters, List<Object> parameters) {
		int times = 0;
		for (List<Object> params : calledParameters) {
			if (params.equals(parameters)) {
				times++;
			}
		}
		return times;
	}
	
	protected static class MockReturnMap {
		Map<String, Map<List<Object>, Object>> mockReturn;

		public MockReturnMap() {
			mockReturn = new HashMap<>();
		}

		public void put(String name, List<Object> args, Object value) {
			if (!mockReturn.containsKey(name) || args.isEmpty()) {
				Map<List<Object>, Object> map = new HashMap<>();
				map.put(args, value);
				mockReturn.put(name, map);
			} else {
				Map<List<Object>, Object> map = mockReturn.get(name);
				map.put(args, value);
			}
		}

		public Object get(String name, List<Object> args) {
			if (mockReturn.containsKey(name)) {
				Map<List<Object>, Object> resultMap = mockReturn.get(name);
				if (resultMap.containsKey(args)) {
					return resultMap.get(args);
				} else {
					return resultMap.get(Collections.emptyList());
				}
			} else {
				return null;
			}
		}

	}
}