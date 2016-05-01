package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore2;

public class Withdraw2 extends Withdraw {

	public Withdraw2(DataStore data) {
		super(data);
	}

	public void makeWithdraw() {
		DataStore2 data2=(DataStore2) getData();
		if(data2.getBalance()>0)
		{
			data2.setBalance(data2.getBalance()-data2.getTempWithdraw());
			data2.setTempWithdraw(0);
		}
	}

}