package sc08_introducao_poo.ex03_retangulo.entities;

public class Retangulo {
    public double base;
    public double altura;

    public double area(){
        double area = base * altura;
        return area;
    }

    public double perimetro(){
        double perimetro = 2 * (base+altura);
        return perimetro;
    }

    public double diagonal(){
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return diagonal;
    }
    
}
