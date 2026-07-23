package sc11_data_hora.operacoes_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        
        // 1. INSTANCIANDO DATA-HORA ATUAL (O EXATO "AGORA")
        LocalDate d01 = LocalDate.now(); // Apenas a data local (sem hora e sem fuso)
        LocalDateTime d02 = LocalDateTime.now(); // Data e hora local (com frações de segundos, sem fuso)
        Instant d03 = Instant.now(); // Data e hora global (Fuso horário GMT/UTC - Londres)

        System.out.println("--- Instanciando a partir do 'agora' ---");
        System.out.println("d01 (LocalDate): " + d01);
        System.out.println("d02 (LocalDateTime): " + d02);
        System.out.println("d03 (Instant GMT): " + d03);
        System.out.println();
        
        // 2. CONVERTENDO TEXTO PADRÃO ISO 8601 PARA OBJETO DATA-HORA (PARSE)
        LocalDate d04 = LocalDate.parse("2026-07-28");
        LocalDateTime d05 = LocalDateTime.parse("2026-07-28T01:30:36");
        Instant d06 = Instant.parse("2026-07-28T01:30:36Z"); // O 'Z' no final indica o padrão UTC
        Instant d07 = Instant.parse("2026-07-28T01:30:36-03:00"); // Converte o fuso -03:00 para o horário global UTC

        System.out.println("--- Convertendo Texto (Parse ISO 8601) ---");
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06);
        System.out.println("d07: " + d07);
        System.out.println();
   
        // 3. CONVERTENDO TEXTO CUSTOMIZADO PARA DATA-HORA
        // Referência: https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html
   
        // Instanciando os objetos de formatação com o padrão desejado
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Fazendo o parse informando ao Java qual formato o texto está usando
        LocalDate d08 = LocalDate.parse("26/07/2026", formato1);
        LocalDateTime d09 = LocalDateTime.parse("22/07/2026 01:30", formato2);

        System.out.println("--- Convertendo Texto Customizado ---");
        System.out.println("d08: " + d08);
        System.out.println("d09: " + d09);
        System.out.println();
   
        // 4. INSTANCIANDO DATA-HORA A PARTIR DE DADOS ISOLADOS
        LocalDate d10 = LocalDate.of(2026, 7, 24); // Passando ano, mês e dia
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 24, 1, 30); // Passando ano, mês, dia, hora e minuto

        System.out.println("--- Instanciando por Dados Isolados ---");
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);
    }
}