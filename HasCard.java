public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("please Enter a card. ");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setAtmState(atmMachine.beforeCard());
    }

    @Override
    public void insertPin(int PinNumber) {
        if (PinNumber == 1017){
            System.out.println("Correct PIN");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.validatePin());
        } else {
            System.out.println("Wrong Pin, try Again");
            atmMachine.correctPinEntered = false;
            System.out.println("Card Ejected");
            atmMachine.setAtmState(atmMachine.beforeCard());
        }
    }

    @Override
    public void requestCash(int cachToWithdraw) {
        System.out.println("Enter the PIN first: ");
    }
}
