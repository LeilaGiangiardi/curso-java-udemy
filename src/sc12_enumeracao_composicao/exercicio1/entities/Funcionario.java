package sc12_enumeracao_composicao.exercicio1.entities;

import java.util.ArrayList;
import java.util.List;

import sc12_enumeracao_composicao.exercicio1.entities_enum.Level;


public class Funcionario {
    private String nome;
    private Level level;
    private Double salarioBase;
    private Departamento departamento;
    private List<ContratoPorHora> contratos = new ArrayList<>();

    public Funcionario(){
    }

    public Funcionario(String nome, Level level, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Level getLevel() {
        return level;
    }


    public void setLevel(Level level) {
        this.level = level;
    }


    public Double getSalarioBase() {
        return salarioBase;
    }


    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public Departamento getDepartamento() {
        return departamento;
    }


    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


    public List<ContratoPorHora> getContratos() {
        return contratos;
    }

    public void addContrato(ContratoPorHora contrato){
        contratos.add(contrato);
    }

    public void removerContrato(ContratoPorHora contrato){
        contratos.remove(contrato);
    }

    // Método para calcular a renda total do trabalhador em um mês e ano específicos
    public double renda(int ano, int mes) {
        double soma = salarioBase;
        
        for (ContratoPorHora contrato : contratos) {
            int c_ano = contrato.getDate().getYear();
            int c_mes = contrato.getDate().getMonthValue();
            
            if (ano == c_ano && mes == c_mes) {
                soma += contrato.valorTotal();
            }
        }
        return soma;
    }
}
