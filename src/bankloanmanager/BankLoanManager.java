 
package bankloanmanager;
  import java.time.LocalDate;
public class BankLoanManager {

   public static void main(String[] args) {
        // Creating objects for different loan types
        BankLoan[] loans = new BankLoan[4];
        
        loans[0] = new CarLoan(500000, 60, 9.5, 10000, 5000);
        loans[1] = new HomeLoan(1500000, 240, 8.0, 20000, 10000, LocalDate.of(1980, 5, 3));
        loans[2] = new PersonalLoan(200000, 24, 12.0, 3000);
        loans[3] = new CarLoan(300000, 36, 10.5, 15000, 4000);

        // Loop through the array and call the CalculateMonthlyInstallment method for each loan
        for (BankLoan loan : loans) {
            loan.CalculateMonthlyInstallment();  // Polymorphic call
            System.out.println("--------------------");
    }
   }
}
