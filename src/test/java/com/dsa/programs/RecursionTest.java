package com.dsa.programs;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by harshit on 15/12/19.
 */

public class RecursionTest {
    Recursion recursion;

    @Before
    public void setup(){
        this.recursion = new Recursion();
    }

    @Test
    public void testFactorial(){
        assert recursion.factorial( 5, 1 ) == 120;
    }
}
