public class HasNoCard implements ATMState {

    ATMMachine atmMachine;

    public HasNoCard(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("Please Enter a Card");
        atmMachine.setAtmState(atmMachine.validateCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("Please insert a card First");
    }

    @Override
    public void insertPin(int PinNumber) {
        System.out.println("Please insert a card First");
    }

    @Override
    public void requestCash(int cachToWithdraw) {
        System.out.println("Please insert a card First");
    }
}
