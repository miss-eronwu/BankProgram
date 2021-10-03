package Banking;


public class SavingAcct {
    
    
    int savingAccount;
    double savingAmt;
    
    public SavingAcct(int SavingAcct, double savingAmt) {
	this.savingAccount = SavingAcct;
	this.savingAmt = savingAmt;
    }
    
    public int getSavingAcct(int savingAcct) {
   	return savingAcct;
	
    }
         
    public void setSavingAcct(int acctNum) {
   	this.savingAccount = acctNum;
    }
    
    public double getsavingAmt(double savingAmt) {
  	return savingAmt;
      }
    
    public void setsavingAmt(double newAmt) {
	this.savingAmt = savingAmt + newAmt;
      }
    
    public void setSavingAmtWithdraw(double newAmt) {
	this.savingAmt = savingAmt - newAmt;
      }
    
    public void setSavingAmtTransferToChecking(double newAmt) {
	this.savingAmt = savingAmt - newAmt;
      }
    
    public void setSavingAmtTransferFromChecking(double newAmt) {
	this.savingAmt = savingAmt + newAmt;
      }
    
    public String toString () {
   	return "Your saving acount " + "("+savingAccount+") balance is: " + savingAmt;
       }

    

}
