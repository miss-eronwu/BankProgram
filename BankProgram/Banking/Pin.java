package Banking;

public class Pin {
    
    public int pin = 0;
    
    Pin(int pin){
	this.pin = pin;
    }
    
    public int getPin() {
	return pin;
}

public void setPin(int newPin) {
	this.pin = newPin;
}

public String toString() {
    return "Your Pin number is: " + pin;
}
    

}
