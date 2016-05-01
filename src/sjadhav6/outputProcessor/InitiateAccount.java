package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;

public abstract class InitiateAccount 
{
	private DataStore data;
	public DataStore getData() {
		return data;
	}
	public InitiateAccount(DataStore data) {
		this.data = data;
	}
	public abstract void initiateAccount();
}