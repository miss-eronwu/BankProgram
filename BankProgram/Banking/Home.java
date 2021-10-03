package Banking;

public class Home {

    static int favPin;
    static int next;
    static int pin;
    static int count = 1;

    public static void main(String[] args) {

	double amount_to_deposit;
	double amount_to_withdraw;
	double amount_to_transfer;

	
	//Changed values in string and the numbers from checking and savings 
	//the values remained the same 
	AccountInfo a = new AccountInfo("Adanma", "Eronwu");
	CheckingAcct c = new CheckingAcct(123456765, 12.00);
	SavingAcct s = new SavingAcct(435687234, 500.00);
	Pin p = new Pin(0);

	favPin = TransactionsInput.getPin();
	p.setPin(favPin);

	pin = TransactionsInput.checkPin();

	while (favPin != 0) {
	    if (pin == favPin) {
		System.out.println(a);
		System.out.println(c);
		System.out.println(s);

		System.out.println();

		next = TransactionsInput.options();

		while (pin == favPin) {
		    try {

			if (next == 1) {
			    amount_to_deposit = TransactionsInput.checking_deposit();
			    c.setCheckingAmt(amount_to_deposit);
			    System.out.println(c);
			    next = TransactionsInput.options();
			    continue;
			} else if (next == 2) {
			    amount_to_deposit = TransactionsInput.saving_deposit();
			    s.setsavingAmt(amount_to_deposit);
			    System.out.println(s);
			    next = TransactionsInput.options();
			    continue;
			} else if (next == 3) {
			    amount_to_withdraw = TransactionsInput.checking_withdraw();
			    if (amount_to_withdraw > c.checkingAmt) {
				System.out.println(TransactionsInput.textList().get(14));
				System.out.println();
				next = TransactionsInput.options();
				continue;
			    }
			    c.setCheckingAmtWithdraw(amount_to_withdraw);
			    System.out.println(c);
			    next = TransactionsInput.options();
			    continue;

			} else if (next == 4) {
			    amount_to_withdraw = TransactionsInput.saving_withdraw();
			    if (amount_to_withdraw > s.savingAmt) {
				System.out.println(TransactionsInput.textList().get(15));
				System.out.println();
				next = TransactionsInput.options();
				continue;
			    }
			    s.setSavingAmtWithdraw(amount_to_withdraw);
			    System.out.println(s);
			    next = TransactionsInput.options();
			    continue;
			} else if (next == 5) {
			    amount_to_transfer = TransactionsInput.checking_saving_transfer();
			    if (amount_to_transfer > c.checkingAmt) {
				System.out.println(TransactionsInput.textList().get(16));
				System.out.println();
				next = TransactionsInput.options();
				continue;
			    }
			    c.setCheckingAmtTransferToSaving(amount_to_transfer);
			    s.setSavingAmtTransferFromChecking(amount_to_transfer);
			    System.out.println(c);
			    System.out.println(s);
			    next = TransactionsInput.options();
			    continue;
			} else if (next == 6) {
			    amount_to_transfer = TransactionsInput.saving_checking_transfer();
			    if (amount_to_transfer > s.savingAmt) {
				System.out.println(TransactionsInput.textList().get(16));
				System.out.println();
				next = TransactionsInput.options();
				continue;
			    }
			    c.setCheckingAmtTransferFromSaving(amount_to_transfer);
			    s.setSavingAmtTransferToChecking(amount_to_transfer);
			    System.out.println(c);
			    System.out.println(s);
			    next = TransactionsInput.options();
			    continue;
			}

			else if (next == 7) {
			    pin = TransactionsInput.reset_pin();
			    p.setPin(pin);
			    System.out.println(TransactionsInput.textList().get(3));
			    System.out.println(p);
			    pin = TransactionsInput.checkPin();
			    favPin = pin;
			    break;
			} else if (next == 8) {
			    System.out.println(TransactionsInput.textList().get(19));
			    System.exit(0);
			} else {
			    System.out.println(TransactionsInput.textList().get(18));
			    System.out.println();
			    next = TransactionsInput.options();
			    continue;
			}

		    } catch (Exception e) {
			System.out.println(e.getMessage());
		    }
		}

	    } else {
		System.out.println(TransactionsInput.textList().get(4));
		pin = TransactionsInput.checkPin();
		count = count + 1;
		if (count == 3) {
		    System.out.println(TransactionsInput.textList().get(5));
		    break;
		} else {
		    continue;
		}
	    }
	    continue;

	}
    }

}
