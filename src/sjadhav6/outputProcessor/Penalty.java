package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;

public abstract class Penalty 
{
	private DataStore data;
	public DataStore getData() {
		return data;
	}
	public Penalty(DataStore data) {
		this.data = data;
	}
	public abstract void applyPenalty();

}