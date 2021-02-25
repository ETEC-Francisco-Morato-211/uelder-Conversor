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
public class ProgramaConversao {
    // PROGRAMDORES : UELDER E ISABELA
    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {

        //aqui começamos nosso programa criando um objeto de entrada de dados
        Scanner entrada = new Scanner(System.in);

        //declaração de variaveis
        double vFah, vCel, celsius, fahrenheit;
        int conversor;

        /*para o exercicio precisamos que o menu aparece pelo menos uma vez, sendo assim precisamos de um laço de repetição
        do tipo do while*/
        do{
        //criamos uma janela com o nome do programa
        JOptionPane.showMessageDialog(null, "\n\t\t\t!========== CONVERSOR DE TEMPERATURAS SHOW DE BOLA ==========!\n"
                + "__________________________________________\n");

        /* aqui criamos um MENU com opções e para isso dentro do método JOptionPane precisa fazer a conversão de dados, pois ele recebe com String
         o que precisamos são dados do tipo Double */
        conversor = Integer.parseInt(JOptionPane.showInputDialog(null, "\n\t\t\\_____MENU____/\n" + "OPÇÕES DE CONVERSÃO DE TEMPERATURAS \n" +
                "\n [1] - Converter Celsius para Fahrenheit" + "\n [2] - Converter Fahrenheit para Celsius" + "\n [3] - Sair do Programa"));

        // AUTOR: UELDER DOS SANTOS
        // Aqui iniciamos o método Switch Case para determinar qual operção realizar de acordo com a escolha do usuário
        switch (conversor) {

            case 1:
                // Entrada de dados com método JOptionPane e conversão de dados recebidos
                vCel = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor informe a temperatura em ºC: "));

                // Execução da conversção através da fórmula de conversão FAHRENHEIT
                JOptionPane.showMessageDialog(null, "\n EXECUTANDO CONVERSÃO POR FAVOR AGUARDE");
                fahrenheit = (9 * vCel / 5) + 32;

                // Exibindo o Resultado da conversão
                JOptionPane.showMessageDialog(null, "SUA CONVERSÃO ESTA PRONTA\n");
                JOptionPane.showMessageDialog(null, String.format("A TEMPERATURA EM CELSIUS É:\n %.2f", fahrenheit));
                break;
                
            // AUTOR: ISABELA
            case 2:
                // Entrada de dados com método JOptionPane e conversão de dados recebidos
                vFah = Double.parseDouble(JOptionPane.showInputDialog("Por favor informe a temperatura em ºF: "));

                // Execução da conversção através da fórmula de conversão FAHRENHEIT
                JOptionPane.showMessageDialog(null, "\n EXECUTANDO CONVERSÃO POR FAVOR AGUARDE");
                celsius = (vFah - 32) * 5 / 9;

                // Exibindo o Resultado da conversão
                JOptionPane.showMessageDialog(null, "SUA CONVERSÃO ESTA PRONTA");
                JOptionPane.showMessageDialog(null, String.format("A TEMPERATURA EM CELSIUS É:\n %.2f", celsius));
                break;
            //AUTORES: UELDER DE ISABELA    
            case 3:
                // Aqui caso o usuário escolha sair do programa exibimos uma mensagem de despedida
                JOptionPane.showMessageDialog(null, "\t\t\t *** GOOD BYE *** ");
                break;
            //AUTORES: UELDER DE ISABELA  
            default:
                /* Nese caso se o usuário não digitar uma das opóes válidas como orienta o menu o programa exibe uma mensagem
                 de erro e volta ao menu inicial */
                JOptionPane.showMessageDialog(null, "\t\t\t *** OPÇÃO INVÁLIDA *** ");

        }
                // Nesse caso o programa fica em loop enquanto o usuário não escolher a opção " 3 " que é a de saída e finalização do programa
            }while (conversor != 3 );

  }
    
}
