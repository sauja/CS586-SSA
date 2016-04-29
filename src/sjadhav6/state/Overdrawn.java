package sjadhav6.state;


public class Overdrawn extends State {
	private final int ID=6;
	public int getID()
	{
		return ID;
   	}
	public void withdraw() {
		outp.displayMinBalanceMsg();
		return;
	}

	public void balance() {
		outp.displayBalance();
		return;
	}

	public void correctLock() {
		// TODO implement here
		return;
	}

	public void incorrectLock() {
		outp.displayIncorrectPINMsg();
		return;
	}

	public void logout() {
		// TODO implement here
		return;
	}

	public void deposit() {
		outp.makeDeposit();
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

}