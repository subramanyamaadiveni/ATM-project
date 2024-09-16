package atm_machin;
// interface class are used to achive abstraction
public interface AtmOperationsInterface {
    public void viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void depositAmount(double  depositAmount);
    public void viewMiniStatement();
}
