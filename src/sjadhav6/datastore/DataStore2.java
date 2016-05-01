package sjadhav6.datastore;

public class DataStore2 extends DataStore {

	public DataStore2() {
		super(2);
	}

	private int attempts;
	private int pin;
	private int uID;
	private int balance;
	
	private int tempUID;
	private int tempBalance;
	private int tempPIN;
	private int tempDeposit;
	private int tempWithdraw;
	
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public int getTempUID() {
		return tempUID;
	}
	public void setTempUID(int tempUID) {
		this.tempUID = tempUID;
	}
	public int getTempBalance() {
		return tempBalance;
	}
	public void setTempBalance(int tempBalance) {
		this.tempBalance = tempBalance;
	}
	public int getTempPIN() {
		return tempPIN;
	}
	public void setTempPIN(int tempPIN) {
		this.tempPIN = tempPIN;
	}
	public int getTempDeposit() {
		return tempDeposit;
	}
	public void setTempDeposit(int tempDeposit) {
		this.tempDeposit = tempDeposit;
	}
	public int getTempWithdraw() {
		return tempWithdraw;
	}
	public void setTempWithdraw(int tempWithdraw) {
		this.tempWithdraw = tempWithdraw;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	

}