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

		return new IncorrectPIN1();
	}
	@Override
	public TooManyAttempts getTooManyAttempts(DataStore data) {

		return new TooManyAttempts1();
	}
	@Override
	public Deposit getDeposit(DataStore data) {

		return new Deposit1(data);
	}
	@Override
	public Balance getBalance(DataStore data) {

		return new Balance1(data);
	}
	@Override
	public Withdraw getWithdraw(DataStore data) {

		return new Withdraw1(data);
	}
	@Override
	public MinBalance getMinBalance(DataStore data) {

		return new MinBalance1();
	}
	@Override
	public Penalty getPenalty(DataStore data) {

		return new Penalty1(data);
	}
	@Override
	public IncorrectLock getIncorrectLock(DataStore data) {

		return new IncorrectLock1();
	}
	@Override
	public IncorrectUnlock getIncorrectUnlock(DataStore data) {

		return new IncorrectUnlock1();
	}


	
}