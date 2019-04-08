package org.fieb;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @authors:
 * Eduardo Correia
 * Felipe Bastos
 * Felipe Neiva
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("Iniciando calculadora...");
        Scanner sc = new Scanner(System.in);
        while (true) {            
            try {
                System.out.print("Insira sua equação: ");
                String equacao = sc.nextLine();
                String[] parts = null;
                double num1;
                double num2;
                parts = equacao.split(" ");
                num1 = Integer.parseInt(parts[0]);
                num2 = Integer.parseInt(parts[2]);
                
                if (equacao.contains("+")) {
                    System.out.println("O resultado da soma é "+Soma.calcular(num1, num2));
                }else if(equacao.contains("-")){
                    //Lógica para subtração
                }else if(equacao.contains("*")){
                    //Lógica para multiplicação
                }else if(equacao.contains("/")){
                    System.out.println("O resultado da divisão é "+Divisao.calcular(num1, num2));
                }   
            } catch (NullPointerException ex) {
                System.out.println("Finalizando calculadora...");
                break;
            }catch(Exception ex){
                System.out.println("Operação inválida, siga o modelo <operando><espaço><operação><espaço><operando>, onde os operandos podem ser \"+ , - , * , /\" e execute novamente.");
            }
        }

    }
}
