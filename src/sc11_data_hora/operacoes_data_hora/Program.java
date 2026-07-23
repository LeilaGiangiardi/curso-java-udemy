package sc11_data_hora.operacoes_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        //instanciando data-hora

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        Instant d03 = Instant.now();

        System.out.println("Usando LocalDate");
        //somante a data
        System.out.println("d01: "+ d01);
        //Data e hora com frações de segundos
        System.out.println("d02:"+ d02);
        System.out.println(" ");
        System.out.println("usando isntant: ");
        //Data hora GMT
        System.out.println("d03"+d03);
        //o instant gera com o fuso horario de londres (global)

        
        //convertendo LocalData com parse
        LocalDate d04 = LocalDate.parse("2026-07-28");
        LocalDateTime d05 = LocalDateTime.parse("2026-07-28T01:30:36");
        System.out.println("d04: "+d04);
        System.out.println("d05:"+d05);


        //convertendo instant com parse
        Instant d06 = Instant.parse("2026-07-28T01:30:36z");
        System.out.println("d06: "+d06);

        //especificando um fuso horario
        Instant d07 = Instant.parse("2026-07-28T01:30:36-03:00");
        System.out.println("d07: "+d07);
   
   
        //referencia
        //https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html
        //classe para formatar datas -> converte uma string em um objeto data-hora
   
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //objeto de formatação instanciado

        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        //formatando uma data com a classe:
        LocalDate d08  = LocalDate.parse("26/07/2026", formato1);
        System.out.println("d09: "+d08);

        LocalDateTime d09 = LocalDateTime.parse("22/07/2026 01:30", formato2);
        System.out.println("d09: "+d09);
   
   
        //dados isolados
        LocalDate d10 = LocalDate.of(2026, 7, 24);
        System.out.println("d10: "+d10);
        
        LocalDateTime d11 = LocalDateTime.of(2022,7,24,1,30);
        System.out.println("d11: "+d11);
   
   
    }


}
