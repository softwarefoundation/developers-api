package com.softwarefoundation.developersapi.lambda;

import java.util.function.Function;

public class FunctionsParametro {

    public static void main(String[] args) {

        Integer numero = convert(  s -> Integer.valueOf(s) , "10");
        System.out.println(numero);
    }

    private static Integer convert(Function<String, Integer> convert, String numero){
        return convert.apply(numero);
    }

}
