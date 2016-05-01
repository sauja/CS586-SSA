package sjadhav6.state;

import sjadhav6.datastore.DataStore;
import sjadhav6.main.Constants;

public class CheckPin extends State {

	public CheckPin(DataStore data) {
		super(data);
	}
	private final int ID=Constants.CHECKPIN;
	public int getID()
	{
		return ID;
	}
	public void correctPINAboveMinBalance() {
		outp.displayMenu();
	}
	public void correctPINBelowMinBalance() {
		outp.displayMenu();
	}

	public void logout(){}

	public void incorrectPIN() {
		outp.displayIncorrectPINMsg();	
		DataStore data=outp.getData();
		if(data.getAttempts()>=Constants.ACCOUNT1_MAXATTEMPT)
			outp.displayTooManyAttemptsMsg();
		else
			data.setAttempts(data.getAttempts()+1);	
	}
	
@Override public void open(){}
@Override public void correctLogin(){}
@Override public void incorrectLogin(){}
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


}