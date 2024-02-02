public class BankAccount {
    private String accountNumber ;
    private double accountBalance ;
    private String customerName ;
    private String customerEmail ;
    private String customerPhoneNumber;

    public BankAccount() {

        this ("01107819228700",300.5,"Default name","Default email","Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber,double accountBalance,String customerName,String email,String phoneNumber) {
        System.out.println("Account constructor with parameters");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("0118",123,customerName,customerEmail,customerPhoneNumber);
        //this.customerName = customerName;
        //this.customerEmail = customerEmail;
        //this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of $" +depositAmount + " made .New balance is $" + accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (accountBalance-withdrawalAmount < 0) {
            System.out.println("Insufficient funds! You only have $"+accountBalance + " in your account");
        } else {
            accountBalance -=withdrawalAmount;
            System.out.println("Withdrawal of $" +withdrawalAmount +" processed,remaining balance =$"+accountBalance);
        }
    }
    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return customerEmail;
    }

    public String getPhoneNumber() {
        return customerPhoneNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void  setAccountNumber(){
        this.accountNumber = accountNumber;

    }
}
