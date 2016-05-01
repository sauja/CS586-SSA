package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore1;

public class InitiateAccount1 extends InitiateAccount {

	public InitiateAccount1(DataStore data) {
		super(data);
	}

	public void initiateAccount() {
		DataStore1 data1=(DataStore1) getData();
		data1.setPin(data1.getTempPIN());
		data1.setuID(data1.getTempUID());
		data1.setBalance(data1.getTempBalance());
		data1.setTempBalance(0);
		data1.setTempPIN(null);
		data1.setTempUID(null);
		
	}

}