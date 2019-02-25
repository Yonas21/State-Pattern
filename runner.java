import java.util.Scanner;

public class runner
{
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();

        //get the pin code for secret pass
        Scanner input = new Scanner(System.in);
        //enter the screen
        System.out.println("Enter The Secret Code: ");
        int pinNumber = input.nextInt();

        //enter the amount of cash to withdraw
        System.out.println("Enter the Amount of Cash: ");
        int cashToWithdraw = input.nextInt();
        atmMachine.insertCard();
        atmMachine.ejectCard();

        atmMachine.insertCard();
        atmMachine.insertPin(pinNumber);
        atmMachine.requestCash(cashToWithdraw);
    }
}
