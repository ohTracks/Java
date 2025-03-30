import java.util.Scanner;
public class Calc_Eletron {

    @SuppressWarnings("resource")
    public static void main(String[] args){
    Scanner n1 = new Scanner(System.in);
    double cargaEletron = 1.6e-19;
        
        System.out.println("Calculadora de carga total de eletrons");

        System.out.print("Digite o número de eletrons: ");
        int numEletrons = n1.nextInt();

        double cargaTotal = numEletrons * cargaEletron;

        System.out.print("A carga elétrica total é: " + cargaTotal + " C");
              
    }
}