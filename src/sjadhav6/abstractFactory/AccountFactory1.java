package sjadhav6.abstractFactory;



import sjadhav6.datastore.DataStore;
import sjadhav6.outputProcessor.*;

public class AccountFactory1 extends AccountAbstractFactory {


	@Override
	public InitiateAccount getInitiateAccount(DataStore data) {
		return new InitiateAccount1(data);
	}
	@Override
	public PINPrompt getPINPrompt(DataStore data) {
		return new PINPrompt1();
	}
	@Override
	public IncorrectID getIncorrectID(DataStore data) {
		return new IncorrectID1();
	}
	@Override
	public Menu getMenu(DataStore data) {
		return new Menu1();
	}
	@Override
	public IncorrectPIN getIncorrectPIN(DataStore data) {
		// TODO Auto-generated method stub
		return new IncorrectPIN1();
	}
	@Override
	public TooManyAttempts getTooManyAttempts(DataStore data) {
		// TODO Auto-generated method stub
		return new TooManyAttempts1();
	}
	@Override
	public Deposit getDeposit(DataStore data) {
		// TODO Auto-generated method stub
		return new Deposit1(data);
	}
	@Override
	public Balance getBalance(DataStore data) {
		// TODO Auto-generated method stub
		return new Balance1(data);
	}
	@Override
	public Withdraw getWithdraw(DataStore data) {
		// TODO Auto-generated method stub
		return new Withdraw1(data);
	}
	@Override
	public MinBalance getMinBalance(DataStore data) {
		// TODO Auto-generated method stub
		return new MinBalance1();
	}
	@Override
	public Penalty getPenalty(DataStore data) {
		// TODO Auto-generated method stub
		return new Penalty1(data);
	}
	@Override
	public IncorrectLock getIncorrectLock(DataStore data) {
		// TODO Auto-generated method stub
		return new IncorrectLock1();
	}
	@Override
	public IncorrectUnlock getIncorrectUnlock(DataStore data) {
		// TODO Auto-generated method stub
		return new IncorrectUnlock1();
	}


	
}