package bitManipulation;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRunner {
    @Test
    public void InsertionTest() {
        int n = 1024;
        int m = 19; 
        int i = 2;
        int j = 6;

        int result = BitManipulation.Insertion(n, m, i, j);

        if (result != 1100) {
            fail("Bit Insertion did not produce expected value of 1100, or 10001001100");
        }
    }
    
    @Test 
    public void BinaryToStringTest() {
    	double val = .375;
    	String result = BitManipulation.BinaryToString(val);
    	
    	if (!result.equals(".011")) {
    		fail("Expected: .011 but method returned:" + result);
    	}
    }
    
    @Test
    public void FlipBitToWinTest() {
    	int num = 1775;
    	int result = BitManipulation.FlipBitToWin(num);
    	
    	if (result != 8) {
    		fail("The bit representation of 1775 can have a sequence of 8 1s, but method returned:" + result);
    	}
    }
}