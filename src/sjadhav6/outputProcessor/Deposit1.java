package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore1;

public class Deposit1 extends Deposit {
	public Deposit1(DataStore data) {
		super(data);
	}

	

	public void makeDeposit() {
		DataStore1 data1=(DataStore1) getData();
		data1.setBalance(data1.getTempDeposit()+data1.getBalance());
		data1.setTempDeposit(0);
	}

}