package sc11_data_hora.calculos_data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        // datas base
        LocalDate d4 = LocalDate.parse("2026-07-20");
        LocalDateTime d5 = LocalDateTime.parse("2026-07-20T01:30:26");
        Instant d6 = Instant.parse("2026-07-20T01:30:26Z"); 
  
        // calculos com localdate
        LocalDate semanaAnterior = d4.minusDays(7);
        LocalDate proximaSemana = d4.plusDays(7);
        LocalDate maisUmAno = d4.plusYears(1);
        
        System.out.println("--- calculos com localdate ---");
        System.out.println("d4 original: " + d4);
        System.out.println("semana anterior: " + semanaAnterior);
        System.out.println("proxima semana: " + proximaSemana);
        System.out.println("adicionando 1 ano: " + maisUmAno);
        System.out.println();
    
        // calculos com localdatetime
        LocalDateTime semanaAnteriorLocal = d5.minusDays(7);
        LocalDateTime proximaSemanaLocal = d5.plusDays(7);
    
        System.out.println("--- calculos com localdatetime ---");
        System.out.println("semana anterior local: " + semanaAnteriorLocal);
        System.out.println("proxima semana local: " + proximaSemanaLocal);
        System.out.println();
    
        // calculos com instant (precisa do chronounit para especificar o que adicionar)
        Instant semanaPassadaInstant = d6.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d6.plus(7, ChronoUnit.DAYS);
    
        System.out.println("--- calculos com instant ---");
        System.out.println("semana passada instant: " + semanaPassadaInstant);
        System.out.println("proxima semana instant: " + proximaSemanaInstant);
        System.out.println();

        // calculando a duracao (diferenca entre datas)
        System.out.println("--- calculo de duracao ---");
        
        // localdate nao tem hora, entao forçamos o inicio do dia (meia-noite) com atstartofday()
        Duration t1 = Duration.between(semanaAnterior.atStartOfDay(), d4.atStartOfDay());
        System.out.println("t1 dias (diferenca entre semana passada e hoje): " + t1.toDays());

        // data mais antiga (d5) vem primeiro, data mais no futuro vem depois para nao dar negativo
        Duration t2 = Duration.between(d5, proximaSemanaLocal);
        System.out.println("t2 dias (diferenca entre hoje e proxima semana): " + t2.toDays());

        // duracao usando instant
        Duration t3 = Duration.between(semanaPassadaInstant, d6);
        System.out.println("t3 dias (diferenca no instant): " + t3.toDays());
    }
}