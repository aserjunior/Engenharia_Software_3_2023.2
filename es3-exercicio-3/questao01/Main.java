package questao01;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor(1, "Aser Junior", "email@teste.com");
        System.out.println(autor.getId());

        Post post = new Post(1, "Olá Mundo!", autor, new Date(), "C:/Users/Cliente/Desktop/01.txt");
        System.out.println(post.getData());
        
        RepositorioDePosts repositorio = new RepositorioDePosts();

        repositorio.saveToFile(post);
    }
}   
