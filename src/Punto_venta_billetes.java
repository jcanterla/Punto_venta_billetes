import java.util.InputMismatchException;
import java.util.Scanner;

public class Punto_venta_billetes extends PilotoAPV {

        public static void main(String[] args) {

            Scanner seleccion = new Scanner(System.in);
            boolean salir = false;

            while (!salir) {
                System.out.println("\n\t\t\t\t\033[0;1mPROGRAMA BILLETE AVIÓN\033[0m");
                System.out.println("\t\t\t\t======================\n");
                System.out.println("1.-Transformación fecha suministrada como parámetro");
                System.out.println("2.-Generación de la hora de llegada");
                System.out.println("3.-Generación automatizada de tabla de meses");
                System.out.println("4.-Obtención de los días correspondientes de un mes");
                System.out.print("\n Ingrese una opción: ");


                try {
                    int opcion = seleccion.nextInt();

                    switch (opcion) {
                        case 1:
                            if (args.length == 3) {
                                System.out.println("\nEl resultado solicitado de la misma es: " + Opcion1(args));
                            } else {
                                System.out.println("\n\tDebe indicar tres argumentos de programa");
                            }
                            break;
                        case 2:
                            System.out.println("\nEl resultado solicitado de la misma es: " + Opcion2());
                            break;
                        case 3:
                            System.out.println("\nEl resultado solicitado es:\n" + Opcion3());
                            break;
                        case 4:
                            System.out.println("El resultado solicitado es: " + Opcion4());
                            break;
                        case 5:
                            Opcion5();
                            break;
                        case 6:
                            salir = true;
                            break;
                    }
                }
                catch (InputMismatchException exc) {
                    System.out.println("\n\t\t\u001B[0;1mOpción no valida o no disponible\033[0m");
                }
            }
        }

    }


