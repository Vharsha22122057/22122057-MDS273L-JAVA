import java.util.Scanner;
class BankDetails{   //Parent Class
    private String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);  
    
    // To open account
    public void OpenAccount(){
        System.out.print("Enter the account number: ");
        accno=sc.next();
        System.out.print("Enter the account name: ");
        name=sc.next();
        System.out.print("Enter the account type: ");
        acc_type=sc.next();
        System.out.print("Enter the balance of your account: ");
        balance=sc.nextLong();
    }
    
    //Show accounnt details
    public void ShowAccount(){
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accno);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " + balance);
    }
    

    //To deposit amount
    public void deposit(){
        long amt;
        System.out.print("Enter the amount you want to deposit: ");
        amt=sc.nextLong();
        balance=balance+amt;
        System.out.print("Your current balance is "+balance);
    }

    //To withdraw the amount
    public void withdraw(){
        long amt;
        System.out.print("Enter the amount you want to withdraw: ");
        amt=sc.nextLong();
        if(balance>=amt){
            balance=balance-amt;
            System.out.print("Your current balance is "+balance);
        }
        else{
            System.out.print("your account balance is low");
        }
    }

    //method to search an account number  
    public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            ShowAccount();  
            return (true);  
        }  
        return (false);  
    }  
}

public class lab4{
    public static void main (String arg[]){
        Scanner sc= new Scanner(System.in);
        //Creating initial accounts
        System.out.print("How many number of customers do you want to input? ");  
        int n = sc.nextInt();  
        BankDetails C[] = new BankDetails[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new BankDetails();  
            C[i].OpenAccount();  
        }

        int choice;
        do{
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            choice = sc.nextInt();  
                switch (choice) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].ShowAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].withdraw();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (choice != 5);  
    }  
}

    
