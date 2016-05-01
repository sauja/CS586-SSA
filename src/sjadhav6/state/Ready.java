package sjadhav6.state;

import sjadhav6.datastore.DataStore;
import sjadhav6.main.Constants;

public class Ready extends State {

	public Ready(DataStore data) {
		super(data);

	}
	private final int ID=Constants.READY;
	public int getID()
	{
		return ID;
	}
	public void noFunds() {
		outp.displayMinBalanceMsg();

	}

	public void incorrectLock() {
		outp.displayIncorrectPINMsg();

	}

	public void deposit() {
		outp.makeDeposit();

	}

	public void balance() {
		outp.displayBalance();

	}

	public void suspend(){}

	public void correctLock(){}

	public void withdraw() {
		outp.makeWithdraw();

	}
	public void logout(){}

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
	@Override public void activate(){}
	@Override public void close(){}
	@Override public void incorrectPIN() {}

}