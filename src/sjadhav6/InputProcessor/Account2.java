package sjadhav6.InputProcessor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore2;
import sjadhav6.main.Constants;
import sjadhav6.mda_efsm.MDA_EFSM;

public class Account2  
{
	public MDA_EFSM model;
	private DataStore data2;
	public Account2() {
		this.data2=new DataStore2();
		this.model=new MDA_EFSM(data2);	
	}
	//main method to handle Account 2 interactions
	public void run() {

		System.out.println("In Account 2");
		BufferedReader readConsole = new BufferedReader(new InputStreamReader(System.in));
		String option="";
		while(!option.equals("11"))// while option is not "exit"
		{
			try
			{
				System.out.println("Enter Operation for Account1:\n"
						+ "1:OPEN  2:PIN  3:DEPOSIT  4:WITHDRAW  \n"
						+ "5:BALANCE  6:LOGIN  7:LOGOUT  \n"
						+ "8:suspend  9:activate  10:close	11:EXIT");
				option=readConsole.readLine();
				switch(option)
				{
				case "1": //To open account
					int p,y,a;
					System.out.println("Enter PIN digits");
					p=Integer.parseInt(readConsole.readLine());
					System.out.println("Enter User Identification digits");
					y=Integer.parseInt(readConsole.readLine());
					System.out.println("Enter balance in digits");
					a=Integer.parseInt((readConsole.readLine()));
					OPEN(p, y, a);
					break;
				case "2": //To enter pin
					int x;
					System.out.println("Enter PIN digits");
					x=Integer.parseInt(readConsole.readLine());
					PIN(x);
					break;
				case "3": //To deposit money
					int d;
					System.out.println("Enter amount to be deposited in digits");
					d=Integer.parseInt(readConsole.readLine());
					DEPOSIT(d);
					break;
				case "4": //To withdraw money
					int w;
					System.out.println("Enter amount to be withdrawn in digits");
					w=Integer.parseInt(readConsole.readLine());
					WITHDRAW(w);
					break;
				case "5": //To check balance
					BALANCE();
					break;
				case "6": //To login
					int y1;
					System.out.println("Enter Client ID digits");
					y1=Integer.parseInt(readConsole.readLine());
					LOGIN(y1);
					break;
				case "7": //To logout
					LOGOUT();
					break;
				case "8": // To suspend account
					suspend();
					break;
				case "9": //To activate suspended account
					activate();
					break;
				case "10": //To close or exit
					close();
					break;
				case "11": //To close or exit
					break;
				default:
					System.out.println("Invalid Input");

				}

			}catch(NumberFormatException e)
			{
				System.out.println("Invalid Input");;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end while
	}

	public void OPEN(int p, int y, int a) {
		DataStore2 temp=(DataStore2)data2;
		temp.setTempBalance(a);
		temp.setTempPIN(p);
		temp.setTempUID(y);
		model.open();
		
		System.out.println("Account Initialized bal="+temp.getBalance()+" pin="+temp.getPin()+" uid="+temp.getuID());
	}

	public void PIN(int x) {
		DataStore2 temp=(DataStore2)data2;
		if(temp.getPin()==x)
			model.correctPINAboveMinBalance();
		else
			model.incorrectPIN(Constants.ACCOUNT2_MAXATTEMPT);
	}

	public void DEPOSIT(int d) {
		DataStore2 temp=(DataStore2)data2;
		temp.setTempDeposit(d);
		model.deposit();
		model.aboveMinBalance();
	}

	public void WITHDRAW(int w) {
		DataStore2 temp=(DataStore2)data2;
		temp.setTempWithdraw(w);
		float bal=temp.getBalance();
		if(bal>0)
		{
			model.withdraw();
			model.aboveMinBalance();
		}
		else
		{
			model.withdraw();
			model.aboveMinBalance();
			model.noFunds();
		}
	}

	public void BALANCE() {
		DataStore2 temp=(DataStore2)data2;
		model.balance();
	}

	public void LOGIN(int y) {
		DataStore2 temp=(DataStore2)data2;
		if(temp.getuID()==y)
			model.correctLogin();
		else
			model.incorrectLogin();
	}

	public void LOGOUT() {
		model.logout();
	}

	public void suspend() {
		model.suspend();
	}

	public void activate() {
		model.activate();
	}

	public void close() {
		model.close();
	}

}