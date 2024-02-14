import java.util.Scanner;

public class Punto_venta_billetes {
    public static void main(String[] args) {

        Scanner lenteja = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("1.-Transformación fecha suministrada como parámetro");
            System.out.println("2.-Generación de la hora de llegada");
            System.out.println("3.-Generación automatizada de tabla de meses");
            System.out.println("4.-Obtención de los días correspondientes de un mes");
            System.out.print("Ingrese una opción: ");
            opcion = lenteja.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                default:
                    System.out.println("Elige una opción válida");
            }
        }


    }
}
