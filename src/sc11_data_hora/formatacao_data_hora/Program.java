package sc11_data_hora.formatacao_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        LocalDate d4 = LocalDate.parse("2026-07-20");
        LocalDateTime d5 = LocalDateTime.parse("2026-07-20T01:30:26");
        // instant representa data e hora global (utc/gmt)
        Instant d6 = Instant.parse("2026-07-20T01:30:26Z"); 
        
        // referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // impressão sem formatação (padrão iso)
        System.out.println("d04: " + d4);

        // impressão formatada com .format (chamando a partir do objeto data)
        System.out.println("d04: " + d4.format(fmt1));

        // outra forma de formatar (chamando a partir do objeto formatter)
        System.out.println("d04: " + fmt1.format(d4));

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // usando formatações diferentes customizadas no mesmo objeto
        System.out.println("d5: " + d5.format(fmt1));
        System.out.println("d5: " + d5.format(fmt2));
            
        // formatador para o instant precisa de um fuso horário definido (zoneid)
        //pega o fuso horario do pc do usuario
        DateTimeFormatter fmt3 = DateTimeFormatter
            .ofPattern("dd/MM/yyyy HH:mm")
            .withZone(ZoneId.systemDefault());
        
        // zoneid.systemdefault pega o fuso horário local do seu computador
        System.out.println("d6: " + fmt3.format(d6));
    }
}