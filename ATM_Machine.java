
import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 2521;
    public void chekPin(){
        System.out.println("Enter Your ATM PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin==PIN){
            menu();
        }else {
            System.out.println("Enter Vaild PIN: ");
            chekPin();
        }
    }

    public void menu(){
        System.out.println("Enter Your Choise:");
        System.out.println("1. Check A/C Balance: ");
        System.out.println("2. Withdraw Money: ");
        System.out.println("3. Deposit Money: ");
        System.out.println("4. Transfer Money");
        System.out.println("5. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt==1){
            checkBalnce();
        } else if (opt==2) {
            withdrawMoney();
        } else if (opt==3) {
            depositMoney();
        } else if (opt==4) {
            transfer();
        } else if (opt==5) {
            return;
        } else {
            System.out.println("Enter Vaild Choise: ");
        }
    }

    public void checkBalnce(){
        System.out.println("Your Current Balance = " + Balance);
        System.out.println("************************");
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance:");
        }else {
            Balance = Balance - amount;
            System.out.println("Money Withdraw Successful:  " + amount);
        }
        System.out.println("************************");
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter Amount to Deposit:");
        Scanner sc = new Scanner(System.in);
        float deAmount = sc.nextFloat();
        Balance = deAmount + Balance;
        System.out.println("Money Deposit Successful:  " + deAmount);
        System.out.println("************************");
        menu();
    }
    public void transfer(){
        float tar = 0;
        System.out.println("Enter Account Number:");
        Scanner sc = new Scanner(System.in);
        int Account = sc.nextInt();
        System.out.println("Your Account Number "+Account);
        float tarnAmount=0;
        if (Balance>tarnAmount){
            System.out.println("Enetr Amount to Transfer:");
            tarnAmount = sc.nextFloat();
            Balance = Balance - tarnAmount;
            System.out.println("Your Amount is Successful Transfer:");

        } else{
            System.out.println("Insufficient Balance:");
        }
        System.out.println("************************");
        menu();
    }
}
public class ATM_Machine {
    public static void main(String[] args) {
    ATM obj = new ATM();
    obj.chekPin();
    }
}
