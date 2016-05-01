package sjadhav6.abstractFactory;

import sjadhav6.datastore.DataStore;
import sjadhav6.outputProcessor.*;

public abstract class AccountAbstractFactory {
	DataStore data;
	public AccountAbstractFactory(DataStore data) {
		super();
		this.data = data;
	}
	public abstract InitiateAccount getInitiateAccount(DataStore data);
	public abstract PINPrompt getPINPrompt(DataStore data);
	public abstract IncorrectID getIncorrectID(DataStore data);
	public abstract Menu getMenu(DataStore data);
	public abstract IncorrectPIN getIncorrectPIN(DataStore data);
	public abstract TooManyAttempts getTooManyAttempts(DataStore data);
	public abstract Deposit getDeposit(DataStore data);
	public abstract Balance getBalance(DataStore data);
	public abstract Withdraw getWithdraw(DataStore data);
	public abstract MinBalance getMinBalance(DataStore data);
	public abstract Penalty getPenalty(DataStore data);
	public abstract IncorrectLock getIncorrectLock(DataStore data);
	public abstract IncorrectUnlock getIncorrectUnlock(DataStore data);
	public AccountAbstractFactory() {}
}