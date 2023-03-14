package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        int a = 5, b = 3;

        Livro livro = new livro(nome;: "Dragões de Éter", numPaginas:300);
        System.out.println(livro1);

        Gato gato = new Gato();

        System.out.println("Hello word!" + (a + b));
        System.out.println(gato);
    }

}


class livro{
    private String nome;
    private Integer numPaginas;

    public livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}