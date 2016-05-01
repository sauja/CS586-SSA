package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;

public abstract class Balance 
{
	private DataStore data;
	public DataStore getData() {
		return data;
	}
	public Balance(DataStore data) {
		this.data = data;
	}
	public abstract void displayBalance();
}