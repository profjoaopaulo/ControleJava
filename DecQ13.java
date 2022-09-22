/* Questão 13 da lista de Decisão: https://wiki.python.org.br/EstruturaDeDecisao  */

import java.util.Scanner;

public class DecQ13 {
    
    public static void main(String[] args) {
        
        //Armazenamento dos dias da semana num vetor
        String diaSemana[] = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        
        //Leitura
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Digite um valor entre 1 e 7: ");
        int dia = iScanner.nextInt();

        //Saída
        System.out.println(diaSemana[dia-1]);

        //Essa parte comentada a seguir era a outra solução, que também resolve, embora não otimizada quanto a atual
        /*String dayWeek = null;

        switch (dia) {
            case 1:
                dayWeek = diaSemana[0];
                break;
            case 2:
                dayWeek = diaSemana[1];
                break;
            case 3:
                dayWeek = diaSemana[2];
                break;
            case 4:
                dayWeek = diaSemana[3];
                break;
            case 5:
                dayWeek = diaSemana[4];
                break;
            case 6:
                dayWeek = diaSemana[5];
                break;
            case 7:
                dayWeek = diaSemana[6];
                break;
            default:
                System.out.println("Valor Inválido!");
                break;
        }//switch

        if(dayWeek != null)
            System.out.println(dayWeek);*/

        iScanner.close();
    }//main
}
