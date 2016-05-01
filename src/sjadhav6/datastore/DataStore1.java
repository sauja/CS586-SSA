package sjadhav6.datastore;

public class DataStore1 extends DataStore {

	public DataStore1() 
	{
		super(1);
	}
	private float balance;
	private int attempts;
	private String pin;
	private String uID;
	
	private String tempUID;
	private float tempBalance;
	private String tempPIN;
	private float tempDeposit;
	private float tempWithdraw;
	
	boolean belowMinFlag=false;
	
	
	public boolean isBelowMinFlag() {
		return belowMinFlag;
	}
	public void setBelowMinFlag(boolean belowMinFlag) {
		this.belowMinFlag = belowMinFlag;
	}
	public String getTempUID() {
		return tempUID;
	}
	public void setTempUID(String tempUID) {
		this.tempUID = tempUID;
	}
	public float getTempBalance() {
		return tempBalance;
	}
	public void setTempBalance(float tempBalance) {
		this.tempBalance = tempBalance;
	}
	public String getTempPIN() {
		return tempPIN;
	}
	public void setTempPIN(String tempPIN) {
		this.tempPIN = tempPIN;
	}
	public float getTempDeposit() {
		return tempDeposit;
	}
	public void setTempDeposit(float tempDeposit) {
		this.tempDeposit = tempDeposit;
	}
	public float getTempWithdraw() {
		return tempWithdraw;
	}
	public void setTempWithdraw(float tempWithdraw) {
		this.tempWithdraw = tempWithdraw;
	}
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
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public int getAccountID() {
		return accountID;
	}

	




}