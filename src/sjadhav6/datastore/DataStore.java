package sjadhav6.datastore;

public abstract class DataStore {

	int accountID;
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public DataStore(int accountID) {
		this.accountID=accountID;
	}
	public abstract int getAttempts();
	public abstract void setAttempts(int attempts);



}