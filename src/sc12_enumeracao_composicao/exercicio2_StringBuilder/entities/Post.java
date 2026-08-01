package sc12_enumeracao_composicao.exercicio2_StringBuilder.entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private static DateTimeFormatter fmt = DateTimeFormatter
        .ofPattern("dd/MM/yyyy HH:mm:ss")
        .withZone(ZoneId.systemDefault()); //fuso horario do computador
    private Instant data;
    private String titulo;
    private String conteudo;
    private Integer likes; 
    private List<Comentario> comentarios = new ArrayList<>();
    
    public Post() {
    }
    
    public Post(Instant data, String titulo, String conteudo, Integer likes) {
        this.data = data;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public static DateTimeFormatter getFmt() {
        return fmt;
    }

    public static void setFmt(DateTimeFormatter fmt) {
        Post.fmt = fmt;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    public void removerComentario(Comentario comentario){
        comentarios.remove(comentario);
   
    
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(titulo+"\n"); //\n para quebra de linha
            sb.append(likes);
            sb.append(" Likes - ");
            sb.append(fmt.format(data)+"\n");
            sb.append(conteudo+"\n");
            sb.append("Comentários:"+"\n");
            for (Comentario c: comentarios){
                sb.append(c.getTexto()+"\n");
            }
            return sb.toString();

        




    }
}
