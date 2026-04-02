package sc08_introducao_poo.ex01_triangulo.entities;

public class Triangle {
    // Atributos da classe (as medidas dos lados)
    public double a;
    public double b;
    public double c;

    // Método para calcular a área (Delegação)
    public double area( ) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
