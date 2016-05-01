package sjadhav6.state;

import sjadhav6.datastore.DataStore;
import sjadhav6.main.Constants;

public class Suspended extends State {

	public Suspended(DataStore data) {
		super(data);

	}
	private final int ID=Constants.SUSPENDED;

	public int getID()
	{
		return ID;
	}
	public void balance() {
		outp.displayBalance();

	}
	public void close(){}
	public void activate(){}

	@Override public void open(){}
	@Override public void correctLogin(){}
	@Override public void incorrectLogin(){}
	@Override public void correctPINAboveMinBalance(){}
	@Override public void correctPINBelowMinBalance(){}
	@Override public void logout(){}
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
	@Override public void noFunds(){}
	@Override public void incorrectPIN() {}

}