// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String senhaValida = "2002", senha;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a senha");
        senha = ler.next();

        while (!senhaValida.equals(senha)){
            System.out.println("Senha inválida, informe a senha correta:");
            senha = ler.next();
        }
        System.out.println("Acesso concedido");

    }
}