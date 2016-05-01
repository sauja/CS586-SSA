package sjadhav6.mda_efsm;

import sjadhav6.datastore.DataStore;
import sjadhav6.main.Constants;
import sjadhav6.state.*;


public class MDA_EFSM 
{
	private State stateList[];
	private int stateID=0;



	public MDA_EFSM(DataStore data) 
	{
		
		stateList=new State[Constants.TOTALSTATES];
		stateList[0]=new Start(data);
		stateList[1]=new Idle(data);
		stateList[2]=new CheckPin(data);
		stateList[3]=new Ready(data);
		stateList[4]=new CheckBalance(data);
		stateList[5]=new Locked(data);
		stateList[6]=new Overdrawn(data);
		stateList[7]=new Suspended(data);
	}

	public int getID() {
		return stateID;
	}

	public void setID(int ID) {
		this.stateID = ID;
	}

	public void open() 
	{
		if (stateID==Constants.START)
		{
			System.out.println("Start-->Idle");
			stateList[stateID].open();
			stateID=Constants.IDLE;
		}
	}

	public void correctLogin() 
	{
		if (stateID==Constants.IDLE)
		{
			System.out.println("Idle-->Checkpin");
			stateList[stateID].correctLogin();
			stateID=Constants.CHECKPIN;
		}
	}

	public void incorrectLogin() 
	{
		if (stateID==Constants.IDLE)
		{
			System.out.println("Idle-->Idle");
			stateList[stateID].incorrectLogin();
			stateID=Constants.IDLE;
		}
	}

	public void correctPINAboveMinBalance() 
	{
		if (stateID==Constants.CHECKPIN)
		{
			System.out.println("Checkpin-->Ready");
			stateList[stateID].correctPINAboveMinBalance();
			stateID=Constants.READY;
		}
	}

	public void correctPINBelowMinBalance() 
	{
		if (stateID==Constants.CHECKPIN)
		{
			System.out.println("Checkpin-->Overdrawn");
			stateList[stateID].correctPINBelowMinBalance();
			stateID=Constants.OVERDRAWN;
		}
	}

	public void incorrectPIN(int max) 
	{
		if (stateID==Constants.CHECKPIN)
		{
			if(stateList[stateID].outp.getData().getAttempts()==max)
			{
				System.out.println("Checkpin-->Idle");
				stateList[stateID].incorrectPIN();
				stateID=Constants.IDLE;
			}
			else
			{
				stateList[stateID].incorrectPIN();
				stateID=Constants.CHECKPIN;
			}
		}
	}

	public void logout() 
	{
		if(stateID==Constants.CHECKPIN||stateID==Constants.READY||stateID==Constants.OVERDRAWN)
		{
			stateList[stateID].logout();
			stateID=Constants.IDLE;
		}
	}

	public void balance() {
		if(stateID==Constants.SUSPENDED||stateID==Constants.READY||stateID==Constants.OVERDRAWN)
		{
			stateList[stateID].balance();
			System.out.println("Suspended||Ready||Overdrawn-->Suspended||Ready||Overdrawn");
		}
	}

	public void close() {
		if (stateID==Constants.SUSPENDED)
		{
			System.out.println("Suspend-->Close");
			stateList[stateID].close();
			System.exit(0);
		}
	}

	public void suspend() 
	{
		if (stateID==Constants.READY)
		{
			System.out.println("Ready-->Suspend");
			stateList[stateID].suspend();
			stateID=Constants.SUSPENDED;
		}
	}

	public void activate() {
		if (stateID==Constants.SUSPENDED)
		{
			System.out.println("Suspend-->Ready");
			stateList[stateID].activate();
			stateID=Constants.READY;
		}
	}


	public void deposit() {
		if (stateID==Constants.READY)
		{
			System.out.println("ready-->ready");
			stateList[stateID].deposit();
			stateID=Constants.READY;
		}
		if (stateID==Constants.OVERDRAWN)
		{
			System.out.println("Overdrawn-->Checkbalance");
			stateList[stateID].deposit();
			stateID=Constants.CHECKBALANCE;
		}
	}

	public void aboveMinBalance() {
		if (stateID==Constants.CHECKBALANCE)
		{
			System.out.println("CheckBalance-->ready");
			stateList[stateID].aboveMinBalance();
			stateID=Constants.READY;
		}
	}

	public void belowMinBalance() {
		if (stateID==Constants.CHECKBALANCE)
		{
			System.out.println("CheckBalance-->Overdrawn");
			stateList[stateID].belowMinBalance();
			stateID=Constants.OVERDRAWN;
		}
	}

	public void correctLock() 
	{
		if (stateID==Constants.READY||stateID==Constants.OVERDRAWN)
		{
			System.out.println("Ready|Overdrawn-->Locked");
			stateList[stateID].correctLock();
			stateID=Constants.LOCKED;
		}
	}

	public void incorrectUnlock() 
	{
		if (stateID==Constants.LOCKED)
			stateList[stateID].incorrectUnlock();
	}

	public void withdraw() 
	{
		if (stateID==Constants.READY)
		{
			System.out.println("Ready-->CheckBalance");
			stateList[stateID].withdraw();
			stateID=Constants.CHECKBALANCE;
		}
		else if (stateID==Constants.OVERDRAWN)
		{
			System.out.println("Overdrawn-->CheckBalance");
			stateList[stateID].withdraw();
			stateID=Constants.OVERDRAWN;
		}
	}

	public void belowMinBalancePenalty() {
		if (stateID==Constants.CHECKBALANCE)
		{
			System.out.println("CheckBalance-->Overdrawn");
			stateList[stateID].belowMinBalancePenalty();
			stateID=Constants.OVERDRAWN;
		}
	}

	public void incorrectLock() {
		if (stateID==Constants.READY||stateID==Constants.OVERDRAWN)
			stateList[stateID].incorrectLock();
	}

	public void correctUnlock() {
		if (stateID==Constants.LOCKED)
		{
			System.out.println("Locked-->Checkbalance");
			stateList[stateID].correctUnlock();
			stateID=Constants.CHECKBALANCE;
		}

	}

}