package sc11_data_hora.global_para_local;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {
        
        // instanciando datas base para os testes
        LocalDate d4 = LocalDate.parse("2026-07-20");
        LocalDateTime d5 = LocalDateTime.parse("2026-07-20T01:30:26");
        Instant d6 = Instant.parse("2026-07-20T01:30:26Z"); 
        
        // convertendo instant (global) para localdate usando fusos horarios
        // ofinstant pede a data global e o fuso (zoneid) desejado
        // systemdefault() pega o fuso horario do computador rodando o sistema
        LocalDate r1 = LocalDate.ofInstant(d6, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d6, ZoneId.of("Portugal"));
        
        // convertendo instant para localdatetime (trazendo a hora junto)
        LocalDateTime r3 = LocalDateTime.ofInstant(d6, ZoneId.of("Portugal"));
        LocalDateTime r4 = LocalDateTime.ofInstant(d6, ZoneId.systemDefault());

        System.out.println("conversao de global para local");
        System.out.println("d6 (global): " + d6);
        System.out.println("r1 (localdate pc): " + r1);
        System.out.println("r2 (localdate portugal): " + r2);
        System.out.println("r3 (localdatetime portugal): " + r3);
        System.out.println("r4 (localdatetime pc): " + r4);
        System.out.println();
        
        // extraindo dados isolados de uma data local
        System.out.println("dados isolados de d4 (localdate)");
        System.out.println("d4 dia: " + d4.getDayOfMonth());
        System.out.println("d4 mês: " + d4.getMonthValue());
        System.out.println("d4 ano: " + d4.getYear());
        System.out.println();
  
        // extraindo hora e minuto de uma data-hora local
        System.out.println("dados isolados de d5 (localdatetime)");
        System.out.println("d5 hora: " + d5.getHour());
        System.out.println("d5 minutos: " + d5.getMinute());
    }
}