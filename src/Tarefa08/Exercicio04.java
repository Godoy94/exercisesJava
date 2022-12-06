package Tarefa08;

public class Exercicio04 {
    public static void main(String[] args) {
        // 4) Apresentar todos os valores numéricos inteiros ímpares situados na faixa
        // de 0 a 20. Para verificar se o número é ímpar, efetuar dentro da malha a
        // verificação lógica desta condição com a instrução se, perguntando se o número
        // é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.
        int contador = 0;

        while (contador <= 20) {
            if (contador % 2 == 1) {
                System.out.print(contador);
            }
            contador++;
        }
    }
}
