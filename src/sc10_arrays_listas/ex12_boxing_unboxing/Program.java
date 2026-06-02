package sc10_arrays_listas.ex12_boxing_unboxing;

public class Program {
    public static void main(String[] args) {
        
        int x = 20;

        Object obj = x; // Boxing (o int virou um objeto)

        System.out.println(obj);

        int y = (int) obj; // Unboxing (o objeto voltou a ser um int comum)
        System.out.println(y);
    }
}
