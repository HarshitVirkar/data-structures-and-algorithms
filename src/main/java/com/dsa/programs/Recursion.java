package com.dsa.programs;

/**
 * Created by harshit on 15/12/19.
 */
public class Recursion {
    int factorial( int n, int result ){
        if( n == 0 ){
            return result;
        }
        return factorial( n - 1, n * result );
    }
}
