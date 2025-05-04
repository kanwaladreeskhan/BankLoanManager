
package bankloanmanager;
import java.time.LocalDate;
import java.time.Period;
public class HomeLoan extends BankLoan{
private double totAmount;
private LocalDate dateOfBirth;

 HomeLoan(double loanamount,int duration,double interestrate,double insuranceamt,double processingFee,LocalDate dateOfBirth){
   super(loanamount,duration,interestrate,processingFee);

         this.insuranceamt=insuranceamt;
        this.dateOfBirth=dateOfBirth;
}
@Override
public void CalculateMonthlyInstallment( ){
    System.out.println("Monthly Installment Calculator for Home Loan!");
    LocalDate today = LocalDate.now();
    Period age=Period.between(dateOfBirth, today);
    int years=age.getYears();

if (years < 25) {
    System.out.println("You are not eligible for loan!");
        return;
} else if (years > 45 && getDuration() > 120) {
    System.out.println("Max allowed duration is 10 years for age > 45!");
    return;
} else if (years >= 25 && years <= 45 && getDuration() > 240) {
    System.out.println("Max allowed duration is 20 years for your age group!");
    return;
}
     totAmount=super.calculateTotalLoanAmount();
     super.CalculateMonthlyInstallment( );
}
}
