package expressivo;
public class NumberExpression implements Expression {
    private final double value;

    // Abstract Function: Represents a numeric constant in the expression.
    // Rep Invariant: true
    // Safety from rep exposure: All fields are private and final.

    public NumberExpression(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    @Override public String toString() {
        return Double.toString(value);
    }
    @Override public boolean equals(Object thatObject) {
    	if (thatObject == this) {
    		return true;
    	}
        if (!(thatObject instanceof NumberExpression)) {
            return false;
        }
        NumberExpression that = (NumberExpression) thatObject;
        return this.value == that.value;
    }
    @Override public int hashCode() {
        return Double.hashCode(value);
    }
}
