package sjadhav6.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sjadhav6.InputProcessor.Account1;
import sjadhav6.InputProcessor.Account2;

public class SSAProject 
{


	public static void main(String[] args) throws  IOException 
	{		
		BufferedReader readConsole = new BufferedReader(new InputStreamReader(System.in));
		String option="";
		while(!option.equals("3"))
		{
			try
			{
				System.out.println("Enter Account:\n"
						+"1: Account 1\n"
						+"2: Account 2\n"
						+"3: Exit");
				option=readConsole.readLine();
				switch(option)
				{
				case "1":// send to Account1 operations
					Account1 account1=new Account1();
					account1.run();
					break;
				case "2":// send to Account1 operations
					Account2 account2=new Account2();
					account2.run();
					break;
				case "3"://Exit
					break;
				default:
					System.out.println("Invalid Input");
				}

			}catch(NumberFormatException e)
			{
				System.out.println("Invalid Input");;
			}
		}//end while
		System.out.println("Thank you for using our Banking Service.\n"
				+ "Have a nice Day!");
	}


}