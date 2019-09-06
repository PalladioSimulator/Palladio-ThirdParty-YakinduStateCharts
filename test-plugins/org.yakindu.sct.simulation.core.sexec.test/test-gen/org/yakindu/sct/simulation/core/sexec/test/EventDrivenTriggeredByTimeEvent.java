/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.sct.simulation.core.sexec.test;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.yakindu.sct.model.sexec.ExecutionFlow;
import org.yakindu.sct.model.sexec.interpreter.test.util.AbstractExecutionFlowTest;
import org.yakindu.sct.model.sexec.interpreter.test.util.SExecInjectionProvider;
import org.yakindu.sct.test.models.SCTUnitTestModels;
import com.google.inject.Inject;
import static org.junit.Assert.*;

/**
 * Unit TestCase for EventDrivenTriggeredByTimeEvent
 */
@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SExecInjectionProvider.class)
public class EventDrivenTriggeredByTimeEvent extends AbstractExecutionFlowTest {
	
	@Before
	public void setup() throws Exception{
		ExecutionFlow flow = models.loadExecutionFlowFromResource("eventdriven/EventDrivenTriggeredByTimeEvent.sct");
		initInterpreter(flow);
	}
	@Test
	public void timeEventTriggersRunCycle() throws Exception {
		interpreter.enter();
		assertTrue(isStateActive("A"));
		assertTrue(getInteger("x") == 0l);
		timer.timeLeap(999);
		assertTrue(isStateActive("A"));
		assertTrue(getInteger("x") == 0l);
		timer.timeLeap(1);
		assertTrue(isStateActive("B"));
		assertTrue(getInteger("x") == 0l);
		assertTrue(getInteger("transition_count") == 1l);
		timer.timeLeap(1000);
		assertTrue(isStateActive("A"));
		assertTrue(getInteger("x") == 0l);
		assertTrue(getInteger("transition_count") == 2l);
		timer.timeLeap(999000);
		assertTrue(isStateActive("B"));
		assertTrue(getInteger("x") == 0l);
		assertTrue(getInteger("transition_count") == 1001l);
		timer.timeLeap(999000);
		assertTrue(isStateActive("A"));
		assertTrue(getInteger("x") == 0l);
		assertTrue(getInteger("transition_count") == 2000l);
		interpreter.exit();
	}
}
