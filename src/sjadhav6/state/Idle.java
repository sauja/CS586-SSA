package sjadhav6.state;


import java.util.*;

import sjadhav6.datastore.DataStore;
import sjadhav6.main.Constants;

public class Idle extends State{

	public Idle(DataStore data) {
		super(data);

	}
	private final int ID=Constants.IDLE;
	public int getID()
	{
		return ID;
	}

	public void correctLogin() {
		outp.displayPINPrompt();
		return ;
	}

	public void incorrectLogin() {
		outp.diplayIncorrectIDMsg();
		return ;
	}
@Override public void open(){}
@Override public void correctPINAboveMinBalance(){}
@Override public void correctPINBelowMinBalance(){}
@Override public void logout(){}
@Override public void balance(){}
@Override public void deposit(){}
@Override public void aboveMinBalance(){}
@Override public void belowMinBalance(){}
@Override public void correctLock(){}
@Override public void incorrectLock(){}
@Override public void correctUnlock(){}
@Override public void incorrectUnlock(){}
@Override public void withdraw(){}
@Override public void belowMinBalancePenalty(){}
@Override public void suspend(){}
@Override public void activate(){}
@Override public void noFunds(){}
@Override public void close(){}
@Override public void incorrectPIN() {}

}