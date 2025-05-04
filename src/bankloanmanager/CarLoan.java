 
package bankloanmanager;

 public class CarLoan extends BankLoan{
      private double totAmount;
  
   CarLoan(double loanamount,int duration,double interestrate,double insuranceamt,double processingFee){
       super(loanamount,duration,interestrate,processingFee);
           
             this.insuranceamt=insuranceamt;

   }
 @Override
public void CalculateMonthlyInstallment( ) {
    System.out.println("Monthly Installment Calculator for Car Loan!");
    totAmount =super.calculateTotalLoanAmount();
    super.CalculateMonthlyInstallment( );
}
}
