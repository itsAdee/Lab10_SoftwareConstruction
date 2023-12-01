package expressivo;

public class VariableExpression implements Expression {
    private final String name;

    // Abstract Function: Represents a variable in the expression.
    // Rep Invariant: true
    // Safety from rep exposure: All fields are private and final.

    public VariableExpression(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override public String toString() {
        return name;
    }
    @Override public boolean equals(Object thatObject) {
        if (!(thatObject instanceof VariableExpression)) {
            return false;
        }
        VariableExpression that = (VariableExpression) thatObject;
        return this.name.equals(that.name);
    }
    @Override public int hashCode() {
        return name.hashCode();
    }
}
