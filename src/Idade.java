import br.com.exercicios.IdadePessoa.IdadePessoa;

import java.util.Scanner;

public class Idade{

public static void main(String[] args) {
            Scanner response = new Scanner(System.in);
            IdadePessoa dados = new IdadePessoa();


    System.out.println("Qual o seu nome?");
    String nomeDigitado = response.nextLine();
    System.out.println("Ok, " + nomeDigitado + " Quantos anos você tem?");
    int idadeDigitada = response.nextInt();
    System.out.println(dados.verificarIdade(idadeDigitada));
 }
}