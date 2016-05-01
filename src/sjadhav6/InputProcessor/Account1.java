package sjadhav6.InputProcessor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sjadhav6.abstractFactory.*;
import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore1;
import sjadhav6.main.Constants;
import sjadhav6.mda_efsm.MDA_EFSM;
/** 
* This class performs various activities for Account 1
* @author      Saurabh Jadhav
* @version     1.0
* 
*/
public class Account1 
{
	
	private MDA_EFSM model;
	private DataStore data1;
	
	/**
	 * Constructor for initializing Account 1 variables
	 */
	public Account1() {
		this.data1=new DataStore1();
		this.model=new MDA_EFSM(data1);	
	}
	//main method to handle Account 1 interactions
	public void run() {
		
		System.out.println("In Account 1");
		BufferedReader readConsole = new BufferedReader(new InputStreamReader(System.in));
		String option="";
		while(!option.equals("10"))// while option is not "exit"
		{
			try
			{
				System.out.println("Enter Operation for Account1:\n"
						+ "1:open  2:pin  3:deposit  4:withdraw  5:balance  6:login  7:logout  8:lock  9:unlock  10:EXIT");
				option=readConsole.readLine();
				switch(option)
				{
					case "1": //To open account
						String p,y;
						float a;
						System.out.println("Enter PIN text");
						p=readConsole.readLine();
						System.out.println("Enter User Identification text");
						y=readConsole.readLine();
						System.out.println("Enter balance in digits");
						a=Float.parseFloat(readConsole.readLine());
						open(p, y, a);
						break;
					case "2": //To enter pin
						String x;
						System.out.println("Enter PIN text");
						x=readConsole.readLine();
						pin(x);
						break;
					case "3": //To deposit money
						float d;
						System.out.println("Enter amount to be deposited in digits");
						d=Float.parseFloat(readConsole.readLine());
						deposit(d);
						break;
					case "4": //To withdraw money
						float w;
						System.out.println("Enter amount to be withdrawn in digits");
						w=Float.parseFloat(readConsole.readLine());
						withdraw(w);
						break;
					case "5": //To check balance
						balance();
						break;
					case "6": //To login
						String y1;
						System.out.println("Enter Client ID text");
						y1=readConsole.readLine();
						login(y1);
						break;
					case "7": //To logout
						logout();
						break;
					case "8": //To lock account
						String pin1;
						System.out.println("Enter PIN text");
						pin1=readConsole.readLine();
						lock(pin1);
						break;
					case "9": //To unlock account
						String pin2;
						System.out.println("Enter PIN text");
						pin2=readConsole.readLine();
						unlock(pin2);
						break;
					case "10": //To exit
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



	public void open(String p,String y,float a) 
	{	DataStore1 temp=(DataStore1)data1;
		temp.setTempBalance(a);
		temp.setTempPIN(p);
		temp.setTempUID(y);
		model.open();
		
		System.out.println("Account Initialized bal="+temp.getBalance()+" pin="+temp.getPin()+" uid="+temp.getuID());
	}

	public void balance() {
		DataStore1 temp=(DataStore1)data1;
		model.balance();
	}

	public void pin( String x) {
		DataStore1 temp=(DataStore1)data1;
		if(temp.getPin().equals(x))
		{	
			if(temp.getBalance()>500){
				model.correctPINAboveMinBalance();
			}
			else
				model.correctPINBelowMinBalance();
		}
		else
		{
			model.incorrectPIN(Constants.ACCOUNT1_MAXATTEMPT);
		}
		
	}

	public void deposit( float d) {
		DataStore1 temp=(DataStore1)data1;
		temp.setTempDeposit(d);
		model.deposit();
		if(temp.getBalance()>500)
			model.aboveMinBalance();
		else
			model.belowMinBalance();
	}

	public void withdraw( float w) {
		DataStore1 temp=(DataStore1)data1;
		temp.setTempWithdraw(w);
		float bal=temp.getBalance();
		if(bal-w>=500)
		{
			model.withdraw();
			model.aboveMinBalance();
		}
		else
		{
			model.withdraw();
			model.belowMinBalancePenalty();
		}
	}

	public void login( String y) {
		DataStore1 temp=(DataStore1)data1;
		if(temp.getuID().equals(y))
			model.correctLogin();
		else
			model.incorrectLogin();
	}

	public void logout() {
		model.logout();
	}

	public void lock( String x) {
		DataStore1 temp=(DataStore1)data1;
		if(temp.getPin().equals(x))
			model.correctLock();
		else
			model.incorrectLock();
		return ;
	}

	public void unlock( String x) {
		DataStore1 temp=(DataStore1)data1;
		if(temp.getPin().equals(x))
		{
			model.correctUnlock();
			if(temp.getBalance()>500)
				model.aboveMinBalance();
			else
				model.belowMinBalance();
		}
		else
			model.incorrectUnlock();
		return ;
	}



}