package week3.day1ass;

public class AxisBank extends BankInfo {
	/*
  Class     :AxisBank
		     Methods :deposit()

		Description:
		You have to override the method deposit in AxisBank.*/
	public void deposit() {
		System.out.println("Axis Bank info deposit method");
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.deposit();
	}
}

