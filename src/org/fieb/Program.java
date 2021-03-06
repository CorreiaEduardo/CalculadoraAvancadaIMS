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
        boolean quer_sair=false;
        
        System.out.println("Iniciando calculadora...");
        Scanner sc = new Scanner(System.in);
        while (quer_sair==false) {
            try {
                System.out.print("Insira sua equação: Ou digite apenas 0 para sair: ");
                String equacao = sc.nextLine();
                if(!(equacao.equals("0"))){
                String[] parts = parts = equacao.split(" ");
                double num1 = Double.parseDouble(parts[0]);
                double num2 = Double.parseDouble(parts[2]);
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
                }else if(operator.equals("%")){
                    System.out.println("O resultado da porcentagem é "+Porcentagem.calcular(num1, num2));
                }else if (operator.equals("v")) {
                    System.out.println("O resultado da raiz é "+Raiz.calcular(num1, num2));
                }else if (operator.equals("^")) {
                    System.out.println("O resultado da exponenciação é "+Exponencial.calcular(num1, num2));
                }
            } 
                else{
                    quer_sair=true;
                }
            }
                catch(Exception ex){
                    System.out.println("Operação inválida, siga o modelo <operando><espaço><operação><espaço><operando>, onde os operandos podem ser \"+ , - , * , /\" e execute novamente.");
            }
            }
        }

    }

