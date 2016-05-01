package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore2;

public class Deposit2 extends Deposit {
	public Deposit2(DataStore data) {
		super(data);
	}
	public void makeDeposit() {
		DataStore2 data2=(DataStore2) getData();
		data2.setBalance(data2.getTempDeposit()+data2.getBalance());
	}

}