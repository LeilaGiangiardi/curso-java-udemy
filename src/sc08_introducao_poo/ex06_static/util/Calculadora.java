package sc08_introducao_poo.ex06_static.util;

public class Calculadora {

    // Constante estática (final indica que o valor não muda)
    public static final double PI = 3.14159;

    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI * Math.pow(raio, 3) / 3.0;
    }
}