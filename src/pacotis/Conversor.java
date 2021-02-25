/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotis;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usaze
 */
public class Conversor {
    
    
     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double vFah, vCel, celsius, fahrenheit;
        int  conversor;


        JOptionPane.showMessageDialog(null,"\n\t\t\t!========== CONVERSOR DE TEMPERATURAS SHOW DE BOLA ==========!\n"
        + "__________________________________________\n");
        conversor = Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t\t\\_____MENU____/\n" + "OPÇÕES DE CONVERSÃO DE TEMPERATURAS \n" +
                "\n [1] - ConVerter Celsius para Fahrenheit" + "\n [2] - Converter Fahrenheit para Celsius" + "\n [3] - Sair do Programa"));

        switch(conversor){

            case 1:

                vCel = Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor informe a temperatura em ºC: "));

                JOptionPane.showMessageDialog(null,"\n EXECUTANDO CONVERSÃO POR FAVOR AGUARDE");
                fahrenheit = (9 * vCel / 5) + 32;

                JOptionPane.showMessageDialog(null,"SUA CONVERSÃO ESTA PRONTA\n");
                JOptionPane.showMessageDialog(null,"A TEMPERATURA EM FAHRENHEIT É %.2f\n" + fahrenheit);
                break;

            case 2:

                vFah = Double.parseDouble(JOptionPane.showInputDialog("Por favor informe a temperatura em ºF: "));

                JOptionPane.showMessageDialog(null,"\n EXECUTANDO CONVERSÃO POR FAVOR AGUARDE");
                celsius = (vFah-32) * 5 / 9;

                JOptionPane.showMessageDialog(null,"SUA CONVERSÃO ESTA PRONTA\n");
                JOptionPane.showMessageDialog(null,"\n A TEMPERATURA EM CELSIUS É %.2f\n");
                break;

            case 3:

                JOptionPane.showMessageDialog(null,"GOOD BYE");
                break;

            default:

                JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA!");



        }







    while (conversor != 3 );


    }

}
