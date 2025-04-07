import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        String categoria = null;

        System.out.print("1 - milho\r\n" + //
                        "2 - sardinha\r\n" + //
                        "3 - maçã\r\n" + //
                        "4 - banana\r\n" + //
                        "5 - uva\r\n" + //
                        "6 - limao\r\n" + //
                        "7 - laranja\r\n" + //
                        "8 - suco\r\n" + //
                        "9 - refrigerante\r\n" + //
                        "10 - agua\r\n" + //
                        "\r\n" + //
                        "");

        System.out.print("Digite o código do produto: ");
        int codigo = a.nextInt();
        
            switch (codigo) {
            case 0:
            System.out.print("Saindo...");
            break;


            case 1:
            categoria = "Alimento não perecível";
            break;

            case 2:
            categoria = "Alimento não perecível";
            break;
            
            case 3:
            categoria = "Frutas";
            break;

            case 4:
            categoria = "Frutas";
            break;

            case 5:
            categoria = "Frutas";
            break;

            case 6:
            categoria = "Frutas";
            break;

            case 7:
            categoria = "Frutas";
            break;

            case 8:
            categoria = "Bebidas";
            break;

            case 9:
            categoria = "Bebidas";
            break;

            case 10:
            categoria = "Bebidas";
            break;

            default:
            categoria = "Codigo Inválido";
            break;
        }
    
        System.out.println("Categoria: " + categoria);

    }

}
