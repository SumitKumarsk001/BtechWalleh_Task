

import java.util.*;
 class BankDetail {
    
    private String accountno;
    private String name;
    private String account_type;
    private long balance;

    Scanner sc =new Scanner(System.in);
    

    public void openAccount()
    {
        System.out.println("Enter Account No:");
        accountno =sc.next();
        System.out.println("Enter Account type");
        account_type = sc.next();
        System.out.println("Enter Name");
        name = sc.next();
        System.out.println("Enter Balance");
        balance = sc.nextLong();
    }

    public void showAccount(){
        System.out.println("Name of account holder:" +name);
        System.out.println("Account no"+accountno);
        System.out.println("Account type" +account_type);
        System.out.println("Balance"+balance);
    }
public void deposit(){
    long amt;
    System.out.println("Enter the amount you want to deposit");
    amt = sc.nextLong();
    balance= balance+amt;
}
    public void withdrawal(){
        long amt;
        System.out.println("Enter the amount you want to withdraw");
        amt = sc.nextLong();
        if(balance>=amt){
            balance=balance-amt;
            System.out.println("Balance after withdrawal"+balance);
        }else{
            System.out.println("Your balance is less than"+amt+"\tTransaction failed..");
        }
    }
    public boolean search(String account_no){
        if(accountno.equals(account_no)){
            showAccount();
            return(true);
        }
        return(false);
        
    }}
    public class BankingApps{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("How many number of customers do you want to input?");
            int n =sc.nextInt();
            BankDetail C[] = new BankDetail[n];
            for(int i=0;i<C.length;i++){
                C[i]=new BankDetail();
                C[i].openAccount();
            }
            int ch;
            do{
                System.out.println("\n***Banking System Application***");
                System.out.println("1.Display all accouunt details ");
                System.out.println("2.Search by Account number");
                System.out.println("3.Deposit the amount");
                System.out.println("4.Withdraw the amount");
                System.out.println("5.Exit");
                System.out.println("Enter your choice");
                ch=sc.nextInt();
    switch (ch) {
            case 1:
                    for(int i=0;i<C.length;i++){
                        C[i].showAccount();
                    }
                    break;
            case 2:
                    System.out.println("Enter account no.you want to search");
                    String account_no = sc.next();
                    boolean found = false;
                    for(int i=0;i<C.length;i++){
                        found = C[i].search(account_no);
                        if(found){
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Search failed! Account doesn't exits...!!");
                    }
                        break;
             case 3:
                        System.out.println("Enter Account no");
                        account_no = sc.next();
                        found = false;
                        for(int i=0;i<C.length;i++){
                            found= C[i].search(account_no);
                            if(found){
                                C[i].deposit();
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Search failed Account dosn't exit!!");
                        } break;
             case 4:
                            System.out.println("Enter Account No");
                            account_no= sc.next();
                            found = false;
                            for(int i=0;i<C.length;i++){
                                found =C[i].search(account_no);
                                if(found){
                                    C[i].withdrawal();
                                    break;
                                }
                            }
                        if(!found){
                            System.out.println("Search failed Account doesn't exits");
                        }
                        break;
            
                    case 5:
                    System.out.println("See you soon...");
                        break;
                }
            }
            while(ch!=5);
        }
    }



