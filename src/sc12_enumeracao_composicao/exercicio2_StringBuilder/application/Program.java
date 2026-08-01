package sc12_enumeracao_composicao.exercicio2_StringBuilder.application;

import java.time.Instant;


import sc12_enumeracao_composicao.exercicio2_StringBuilder.entities.Comentario;
import sc12_enumeracao_composicao.exercicio2_StringBuilder.entities.Post;


public class Program {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        Comentario c1 = new Comentario("Bom passeio");
        Comentario c2 = new Comentario("bem-vindo!");
        Comentario c3 = new Comentario("que lugar lindo!");

    
       Post p1 = new Post(
        Instant.parse("2018-06-21T13:05:44Z"),
        "Viajando para Nova Zelandia", 
        "Vou visitar esse país maravilhoso!", 
        12);
   
        p1.addComentario(c1);
        p1.addComentario(c2);
        p1.addComentario(c3);


        Comentario c4 = new Comentario("Boa noite");
        Comentario c5 = new Comentario("Que a Força esteja com você");

        Post p2 = new Post(
            Instant.parse("2018-07-28T23:14:19Z"),
            "Boa noite pessoal",
            "Até amanhã",
            5
        );

        p2.addComentario(c4);
        p2.addComentario(c5);

        System.out.println(p1);
        System.out.println(p2); 
   
    }
}
