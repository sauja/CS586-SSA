package sjadhav6.state;

import sjadhav6.datastore.DataStore;
import sjadhav6.main.Constants;

public class Start extends State {
	public Start(DataStore data) {
		super(data);

	}
	private final int ID=Constants.START;
	public int getID()
	{
		return ID;
	}


	public void open() 
	{
		outp.initiateAccount();
	}
@Override public void correctLogin(){}
@Override public void incorrectLogin(){}
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


@Override
public void incorrectPIN() {}






}