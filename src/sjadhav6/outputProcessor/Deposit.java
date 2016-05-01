package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;

public abstract class Deposit 
{
	private DataStore data;
	public Deposit(DataStore data) {
		this.data=data;
	}
	public DataStore getData() {
		return data;
	}
	public abstract void makeDeposit();
}