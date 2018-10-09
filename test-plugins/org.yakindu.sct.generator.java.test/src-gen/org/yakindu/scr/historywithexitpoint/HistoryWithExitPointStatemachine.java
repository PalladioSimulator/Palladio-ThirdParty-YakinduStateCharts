package org.yakindu.scr.historywithexitpoint;

public class HistoryWithExitPointStatemachine implements IHistoryWithExitPointStatemachine {

	protected class SCInterfaceImpl implements SCInterface {
	
		private boolean push;
		
		public void raisePush() {
			push = true;
		}
		
		private boolean back;
		
		public void raiseBack() {
			back = true;
		}
		
		private boolean next;
		
		public void raiseNext() {
			next = true;
		}
		
		protected void clearEvents() {
			push = false;
			back = false;
			next = false;
		}
	}
	
	protected SCInterfaceImpl sCInterface;
	
	private boolean initialized = false;
	
	public enum State {
		mr_A,
		mr_A_r_X1,
		mr_A_r_X2,
		mr_B,
		$NullState$
	};
	
	private State[] historyVector = new State[1];
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	public HistoryWithExitPointStatemachine() {
		sCInterface = new SCInterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NullState$;
		}
		for (int i = 0; i < 1; i++) {
			historyVector[i] = State.$NullState$;
		}
		clearEvents();
		clearOutEvents();
	}
	
	public void enter() {
		if (!initialized) {
			throw new IllegalStateException(
					"The state machine needs to be initialized first by calling the init() function.");
		}
		enterSequence_mr_default();
	}
	
	public void exit() {
		exitSequence_mr();
	}
	
	/**
	 * @see IStatemachine#isActive()
	 */
	public boolean isActive() {
		return stateVector[0] != State.$NullState$;
	}
	
	/** 
	* Always returns 'false' since this state machine can never become final.
	*
	* @see IStatemachine#isFinal()
	*/
	public boolean isFinal() {
		return false;
	}
	/**
	* This method resets the incoming events (time events included).
	*/
	protected void clearEvents() {
		sCInterface.clearEvents();
	}
	
	/**
	* This method resets the outgoing events.
	*/
	protected void clearOutEvents() {
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case mr_A:
			return stateVector[0].ordinal() >= State.
					mr_A.ordinal()&& stateVector[0].ordinal() <= State.mr_A_r_X2.ordinal();
		case mr_A_r_X1:
			return stateVector[0] == State.mr_A_r_X1;
		case mr_A_r_X2:
			return stateVector[0] == State.mr_A_r_X2;
		case mr_B:
			return stateVector[0] == State.mr_B;
		default:
			return false;
		}
	}
	
	public SCInterface getSCInterface() {
		return sCInterface;
	}
	
	public void raisePush() {
		sCInterface.raisePush();
	}
	
	public void raiseBack() {
		sCInterface.raiseBack();
	}
	
	public void raiseNext() {
		sCInterface.raiseNext();
	}
	
	private void effect_mr_A_tr0() {
		exitSequence_mr_A();
		enterSequence_mr_B_default();
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_mr_A_default() {
		enterSequence_mr_A_r_default();
	}
	
	/* 'default' enter sequence for state X1 */
	private void enterSequence_mr_A_r_X1_default() {
		nextStateIndex = 0;
		stateVector[0] = State.mr_A_r_X1;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state X2 */
	private void enterSequence_mr_A_r_X2_default() {
		nextStateIndex = 0;
		stateVector[0] = State.mr_A_r_X2;
		
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_mr_B_default() {
		nextStateIndex = 0;
		stateVector[0] = State.mr_B;
	}
	
	/* 'default' enter sequence for region mr */
	private void enterSequence_mr_default() {
		react_mr__entry_Default();
	}
	
	/* 'default' enter sequence for region r */
	private void enterSequence_mr_A_r_default() {
		react_mr_A_r__entry_Default();
	}
	
	/* shallow enterSequence with history in child r */
	private void shallowEnterSequence_mr_A_r() {
		switch (historyVector[0]) {
		case mr_A_r_X1:
			enterSequence_mr_A_r_X1_default();
			break;
		case mr_A_r_X2:
			enterSequence_mr_A_r_X2_default();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_mr_A() {
		exitSequence_mr_A_r();
	}
	
	/* Default exit sequence for state X1 */
	private void exitSequence_mr_A_r_X1() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state X2 */
	private void exitSequence_mr_A_r_X2() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_mr_B() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for region mr */
	private void exitSequence_mr() {
		switch (stateVector[0]) {
		case mr_A_r_X1:
			exitSequence_mr_A_r_X1();
			break;
		case mr_A_r_X2:
			exitSequence_mr_A_r_X2();
			break;
		case mr_B:
			exitSequence_mr_B();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r */
	private void exitSequence_mr_A_r() {
		switch (stateVector[0]) {
		case mr_A_r_X1:
			exitSequence_mr_A_r_X1();
			break;
		case mr_A_r_X2:
			exitSequence_mr_A_r_X2();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_mr__entry_Default() {
		enterSequence_mr_A_default();
	}
	
	/* Default react sequence for shallow history entry  */
	private void react_mr_A_r__entry_Default() {
		/* Enter the region with shallow history */
		if (historyVector[0] != State.$NullState$) {
			shallowEnterSequence_mr_A_r();
		} else {
			enterSequence_mr_A_r_X1_default();
		}
	}
	
	/* The reactions of exit exit_to_B. */
	private void react_mr_A_r_exit_to_B() {
		effect_mr_A_tr0();
	}
	
	private boolean react(boolean try_transition) {
		return false;
	}
	
	private boolean mr_A_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react(try_transition)==false) {
				did_transition = false;;
			}
		}
		if (did_transition==false) {
		}
		return did_transition;
	}
	
	private boolean mr_A_r_X1_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (mr_A_react(try_transition)==false) {
				if (sCInterface.next) {
					exitSequence_mr_A_r_X1();
					enterSequence_mr_A_r_X2_default();
				} else {
					if (sCInterface.push) {
						exitSequence_mr_A_r_X1();
						react_mr_A_r_exit_to_B();
					} else {
						did_transition = false;;
					}
				}
			}
		}
		if (did_transition==false) {
		}
		return did_transition;
	}
	
	private boolean mr_A_r_X2_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (mr_A_react(try_transition)==false) {
				if (sCInterface.next) {
					exitSequence_mr_A_r_X2();
					enterSequence_mr_A_r_X1_default();
				} else {
					if (sCInterface.push) {
						exitSequence_mr_A_r_X2();
						react_mr_A_r_exit_to_B();
					} else {
						did_transition = false;;
					}
				}
			}
		}
		if (did_transition==false) {
		}
		return did_transition;
	}
	
	private boolean mr_B_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react(try_transition)==false) {
				if (sCInterface.back) {
					exitSequence_mr_B();
					enterSequence_mr_A_default();
				} else {
					did_transition = false;;
				}
			}
		}
		if (did_transition==false) {
		}
		return did_transition;
	}
	
	public void runCycle() {
		if (!initialized)
			throw new IllegalStateException(
					"The state machine needs to be initialized first by calling the init() function.");
		clearOutEvents();
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case mr_A_r_X1:
				mr_A_r_X1_react(true);
				break;
			case mr_A_r_X2:
				mr_A_r_X2_react(true);
				break;
			case mr_B:
				mr_B_react(true);
				break;
			default:
				// $NullState$
			}
		}
		clearEvents();
	}
}
