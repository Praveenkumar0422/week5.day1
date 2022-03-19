package week5.day1;

public class AxisBank extends BankInfo{
	public void deposit() {
		super.deposit();
		System.out.println("deposit amount 5000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();

	}

}
