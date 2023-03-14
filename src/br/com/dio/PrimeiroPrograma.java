package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        int a = 5, b = 3;

        Livro livro = new livro(nome;: "Dragões de Éter", numPagina:300);
        System.out.println(livro4);

        Gato gato = new Gato();

        System.out.println("Hello word!" + (a + b));
        System.out.println(gato);
    }

}


class livro{
    private String nome;
    private Integer numPagina;

    public livro(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPaginas(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPagina +
                '}';
    }
}