package sjadhav6.abstractFactory;

import sjadhav6.datastore.DataStore;
import sjadhav6.outputProcessor.*;


public class AccountFactory2 extends AccountAbstractFactory {

	@Override
	public InitiateAccount getInitiateAccount(DataStore data) {
		return new InitiateAccount2(data);
	}
	@Override
	public PINPrompt getPINPrompt(DataStore data) {
		return new PINPrompt2();
	}
	@Override
	public IncorrectID getIncorrectID(DataStore data) {
		return new IncorrectID2();
	}
	@Override
	public Menu getMenu(DataStore data) {
		return new Menu2();
	}
	@Override
	public IncorrectPIN getIncorrectPIN(DataStore data) {
		// TODO Auto-generated method stub
		return new IncorrectPIN2();
	}
	@Override
	public TooManyAttempts getTooManyAttempts(DataStore data) {
		// TODO Auto-generated method stub
		return new TooManyAttempts2();
	}
	@Override
	public Deposit getDeposit(DataStore data) {
		// TODO Auto-generated method stub
		return new Deposit2(data);
	}
	@Override
	public Balance getBalance(DataStore data) {
		// TODO Auto-generated method stub
		return new Balance2(data);
	}
	@Override
	public Withdraw getWithdraw(DataStore data) {
		// TODO Auto-generated method stub
		return new Withdraw2(data);
	}
	@Override
	public MinBalance getMinBalance(DataStore data) {
		// TODO Auto-generated method stub
		return new MinBalance2();
	}
	@Override
	public Penalty getPenalty(DataStore data) {
		// TODO Auto-generated method stub
		return new Penalty2(data);
	}
	@Override
	public IncorrectLock getIncorrectLock(DataStore data) {
		// TODO Auto-generated method stub
		return new IncorrectLock2();
	}
	@Override
	public IncorrectUnlock getIncorrectUnlock(DataStore data) {
		// TODO Auto-generated method stub
		return new IncorrectUnlock2();
	}

}