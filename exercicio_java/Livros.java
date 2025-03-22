package exercicio_java;

class Livro {
    // Atributos da classe
    String titulo;
    String autor;
    int numPaginas;
    double preco;

    // Construtor da classe
    public Livro(String titulo, String autor, int numPaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.preco = preco;
    }

    // Método para exibir as informações do livro
    public void exibirInformacoes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de Páginas: " + this.numPaginas);
        System.out.println("Preço: R$" + String.format("%.2f", this.preco));
    }
}

public class Livros {
    public static void main(String[] args) {
        // Criando instâncias de dois livros
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 512, 49.90);
        Livro livro2 = new Livro("O Primo Basílio", "José de Alencar", 400, 39.90);

        // Exibindo os dados dos livros
        System.out.println("Livro 1:");
        livro1.exibirInformacoes();
        System.out.println();
        
        System.out.println("Livro 2:");
        livro2.exibirInformacoes();
    }
}
