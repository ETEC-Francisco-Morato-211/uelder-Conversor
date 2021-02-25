/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotis;

import java.util.Scanner;

/**
 *
 * @author usaze
 */
public class Conversor {
    
    
    public static void main(String[] args) {




        //Aqui criamos um objeto para receber os dados pelo usuário.
        Scanner entrada = new Scanner (System.in);

        //Área para declaração de variáveis.
        double vCel, celsius, vFah,fahrenheit;
        int conversor;

        do {
            System.out.println("\n\t\t\t!==========CONVERSOR DE TEMPERATURAS SHOW DE BOLA==========!");
            System.out.println("\n__________________________________________");
            System.out.println("\n\t\t\\_____MENU____");
            System.out.println("OPÇÕES DE CONVERSÃO DE TEMPERATURAS");
            System.out.println("\n [1] - Conerter Celsius para Fahrenheit");
            System.out.println("\n[2] - Converter Fahrenheit para Celsius");
            System.out.println("\n[3] - Sair do Programa");

            switch(conversor){

                case 1:

                    System.out.println("Por favor informe a temperatura em ºC: ");
                    vCel = entrada.nextDouble();

                    System.out.println("\n EXECUTANDO CONVERSÃO POR FAVOR AGUARDE");
                    fahrenheit = (9 * vCel / 5) + 32;

                    System.out.println("SUA CONVERSÃO ESTA PRONTA\n");
                    System.out.printf("A TEMPERATURA EM FAHRENHEIT É %.2f\n", fahrenheit);
                    break;

                case 2:

                    System.out.println("Por favor informe a temperatura em ºF: ");
                     vFah = entrada.nextDouble();

                    System.out.println("\n EXECUTANDO CONVERSÃO POR FAVOR AGUARDE");
                    celsius = (vFah-32) * 5 / 9;

                    System.out.printf("SUA CONVERSÃO ESTA PRONTA\n");
                    System.out.println("\n A TEMPERATURA EM CELSIUS É %.2f\n");
                    break;

                case 3:





            }

        }while (conversor != 3 );


    }

}
