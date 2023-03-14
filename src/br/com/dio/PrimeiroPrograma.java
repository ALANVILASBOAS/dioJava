package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        int a = 5, b = 3;

        Livro livro = new Livro("Dragões", 300);
        Gato gato = new Gato();

        System.out.println("Hello word!" + (a + b));
        System.out.println(gato);
    }

}

class Livro {
    private String nome;
    private Integer numPaginas;


    //Constructor:

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    //Getter and Setters

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


    //toString
    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}