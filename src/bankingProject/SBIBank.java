package bankingProject;

public class SBIBank implements RBIBankSystem{

    private String accNo;
     private String passCode;

     private double bal;

     private Integer minimum=500;

     private double rateOfInterest=6;

     public SBIBank(String accNo,String passCode, double bal){
         this.accNo=accNo;
         this.passCode=passCode;
         this.bal=bal;
     }
     public String depositeMoney(int money) {
        if(money>0){
            bal=bal+money;
            return "Money :"+money+"has been added Total"+"balance is "+bal;
        }
        else{
            return "money is negative this is cannot be added";
        }
    }

    public String withdrawMoney(int money,String password) {
        if(password.equals(this.passCode)){
            if(bal-minimum>=money) {
                bal= bal- money;
                return " your entered money withdraw from your account and your current balance is" + bal;
            }else{
                return "insufficient money can not be withdraw";
            }
        }
        else{
            return "wrong password please entered right password";
        }
    }

    public String checkBalance(String password) {
        if(this.passCode.equals(password)){
            return "your current balance is"+this.bal;
        }
        else{
            return "you entered wrong password";
        }
    }

    public Double calculateTotalInterest(int time) {
        double simpleInterest=(rateOfInterest*time*bal)/100;
        return simpleInterest;
    }
}
