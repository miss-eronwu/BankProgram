package Banking;


public class CheckingAcct {
    
    int checkingAccount;
    double checkingAmt;
    
    public CheckingAcct(int checkingAcct, double checkingAmt) {
	this.checkingAccount = checkingAcct;
	this.checkingAmt = checkingAmt;
    }
    
    public int getCheckingAcct(int checkingAcct) {
   	return checkingAcct;
    }
         
    public void setCheckingAcct(int acctNum) {
	
   	this.checkingAccount = acctNum;
    }
    
    public double getCheckingAmt(double checkingAmt) {
  	return checkingAmt;
      }
    
    public void setCheckingAmt(double newAmt) {
	this.checkingAmt = checkingAmt + newAmt;
      }
    
    public void setCheckingAmtWithdraw(double newAmt) {
	this.checkingAmt = checkingAmt - newAmt;
      }
    
    public void setCheckingAmtTransferToSaving(double newAmt) {
	this.checkingAmt = checkingAmt - newAmt;
      }
    
    public void setCheckingAmtTransferFromSaving(double newAmt) {
	this.checkingAmt = checkingAmt + newAmt;
      }
    
    public String toString () {
   	return "Your checking acount " +"("+checkingAccount+") balance is: " + checkingAmt;
       }

}
