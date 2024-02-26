import java.time.*;
import java.time.format.*;
import java.util.*;

public class ApoyoPuntoVenta {

    public static final Scanner scanner = new Scanner(System.in);

    public static String Opcion1(String[] args) {

        String dia = args[0];
        String mes = args[1];
        String anio = args[2];
        System.out.println("\nDia: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Año: " + anio);

        LocalDate fecha = LocalDate.of(Integer.parseInt(anio), Integer.parseInt(mes), Integer.parseInt(dia));
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", new Locale("es", "ES"));

        return fecha.format(fechaFormateada);

    }

    public static LocalTime Opcion2(){

        System.out.print("\nHora de despegue (hh:mm): ");
        String hora = scanner.nextLine();
        DateTimeFormatter formatohora = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaconformato = LocalTime.parse(hora,formatohora);
        System.out.print("Duración (en minutos): ");
        int minutos = scanner.nextInt();

        return horaconformato.plusMinutes(minutos);

    }

    public static String Opcion3(){
        //Introducir mes por teclado
        int mes;
        do {
            System.out.print("\nIntroduzca el mes en formato numérico: ");
            mes = scanner.nextInt();
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

        return tabla;

    }


    public static int Opcion4() {
        HashMap<String, Integer> meses = new HashMap<>();
        List<Integer> añosBisiestos = new ArrayList<>();

        // Añadimos al HashMap como elementos clave-valor los meses junto el número de días que tienen
        meses.put("Enero", 31);
        meses.put("Febrero", 28);
        meses.put("Marzo", 31);
        meses.put("Abril", 30);
        meses.put("Mayo", 31);
        meses.put("Junio", 30);
        meses.put("Julio", 31);
        meses.put("Agosto", 31);
        meses.put("Septiembre", 30);
        meses.put("Octubre", 31);
        meses.put("Noviembre", 30);
        meses.put("Diciembre", 31);

        Year añoActual = Year.now();

        if (añoActual.isLeap()) {
            meses.put("Febrero", 29);
        }

        System.out.print("\nIntroduzca el mes en formato cadena: ");
        String mes = scanner.nextLine();

        if (meses.containsKey(mes)) {
            return meses.get(mes);
        }
        else {
            System.out.println("\n\tEscriba correctamente el mes");

        }

        return 0; // Arreglar o mirar

    }

    public static void Opcion5(){

        HashMap<String, String> IATAdic = new HashMap<>();

        IATAdic.put("Sevilla", "SVQ");
        IATAdic.put("Madrid", "MAD");
        IATAdic.put("Barcelona", "BCN");
        IATAdic.put("Valencia", "VLC");
        IATAdic.put("Bilbao", "BIO");
        IATAdic.put("Málaga", "AGP");
        IATAdic.put("A Coruña", "LCG");
        IATAdic.put("Santander", "SDR");
        IATAdic.put("Asturias", "OVD");

        HashMap<String, String> vuelosDic = new HashMap<>();

        List<String> SVQ = new ArrayList<>();
        SVQ.add("BCN");
        SVQ.add("7:45");
        SVQ.add("18:55");
        SVQ.add("90");

        List<String> MAD = new ArrayList<>();
        SVQ.add("BCN");
        SVQ.add("7:45");
        SVQ.add("18:55");
        SVQ.add("90");

        List<String> BCN = new ArrayList<>();
        SVQ.add("BCN");
        SVQ.add("7:45");
        SVQ.add("18:55");
        SVQ.add("90");

        System.out.print("\nOrigen: ");
        String origen = scanner.nextLine();
        System.out.print("Destino: ");
        String destino = scanner.nextLine();

        for (String clave : IATAdic.keySet()) {
            if (clave.equalsIgnoreCase(origen)) {
                String IATAo = IATAdic.get(origen);
                String IATAd = IATAdic.get(destino);
                System.out.println(origen + "(" + IATAo + ") --> " + destino + "(" + IATAd + ")");
            }
        }

    }

}
