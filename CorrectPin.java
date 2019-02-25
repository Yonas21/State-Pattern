public class CorrectPin implements ATMState {

    ATMMachine atmMachine;

    public CorrectPin(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't Enter more than one Card.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setAtmState(atmMachine.beforeCard());
    }

    @Override
    public void insertPin(int PinNumber) {
        System.out.println("PIN Already Inserted");
    }

    @Override
    public void requestCash(int cachToWithdraw) {
        if (cachToWithdraw > atmMachine.cashInMachine){
            System.out.println("no Enough cash to Withdraw");
            System.out.println("Card Ejected");
            atmMachine.setAtmState(atmMachine.beforeCard());
        } else {
            System.out.println(cachToWithdraw + " ATM has this cash ");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cachToWithdraw);

            System.out.println("Card Ejected, please make sure to get Your Card");
            atmMachine.setAtmState(atmMachine.beforeCard());

            if (atmMachine.cashInMachine <= 0){
                atmMachine.setAtmState(atmMachine.beforeCard());
            }
        }
    }
}
