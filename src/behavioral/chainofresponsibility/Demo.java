package behavioral.chainofresponsibility;

import java.util.Scanner;

public class Demo {
	
	private final DispenseChain dispenseChain;

	public Demo() {
		// initialize the chain
		this.dispenseChain = new Dollar50Dispense();
		DispenseChain dispenseChain2 = new Dollar20Dispense();
		DispenseChain dispenseChain3 = new Dollar10Dispense();

		// set the chain of responsibility
		dispenseChain.setNextChain(dispenseChain2);
		dispenseChain2.setNextChain(dispenseChain3);

	}
	
	public static void main(final String[] args) {
		Demo atmDispenser = new Demo();
		while (true) {
			int amount = 0;
			System.out.print("Enter amount to dispense: ");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atmDispenser.dispenseChain.dispense(new Currency(amount));
		}

	}

}
