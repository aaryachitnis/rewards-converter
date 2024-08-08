
// RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
// RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
// RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
// RewardValue must convert from miles to cash at a rate of 0.0035.

public class RewardValue {
    private double cashValue;
    private int milesValue;

    /*
    Constructor accepting cash value
     */
    public RewardValue (double cash){
        this.cashValue = cash;
        this.milesValue = (int) (this.cashValue / 0.0035);
    }

    /*
    Constructor accepting miles value
     */
    public RewardValue (int miles){
        this.milesValue = miles;
        this.cashValue = this.milesValue * 0.0035;
    }

    /*
    Accessor function for cashValue
     */
    public double getCashValue(){
        return cashValue;
    }

    /*
    Accessor function for milesValue
     */
    public int getMilesValue(){
        return milesValue;
    }
}
