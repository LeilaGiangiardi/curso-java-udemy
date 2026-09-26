package sc14_tratamento_excecoes.ex03_excecoes_personalizadas.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import sc14_tratamento_excecoes.ex03_excecoes_personalizadas.model.entities.Reserva;
import sc14_tratamento_excecoes.ex03_excecoes_personalizadas.model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int number = sc.nextInt();
            System.out.print("Data de check-in (DD/MM/YYYY): ");
            LocalDate checkin = LocalDate.parse(sc.next(), fmt);
            System.out.print("Data de check-out (DD/MM/YYYY): ");
            LocalDate checkout = LocalDate.parse(sc.next(), fmt);

            // Instancia a reserva (se as datas forem inválidas, ele pula pro catch na hora)
            Reserva reserva = new Reserva(number, checkin, checkout);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com os dados para atualizar a reserva:");
            System.out.print("Data de check-in (DD/MM/YYYY): ");
            checkin = LocalDate.parse(sc.next(), fmt);
            System.out.print("Data de check-out (DD/MM/YYYY): ");
            checkout = LocalDate.parse(sc.next(), fmt);

            // Tenta atualizar (novamente, se der erro, cai no catch)
            reserva.updateDates(checkin, checkout);
            System.out.println("Reserva: " + reserva);
        }
        catch (DomainException e) {
            // Captura os erros de negócio (datas inválidas) que nós mesmos criamos
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            // Captura o erro se o usuário digitar letras no número do quarto
            System.out.println("Erro de entrada: O número do quarto deve ser numérico.");
        }
        catch (RuntimeException e) {
            // para qualquer erro que não previmos
            System.out.println("Erro inesperado aconteceu.");
        }

        sc.close();
    }
}