package com.softwarefoundation.developersapi.lambda;

import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {
        Function<String, Integer> convertToInteger =  s ->  {
            return Integer.valueOf(s) + 1;
        };


        System.out.println( convertToInteger.apply("10") );



    }

}
