package com.softwarefoundation.developersapi.datetime;

import java.time.LocalTime;

public class AdicaoEhSubstracaoDeDatasEhHoras {

    public static void main(String[] args) {

        LocalTime hora = LocalTime.now();
        System.out.println(hora);
        System.out.println("-----------------------");
        System.out.println(hora.minusHours(2));
        System.out.println(hora.minusMinutes(5));
        System.out.println(hora.minusSeconds(10));
        System.out.println("-----------------------");
        System.out.println(hora.plusHours(3));
        System.out.println(hora.plusMinutes(11));
        System.out.println(hora.plusSeconds(13));

    }

}
