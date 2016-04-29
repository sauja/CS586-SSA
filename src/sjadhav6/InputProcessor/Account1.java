package sjadhav6.InputProcessor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sjadhav6.datastore.DataStore;
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
		// TODO initialize model and objects
		this.model=new MDA_EFSM();
		
	}
	//main method to handle Account 1 interactions
	public void run() throws IOException {
		
		System.out.println("In Account 1");
		BufferedReader readConsole = new BufferedReader(new InputStreamReader(System.in));
		String option="";
		while(!option.equals("10"))// while option is not "exit"
		{
			try
			{
				System.out.println("Enter Operation for Account1:\n"
						+ "1:open  2:pin  3:deposit  4:withdraw  5:balance  6:login  7:logout  8:lock  9:unlock  10:exit");
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
						String x1;
						System.out.println("Enter PIN text");
						x1=readConsole.readLine();
						lock(x1);
						break;
					case "9": //To unlock account
						String x2;
						System.out.println("Enter PIN text");
						x2=readConsole.readLine();
						unlock(x2);
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
		}//end while
	}



	public void open(String p,String y,float a) {
		// TODO implement here
		return ;
	}

	public void balance() {
		// TODO implement here
		return ;
	}

	public void pin( String x) {
		// TODO implement here
		return ;
	}

	public void deposit( float d) {
		// TODO implement here
		return ;
	}

	public void withdraw( float w) {
		// TODO implement here
		return ;
	}

	

	public void login( String y) {
		// TODO implement here
		return ;
	}

	public void logout() {
		// TODO implement here
		return ;
	}

	public void lock( String x) {
		// TODO implement here
		return ;
	}

	public void unlock( String x) {
		// TODO implement here
		return ;
	}



}