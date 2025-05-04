 
package bankloanmanager;
      public class PersonalLoan extends BankLoan{
      private double totAmount;
  
   PersonalLoan(double loanamount,int duration,double interestrate,double processingFee){
       super(loanamount,duration,interestrate,processingFee);
     }
    @Override
   public void CalculateMonthlyInstallment( ){
        System.out.println("Monthly Installment Calculator for Personal Loan!");
        super.calculateTotalLoanAmount();
         super.CalculateMonthlyInstallment();
   }
}
