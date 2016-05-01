package sjadhav6.state;

import java.util.*;

import sjadhav6.datastore.DataStore;
import sjadhav6.main.Constants;

public class Locked extends State {
	public Locked(DataStore data) {
		super(data);
		// TODO Auto-generated constructor stub
	}
	private final int ID=Constants.LOCKED;
	
	public int getID()
	{
		return ID;
	}
	public void correctUnlock() {
		// TODO implement here
		return;
	}

	public void incorrectUnLock() {
		outp.displayIncorrectPINMsg();
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
public void logout() {
		// TODO Auto-generated method stub
		
	}
@Override
public void balance() {
		// TODO Auto-generated method stub
		
	}
@Override
public void deposit() {
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
public void correctLock() {
		// TODO Auto-generated method stub
		
	}
@Override
public void incorrectUnlock() {
		// TODO Auto-generated method stub
		
	}
@Override
public void withdraw() {
		// TODO Auto-generated method stub
		
	}
@Override
public void belowMinBalancePenalty() {
		// TODO Auto-generated method stub
		
	}
@Override
public void suspend() {
		// TODO Auto-generated method stub
		
	}
@Override
public void activate() {
		// TODO Auto-generated method stub
		
	}
@Override
public void noFunds() {
		// TODO Auto-generated method stub
		
	}
@Override
public void close() {
		// TODO Auto-generated method stub
		
	}
@Override
public void incorrectLock() {
		// TODO Auto-generated method stub
		
	}
@Override
public void incorrectPIN() {
	// TODO Auto-generated method stub
	
}

}