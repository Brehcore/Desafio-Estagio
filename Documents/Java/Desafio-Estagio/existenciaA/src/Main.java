import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Solicita ao usuário uma entrada
        System.out.println("Informe uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        char letra = 'a'; //Letra a ser procurada
        boolean encontrada = false; //Inicializa a variavel como false
        int contador = 0; //Inicializa o contador como 0

        //Loop responsável por contar quantas vezes a letra a aparece na palavra
        for (char a : palavra.toCharArray()) {
            if (a == letra) {
                contador++;
            }
        }

        //Loop para verificar se a letra está presente na palavra informada
        for (char a : palavra.toCharArray()) {
            if (a == letra) {
                encontrada = true;
                break;
            }
        }

        //Condicional para exibir as mensagens
        if (encontrada) {
            System.out.println("A letra está presente " + contador + " vezes na palavra informada.");
        } else {
            System.out.println("A letra não está presente na palavra informada.");
        }

        sc.close();

    }
}