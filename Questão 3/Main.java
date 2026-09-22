public class Main {
    
    public static void main(String[] args) {
        Autor autor1 = new Autor("Neal Shusterman", "Americano");
        Livro livro1 = new Livro("O Ceifador", 40.0, autor1);

        livro1.exibirDetalhes();
    }
}
