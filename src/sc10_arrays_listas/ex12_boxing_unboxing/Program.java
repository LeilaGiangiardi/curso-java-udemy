package sc10_arrays_listas.ex12_boxing_unboxing;

public class Program {
    public static void main(String[] args) {
        
        int x = 20;

        Object obj = x; // Boxing (o int virou um objeto)

        System.out.println(obj);

        int y = (int) obj; // Unboxing (o objeto voltou a ser um int comum)
        System.out.println(y);
    
        Integer objWrapper = x; // Autoboxing natural (sem precisar do 'new')
        int z = objWrapper * 2; // Auto-unboxing na hora de realizar a conta
        System.out.println("Wrapper Class (Autoboxing): " + objWrapper);
        System.out.println("Wrapper Class (Auto-unboxing): " + z);

    
        // As Wrapper classes aceitam o valor null. 
        // Um int normal nunca pode ser nulo (ele nasce valendo 0), mas um Integer pode ser null, o que é crucial em banco de dados
        Integer idadeBancoDeDados = null; // Aceita perfeitamente 
        // int idadePrimitiva = null; // Isso daria erro de compilação! 
        
        System.out.println("Valor nulo permitido na Wrapper: " + idadeBancoDeDados);
    
    
    }
}
