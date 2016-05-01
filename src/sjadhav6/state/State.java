package sjadhav6.state;

import sjadhav6.datastore.DataStore;
import sjadhav6.outputProcessor.OutputProcessor;

public abstract class State 
{
	public OutputProcessor outp;

	public State(DataStore data) 
	{
		this.outp=new OutputProcessor(data);
	}

	public abstract int getID();
	public abstract void open();
	public abstract void correctLogin();
	public abstract void incorrectLogin();
	public abstract void correctPINAboveMinBalance();
	public abstract void correctPINBelowMinBalance();
	public abstract void incorrectPIN();
	public abstract void logout();
	public abstract void balance();
	public abstract void deposit();
	public abstract void aboveMinBalance();
	public abstract void belowMinBalance();
	public abstract void correctLock();
	public abstract void incorrectLock();
	public abstract void correctUnlock();
	public abstract void incorrectUnlock();
	public abstract void withdraw();
	public abstract void belowMinBalancePenalty();
	public abstract void suspend();
	public abstract void activate();
	public abstract void noFunds();
	public abstract void close();
}