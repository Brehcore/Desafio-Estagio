import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean entradaInvalida = false;

        //Loop necessário caso o usuário insira uma entrada inválida
        while (!entradaInvalida) {
            try {
                System.out.println("Informe um número: ");
                int n = sc.nextInt();
                entradaInvalida = true;

                //Calculo da sequência de Fibonacci
                int termoAnterior1 = 1, termoAnterior2 = 0, termoAtual = 0;
                boolean pertence = false;

                while (termoAtual <= n) {
                    if (termoAtual == n) {
                        pertence = true;
                        break;
                    }
                    termoAtual = termoAnterior1 + termoAnterior2;
                    termoAnterior2 = termoAnterior1;
                    termoAnterior1 = termoAtual;
                }

                //Resultado
                if (pertence) {
                    System.out.println("Pertence ");
                } else {
                    System.out.println("Não pertence");
                }
            } catch (InputMismatchException e) {
                //Tratamento de exceção em caso do usuário inserir um valor não inteiro
                System.out.println("Entrada inválida. Insira um número inteiro.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}


