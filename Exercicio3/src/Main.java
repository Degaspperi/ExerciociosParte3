//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int alccol=0, gasolina=0, diesel=0, tipoCombustivel;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tipo de combustível abastecido: \n 1 Álcool\n 2 Gasolina\n 3 Diesel\n 4 Fim");
        tipoCombustivel = ler.nextInt();

        while (tipoCombustivel != 4){

            switch (tipoCombustivel){
                case 1:
                    alccol = alccol+1;
                    System.out.println("Informe o tipo de combustível abastecido: \n 1 Álcool\n 2 Gasolina\n 3 Diesel\n 4 Fim");
                    tipoCombustivel = ler.nextInt();
                    break;
                case 2:
                    gasolina = gasolina+1;
                    System.out.println("Informe o tipo de combustível abastecido: \n 1 Álcool\n 2 Gasolina\n 3 Diesel\n 4 Fim");
                    tipoCombustivel = ler.nextInt();
                    break;
                case 3:
                    diesel=diesel+1;
                    System.out.println("Informe o tipo de combustível abastecido: \n 1 Álcool\n 2 Gasolina\n 3 Diesel\n 4 Fim");
                    tipoCombustivel = ler.nextInt();
                    break;
                default:
                    System.out.println("Informe o tipo de combustível abastecido: \n 1 Álcool\n 2 Gasolina\n 3 Diesel\n 4 Fim");
                    tipoCombustivel = ler.nextInt();
            }

        }
        System.out.println("Muito obrigado! \n 1 Álcool: "+alccol+"\n 2 Gasolina: "+gasolina+"\n 3 Diesel: "+diesel);
    }
}