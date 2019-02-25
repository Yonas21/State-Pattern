public class HasNoCash implements ATMState {

    ATMMachine atmMachine;

    public HasNoCash(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("we don't have cash");
    }

    @Override
    public void ejectCard() {
        System.out.println("please Enter the card.");
    }

    @Override
    public void insertPin(int PinNumber) {
        System.out.println("please Enter the card first.");
    }

    @Override
    public void requestCash(int cachToWithdraw) {
        System.out.println("please Enter the card first.");
    }
}
