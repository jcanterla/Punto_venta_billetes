import java.util.Arrays;
import java.util.Scanner;

public class opcion_3 {
    public static void opcion_3(){
        //Introducir mes por teclado
        Scanner teclado = new Scanner(System.in);
        Integer mes;
        do {
            System.out.print("Introduzca el mes en formato numérico: ");
            mes = teclado.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("Mes incorrecto. Debe estar entre 1 y 12");
            }
        }while (mes < 1 || mes > 12) ;

        //Lista de los meses
        String [] meses = {"Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre" ,"Diciembre"};

        System.out.println("\nLa tabla se esta generando...");

        mes = (mes -1 + 12) % 12;

        String tabla = "";
        for (int i = 0; i<12; i++){
            tabla += meses[mes];
            if (i <11) {
                tabla += ", ";
            }
            mes = (mes +1) % 12;
        }
        System.out.println("\nEl resultado solicitado es: ");
        System.out.println(tabla);

    }

    public static void main(String[] args) {
        opcion_3();
    }
}
