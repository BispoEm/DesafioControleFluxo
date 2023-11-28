import java.util.Scanner;

import exeptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int num1 = leitor.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int num2 = leitor.nextInt();

        leitor.close();
        try {
            // chamando o método contendo a lógica de contagem
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o 
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (num2 > num1) {
            int contagem = num2 - num1;
            // realizar o for para imprimir os números com base na variável contagem
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
        } else {
            throw new ParametrosInvalidosException(num1, num2);
        }

    }
}