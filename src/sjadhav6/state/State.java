package sjadhav6.state;

import java.util.*;

import sjadhav6.mda_efsm.MDA_EFSM;
import sjadhav6.outputProcessor.OutputProcessor;

public class State {

	public State() {
	}

	public MDA_EFSM model;

	public int ID;

	public OutputProcessor outp;



	public void open() {
		// TODO implement here
		return;
	}

	public void correctLogin() {
		// TODO implement here
		return;
	}

	public void incorrectLogin() {
		// TODO implement here
		return;
	}

	public void correctPINAboveMinBalance() {
		// TODO implement here
		return;
	}

	public void correctPINBelowMinBalance() {
		// TODO implement here
		return;
	}

	public void incorrectPIN(int max) {
		// TODO implement here
		return;
	}

	public void logout() {
		// TODO implement here
		return;
	}

	public void balance() {
		// TODO implement here
		return;
	}

	public void deposit() {
		// TODO implement here
		return;
	}

	public void aboveMinBalance() {
		// TODO implement here
		return;
	}

	public void belowMinBalance() {
		// TODO implement here
		return;
	}

	public void correctLock() {
		// TODO implement here
		return;
	}

	public void incorrectLock() {
		// TODO implement here
		return;
	}

	public void correctUnlock() {
		// TODO implement here
		return;
	}

	public void incorrectUnlock() {
		// TODO implement here
		return;
	}

	public void withdraw() {
		// TODO implement here
		return;
	}

	public void belowMinBalancePenalty() {
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

	public void noFunds() {
		// TODO implement here
		return;
	}

	public void close() {
		// TODO implement here
		return;
	}

}