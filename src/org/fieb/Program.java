package org.fieb;

import java.util.Scanner;

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
                String[] parts = parts = equacao.split(" ");
                double num1 = Integer.parseInt(parts[0]);
                double num2 = Integer.parseInt(parts[2]);
                String operator = parts[1];
                
                if (operator.equals("+")) {
                    System.out.println("O resultado da soma é "+Soma.calcular(num1, num2));
                }else if(operator.equals("-")){
                    System.out.println("O resultado da subtração é "+Subtracao.calcular(num1, num2));
                }else if(operator.equals("*")){
                    System.out.println("O resultado da multiplicacao é "+ Multiplicacao.calculo(num1, num2));
                }else if(operator.equals("/")){
                    System.out.println("O resultado da divisão é "+Divisao.calcular(num1, num2));
                }else if(operator.equalsIgnoreCase("l")){
                    System.out.println("O resultado do logaritimo é "+Logaritimo.calcular(num1, num2));
                }   
                else if(operator.equals("%")){
                    System.out.println("O resultado da porcentagem é "+Porcentagem.calcular(num1, num2));
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
