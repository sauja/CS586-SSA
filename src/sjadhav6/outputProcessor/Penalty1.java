package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore1;
import sjadhav6.main.Constants;

public class Penalty1 extends Penalty {

	public Penalty1(DataStore data) {
		super(data);
	}
	public DataStore data1;

	public void applyPenalty() {
		DataStore1 data1=(DataStore1) getData();
		data1.setBalance(data1.getBalance()-Constants.ACCOUNT1_PENALTY);
		System.out.println("Penalty of $"+Constants.ACCOUNT1_PENALTY+" applied.");
	}

}