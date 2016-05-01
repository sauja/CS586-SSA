package sjadhav6.outputProcessor;

import java.util.*;

import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore1;

public class Balance1 extends Balance {

	public Balance1(DataStore data) {
		super(data);
	}

	public void displayBalance() {
		DataStore1 data1=(DataStore1) getData();
		System.out.println("Balance for account1: $"+data1.getBalance());
		return;
	}

}