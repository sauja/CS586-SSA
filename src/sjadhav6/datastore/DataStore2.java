package sjadhav6.datastore;

import java.util.*;

public class DataStore2 extends DataStore {

	public DataStore2() {
	}

	private String pin;
	private String uID;
	private float balance;
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getuID() {
		return uID;
	}
	public void setuID(String uID) {
		this.uID = uID;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}

}