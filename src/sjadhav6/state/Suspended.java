package sjadhav6.state;

import java.util.*;

public class Suspended extends State {

	private final int ID=7;

	public int getID()
	{
		return ID;
	}
	public void balance() {
		outp.displayBalance();
		return;
	}

	public void close() {
		// TODO implement here
		return;
	}

	public void activate() {
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
public void incorrectPIN(int max) {
		// TODO Auto-generated method stub
		
	}
@Override
public void logout() {
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
public void incorrectLock() {
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
public void noFunds() {
		// TODO Auto-generated method stub
		
	}

}