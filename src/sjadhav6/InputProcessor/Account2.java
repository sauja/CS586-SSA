package sjadhav6.InputProcessor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import sjadhav6.datastore.DataStore;
import sjadhav6.datastore.DataStore2;
import sjadhav6.mda_efsm.MDA_EFSM;

public class Account2  
{
	public MDA_EFSM model;
	private DataStore data2;

	//main method to handle Account 2 interactions
	public void run() {

		System.out.println("In Account 2");
		BufferedReader readConsole = new BufferedReader(new InputStreamReader(System.in));
		String option="";
		while(!option.equals("12"))// while option is not "exit"
		{
			try
			{
				System.out.println("Enter Operation for Account1:\n"
						+ "1:OPEN  2:PIN  3:DEPOSIT  4:WITHDRAW  \n"
						+ "5:BALANCE  6:LOGIN  7:LOGOUT  \n"
						+ "8:LOCK  9:UNLOCK  10:suspend  \n"
						+ "11:activate  12:close");
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
				case "8": //To lock account
					int pin1;
					System.out.println("Enter PIN digits");
					pin1=Integer.parseInt(readConsole.readLine());
					LOCK(pin1);
					break;
				case "9": //To unlock account
					int pin2;
					System.out.println("Enter PIN digits");
					pin2=Integer.parseInt(readConsole.readLine());
					UNLOCK(pin2);
					break;
				case "10": // To suspend account
					suspend();
					break;
				case "11": //To activate suspended account
					activate();
				case "12": //To close or exit
					close();
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
		// TODO implement here
		return;
	}

	public void DEPOSIT(int d) {
		// TODO implement here
		return;
	}

	public void WITHDRAW(int w) {
		// TODO implement here
		return;
	}

	public void BALANCE() {
		DataStore2 temp=(DataStore2)data2;
		model.balance();
	}

	public void LOGIN(int y) {
		// TODO implement here
		return;
	}
	private void LOCK(int x) {
		// TODO Auto-generated method stub
		
	}

	private void UNLOCK(int x) {
		// TODO Auto-generated method stub
		
	}
	public void LOGOUT() {
		// TODO implement here
		return;
	}

	public void suspend() {
		// TODO implement here
		return;
	}

	public void activate() {
		// TODO implement here
		return;
	}

	public void close() {
		// TODO implement here
		return;
	}

}