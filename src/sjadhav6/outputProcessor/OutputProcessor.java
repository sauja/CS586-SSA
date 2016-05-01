package sjadhav6.outputProcessor;

import java.util.*;

import sjadhav6.abstractFactory.AccountAbstractFactory;
import sjadhav6.abstractFactory.AccountFactory1;
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

	public void initiateAccount(DataStore data) 
	{
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			initiateAccount=af.getInitiateAccount(data);
			initiateAccount.initiateAccount();
		}
	}
	
	public void displayPINPrompt(DataStore data) {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			pinPrompt=af.getPINPrompt(data);
			pinPrompt.displayPINPrompt();
		}
	}

	public void diplayIncorrectIDMsg(DataStore data) 
	{
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			incorrectID=af.getIncorrectID(data);
			incorrectID.diplayIncorrectIDMsg();
		}
	}
	
	public void displayMenu(DataStore data) 
	{
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			menu=af.getMenu(data);
			menu.displayMenu();
		}
	}
	
	public void displayIncorrectPINMsg(DataStore data) 
	{
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			incorrectPIN=af.getIncorrectPIN(data);
			incorrectPIN.displayIncorrectPINMsg();
		}
	}

	public void displayTooManyAttemptsMsg(DataStore data) {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			tooManyAttempts=af.getTooManyAttempts(data);
			tooManyAttempts.displayTooManyAttemptsMsg();
		}
	}

	public void makeDeposit(DataStore data) {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			deposit=af.getDeposit(data);
			deposit.makeDeposit();
		}
	}

	public void displayBalance(DataStore data) {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			balance=af.getBalance(data);
			balance.displayBalance();
		}
	}

	public void makeWithdraw(DataStore data) {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			withdraw=af.getWithdraw(data);
			withdraw.makeWithdraw();
		}
	}

	public void displayMinBalanceMsg(DataStore data) {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			minBalance=af.getMinBalance(data);
			minBalance.displayMinBalanceMsg();
		}
	}

	public void applyPenalty(DataStore data) {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			penalty=af.getPenalty(data);
			penalty.applyPenalty();
		}
	}

	public void incorrectLockMsg(DataStore data) {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			incorrectLock=af.getIncorrectLock(data);
			incorrectLock.incorrectLockMsg();
		}
	}

	public void incorrectUnlockMsg(DataStore data) {
		if(data.getAccountID()==1)
		{
			af=new AccountFactory1(data);
			incorrectUnlock=af.getIncorrectUnlock(data);
			incorrectUnlock.incorrectUnlockMsg();
		}
	}

}