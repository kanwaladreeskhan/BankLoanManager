package bankloanmanager;

public class BankLoan {
 private double loanamount;
 private int durationinmonth;
  protected double interestrate;
   protected double insuranceamt;
    protected double processingFee;
     protected double monthlyinstallment;
     
 BankLoan(double loanamount,int duration,double interestrate,double processingFee){
     this.loanamount=loanamount;
     this.durationinmonth=duration;
      this.interestrate=interestrate;
       this.processingFee=processingFee;
      
 }
 public double getLoanamount(){
      return loanamount;
  }
   public void setLoanamount(double loanamount){
    this.loanamount=loanamount;                         
  }
    public int getDuration(){
      return durationinmonth;
  }
   public void setDuration(int duration){
    this.durationinmonth=duration;                         
  }
   protected double calculateTotalLoanAmount() {
    return loanamount + insuranceamt + processingFee;
}
    public void CalculateMonthlyInstallment(){
    
  double r = interestrate / (12 * 100);
monthlyinstallment = (loanamount * r * Math.pow(1 + r, durationinmonth)) / (Math.pow(1 + r, durationinmonth) - 1);
       System.out.println("Monthly Installment:"+monthlyinstallment);
    }
}
