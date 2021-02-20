package com.softwarefoundation.developersapi.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatacaoDataEhHora {

    public static void main(String[] args) {

        LocalTime hora = LocalTime.now();
        System.out.println(hora.format(DateTimeFormatter.ofPattern("hh:mm:ss")));

        LocalDate data = LocalDate.now();
        System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));

    }
}
