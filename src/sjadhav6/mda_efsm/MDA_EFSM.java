package sjadhav6.mda_efsm;

import sjadhav6.main.Constants;
import sjadhav6.state.*;


public class MDA_EFSM 
{
	public State currState;
	public State stateList[];
	public int attempts;
	static int ID;
	
	
	public MDA_EFSM() 
	{
		stateList=new State[Constants.TOTALSTATES];
		stateList[0]=new Start();
		stateList[1]=new Idle();
		stateList[2]=new CheckPin();
		stateList[3]=new Ready();
		stateList[4]=new CheckBalance();
		stateList[5]=new Overdrawn();
		stateList[6]=new Suspended();
		
		currState=stateList[0];
	}

	public void open() {
		currState.open();
		currState.getID();
		if(currState.getID()==Constants.START)
		{
			currState=stateList[1];
		}
	}

	public void correctLogin() {
		// TODO implement here
		return;
	}

	public void incorrectLogin() {
		// TODO implement here
		return;
	}

	public void correctPINAboveMinBalance() {
		// TODO implement here
		return;
	}

	public void correctPINBelowMinBalance() {
		// TODO implement here
		return;
	}

	public void incorrectPIN(int max) {
		// TODO implement here
		return;
	}

	public void logout() {
		// TODO implement here
		return;
	}

	public void balance() {
		// TODO implement here
		return;
	}

	public void deposit() {
		// TODO implement here
		return;
	}

	public void aboveMinBalance() {
		// TODO implement here
		return;
	}

	public void belowMinBalance() {
		// TODO implement here
		return;
	}

	public void correctLock() {
		// TODO implement here
		return;
	}

	public void incorrectUnlock() {
		// TODO implement here
		return;
	}

	public void withdraw() {
		// TODO implement here
		return;
	}

	public void belowMinBalancePenalty() {
		// TODO implement here
		return;
	}

	public void suspend() {
		// TODO implement here
		return;
	}

	public void activate() {
		// TODO implement here
		return;
	}

	public void noFunds() {
		// TODO implement here
		return;
	}

	public void close() {
		// TODO implement here
		return;
	}

}