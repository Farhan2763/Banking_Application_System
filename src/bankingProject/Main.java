package bankingProject;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("which bank you want to open an account");
        System.out.println("option 1 form LotakBank and Option 2 for SBIBank");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        System.out.println("Enter password and initial deposit");
        String password=sc.next();
        Integer initialBalance=sc.nextInt();
        double account=Math.abs(Math.random()*Math.pow(10,9));
        String stringVersion=String.valueOf(account);
        RBIBankSystem bankaccount;
        if(option==1){
                bankaccount=new LotakBank(stringVersion,password,initialBalance);
        }
        else{
            bankaccount=new SBIBank(stringVersion,password,initialBalance);
        }
        String result =bankaccount.withdrawMoney(700000,"far123");
        System.out.println(result);
        result=bankaccount.withdrawMoney(70000,"far123");
        System.out.println(result);
        result=bankaccount.depositeMoney(70000);
        System.out.println(result);
        System.out.println(bankaccount.checkBalance("far123"));
        System.out.println(bankaccount.calculateTotalInterest(3));

    }
}