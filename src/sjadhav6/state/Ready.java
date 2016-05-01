package sjadhav6.state;

import java.util.*;

import sjadhav6.datastore.DataStore;
import sjadhav6.main.Constants;

public class Ready extends State {

	public Ready(DataStore data) {
		super(data);
		// TODO Auto-generated constructor stub
	}
	private final int ID=Constants.READY;
	public int getID()
	{
		return ID;
	}
	public void noFunds() {
		outp.displayMinBalanceMsg();
		return;
	}

	public void incorrectLock() {
		outp.displayIncorrectPINMsg();
		return;
	}

	public void deposit() {
		outp.makeDeposit();
		return;
	}

	public void balance() {
		outp.displayBalance();
		return;
	}

	public void suspend() {
		// TODO implement here
		return;
	}

	public void correctLock() {
		// TODO implement here
		return;
	}

	public void withdraw() {
		outp.makeWithdraw();
		return;
	}

	public void logout() {
		// TODO implement here
		return;
	}
@Override
public void open() {
		// TODO Auto-generated method stub
		
	}
@Override
public void correctLogin() {
		// TODO Auto-generated method stub
		
	}
@Override
public void incorrectLogin() {
		// TODO Auto-generated method stub
		
	}
@Override
public void correctPINAboveMinBalance() {
		// TODO Auto-generated method stub
		
	}
@Override
public void correctPINBelowMinBalance() {
		// TODO Auto-generated method stub
		
	}

@Override
public void aboveMinBalance() {
		// TODO Auto-generated method stub
		
	}
@Override
public void belowMinBalance() {
		// TODO Auto-generated method stub
		
	}
@Override
public void correctUnlock() {
		// TODO Auto-generated method stub
		
	}
@Override
public void incorrectUnlock() {
		// TODO Auto-generated method stub
		
	}
@Override
public void belowMinBalancePenalty() {
		// TODO Auto-generated method stub
		
	}
@Override
public void activate() {
		// TODO Auto-generated method stub
		
	}
@Override
public void close() {
		// TODO Auto-generated method stub
		
	}
@Override
public void incorrectPIN() {
	// TODO Auto-generated method stub
	
}

}