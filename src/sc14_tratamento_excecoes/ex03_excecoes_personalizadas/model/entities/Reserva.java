package sc14_tratamento_excecoes.ex03_excecoes_personalizadas.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import sc14_tratamento_excecoes.ex03_excecoes_personalizadas.model.exceptions.DomainException;

public class Reserva {
    private Integer roomNumber; 
    private LocalDate checkin; 
    private LocalDate checkout; 

    // Formatador estático para ser usado no toString
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reserva(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException {
        // Regra: A data de saída deve ser maior que a data de entrada
        if (!checkout.isAfter(checkin)) {
            throw new DomainException("Erro na reserva: A data de saída deve ser maior que a data de entrada.");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    // Método que calcula a duração em dias
    public Integer duration() {
        // O ChronoUnit descobre a diferença de dias exata entre as duas datas
        return (int) ChronoUnit.DAYS.between(checkin, checkout);
    }

    // Método para atualizar as datas
    public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException {
        LocalDate agora = LocalDate.now();
        
        // Regra: Alterações de reserva só podem ocorrer para datas futuras
        if (checkin.isBefore(agora) || checkout.isBefore(agora)) {
            throw new DomainException("Erro na reserva: As datas para atualização devem ser futuras.");
        }
        // Regra: A data de saída deve ser maior que a data de entrada
        if (!checkout.isAfter(checkin)) {
            throw new DomainException("Erro na reserva: A data de saída deve ser maior que a data de entrada.");
        }
        
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Quarto "
            + roomNumber
            + ", check-in: "
            + checkin.format(fmt)
            + ", check-out: "
            + checkout.format(fmt)
            + ", "
            + duration()
            + " noites";
    }
}