/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.sct.generator.c.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.yakindu.sct.generator.c.gtest.GTest;
import org.yakindu.sct.generator.c.gtest.GTestRunner;
import org.yakindu.sct.generator.c.gtest.GTestHelper;

@GTest(
	statechartBundle = "org.yakindu.sct.test.models",
	sourceFile = "gtests/ChildFirstLocalReactions/ChildFirstLocalReactionsTest.cc",
	program = "gtests/ChildFirstLocalReactions/ChildFirstLocalReactions",
	model = "testmodels/SCTUnit/executionorder/ChildFirstLocalReactions.sct",
	additionalFilesToCopy = {
		"libraryTarget/sc_timer_service.c",
		"libraryTarget/sc_timer_service.h"
	},
	additionalFilesToCompile = {
		"ChildFirstLocalReactions.c",
		"sc_timer_service.c"
	}
)
@RunWith(GTestRunner.class)
public class ChildFirstLocalReactionsTest {

	protected final GTestHelper helper = new GTestHelper(this);

	@Before
	public void setUp() {
		helper.generate();
		helper.compile();
	}
}
