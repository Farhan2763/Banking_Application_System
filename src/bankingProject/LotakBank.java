package bankingProject;

public class LotakBank implements RBIBankSystem{

    private String accountNo;
    private String password;

    private double balance;

    private double rateOfInterest=7.5;

    public LotakBank(String accountNo,String password,double balance){
        this.accountNo=accountNo;
        this.password=password;
        this.balance=balance;
    }

    public String depositeMoney(int money) {

        if(money>0){
            balance=balance+money;
            return "Money :"+money+"has been added Total"+"balance is "+balance;
        }
        else{
            return "money is negative this is cannot be added";
        }
    }

    public String withdrawMoney(int money,String password) {
        if(password.equals(this.password)){
            if(balance>=money) {
                balance = balance - money;
                return " your entered money withdraw from your account and your current balance is" + balance;
            }else{
                return "insufficient money can not be withdraw";
            }
        }
        else{
            return "wrong password please entered right password";
        }
    }

    public String checkBalance(String password) {
        if(this.password.equals(password)){
            return "your current balance is"+this.balance;
        }
        else{
            return "you entered wrong password";
        }
    }

    public Double calculateTotalInterest(int time) {
            double simpleInterest=(rateOfInterest*time*balance)/100;
            return simpleInterest;
    }


}
