package sc12_enumeracao_composicao.exercicio1.entities;

import java.time.LocalDate; 

public class ContratoPorHora {
    private LocalDate date; 
    private Double valorPorHora;
    private Integer horas;
    
    public ContratoPorHora() {
    }

    public ContratoPorHora(LocalDate date, Double valorPorHora, Integer horas) { 
        this.date = date;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public LocalDate getDate() { 
        return date;
    }

    public void setDate(LocalDate date) { 
        this.date = date;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double valorTotal(){
        return valorPorHora * horas;
    }
}