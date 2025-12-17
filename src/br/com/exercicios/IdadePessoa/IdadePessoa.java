package br.com.exercicios.IdadePessoa;

import java.util.Scanner;

public class IdadePessoa {
    /*Crie uma classe br.com.exercicios.IdadePessoa.IdadePessoa com os atributos privados nome e idade.
    Utilize métodos getters e setters para acessar e modificar esses atributos.
    Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.*/

    private String nome ;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(){
        this.idade = idade;
    }

    public String verificarIdade(int idade) {
        if (idade >= 18){
            return "Você é maior de idade";
        }else {
            return "Você é menor de idade";
        }

    }
//exercicios para praticar, módulo 2
    /*Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e
      modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
      Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e
      modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
      Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e
      modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro. */


}