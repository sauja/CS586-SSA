package sjadhav6.state;

import sjadhav6.datastore.DataStore;
import sjadhav6.main.Constants;

public class Overdrawn extends State {
	public Overdrawn(DataStore data) {
		super(data);

	}
	private final int ID=Constants.OVERDRAWN;
	public int getID()
	{
		return ID;
   	}
	public void withdraw() {
		outp.displayMinBalanceMsg();
		
	}

	public void balance() {
		outp.displayBalance();
		
	}

	public void correctLock(){}

	public void incorrectLock() {
		outp.displayIncorrectPINMsg();
		
	}

	public void logout(){}

	public void deposit() {
		outp.makeDeposit();
		
	}
@Override public void open(){}
@Override public void correctLogin(){}
@Override public void incorrectLogin(){}
@Override public void correctPINAboveMinBalance(){}
@Override public void correctPINBelowMinBalance(){}
@Override public void aboveMinBalance(){}
@Override public void belowMinBalance(){}
@Override public void correctUnlock(){}
@Override public void incorrectUnlock(){}
@Override public void belowMinBalancePenalty(){}
@Override public void suspend(){}
@Override public void activate(){}
@Override public void noFunds(){}
@Override public void close(){}
@Override
public void incorrectPIN() {}

}