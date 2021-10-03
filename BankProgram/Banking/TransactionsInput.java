package Banking;

import java.util.ArrayList;
import java.util.Scanner;

public class TransactionsInput {

    static Scanner myObj = new Scanner(System.in);

    static int pin;
    static double deposit_checking_amt;
    static double deposit_saving_amt;

    static double withdraw_checking_amt;
    static double withdraw_saving_amt;
    static double transfer_amt;


    public static int getPin() {
	System.out.println(textList().get(0));
	int local_pin = myObj.nextInt();
	return local_pin;
	
    }
    
    public static int checkPin() {
  	System.out.println(textList().get(1));
  	int pin = myObj.nextInt();
  	return pin;
      }

    static int reset_pin() {
	System.out.println(textList().get(2));
	pin = myObj.nextInt();
	return pin;
    }

    static double checking_deposit() {
	System.out.println(textList().get(6));
	deposit_checking_amt = myObj.nextDouble();
	return deposit_checking_amt;
    }

    static double saving_deposit() {
	System.out.println(textList().get(7));
	deposit_saving_amt = myObj.nextDouble();
	return deposit_saving_amt;
    }

    static double checking_withdraw() {
	System.out.println(textList().get(8));
	withdraw_checking_amt = myObj.nextDouble();
	return withdraw_checking_amt;
    }

    static double saving_withdraw() {
	System.out.println(textList().get(9));
	withdraw_saving_amt = myObj.nextDouble();
	return withdraw_saving_amt;
    }

    static int options() {
	System.out.println(textList().get(10));
	System.out.println(textList().get(11));
	int input = myObj.nextInt();
	return input;
    }

    static double checking_saving_transfer() {
	System.out.println(textList().get(12));
	transfer_amt = myObj.nextInt();
	return transfer_amt;
    }

    static double saving_checking_transfer() {
	System.out.println(textList().get(13));
	transfer_amt = myObj.nextInt();
	return transfer_amt;
    }

    public static ArrayList<String> textList() {
	ArrayList<String> arrL = new ArrayList<String>();

	arrL.add("Please register a pin number: ");
	arrL.add("Please enter your pin: ");
	arrL.add("Enter your new pin:");
	arrL.add("Your new pin has been saved.");
	arrL.add("Please try again. Pin is incorrect.");
	arrL.add("You entered wrong pin 3 times. Please contact Customer service at 800-9475323");
	arrL.add("Enter the amount you want to deposit into your checking account: ");
	arrL.add("Enter the amount you want to deposit into your saving account: ");
	arrL.add("Enter the amount you want to withdraw from your checking: ");
	arrL.add("Enter the amount you want to withdraw from your saving: ");
	arrL.add("Enter 1 for checking deposit. 2 for saving deposit. 3 for checking withdrawal.4 for saving withdrawal.");
	arrL.add("5 for debit-to-saving transfer.6 for saving-to-debit transfer. 7 to reset your pin. 8 to quit.");
	arrL.add("How much you want to transfer from your debit to saving:");
	arrL.add("How much you want to transfer from your saving to checking:");
	arrL.add(" Oh no! You don't have enough funds in your checking to make a withdrawal.");
	arrL.add(" Oh no! You don't have enough funds in your saving to make a withdrawal.");
	arrL.add(" Oh no! You don't have enough funds in your checking to make that transfer.");
	arrL.add(" Oh no! You don't have enough funds in your saving to make that transfer.");
	arrL.add("Please enter a correct value between 1 & 8");
	arrL.add("Thank you for being a customer! Good Bye!");

	return arrL;

    }

}
