package sjadhav6.state;

import java.util.*;

import sjadhav6.datastore.DataStore;
import sjadhav6.main.Constants;

public class CheckBalance extends State {

	public CheckBalance(DataStore data) {
		super(data);

	}
	private final int ID=Constants.CHECKBALANCE;
	public int getID()
	{
		return ID;
	}
	public void aboveMinBalance(){}

	public void belowMinBalancePenalty() {
		outp.applyPenalty();
		
	}

	public void belowMinBalance(){}
@Override public void open(){}
@Override public void correctLogin(){}
@Override public void incorrectLogin(){}
@Override public void correctPINAboveMinBalance(){}
@Override public void correctPINBelowMinBalance(){}

@Override public void logout(){}
@Override public void balance(){}
@Override public void deposit(){}
@Override public void correctLock(){}
@Override public void incorrectLock(){}
@Override public void correctUnlock(){}
@Override public void incorrectUnlock(){}
@Override public void withdraw(){}
@Override public void suspend(){}
@Override public void activate(){}
@Override public void noFunds(){}
@Override public void close(){}
@Override
public void incorrectPIN() {}

}