public interface ATMState
{
    void insertCard();
    void ejectCard();
    void insertPin(int PinNumber);
    void requestCash(int cachToWithdraw);
}
