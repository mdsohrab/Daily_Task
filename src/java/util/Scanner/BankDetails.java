
import java.util.Scanner;

public class BankDetails {
    private String account_number;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc= new Scanner(System.in);

    public void open_Account() {
        System.out.println("ENTER THE ACCOUNT NUMBER: ");
        account_number = sc.next();
        System.out.println("ENTER THE ACCOUNT HOLDER NAME: ");
        name = sc.next();
        System.out.println("ENTER THE ACCOUNT TYPE: ");
        acc_type = sc.next();
        System.out.println("ENTER THE BALANCE: ");
        balance = sc.nextLong();
    }
    public void ShowAccount(){
        System.out.println("Name of account holder:" + name);
        System.out.println("Account no:" + account_number);
        System.out.println("Account type:" + acc_type);
        System.out.println("Balance:"+ balance);
    }

    public void Deposit(){
        long amount;
        System.out.println("ENTER HOW MUCH YOU WANT TO DEPOSIT ON YOUR ACCOUNT:");
        amount= sc.nextLong();
        balance=balance+amount;
    }

    public void withdraw(){
        long amount;
        System.out.println("ENTER HOW MUCH AMOUNT YOU WANT TO WITHDRAW: ");
        amount=sc.nextLong();
        if(balance>=amount)
        {
            balance=balance-amount;
        }
        else {
            System.out.println("YOUR BALANCE IS LESS THAN" +amount+ "transcation failed...!!");
        }
    }
public boolean search(String ac_no)
{
    if(account_number.equals(ac_no))
    {
        ShowAccount();
        return (true);
    }
    else {
        return(false);
    }
}


}
