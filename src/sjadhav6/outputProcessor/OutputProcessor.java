package sjadhav6.outputProcessor;


import sjadhav6.abstractFactory.AccountAbstractFactory;
import sjadhav6.abstractFactory.AccountFactory1;
import sjadhav6.abstractFactory.AccountFactory2;
import sjadhav6.datastore.DataStore;

public class OutputProcessor {
	private AccountAbstractFactory af;

	private InitiateAccount initiateAccount;
	private IncorrectID incorrectID;
	private PINPrompt pinPrompt;
	private IncorrectPIN incorrectPIN;
	private TooManyAttempts tooManyAttempts;
	private Menu menu;
	private Deposit deposit;
	private Balance balance;
	private Withdraw withdraw;
	private MinBalance minBalance;
	private Penalty penalty;
	private IncorrectLock incorrectLock;
	private IncorrectUnlock incorrectUnlock;

	private DataStore data;

	public DataStore getData() {
		return data;
	}

	public void setData(DataStore data) {
		this.data = data;
	}

	public OutputProcessor(DataStore data) {
		this.data=data;
	}

	public void initiateAccount() 
	{
		if(data.getAccountID()==1)
			af=new AccountFactory1();
		else if(data.getAccountID()==2)
			af=new AccountFactory2();
		initiateAccount=af.getInitiateAccount(data);
		initiateAccount.initiateAccount();
	}

	public void displayPINPrompt() {
		if(data.getAccountID()==1)
			af=new AccountFactory1();
		else if(data.getAccountID()==2)
			af=new AccountFactory2();
		pinPrompt=af.getPINPrompt(data);
		pinPrompt.displayPINPrompt();

	}

	public void diplayIncorrectIDMsg() 
	{
		if(data.getAccountID()==1)
			af=new AccountFactory1();
		else if(data.getAccountID()==2)
			af=new AccountFactory2();
		incorrectID=af.getIncorrectID(data);
		incorrectID.diplayIncorrectIDMsg();

	}

	public void displayMenu() 
	{
		if(data.getAccountID()==1)
			af=new AccountFactory1();
		else if(data.getAccountID()==2)
			af=new AccountFactory2();
		menu=af.getMenu(data);
		menu.displayMenu();
	}

	public void displayIncorrectPINMsg() 
	{
		if(data.getAccountID()==1)
			af=new AccountFactory1();
		else if(data.getAccountID()==2)
			af=new AccountFactory2();
		incorrectPIN=af.getIncorrectPIN(data);
		incorrectPIN.displayIncorrectPINMsg();

	}

	public void displayTooManyAttemptsMsg() {
		if(data.getAccountID()==1)
			af=new AccountFactory1();
		else if(data.getAccountID()==2)
			af=new AccountFactory2();
		tooManyAttempts=af.getTooManyAttempts(data);
		tooManyAttempts.displayTooManyAttemptsMsg();

	}

	public void makeDeposit() {
		if(data.getAccountID()==1)
			af=new AccountFactory1();
		else if(data.getAccountID()==2)
			af=new AccountFactory2();
		deposit=af.getDeposit(data);
		deposit.makeDeposit();

	}

	public void displayBalance() {
		if(data.getAccountID()==1)
			af=new AccountFactory1();
		else if(data.getAccountID()==2)
			af=new AccountFactory2();
		balance=af.getBalance(data);
		balance.displayBalance();

	}

	public void makeWithdraw() {
		if(data.getAccountID()==1)
			af=new AccountFactory1();
		else if(data.getAccountID()==2)
			af=new AccountFactory2();
		withdraw=af.getWithdraw(data);
		withdraw.makeWithdraw();

	}

	public void displayMinBalanceMsg() {
		if(data.getAccountID()==1)
			af=new AccountFactory1();
		else if(data.getAccountID()==2)
			af=new AccountFactory2();
			minBalance=af.getMinBalance(data);
			minBalance.displayMinBalanceMsg();
		
	}

	public void applyPenalty() {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1();
			penalty=af.getPenalty(data);
			penalty.applyPenalty();
		}
	}

	public void incorrectLockMsg() {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1();
			incorrectLock=af.getIncorrectLock(data);
			incorrectLock.incorrectLockMsg();
		}
	}

	public void incorrectUnlockMsg() {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1();
			incorrectUnlock=af.getIncorrectUnlock(data);
			incorrectUnlock.incorrectUnlockMsg();
		}
	}

}