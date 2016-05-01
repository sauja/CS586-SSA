package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;

public abstract class Withdraw 
{
	private DataStore data;
	public DataStore getData() {
		return data;
	}
	public Withdraw(DataStore data) {
		this.data = data;
	}
	public abstract void makeWithdraw();
}