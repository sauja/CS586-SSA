package sjadhav6.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper 
{
	BufferedReader readConsole;
	Helper()
	{
		this.readConsole = new BufferedReader(new InputStreamReader(System.in));
	}
	public float consoleFloat() throws NumberFormatException, IOException
	{
		return Float.parseFloat(readConsole.readLine());
	}
	public int consoleInt() throws NumberFormatException, IOException
	{
		return Integer.parseInt(readConsole.readLine());
	}
	public String consoleString() throws IOException
	{
		return readConsole.readLine();
	}
	public void close() throws IOException
	{
		readConsole.close();
	}
}
