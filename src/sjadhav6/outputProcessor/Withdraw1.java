package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore1;

public class Withdraw1 extends Withdraw {

	public Withdraw1(DataStore data) {
		super(data);
	}

	public void makeWithdraw() {
		DataStore1 data1=(DataStore1) getData();
		if(data1.getBalance()>500)
		{
			data1.setBalance(data1.getBalance()-data1.getTempWithdraw());
			data1.setTempWithdraw(0);
		}
	}

}