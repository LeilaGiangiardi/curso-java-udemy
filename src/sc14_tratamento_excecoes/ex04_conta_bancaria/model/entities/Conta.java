package sc14_tratamento_excecoes.ex04_conta_bancaria.model.entities;

import sc14_tratamento_excecoes.ex04_conta_bancaria.model.exceptions.DomainException;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void sacar(Double valor) {
        // verifica se o valor do saque é maior que o saldo disponível
        if (valor > saldo) {
            throw new DomainException("Erro de saque: Saldo insuficiente");
        }
        // verifica se o valor do saque ultrapassa o limite permitido
        if (valor > limiteSaque) {
            throw new DomainException("Erro de saque: A quantia excede o limite de saque");
        }
        
        // se passar pelas validações acima, desconta do saldo
        saldo -= valor;
    }
}