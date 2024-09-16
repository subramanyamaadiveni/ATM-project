package atm_machin;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationsInterface op=new AtmOperationsImpl();
        int atmnumber=12345;
        int pin=123;
        Scanner input=new Scanner(System.in);
        System.out.println("                      $$$  Welcom to Atm Machine $$$");
        System.out.print("enter Atm card number: ");
        int Atmnumber=input.nextInt();
        System.out.print("enter pin number: ");
        int Pin=input.nextInt();
        if((atmnumber==Atmnumber) && (pin==Pin)){
            while (true){
                System.out.println("1.View Available Balance \n 2.Withdrawl Amount\n 3.Deposit Amount\n 4.Mini Statament \n 5.Exit ");
                System.out.println("Enter choice: ");
                int Choice =input.nextInt();
                switch (Choice){
                    case 1:
                        op.viewBalance();
                        break;
                    case 2:
                        System.out.println("$500 notes only available");
                        System.out.print("Enter the withdraw amount:");
                        double withdraw= input.nextDouble();
                        op.withdrawAmount(withdraw);



                        break;
                    case 3:
                        System.out.print("enter how much amount to Deposit:");
                        double depositAmount= input.nextDouble();
                        op.depositAmount(depositAmount);


                        break;
                    case 4:
                        op.viewMiniStatement();

                        break;
                    case 5:
                        System.out.println("Collect Your Atm card\n Tq For using ATM Machine \n Visit Again ");
                        System.exit(0);
                        break;
                    default:
                        System.out.println(" Please enter correct choice");
                }

            }
        }
        else{
            System.out.println("Incorrect Atm number or Pin");
            System.out.println("Check Once And Retry");
            System.exit(0);
        }

    }
}
