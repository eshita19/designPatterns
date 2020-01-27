package com.esh.behavioural;

interface DispenseChain {
	void setNextChain(DispenseChain dispenseChain);

	void dispense(int amt);
}

class Dollar50Dispensor implements DispenseChain {
	private DispenseChain nextDispenser;

	@Override
	public void setNextChain(DispenseChain nextDispenser) {
		this.nextDispenser = nextDispenser;
	}

	@Override
	public void dispense(int amt) {
		if (amt == 50) {
			System.out.println("Dispensing 50 dollars");
		} else {
			nextDispenser.dispense(amt);

		}
	}
}

class Dollar20Dispensor implements DispenseChain {
	private DispenseChain nextDispenser;

	@Override
	public void setNextChain(DispenseChain nextDispenser) {
		this.nextDispenser = nextDispenser;
	}

	@Override
	public void dispense(int amt) {
		if (amt == 20) {
			System.out.println("Dispensing 20 dollars");
		} else {
			nextDispenser.dispense(amt);
		}
	}
}

public class ChianOfResponsibilityPatternEx {
	public static void main(String[] args) {
		Dollar50Dispensor dollar50Dispensor = new Dollar50Dispensor();
		dollar50Dispensor.setNextChain(new Dollar20Dispensor());
		dollar50Dispensor.dispense(20);
	}

}
