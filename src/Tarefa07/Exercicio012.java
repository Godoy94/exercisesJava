package Tarefa07;

import java.util.*;

public class Exercicio012 {
    public static void main(String[] args) {

        // 12) Faça um algoritmo para ler um número que é um código de usuário. Caso
        // este código seja
        // diferente de um código armazenado internamente no algoritmo (igual a 1234)
        // deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja
        // correto, deve ser lido outro valor que é a senha. Se esta senha estiver
        // incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’.
        // Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo de Usuario Correto: ");
        int codigoCerto = scanner.nextInt();

        if (codigoCerto == 1234) {
            System.out.print("Correto");
        } else if (codigoCerto != 1234) {
            System.out.print("Usuario Invalido !!!");
            System.out.print("Digite o codigo novamente: ");
            int novaTentativa = scanner.nextInt();
            if (novaTentativa != 1234) {
                System.out.print("Usuario Invalido !!!");
                System.out.print("Digite o codigo novamente: ");
                int novaTentativa02 = scanner.nextInt();
                if (novaTentativa02 != 1234) {
                    System.out.print("Usuario Invalido !!!");
                }
            }
        }

        System.out.print("Digite a senha correta: ");
        int senhaCorreta = scanner.nextInt();

        if (senhaCorreta == 9999) {
            System.out.print("Acesso Permitido");
        } else if (senhaCorreta != 9999) {
            System.out.print("Senha incorreta");
            System.out.print("Digite novamente sua senha: ");
            int senhaCorreta02 = scanner.nextInt();
            if (senhaCorreta02 != 9999) {
                System.out.print("Senha incorreta");
                System.out.print("Digite novamente sua senha: ");
                int senhaCorreta03 = scanner.nextInt();
                if (senhaCorreta03 != 9999) {
                    System.out.print("Senha incorreta");
                    System.out.print("Usuario Bloqueado !!!!");
                }
            }
        }

        scanner.close();
    }
}
