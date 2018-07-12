/**
 * Copyright (c) 2018 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	rbeckmann - initial API and implementation
 *
 */

package org.yakindu.sct.ui.editor.editor.themes;

public class ThemeProvider {
	protected static ThemeProvider instance;

	private IStatechartsTheme theme;

	private ThemeProvider() {

	}

	public static ThemeProvider getInstance() {
		if (instance == null) {
			instance = new ThemeProvider();
		}
		instance.setTheme(new FlatTheme());
		return instance;
	}

	public IStatechartsTheme getTheme() {
		return theme;
	}

	public void setTheme(IStatechartsTheme theme) {
		this.theme = theme;
	}
}
