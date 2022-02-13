package demo;

public class BankEMICalculator {
	
	private String customerName;
	private String accountNo;
	private double loanAmount;
	private EMICalculatorHelper helper = new EMICalculatorHelper();
	
	public EMICalculatorHelper getHelper() {
		return helper;
	}
	
	private class EMICalculatorHelper{
		int loanTerm = 60;
		double interestRate = 0.9;
		double interestpermonth = interestRate/loanAmount;
		
		protected double calcMonthlyPayment (double loan) {
			double EMI = (loan * interestpermonth) / ((1.0) - ((1.0)/ Math.pow(1.0 + interestpermonth , loanTerm)));
			return (Math.round(EMI));
		}
	}
	
	public static void main(String[] args) {
		
		BankEMICalculator object = new BankEMICalculator();
		
		System.out.println(object.getHelper().calcMonthlyPayment(5000.89));
	}
}
