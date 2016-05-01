package sjadhav6.outputProcessor;

import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore2;

public class InitiateAccount2 extends InitiateAccount {
	public InitiateAccount2(DataStore data) {
		super(data);
	}

	public void initiateAccount() {
		DataStore2 data2=(DataStore2) getData();
		data2.setPin(data2.getTempPIN());
		data2.setuID(data2.getTempUID());
		data2.setBalance(data2.getTempBalance());
		data2.setTempBalance(0);
		data2.setTempPIN(0);
		data2.setTempUID(0);
		
	}

}