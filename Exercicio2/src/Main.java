import java.util.Scanner;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

public class Main {
    public static void main(String[] args) {

        int x=0, y=0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor de x:");
        x = ler.nextInt();

        System.out.println("Informe o valor de y");
        y = ler.nextInt();

        while (x !=0 && y !=0){

            if (x>0 && y>0){
                System.out.println("Primeiro");
            } else if (x<0 && y>0){
                System.out.println("Segundo");
            } else if (x<0 && y<0 ) {
                System.out.println("Terceiro");
            } else if (x>0 && y<0) {
                System.out.println("Quarto");
            }
            System.out.println("Informe o valor de x:");
            x=ler.nextInt();
            System.out.println("Informe o valor de y:");
            y = ler.nextInt();

        }
    }
}