package sc08_introducao_poo.ex07_conversor.util;

public class ConversorMoeda {

    // Constante estática para o IOF (6%)
    public static final double IOF = 0.06;

    // Método estático para conversão
    public static double dolarParaReal(double cotacao, double montante) {
        double valorSemImposto = cotacao * montante;
        return valorSemImposto * (1.0 + IOF);
    }
}