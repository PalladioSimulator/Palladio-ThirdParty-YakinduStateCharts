/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.sct.generator.cpp.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.yakindu.sct.generator.c.gtest.GTest;
import org.yakindu.sct.generator.c.gtest.GTestRunner;
import org.yakindu.sct.generator.c.gtest.GTestHelper;
import org.yakindu.sct.generator.c.gtest.GTestHelper.Compiler;

@GTest(
	statechartBundle = "org.yakindu.sct.test.models",
	sourceFile = "gtests/EventDrivenTriggeredByEvent/EventDrivenTriggeredByEventTest.cc",
	program = "gtests/EventDrivenTriggeredByEvent/EventDrivenTriggeredByEvent",
	model = "testmodels/SCTUnit/eventdriven/EventDrivenTriggeredByEvent.sct",
	additionalFilesToCopy = {
		"libraryTarget/sc_runner_timed.h",
		"libraryTarget/sc_runner_timed.cpp"
	},
	additionalFilesToCompile = {
		"EventDrivenTriggeredByEvent.cpp",
		"sc_runner_timed.cpp"
	}
)
@RunWith(GTestRunner.class)
public class EventDrivenTriggeredByEventTest {
protected final GTestHelper helper = new GTestHelper(this, Compiler.GPLUSPLUS);

	@Before
	public void setUp() {
		helper.generate();
		helper.compile();
	}

}
