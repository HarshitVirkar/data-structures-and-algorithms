package com.dsa.programs;

/**
 * Created by harshit on 15/12/19.
 */
public class Recursion {

    // Tail recursive function
    int factorial( int n, int result ){
        if( n == 0 ){
            return result;
        }
        return factorial( n - 1, n * result );
    }

    int factorial( int n ){
        if( n == 0 ){
            return 1;
        }
        return n * factorial( n - 1 );
    }
}
