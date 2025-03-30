import java.util.Scanner;
public class Calc {
    @SuppressWarnings("ConvertToStringSwitch")
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

        if(sinal.equals ("s"))
        {
            resul = num1 + num2;
            System.out.println("Resultado final "+resul);
        }
        else if (sinal.equals ("m"))
        {
            resul = num1 - num2;
            System.out.println("Resultado final "+resul);
        }
        else if (sinal.equals ("v"))
        {
            resul = num1 * num2;
            System.out.println("Resultado final "+resul);
        }
        else if (sinal.equals("d"))
        {
            resul = num1 / num2;
            System.out.println("Resultado final "+resul);
        }

    }
}
