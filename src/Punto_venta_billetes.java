import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Punto_venta_billetes {
        public static void main(String[] args) {
            Scanner seleccion = new Scanner(System.in);
            int opcion = 0;
            while (opcion != 3) {
                System.out.println("1).Transformación fecha suministrada como parámetro");
                System.out.println("2).Generación de la hora de llegada");
                System.out.println("3).Generación automatizada de tabla de meses");
                System.out.println("4).Obtención de los días correspondientes de un mes");
                System.out.print("Ingrese una opción: ");
                opcion = seleccion.nextInt();
                switch (opcion) {
                    case 1:
                        if (args.length == 3) {
                            fechatransformar(args);
                        }
                        else{
                            System.out.println("Debe indicar tres argumentos de programa");
                        }
                        break;
                    case 2:
                        Genreacionhorallegada();

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

        public static void fechatransformar(String[] args) {
            String dia = args[0];
            String mes = args[1];
            String anio = args[2];
            System.out.println("Dia: " + dia);
            System.out.println("mes: " + mes);
            System.out.println("año: " + anio);

            LocalDate fecha = LocalDate.of(Integer.parseInt(anio), Integer.parseInt(mes), Integer.parseInt(dia));
            DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", new Locale("es", "ES"));
            String fechafinal = fecha.format(fechaFormateada);
            System.out.println(fechafinal);


        }

        public static void Genreacionhorallegada(){
            Scanner horateclado = new Scanner(System.in);
            System.out.print("Hora de despegue (hh:mm): ");
            String hora = horateclado.nextLine();
            DateTimeFormatter formatohora = DateTimeFormatter.ofPattern("HH:MM");
            LocalTime horaconformato = LocalTime.parse(hora,formatohora);
            System.out.print("Duración (en minutos): ");
            int minutos = horateclado.nextInt();
            LocalTime duracion = horaconformato.plusMinutes(minutos);
            System.out.println(duracion);

        }
    }


