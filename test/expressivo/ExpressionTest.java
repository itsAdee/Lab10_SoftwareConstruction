/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the Expression abstract data type.
 */
public class ExpressionTest {

    // Testing strategy for Expression Interface
    // -----------------------------------------

    // parse():
    //   input: 
    //     - valid
    //     - invalid

    // toString():
    //   expression types: 
    //     - number
    //     - variable
    //     - add
    //     - multiply

    // equals():
    //   expression types: 
    //     - number
    //     - variable
    //     - add
    //     - multiply

    // hashCode():
    //   expression types: 
    //     - number
    //     - variable
    //     - add
    //     - multiply

    // number():
    //   value types: 
    //     - integer
    //     - floating-point

    // variable():
    //   name types: 
    //     - empty
    //     - non-empty

    // add():
    //   operand types: 
    //     - number
    //     - variable
    //     - add
    //     - multiply

    // multiply():
    //   operand types: 
    //     - number
    //     - variable
    //     - add
    //     - multiply
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    
    @Test(expected=IllegalArgumentException.class)
    public void testParseInvalidExpression() {
        Expression.parse("invalid");
    }

    @Test
    public void testParseValidExpression() {
        Expression e = Expression.parse("x + 2");
        assertNotNull(e);
    }

    @Test
    public void testToString() {
        Expression e = Expression.parse("x + 2");
        assertEquals("x + 2", e.toString());
    }

    @Test
    public void testEquals() {
        Expression e1 = Expression.parse("x + 2");
        Expression e2 = Expression.parse("x + 2");
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testHashCode() {
        Expression e1 = Expression.parse("x + 2");
        Expression e2 = Expression.parse("x + 2");
        assertEquals(e1.hashCode(), e2.hashCode());
    }

    @Test
    public void testNumber() {
        Expression e = Expression.number(2);
        assertEquals("2.0", e.toString());
    }

    @Test
    public void testVariable() {
        Expression e = Expression.variable("x");
        assertEquals("x", e.toString());
    }

    @Test
    public void testAdd() {
        Expression e1 = Expression.variable("x");
        Expression e2 = Expression.number(2);
        Expression e = Expression.add(e1, e2);
        assertEquals("x + 2.0", e.toString());
    }

    @Test
    public void testMultiply() {
        Expression e1 = Expression.variable("x");
        Expression e2 = Expression.number(2);
        Expression e = Expression.multiply(e1, e2);
        assertEquals("x * 2.0", e.toString());
    }

}
