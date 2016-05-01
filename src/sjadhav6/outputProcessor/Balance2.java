package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore2;

public class Balance2 extends Balance {

	public Balance2(DataStore data) {
		super(data);
	}
	public void displayBalance() {
		DataStore2 data2=(DataStore2) getData();
		System.out.println("Balance for account1: $"+data2.getBalance());
	}
}