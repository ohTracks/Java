package calculadora;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double num1,num2,resul;
    String sinal;

    System.out.println("Calculadora");
    
    System.out.println("Entre com o primeiro numero: ");
    num1 = in.nextDouble();
    System.out.println("Entre com o segundo numero: ");
    num2 = in.nextDouble();
    System.out.println("Soma (s) Menos (m) Vezes (v) Dividir (d): ");
    
    sinal = in.next();

    switch (sinal) {
        case "s":
        resul = num1 + num2;
        System.out.println("Resultado final "+resul);
        break;

        case "m":
        resul = num1 - num2;
        System.out.println("Resultado final "+resul);
        break;
        case "v":
        resul = num1 * num2;
        System.out.println("Resultado final "+resul);
        break;
        case "d":
        resul = num1 / num2;
        System.out.println("Resultado final "+resul);
        break;
        default:
        System.out.println("Operação Inválida");
        break;

        }

    }
}