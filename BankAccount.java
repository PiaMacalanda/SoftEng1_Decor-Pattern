public interface BankAccount {

    String showAccountType();
    double getInterestRate();
    double getBalance();
    String showBenefits(); 
    /*
     * On the uml diagram, the var type of showBenefits() is double 
        however the print output is text so I guess it should be String not double. 
        o(*￣▽￣*)ブ
     */
    double computeBalanceWithInterest();
    String showInfo();

}