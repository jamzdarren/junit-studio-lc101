package test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // test 1
    @Test
    public void testGoodString1() {
        assertEquals(BalancedBrackets.hasBalancedBrackets(""), true);
    }
    // test 2
    @Test
    public void testGoodString2() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"), true);
    }
    // test 3
    @Test
    public void testGoodString3() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("Launch[Code]"), true);
    }
    // test 4
    @Test
    public void testGoodString4() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"), true);
    }
    // test 5
    @Test
    public void testGoodString5() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[]"), true);
    }
    // test 6
    @Test
    public void testGoodString6() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("1111[]1111[]1111"), true);
    }
    // test 7
    @Test
    public void testBadString1() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[LaunchCode"), false);
    }
    // test 8
    @Test
    public void testBadString2() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("Launch]Code["), false);
    }
    // test 9
    @Test
    public void testBadString3() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("["), false);
    }
    // test 10
    @Test
    public void testBadString4() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("]["), false);
    }
    // test 11
    @Test
    public void testBadString5() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("111["), false);
    }
    // test 12
    @Test
    public void testBadString6() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("111[1111["), false);
    }

}
