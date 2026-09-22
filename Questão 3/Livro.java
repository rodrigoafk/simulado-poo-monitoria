public class Livro {
    
    private String titulo;
    private double preco;
    private Autor autor;

    public Livro(String titulo, double preco, Autor autor) {
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Título do livro: " + this.titulo);
        System.out.printf("Preço do livro: R$ %.2f\n", this.preco);
        System.out.println("Autor do livro: " + this.autor.getNome());
    }
}
