package expressivo;

public class AdditionExpression implements Expression {

  private final Expression left;
  private final Expression right;

  // Abstract Function: Represents an addition expression in the form of left + right.
  // Rep Invariant: true
  // Safety from rep exposure: All fields are private and final.

  private void checkRep() {
    assert left != null;
    assert right != null;
  }

  public AdditionExpression(Expression left, Expression right) {
    this.left = left;
    this.right = right;
    checkRep();
  }

  public Expression getLeft() {
    return left;
  }

  public Expression getRight() {
    return right;
  }

  @Override
  public String toString() {
    return "(" + left.toString() + " + " + right.toString() + ")";
  }

  @Override
  public boolean equals(Object thatObject) {
    if (thatObject == this) {
      return true;
    }
    if (!(thatObject instanceof AdditionExpression)) {
      return false;
    }
    AdditionExpression that = (AdditionExpression) thatObject;
    return this.left.equals(that.left) && this.right.equals(that.right);
  }

  @Override
  public int hashCode() {
    return left.hashCode() + right.hashCode();
  }
}
