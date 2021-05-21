package com.softwarefoundation.developersapi.lambda;

import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {
        Function<String, Integer> convertToInteger =  s ->  {
            return Integer.valueOf(s) + 1;
        };

        Function<String, Integer> convertToInteger2 =  s -> Integer.valueOf(s) + 2;

        System.out.println( convertToInteger.apply("3") );
        System.out.println( convertToInteger2.apply("5") );



    }

}
