/* Questã 09 da lista Sequencial: https://wiki.python.org.br/EstruturaSequencial */

import java.util.Scanner;

public class SeqQ09 {

    public static void main(String[] args) {
        
        //Leitura da temperatura em Fahrenheit
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempF = iScanner.nextDouble();

        //Cálculo através da fórmula de conversão
        double tempC = 5 * ((tempF-32) / 9);

        //Imprimindo resultado no terminal
        System.out.println("A temperatura convertida é " + tempC + "ºC");

        iScanner.close();
    }

}