public class ATMMachine
{
    ATMState hasCard;
    ATMState noCard;
    ATMState correctPin;
    ATMState noCash;

    ATMState atmState;
    int cashInMachine = 35000;
    boolean correctPinEntered = false;

    public ATMMachine(){
        hasCard = new HasCard(this);
        noCard = new HasNoCard(this);
        correctPin = new CorrectPin(this);
        noCash = new HasNoCash(this);

        //initial Atm state
        atmState = noCard;

        if (cashInMachine < 0){
            atmState = noCash;
        }


    }

    void setAtmState(ATMState newAtmState){
        atmState = newAtmState;
    }

    public void setCashInMachine(int newCashInMachine){
        cashInMachine = newCashInMachine;
    }

    public void insertCard(){
        atmState.insertCard();
    }

    public void ejectCard(){
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithDraw){
        atmState.requestCash(cashToWithDraw);
    }

    public void insertPin(int pinToBeInserted){
        atmState.insertPin(pinToBeInserted);
    }

    public ATMState validateCard(){return hasCard;}
    public ATMState beforeCard(){return noCard;}
    public ATMState validatePin(){return correctPin;}
    public ATMState validateCash(){return noCash;}
}
