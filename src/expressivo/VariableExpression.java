package expressivo;

public class VariableExpression implements Expression {

  private final String name;

  // Abstract Function: Represents a variable in the expression.
  // Rep Invariant: true
  // Safety from rep exposure: All fields are private and final.

  private void checkRep() {
    assert name != null;
  }

  public VariableExpression(String name) {
    this.name = name;
    checkRep();
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return this.name;
  }

  @Override
  public boolean equals(Object thatObject) {
    if (thatObject == this) {
      return true;
    }
    if (!(thatObject instanceof VariableExpression)) {
      return false;
    }
    VariableExpression that = (VariableExpression) thatObject;
    return this.toString().equals(that.toString());
  }

  @Override
  public int hashCode() {
    return this.name.hashCode();
  }
}
