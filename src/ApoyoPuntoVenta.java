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
        List<Integer> aniosBisiestos = new ArrayList<>();

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

        Year anioActual = Year.now();

        if (anioActual.isLeap()) {
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
    public String preciorandom() {
        Random rand = new Random();
        double numero = 35.00 + (60.00 - 35.00) * rand.nextDouble();
        String precioFormateado = String.format("%.2f", numero);
        return precioFormateado;
    }
    public static void Opcion5(){

        HashMap<String, String> IATAdic = new HashMap<>();

        IATAdic.put("Alcobendas", "MAD");
        IATAdic.put("Albacete", "ABC");
        IATAdic.put("Elche", "ALC");
        IATAdic.put("El Alquián", "LEI");
        IATAdic.put("Castrillón", "OVD");
        IATAdic.put("Talavera la Real", "BJZ");
        IATAdic.put("El Prat de Llobregat", "BCN");
        IATAdic.put("Lujua", "BIO");
        IATAdic.put("Burgos", "RGS");
        IATAdic.put("Córdoba", "ODB");
        IATAdic.put("Santa Fe", "GRX");
        IATAdic.put("Aiguaviva", "GRO");
        IATAdic.put("Telde", "LPA");
        IATAdic.put("Puerto del Rosario", "FUE");
        IATAdic.put("Culleredo", "LCG");
        IATAdic.put("San Bartolomé", "ACE");
        IATAdic.put("Alcalá del Obispo", "HSK");
        IATAdic.put("San José", "IBZ");

        HashMap<String, List<List<String>>> agrupacion = new HashMap<>();

        // Aeropuerto Alcobendas (MAD)
        List<String> vuelo1MAD = new ArrayList<>();vuelo1MAD.add("ABC");vuelo1MAD.add("07:45");vuelo1MAD.add("18:55");vuelo1MAD.add("90");
        List<String> vuelo2MAD = new ArrayList<>();vuelo2MAD.add("ALC");vuelo2MAD.add("07:45");vuelo2MAD.add("18:55");vuelo2MAD.add("90");
        List<String> vuelo3MAD = new ArrayList<>();vuelo3MAD.add("LEI");vuelo3MAD.add("07:45");vuelo3MAD.add("18:55");vuelo3MAD.add("90");
        List<String> vuelo4MAD = new ArrayList<>();vuelo4MAD.add("OVD");vuelo4MAD.add("07:45");vuelo4MAD.add("18:55");vuelo4MAD.add("90");
        List<String> vuelo5MAD = new ArrayList<>();vuelo5MAD.add("BJZ");vuelo5MAD.add("07:45");vuelo5MAD.add("18:55");vuelo5MAD.add("90");
        List<String> vuelo6MAD = new ArrayList<>();vuelo6MAD.add("BCN");vuelo6MAD.add("07:45");vuelo6MAD.add("18:55");vuelo6MAD.add("90");
        List<String> vuelo7MAD = new ArrayList<>();vuelo7MAD.add("BIO");vuelo7MAD.add("07:45");vuelo7MAD.add("18:55");vuelo7MAD.add("90");
        List<String> vuelo8MAD = new ArrayList<>();vuelo8MAD.add("RGS");vuelo8MAD.add("07:45");vuelo8MAD.add("18:55");vuelo8MAD.add("90");
        List<String> vuelo9MAD = new ArrayList<>();vuelo9MAD.add("ODB");vuelo9MAD.add("07:45");vuelo9MAD.add("18:55");vuelo9MAD.add("90");
        List<String> vuelo10MAD = new ArrayList<>();vuelo10MAD.add("GRX");vuelo10MAD.add("07:45");vuelo10MAD.add("18:55");vuelo10MAD.add("90");
        List<String> vuelo11MAD = new ArrayList<>();vuelo11MAD.add("GRO");vuelo11MAD.add("07:45");vuelo11MAD.add("18:55");vuelo11MAD.add("90");
        List<String> vuelo12MAD = new ArrayList<>();vuelo12MAD.add("LPA");vuelo12MAD.add("07:45");vuelo12MAD.add("18:55");vuelo12MAD.add("90");
        List<String> vuelo13MAD = new ArrayList<>();vuelo13MAD.add("FUE");vuelo13MAD.add("07:45");vuelo13MAD.add("18:55");vuelo13MAD.add("90");
        List<String> vuelo14MAD = new ArrayList<>();vuelo14MAD.add("LCG");vuelo14MAD.add("07:45");vuelo14MAD.add("18:55");vuelo14MAD.add("90");
        List<String> vuelo15MAD = new ArrayList<>();vuelo15MAD.add("ACE");vuelo15MAD.add("07:45");vuelo15MAD.add("18:55");vuelo15MAD.add("90");
        List<String> vuelo16MAD = new ArrayList<>();vuelo16MAD.add("HSK");vuelo16MAD.add("07:45");vuelo16MAD.add("18:55");vuelo16MAD.add("90");
        List<String> vuelo17MAD = new ArrayList<>();vuelo17MAD.add("IBZ");vuelo17MAD.add("07:45");vuelo17MAD.add("18:55");vuelo17MAD.add("90");

        List<String>[] MAD = new List[]{vuelo1MAD,vuelo2MAD,vuelo3MAD,vuelo4MAD,vuelo5MAD,vuelo6MAD,vuelo7MAD,vuelo8MAD,vuelo9MAD,vuelo10MAD,vuelo11MAD,vuelo12MAD,vuelo13MAD,vuelo14MAD,vuelo15MAD,vuelo16MAD,vuelo17MAD};
        agrupacion.put("MAD", List.of(MAD));

        // Aeropuerto Albacete (ABC)
        List<String> vuelo1ABC = new ArrayList<>();vuelo1ABC.add("MAD");vuelo1ABC.add("07:45");vuelo1ABC.add("18:55");vuelo1ABC.add("90");
        List<String> vuelo2ABC = new ArrayList<>();vuelo2ABC.add("ALC");vuelo2ABC.add("07:45");vuelo2ABC.add("18:55");vuelo2ABC.add("90");
        List<String> vuelo3ABC = new ArrayList<>();vuelo3ABC.add("LEI");vuelo3ABC.add("07:45");vuelo3ABC.add("18:55");vuelo3ABC.add("90");
        List<String> vuelo4ABC = new ArrayList<>();vuelo4ABC.add("OVD");vuelo4ABC.add("07:45");vuelo4ABC.add("18:55");vuelo4ABC.add("90");
        List<String> vuelo5ABC = new ArrayList<>();vuelo5ABC.add("BJZ");vuelo5ABC.add("07:45");vuelo5ABC.add("18:55");vuelo5ABC.add("90");
        List<String> vuelo6ABC = new ArrayList<>();vuelo6ABC.add("BCN");vuelo6ABC.add("07:45");vuelo6ABC.add("18:55");vuelo6ABC.add("90");
        List<String> vuelo7ABC = new ArrayList<>();vuelo7ABC.add("BIO");vuelo7ABC.add("07:45");vuelo7ABC.add("18:55");vuelo7ABC.add("90");
        List<String> vuelo8ABC = new ArrayList<>();vuelo8ABC.add("RGS");vuelo8ABC.add("07:45");vuelo8ABC.add("18:55");vuelo8ABC.add("90");
        List<String> vuelo9ABC = new ArrayList<>();vuelo9ABC.add("ODB");vuelo9ABC.add("07:45");vuelo9ABC.add("18:55");vuelo9ABC.add("90");
        List<String> vuelo10ABC = new ArrayList<>();vuelo10ABC.add("GRX");vuelo10ABC.add("07:45");vuelo10ABC.add("18:55");vuelo10ABC.add("90");
        List<String> vuelo11ABC = new ArrayList<>();vuelo11ABC.add("GRO");vuelo11ABC.add("07:45");vuelo11ABC.add("18:55");vuelo11ABC.add("90");
        List<String> vuelo12ABC = new ArrayList<>();vuelo12ABC.add("LPA");vuelo12ABC.add("07:45");vuelo12ABC.add("18:55");vuelo12ABC.add("90");
        List<String> vuelo13ABC = new ArrayList<>();vuelo13ABC.add("FUE");vuelo13ABC.add("07:45");vuelo13ABC.add("18:55");vuelo13ABC.add("90");
        List<String> vuelo14ABC = new ArrayList<>();vuelo14ABC.add("LCG");vuelo14ABC.add("07:45");vuelo14ABC.add("18:55");vuelo14ABC.add("90");
        List<String> vuelo15ABC = new ArrayList<>();vuelo15ABC.add("ACE");vuelo15ABC.add("07:45");vuelo15ABC.add("18:55");vuelo15ABC.add("90");
        List<String> vuelo16ABC = new ArrayList<>();vuelo16ABC.add("HSK");vuelo16ABC.add("07:45");vuelo16ABC.add("18:55");vuelo16ABC.add("90");
        List<String> vuelo17ABC = new ArrayList<>();vuelo17ABC.add("IBZ");vuelo17ABC.add("07:45");vuelo17ABC.add("18:55");vuelo17ABC.add("90");

        List<String>[] ABC = new List[]{vuelo1ABC,vuelo2ABC,vuelo3ABC,vuelo4ABC,vuelo5ABC,vuelo6ABC,vuelo7ABC,vuelo8ABC,vuelo9ABC,vuelo10ABC,vuelo11ABC,vuelo12ABC,vuelo13ABC,vuelo14ABC,vuelo15ABC,vuelo16ABC,vuelo17ABC};
        agrupacion.put("ABC", List.of(ABC));

        // Aeropuerto Elche (ALC)
        List<String> vuelo1ALC = new ArrayList<>();vuelo1ALC.add("MAD");vuelo1ALC.add("07:45");vuelo1ALC.add("18:55");vuelo1ALC.add("90");
        List<String> vuelo2ALC = new ArrayList<>();vuelo2ALC.add("ABC");vuelo2ALC.add("07:45");vuelo2ALC.add("18:55");vuelo2ALC.add("90");
        List<String> vuelo3ALC = new ArrayList<>();vuelo3ALC.add("LEI");vuelo3ALC.add("07:45");vuelo3ALC.add("18:55");vuelo3ALC.add("90");
        List<String> vuelo4ALC = new ArrayList<>();vuelo4ALC.add("OVD");vuelo4ALC.add("07:45");vuelo4ALC.add("18:55");vuelo4ALC.add("90");
        List<String> vuelo5ALC = new ArrayList<>();vuelo5ALC.add("BJZ");vuelo5ALC.add("07:45");vuelo5ALC.add("18:55");vuelo5ALC.add("90");
        List<String> vuelo6ALC = new ArrayList<>();vuelo6ALC.add("BCN");vuelo6ALC.add("07:45");vuelo6ALC.add("18:55");vuelo6ALC.add("90");
        List<String> vuelo7ALC = new ArrayList<>();vuelo7ALC.add("BIO");vuelo7ALC.add("07:45");vuelo7ALC.add("18:55");vuelo7ALC.add("90");
        List<String> vuelo8ALC = new ArrayList<>();vuelo8ALC.add("RGS");vuelo8ALC.add("07:45");vuelo8ALC.add("18:55");vuelo8ALC.add("90");
        List<String> vuelo9ALC = new ArrayList<>();vuelo9ALC.add("ODB");vuelo9ALC.add("07:45");vuelo9ALC.add("18:55");vuelo9ALC.add("90");
        List<String> vuelo10ALC = new ArrayList<>();vuelo10ALC.add("GRX");vuelo10ALC.add("07:45");vuelo10ALC.add("18:55");vuelo10ALC.add("90");
        List<String> vuelo11ALC = new ArrayList<>();vuelo11ALC.add("GRO");vuelo11ALC.add("07:45");vuelo11ALC.add("18:55");vuelo11ALC.add("90");
        List<String> vuelo12ALC = new ArrayList<>();vuelo12ALC.add("LPA");vuelo12ALC.add("07:45");vuelo12ALC.add("18:55");vuelo12ALC.add("90");
        List<String> vuelo13ALC = new ArrayList<>();vuelo13ALC.add("FUE");vuelo13ALC.add("07:45");vuelo13ALC.add("18:55");vuelo13ALC.add("90");
        List<String> vuelo14ALC = new ArrayList<>();vuelo14ALC.add("LCG");vuelo14ALC.add("07:45");vuelo14ALC.add("18:55");vuelo14ALC.add("90");
        List<String> vuelo15ALC = new ArrayList<>();vuelo15ALC.add("ACE");vuelo15ALC.add("07:45");vuelo15ALC.add("18:55");vuelo15ALC.add("90");
        List<String> vuelo16ALC = new ArrayList<>();vuelo16ALC.add("HSK");vuelo16ALC.add("07:45");vuelo16ALC.add("18:55");vuelo16ALC.add("90");
        List<String> vuelo17ALC = new ArrayList<>();vuelo17ALC.add("IBZ");vuelo17ALC.add("07:45");vuelo17ALC.add("18:55");vuelo17ALC.add("90");

        List<String>[] ALC = new List[]{vuelo1ALC,vuelo2ALC,vuelo3ALC,vuelo4ALC,vuelo5ALC,vuelo6ALC,vuelo7ALC,vuelo8ALC,vuelo9ALC,vuelo10ALC,vuelo11ALC,vuelo12ALC,vuelo13ALC,vuelo14ALC,vuelo15ALC,vuelo16ALC,vuelo17ALC};
        agrupacion.put("ALC", List.of(ALC));

        // Aeropuerto El Alquián (LEI)
        List<String> vuelo1LEI = new ArrayList<>();vuelo1LEI.add("MAD");vuelo1LEI.add("07:45");vuelo1LEI.add("18:55");vuelo1LEI.add("90");
        List<String> vuelo2LEI = new ArrayList<>();vuelo2LEI.add("ABC");vuelo2LEI.add("07:45");vuelo2LEI.add("18:55");vuelo2LEI.add("90");
        List<String> vuelo3LEI = new ArrayList<>();vuelo3LEI.add("ALC");vuelo3LEI.add("07:45");vuelo3LEI.add("18:55");vuelo3LEI.add("90");
        List<String> vuelo4LEI = new ArrayList<>();vuelo4LEI.add("OVD");vuelo4LEI.add("07:45");vuelo4LEI.add("18:55");vuelo4LEI.add("90");
        List<String> vuelo5LEI = new ArrayList<>();vuelo5LEI.add("BJZ");vuelo5LEI.add("07:45");vuelo5LEI.add("18:55");vuelo5LEI.add("90");
        List<String> vuelo6LEI = new ArrayList<>();vuelo6LEI.add("BCN");vuelo6LEI.add("07:45");vuelo6LEI.add("18:55");vuelo6LEI.add("90");
        List<String> vuelo7LEI = new ArrayList<>();vuelo7LEI.add("BIO");vuelo7LEI.add("07:45");vuelo7LEI.add("18:55");vuelo7LEI.add("90");
        List<String> vuelo8LEI = new ArrayList<>();vuelo8LEI.add("RGS");vuelo8LEI.add("07:45");vuelo8LEI.add("18:55");vuelo8LEI.add("90");
        List<String> vuelo9LEI = new ArrayList<>();vuelo9LEI.add("ODB");vuelo9LEI.add("07:45");vuelo9LEI.add("18:55");vuelo9LEI.add("90");
        List<String> vuelo10LEI = new ArrayList<>();vuelo10LEI.add("GRX");vuelo10LEI.add("07:45");vuelo10LEI.add("18:55");vuelo10LEI.add("90");
        List<String> vuelo11LEI = new ArrayList<>();vuelo11LEI.add("GRO");vuelo11LEI.add("07:45");vuelo11LEI.add("18:55");vuelo11LEI.add("90");
        List<String> vuelo12LEI = new ArrayList<>();vuelo12LEI.add("LPA");vuelo12LEI.add("07:45");vuelo12LEI.add("18:55");vuelo12LEI.add("90");
        List<String> vuelo13LEI = new ArrayList<>();vuelo13LEI.add("FUE");vuelo13LEI.add("07:45");vuelo13LEI.add("18:55");vuelo13LEI.add("90");
        List<String> vuelo14LEI = new ArrayList<>();vuelo14LEI.add("LCG");vuelo14LEI.add("07:45");vuelo14LEI.add("18:55");vuelo14LEI.add("90");
        List<String> vuelo15LEI = new ArrayList<>();vuelo15LEI.add("ACE");vuelo15LEI.add("07:45");vuelo15LEI.add("18:55");vuelo15LEI.add("90");
        List<String> vuelo16LEI = new ArrayList<>();vuelo16LEI.add("HSK");vuelo16LEI.add("07:45");vuelo16LEI.add("18:55");vuelo16LEI.add("90");
        List<String> vuelo17LEI = new ArrayList<>();vuelo17LEI.add("IBZ");vuelo17LEI.add("07:45");vuelo17LEI.add("18:55");vuelo17LEI.add("90");

        List<String>[] LEI = new List[]{vuelo1LEI,vuelo2LEI,vuelo3LEI,vuelo4LEI,vuelo5LEI,vuelo6LEI,vuelo7LEI,vuelo8LEI,vuelo9LEI,vuelo10LEI,vuelo11LEI,vuelo12LEI,vuelo13LEI,vuelo14LEI,vuelo15LEI,vuelo16LEI,vuelo17LEI};
        agrupacion.put("LEI", List.of(LEI));

        // Aeropuerto Castrillón (OVD)
        List<String> vuelo1OVD = new ArrayList<>();vuelo1OVD.add("MAD");vuelo1OVD.add("07:45");vuelo1OVD.add("18:55");vuelo1OVD.add("90");
        List<String> vuelo2OVD = new ArrayList<>();vuelo2OVD.add("ABC");vuelo2OVD.add("07:45");vuelo2OVD.add("18:55");vuelo2OVD.add("90");
        List<String> vuelo3OVD = new ArrayList<>();vuelo3OVD.add("ALC");vuelo3OVD.add("07:45");vuelo3OVD.add("18:55");vuelo3OVD.add("90");
        List<String> vuelo4OVD = new ArrayList<>();vuelo4OVD.add("LEI");vuelo4OVD.add("07:45");vuelo4OVD.add("18:55");vuelo4OVD.add("90");
        List<String> vuelo5OVD = new ArrayList<>();vuelo5OVD.add("BJZ");vuelo5OVD.add("07:45");vuelo5OVD.add("18:55");vuelo5OVD.add("90");
        List<String> vuelo6OVD = new ArrayList<>();vuelo6OVD.add("BCN");vuelo6OVD.add("07:45");vuelo6OVD.add("18:55");vuelo6OVD.add("90");
        List<String> vuelo7OVD = new ArrayList<>();vuelo7OVD.add("BIO");vuelo7OVD.add("07:45");vuelo7OVD.add("18:55");vuelo7OVD.add("90");
        List<String> vuelo8OVD = new ArrayList<>();vuelo8OVD.add("RGS");vuelo8OVD.add("07:45");vuelo8OVD.add("18:55");vuelo8OVD.add("90");
        List<String> vuelo9OVD = new ArrayList<>();vuelo9OVD.add("ODB");vuelo9OVD.add("07:45");vuelo9OVD.add("18:55");vuelo9OVD.add("90");
        List<String> vuelo10OVD = new ArrayList<>();vuelo10OVD.add("GRX");vuelo10OVD.add("07:45");vuelo10OVD.add("18:55");vuelo10OVD.add("90");
        List<String> vuelo11OVD = new ArrayList<>();vuelo11OVD.add("GRO");vuelo11OVD.add("07:45");vuelo11OVD.add("18:55");vuelo11OVD.add("90");
        List<String> vuelo12OVD = new ArrayList<>();vuelo12OVD.add("LPA");vuelo12OVD.add("07:45");vuelo12OVD.add("18:55");vuelo12OVD.add("90");
        List<String> vuelo13OVD = new ArrayList<>();vuelo13OVD.add("FUE");vuelo13OVD.add("07:45");vuelo13OVD.add("18:55");vuelo13OVD.add("90");
        List<String> vuelo14OVD = new ArrayList<>();vuelo14OVD.add("LCG");vuelo14OVD.add("07:45");vuelo14OVD.add("18:55");vuelo14OVD.add("90");
        List<String> vuelo15OVD = new ArrayList<>();vuelo15OVD.add("ACE");vuelo15OVD.add("07:45");vuelo15OVD.add("18:55");vuelo15OVD.add("90");
        List<String> vuelo16OVD = new ArrayList<>();vuelo16OVD.add("HSK");vuelo16OVD.add("07:45");vuelo16OVD.add("18:55");vuelo16OVD.add("90");
        List<String> vuelo17OVD = new ArrayList<>();vuelo17OVD.add("IBZ");vuelo17OVD.add("07:45");vuelo17OVD.add("18:55");vuelo17OVD.add("90");

        List<String>[] OVD = new List[]{vuelo1OVD,vuelo2OVD,vuelo3OVD,vuelo4OVD,vuelo5OVD,vuelo6OVD,vuelo7OVD,vuelo8OVD,vuelo9OVD,vuelo10OVD,vuelo11OVD,vuelo12OVD,vuelo13OVD,vuelo14OVD,vuelo15OVD,vuelo16OVD,vuelo17OVD};
        agrupacion.put("OVD", List.of(OVD));

        // Aeropuerto Talavera la Real (BJZ)
        List<String> vuelo1BJZ = new ArrayList<>();vuelo1BJZ.add("MAD");vuelo1BJZ.add("07:45");vuelo1BJZ.add("18:55");vuelo1BJZ.add("90");
        List<String> vuelo2BJZ = new ArrayList<>();vuelo2BJZ.add("ABC");vuelo2BJZ.add("07:45");vuelo2BJZ.add("18:55");vuelo2BJZ.add("90");
        List<String> vuelo3BJZ = new ArrayList<>();vuelo3BJZ.add("ALC");vuelo3BJZ.add("07:45");vuelo3BJZ.add("18:55");vuelo3BJZ.add("90");
        List<String> vuelo4BJZ = new ArrayList<>();vuelo4BJZ.add("LEI");vuelo4BJZ.add("07:45");vuelo4BJZ.add("18:55");vuelo4BJZ.add("90");
        List<String> vuelo5BJZ = new ArrayList<>();vuelo5BJZ.add("OVD");vuelo5BJZ.add("07:45");vuelo5BJZ.add("18:55");vuelo5BJZ.add("90");
        List<String> vuelo6BJZ = new ArrayList<>();vuelo6BJZ.add("BCN");vuelo6BJZ.add("07:45");vuelo6BJZ.add("18:55");vuelo6BJZ.add("90");
        List<String> vuelo7BJZ = new ArrayList<>();vuelo7BJZ.add("BIO");vuelo7BJZ.add("07:45");vuelo7BJZ.add("18:55");vuelo7BJZ.add("90");
        List<String> vuelo8BJZ = new ArrayList<>();vuelo8BJZ.add("RGS");vuelo8BJZ.add("07:45");vuelo8BJZ.add("18:55");vuelo8BJZ.add("90");
        List<String> vuelo9BJZ = new ArrayList<>();vuelo9BJZ.add("ODB");vuelo9BJZ.add("07:45");vuelo9BJZ.add("18:55");vuelo9BJZ.add("90");
        List<String> vuelo10BJZ = new ArrayList<>();vuelo10BJZ.add("GRX");vuelo10BJZ.add("07:45");vuelo10BJZ.add("18:55");vuelo10BJZ.add("90");
        List<String> vuelo11BJZ = new ArrayList<>();vuelo11BJZ.add("GRO");vuelo11BJZ.add("07:45");vuelo11BJZ.add("18:55");vuelo11BJZ.add("90");
        List<String> vuelo12BJZ = new ArrayList<>();vuelo12BJZ.add("LPA");vuelo12BJZ.add("07:45");vuelo12BJZ.add("18:55");vuelo12BJZ.add("90");
        List<String> vuelo13BJZ = new ArrayList<>();vuelo13BJZ.add("FUE");vuelo13BJZ.add("07:45");vuelo13BJZ.add("18:55");vuelo13BJZ.add("90");
        List<String> vuelo14BJZ = new ArrayList<>();vuelo14BJZ.add("LCG");vuelo14BJZ.add("07:45");vuelo14BJZ.add("18:55");vuelo14BJZ.add("90");
        List<String> vuelo15BJZ = new ArrayList<>();vuelo15BJZ.add("ACE");vuelo15BJZ.add("07:45");vuelo15BJZ.add("18:55");vuelo15BJZ.add("90");
        List<String> vuelo16BJZ = new ArrayList<>();vuelo16BJZ.add("HSK");vuelo16BJZ.add("07:45");vuelo16BJZ.add("18:55");vuelo16BJZ.add("90");
        List<String> vuelo17BJZ = new ArrayList<>();vuelo17BJZ.add("IBZ");vuelo17BJZ.add("07:45");vuelo17BJZ.add("18:55");vuelo17BJZ.add("90");

        List<String>[] BJZ = new List[]{vuelo1BJZ,vuelo2BJZ,vuelo3BJZ,vuelo4BJZ,vuelo5BJZ,vuelo6BJZ,vuelo7BJZ,vuelo8BJZ,vuelo9BJZ,vuelo10BJZ,vuelo11BJZ,vuelo12BJZ,vuelo13BJZ,vuelo14BJZ,vuelo15BJZ,vuelo16BJZ,vuelo17BJZ};
        agrupacion.put("BJZ", List.of(BJZ));

        // Aeropuerto El Prat de Llobregat (BCN)
        List<String> vuelo1BCN = new ArrayList<>();vuelo1BCN.add("MAD");vuelo1BCN.add("07:45");vuelo1BCN.add("18:55");vuelo1BCN.add("90");
        List<String> vuelo2BCN = new ArrayList<>();vuelo2BCN.add("ABC");vuelo2BCN.add("07:45");vuelo2BCN.add("18:55");vuelo2BCN.add("90");
        List<String> vuelo3BCN = new ArrayList<>();vuelo3BCN.add("ALC");vuelo3BCN.add("07:45");vuelo3BCN.add("18:55");vuelo3BCN.add("90");
        List<String> vuelo4BCN = new ArrayList<>();vuelo4BCN.add("LEI");vuelo4BCN.add("07:45");vuelo4BCN.add("18:55");vuelo4BCN.add("90");
        List<String> vuelo5BCN = new ArrayList<>();vuelo5BCN.add("OVD");vuelo5BCN.add("07:45");vuelo5BCN.add("18:55");vuelo5BCN.add("90");
        List<String> vuelo6BCN = new ArrayList<>();vuelo6BCN.add("BJZ");vuelo6BCN.add("07:45");vuelo6BCN.add("18:55");vuelo6BCN.add("90");
        List<String> vuelo7BCN = new ArrayList<>();vuelo7BCN.add("BIO");vuelo7BCN.add("07:45");vuelo7BCN.add("18:55");vuelo7BCN.add("90");
        List<String> vuelo8BCN = new ArrayList<>();vuelo8BCN.add("RGS");vuelo8BCN.add("07:45");vuelo8BCN.add("18:55");vuelo8BCN.add("90");
        List<String> vuelo9BCN = new ArrayList<>();vuelo9BCN.add("ODB");vuelo9BCN.add("07:45");vuelo9BCN.add("18:55");vuelo9BCN.add("90");
        List<String> vuelo10BCN = new ArrayList<>();vuelo10BCN.add("GRX");vuelo10BCN.add("07:45");vuelo10BCN.add("18:55");vuelo10BCN.add("90");
        List<String> vuelo11BCN = new ArrayList<>();vuelo11BCN.add("GRO");vuelo11BCN.add("07:45");vuelo11BCN.add("18:55");vuelo11BCN.add("90");
        List<String> vuelo12BCN = new ArrayList<>();vuelo12BCN.add("LPA");vuelo12BCN.add("07:45");vuelo12BCN.add("18:55");vuelo12BCN.add("90");
        List<String> vuelo13BCN = new ArrayList<>();vuelo13BCN.add("FUE");vuelo13BCN.add("07:45");vuelo13BCN.add("18:55");vuelo13BCN.add("90");
        List<String> vuelo14BCN = new ArrayList<>();vuelo14BCN.add("LCG");vuelo14BCN.add("07:45");vuelo14BCN.add("18:55");vuelo14BCN.add("90");
        List<String> vuelo15BCN = new ArrayList<>();vuelo15BCN.add("ACE");vuelo15BCN.add("07:45");vuelo15BCN.add("18:55");vuelo15BCN.add("90");
        List<String> vuelo16BCN = new ArrayList<>();vuelo16BCN.add("HSK");vuelo16BCN.add("07:45");vuelo16BCN.add("18:55");vuelo16BCN.add("90");
        List<String> vuelo17BCN = new ArrayList<>();vuelo17BCN.add("IBZ");vuelo17BCN.add("07:45");vuelo17BCN.add("18:55");vuelo17BCN.add("90");

        List<String>[] BCN = new List[]{vuelo1BCN,vuelo2BCN,vuelo3BCN,vuelo4BCN,vuelo5BCN,vuelo6BCN,vuelo7BCN,vuelo8BCN,vuelo9BCN,vuelo10BCN,vuelo11BCN,vuelo12BCN,vuelo13BCN,vuelo14BCN,vuelo15BCN,vuelo16BCN,vuelo17BCN};
        agrupacion.put("BCN", List.of(BCN));

        // Aeropuerto de Lujua (BIO)
        List<String> vuelo1BIO = new ArrayList<>();vuelo1BIO.add("MAD");vuelo1BIO.add("07:45");vuelo1BIO.add("18:55");vuelo1BIO.add("90");
        List<String> vuelo2BIO = new ArrayList<>();vuelo2BIO.add("ABC");vuelo2BIO.add("07:45");vuelo2BIO.add("18:55");vuelo2BIO.add("90");
        List<String> vuelo3BIO = new ArrayList<>();vuelo3BIO.add("ALC");vuelo3BIO.add("07:45");vuelo3BIO.add("18:55");vuelo3BIO.add("90");
        List<String> vuelo4BIO = new ArrayList<>();vuelo4BIO.add("LEI");vuelo4BIO.add("07:45");vuelo4BIO.add("18:55");vuelo4BIO.add("90");
        List<String> vuelo5BIO = new ArrayList<>();vuelo5BIO.add("OVD");vuelo5BIO.add("07:45");vuelo5BIO.add("18:55");vuelo5BIO.add("90");
        List<String> vuelo6BIO = new ArrayList<>();vuelo6BIO.add("BJZ");vuelo6BIO.add("07:45");vuelo6BIO.add("18:55");vuelo6BIO.add("90");
        List<String> vuelo7BIO = new ArrayList<>();vuelo7BIO.add("BCN");vuelo7BIO.add("07:45");vuelo7BIO.add("18:55");vuelo7BIO.add("90");
        List<String> vuelo8BIO = new ArrayList<>();vuelo8BIO.add("RGS");vuelo8BIO.add("07:45");vuelo8BIO.add("18:55");vuelo8BIO.add("90");
        List<String> vuelo9BIO = new ArrayList<>();vuelo9BIO.add("ODB");vuelo9BIO.add("07:45");vuelo9BIO.add("18:55");vuelo9BIO.add("90");
        List<String> vuelo10BIO = new ArrayList<>();vuelo10BIO.add("GRX");vuelo10BIO.add("07:45");vuelo10BIO.add("18:55");vuelo10BIO.add("90");
        List<String> vuelo11BIO = new ArrayList<>();vuelo11BIO.add("GRO");vuelo11BIO.add("07:45");vuelo11BIO.add("18:55");vuelo11BIO.add("90");
        List<String> vuelo12BIO = new ArrayList<>();vuelo12BIO.add("LPA");vuelo12BIO.add("07:45");vuelo12BIO.add("18:55");vuelo12BIO.add("90");
        List<String> vuelo13BIO = new ArrayList<>();vuelo13BIO.add("FUE");vuelo13BIO.add("07:45");vuelo13BIO.add("18:55");vuelo13BIO.add("90");
        List<String> vuelo14BIO = new ArrayList<>();vuelo14BIO.add("LCG");vuelo14BIO.add("07:45");vuelo14BIO.add("18:55");vuelo14BIO.add("90");
        List<String> vuelo15BIO = new ArrayList<>();vuelo15BIO.add("ACE");vuelo15BIO.add("07:45");vuelo15BIO.add("18:55");vuelo15BIO.add("90");
        List<String> vuelo16BIO = new ArrayList<>();vuelo16BIO.add("HSK");vuelo16BIO.add("07:45");vuelo16BIO.add("18:55");vuelo16BIO.add("90");
        List<String> vuelo17BIO = new ArrayList<>();vuelo17BIO.add("IBZ");vuelo17BIO.add("07:45");vuelo17BIO.add("18:55");vuelo17BIO.add("90");

        List<String>[] BIO = new List[]{vuelo1BIO,vuelo2BIO,vuelo3BIO,vuelo4BIO,vuelo5BIO,vuelo6BIO,vuelo7BIO,vuelo8BIO,vuelo9BIO,vuelo10BIO,vuelo11BIO,vuelo12BIO,vuelo13BIO,vuelo14BIO,vuelo15BIO,vuelo16BIO,vuelo17BIO};
        agrupacion.put("BIO", List.of(BIO));

        // Aeropuerto de Burgos (RGS)
        List<String> vuelo1RGS = new ArrayList<>();vuelo1RGS.add("MAD");vuelo1RGS.add("07:45");vuelo1RGS.add("18:55");vuelo1RGS.add("90");
        List<String> vuelo2RGS = new ArrayList<>();vuelo2RGS.add("ABC");vuelo2RGS.add("07:45");vuelo2RGS.add("18:55");vuelo2RGS.add("90");
        List<String> vuelo3RGS = new ArrayList<>();vuelo3RGS.add("ALC");vuelo3RGS.add("07:45");vuelo3RGS.add("18:55");vuelo3RGS.add("90");
        List<String> vuelo4RGS = new ArrayList<>();vuelo4RGS.add("LEI");vuelo4RGS.add("07:45");vuelo4RGS.add("18:55");vuelo4RGS.add("90");
        List<String> vuelo5RGS = new ArrayList<>();vuelo5RGS.add("OVD");vuelo5RGS.add("07:45");vuelo5RGS.add("18:55");vuelo5RGS.add("90");
        List<String> vuelo6RGS = new ArrayList<>();vuelo6RGS.add("BJZ");vuelo6RGS.add("07:45");vuelo6RGS.add("18:55");vuelo6RGS.add("90");
        List<String> vuelo7RGS = new ArrayList<>();vuelo7RGS.add("BCN");vuelo7RGS.add("07:45");vuelo7RGS.add("18:55");vuelo7RGS.add("90");
        List<String> vuelo8RGS = new ArrayList<>();vuelo8RGS.add("BIO");vuelo8RGS.add("07:45");vuelo8RGS.add("18:55");vuelo8RGS.add("90");
        List<String> vuelo9RGS = new ArrayList<>();vuelo9RGS.add("ODB");vuelo9RGS.add("07:45");vuelo9RGS.add("18:55");vuelo9RGS.add("90");
        List<String> vuelo10RGS = new ArrayList<>();vuelo10RGS.add("GRX");vuelo10RGS.add("07:45");vuelo10RGS.add("18:55");vuelo10RGS.add("90");
        List<String> vuelo11RGS = new ArrayList<>();vuelo11RGS.add("GRO");vuelo11RGS.add("07:45");vuelo11RGS.add("18:55");vuelo11RGS.add("90");
        List<String> vuelo12RGS = new ArrayList<>();vuelo12RGS.add("LPA");vuelo12RGS.add("07:45");vuelo12RGS.add("18:55");vuelo12RGS.add("90");
        List<String> vuelo13RGS = new ArrayList<>();vuelo13RGS.add("FUE");vuelo13RGS.add("07:45");vuelo13RGS.add("18:55");vuelo13RGS.add("90");
        List<String> vuelo14RGS = new ArrayList<>();vuelo14RGS.add("LCG");vuelo14RGS.add("07:45");vuelo14RGS.add("18:55");vuelo14RGS.add("90");
        List<String> vuelo15RGS = new ArrayList<>();vuelo15RGS.add("ACE");vuelo15RGS.add("07:45");vuelo15RGS.add("18:55");vuelo15RGS.add("90");
        List<String> vuelo16RGS = new ArrayList<>();vuelo16RGS.add("HSK");vuelo16RGS.add("07:45");vuelo16RGS.add("18:55");vuelo16RGS.add("90");
        List<String> vuelo17RGS = new ArrayList<>();vuelo17RGS.add("IBZ");vuelo17RGS.add("07:45");vuelo17RGS.add("18:55");vuelo17RGS.add("90");

        List<String>[] RGS = new List[]{vuelo1RGS,vuelo2RGS,vuelo3RGS,vuelo4RGS,vuelo5RGS,vuelo6RGS,vuelo7RGS,vuelo8RGS,vuelo9RGS,vuelo10RGS,vuelo11RGS,vuelo12RGS,vuelo13RGS,vuelo14RGS,vuelo15RGS,vuelo16RGS,vuelo17RGS};
        agrupacion.put("RGS", List.of(RGS));

        // Aeropuerto de Córdoba (ODB)
        List<String> vuelo1ODB = new ArrayList<>();vuelo1ODB.add("MAD");vuelo1ODB.add("07:45");vuelo1ODB.add("18:55");vuelo1ODB.add("90");
        List<String> vuelo2ODB = new ArrayList<>();vuelo2ODB.add("ABC");vuelo2ODB.add("07:45");vuelo2ODB.add("18:55");vuelo2ODB.add("90");
        List<String> vuelo3ODB = new ArrayList<>();vuelo3ODB.add("ALC");vuelo3ODB.add("07:45");vuelo3ODB.add("18:55");vuelo3ODB.add("90");
        List<String> vuelo4ODB = new ArrayList<>();vuelo4ODB.add("LEI");vuelo4ODB.add("07:45");vuelo4ODB.add("18:55");vuelo4ODB.add("90");
        List<String> vuelo5ODB = new ArrayList<>();vuelo5ODB.add("OVD");vuelo5ODB.add("07:45");vuelo5ODB.add("18:55");vuelo5ODB.add("90");
        List<String> vuelo6ODB = new ArrayList<>();vuelo6ODB.add("BJZ");vuelo6ODB.add("07:45");vuelo6ODB.add("18:55");vuelo6ODB.add("90");
        List<String> vuelo7ODB = new ArrayList<>();vuelo7ODB.add("BCN");vuelo7ODB.add("07:45");vuelo7ODB.add("18:55");vuelo7ODB.add("90");
        List<String> vuelo8ODB = new ArrayList<>();vuelo8ODB.add("BIO");vuelo8ODB.add("07:45");vuelo8ODB.add("18:55");vuelo8ODB.add("90");
        List<String> vuelo9ODB = new ArrayList<>();vuelo9ODB.add("RGS");vuelo9ODB.add("07:45");vuelo9ODB.add("18:55");vuelo9ODB.add("90");
        List<String> vuelo10ODB = new ArrayList<>();vuelo10ODB.add("GRX");vuelo10ODB.add("07:45");vuelo10ODB.add("18:55");vuelo10ODB.add("90");
        List<String> vuelo11ODB = new ArrayList<>();vuelo11ODB.add("GRO");vuelo11ODB.add("07:45");vuelo11ODB.add("18:55");vuelo11ODB.add("90");
        List<String> vuelo12ODB = new ArrayList<>();vuelo12ODB.add("LPA");vuelo12ODB.add("07:45");vuelo12ODB.add("18:55");vuelo12ODB.add("90");
        List<String> vuelo13ODB = new ArrayList<>();vuelo13ODB.add("FUE");vuelo13ODB.add("07:45");vuelo13ODB.add("18:55");vuelo13ODB.add("90");
        List<String> vuelo14ODB = new ArrayList<>();vuelo14ODB.add("LCG");vuelo14ODB.add("07:45");vuelo14ODB.add("18:55");vuelo14ODB.add("90");
        List<String> vuelo15ODB = new ArrayList<>();vuelo15ODB.add("ACE");vuelo15ODB.add("07:45");vuelo15ODB.add("18:55");vuelo15ODB.add("90");
        List<String> vuelo16ODB = new ArrayList<>();vuelo16ODB.add("HSK");vuelo16ODB.add("07:45");vuelo16ODB.add("18:55");vuelo16ODB.add("90");
        List<String> vuelo17ODB = new ArrayList<>();vuelo17ODB.add("IBZ");vuelo17ODB.add("07:45");vuelo17ODB.add("18:55");vuelo17ODB.add("90");

        List<String>[] ODB = new List[]{vuelo1ODB,vuelo2ODB,vuelo3ODB,vuelo4ODB,vuelo5ODB,vuelo6ODB,vuelo7ODB,vuelo8ODB,vuelo9ODB,vuelo10ODB,vuelo11ODB,vuelo12ODB,vuelo13ODB,vuelo14ODB,vuelo15ODB,vuelo16ODB,vuelo17ODB};
        agrupacion.put("ODB", List.of(ODB));

        // Aeropuerto de Santa Fe (GRX)
        List<String> vuelo1GRX = new ArrayList<>();vuelo1GRX.add("MAD");vuelo1GRX.add("07:45");vuelo1GRX.add("18:55");vuelo1GRX.add("90");
        List<String> vuelo2GRX = new ArrayList<>();vuelo2GRX.add("ABC");vuelo2GRX.add("07:45");vuelo2GRX.add("18:55");vuelo2GRX.add("90");
        List<String> vuelo3GRX = new ArrayList<>();vuelo3GRX.add("ALC");vuelo3GRX.add("07:45");vuelo3GRX.add("18:55");vuelo3GRX.add("90");
        List<String> vuelo4GRX = new ArrayList<>();vuelo4GRX.add("LEI");vuelo4GRX.add("07:45");vuelo4GRX.add("18:55");vuelo4GRX.add("90");
        List<String> vuelo5GRX = new ArrayList<>();vuelo5GRX.add("OVD");vuelo5GRX.add("07:45");vuelo5GRX.add("18:55");vuelo5GRX.add("90");
        List<String> vuelo6GRX = new ArrayList<>();vuelo6GRX.add("BJZ");vuelo6GRX.add("07:45");vuelo6GRX.add("18:55");vuelo6GRX.add("90");
        List<String> vuelo7GRX = new ArrayList<>();vuelo7GRX.add("BCN");vuelo7GRX.add("07:45");vuelo7GRX.add("18:55");vuelo7GRX.add("90");
        List<String> vuelo8GRX = new ArrayList<>();vuelo8GRX.add("BIO");vuelo8GRX.add("07:45");vuelo8GRX.add("18:55");vuelo8GRX.add("90");
        List<String> vuelo9GRX = new ArrayList<>();vuelo9GRX.add("RGS");vuelo9GRX.add("07:45");vuelo9GRX.add("18:55");vuelo9GRX.add("90");
        List<String> vuelo10GRX = new ArrayList<>();vuelo10GRX.add("ODB");vuelo10GRX.add("07:45");vuelo10GRX.add("18:55");vuelo10GRX.add("90");
        List<String> vuelo11GRX = new ArrayList<>();vuelo11GRX.add("GRO");vuelo11GRX.add("07:45");vuelo11GRX.add("18:55");vuelo11GRX.add("90");
        List<String> vuelo12GRX = new ArrayList<>();vuelo12GRX.add("LPA");vuelo12GRX.add("07:45");vuelo12GRX.add("18:55");vuelo12GRX.add("90");
        List<String> vuelo13GRX = new ArrayList<>();vuelo13GRX.add("FUE");vuelo13GRX.add("07:45");vuelo13GRX.add("18:55");vuelo13GRX.add("90");
        List<String> vuelo14GRX = new ArrayList<>();vuelo14GRX.add("LCG");vuelo14GRX.add("07:45");vuelo14GRX.add("18:55");vuelo14GRX.add("90");
        List<String> vuelo15GRX = new ArrayList<>();vuelo15GRX.add("ACE");vuelo15GRX.add("07:45");vuelo15GRX.add("18:55");vuelo15GRX.add("90");
        List<String> vuelo16GRX = new ArrayList<>();vuelo16GRX.add("HSK");vuelo16GRX.add("07:45");vuelo16GRX.add("18:55");vuelo16GRX.add("90");
        List<String> vuelo17GRX = new ArrayList<>();vuelo17GRX.add("IBZ");vuelo17GRX.add("07:45");vuelo17GRX.add("18:55");vuelo17GRX.add("90");

        List<String>[] GRX = new List[]{vuelo1GRX,vuelo2GRX,vuelo3GRX,vuelo4GRX,vuelo5GRX,vuelo6GRX,vuelo7GRX,vuelo8GRX,vuelo9GRX,vuelo10GRX,vuelo11GRX,vuelo12GRX,vuelo13GRX,vuelo14GRX,vuelo15GRX,vuelo16GRX,vuelo17GRX};
        agrupacion.put("GRX", List.of(GRX));

        // Aeropuerto de Aiguaviva (GRO)
        List<String> vuelo1GRO = new ArrayList<>();vuelo1GRO.add("MAD");vuelo1GRO.add("07:45");vuelo1GRO.add("18:55");vuelo1GRO.add("90");
        List<String> vuelo2GRO = new ArrayList<>();vuelo2GRO.add("ABC");vuelo2GRO.add("07:45");vuelo2GRO.add("18:55");vuelo2GRO.add("90");
        List<String> vuelo3GRO = new ArrayList<>();vuelo3GRO.add("ALC");vuelo3GRO.add("07:45");vuelo3GRO.add("18:55");vuelo3GRO.add("90");
        List<String> vuelo4GRO = new ArrayList<>();vuelo4GRO.add("LEI");vuelo4GRO.add("07:45");vuelo4GRO.add("18:55");vuelo4GRO.add("90");
        List<String> vuelo5GRO = new ArrayList<>();vuelo5GRO.add("OVD");vuelo5GRO.add("07:45");vuelo5GRO.add("18:55");vuelo5GRO.add("90");
        List<String> vuelo6GRO = new ArrayList<>();vuelo6GRO.add("BJZ");vuelo6GRO.add("07:45");vuelo6GRO.add("18:55");vuelo6GRO.add("90");
        List<String> vuelo7GRO = new ArrayList<>();vuelo7GRO.add("BCN");vuelo7GRO.add("07:45");vuelo7GRO.add("18:55");vuelo7GRO.add("90");
        List<String> vuelo8GRO = new ArrayList<>();vuelo8GRO.add("BIO");vuelo8GRO.add("07:45");vuelo8GRO.add("18:55");vuelo8GRO.add("90");
        List<String> vuelo9GRO = new ArrayList<>();vuelo9GRO.add("RGS");vuelo9GRO.add("07:45");vuelo9GRO.add("18:55");vuelo9GRO.add("90");
        List<String> vuelo10GRO = new ArrayList<>();vuelo10GRO.add("ODB");vuelo10GRO.add("07:45");vuelo10GRO.add("18:55");vuelo10GRO.add("90");
        List<String> vuelo11GRO = new ArrayList<>();vuelo11GRO.add("GRX");vuelo11GRO.add("07:45");vuelo11GRO.add("18:55");vuelo11GRO.add("90");
        List<String> vuelo12GRO = new ArrayList<>();vuelo12GRO.add("LPA");vuelo12GRO.add("07:45");vuelo12GRO.add("18:55");vuelo12GRO.add("90");
        List<String> vuelo13GRO = new ArrayList<>();vuelo13GRO.add("FUE");vuelo13GRO.add("07:45");vuelo13GRO.add("18:55");vuelo13GRO.add("90");
        List<String> vuelo14GRO = new ArrayList<>();vuelo14GRO.add("LCG");vuelo14GRO.add("07:45");vuelo14GRO.add("18:55");vuelo14GRO.add("90");
        List<String> vuelo15GRO = new ArrayList<>();vuelo15GRO.add("ACE");vuelo15GRO.add("07:45");vuelo15GRO.add("18:55");vuelo15GRO.add("90");
        List<String> vuelo16GRO = new ArrayList<>();vuelo16GRO.add("HSK");vuelo16GRO.add("07:45");vuelo16GRO.add("18:55");vuelo16GRO.add("90");
        List<String> vuelo17GRO = new ArrayList<>();vuelo17GRO.add("IBZ");vuelo17GRO.add("07:45");vuelo17GRO.add("18:55");vuelo17GRO.add("90");

        List<String>[] GRO = new List[]{vuelo1GRO,vuelo2GRO,vuelo3GRO,vuelo4GRO,vuelo5GRO,vuelo6GRO,vuelo7GRO,vuelo8GRO,vuelo9GRO,vuelo10GRO,vuelo11GRO,vuelo12GRO,vuelo13GRO,vuelo14GRO,vuelo15GRO,vuelo16GRO,vuelo17GRO};
        agrupacion.put("GRO", List.of(GRO));

        //Aeropuerto de Telde (LPA)
        List<String> vuelo1LPA = new ArrayList<>();vuelo1LPA.add("MAD");vuelo1LPA.add("07:45");vuelo1LPA.add("18:55");vuelo1LPA.add("90");
        List<String> vuelo2LPA = new ArrayList<>();vuelo2LPA.add("ABC");vuelo2LPA.add("07:45");vuelo2LPA.add("18:55");vuelo2LPA.add("90");
        List<String> vuelo3LPA = new ArrayList<>();vuelo3LPA.add("ALC");vuelo3LPA.add("07:45");vuelo3LPA.add("18:55");vuelo3LPA.add("90");
        List<String> vuelo4LPA = new ArrayList<>();vuelo4LPA.add("LEI");vuelo4LPA.add("07:45");vuelo4LPA.add("18:55");vuelo4LPA.add("90");
        List<String> vuelo5LPA = new ArrayList<>();vuelo5LPA.add("OVD");vuelo5LPA.add("07:45");vuelo5LPA.add("18:55");vuelo5LPA.add("90");
        List<String> vuelo6LPA = new ArrayList<>();vuelo6LPA.add("BJZ");vuelo6LPA.add("07:45");vuelo6LPA.add("18:55");vuelo6LPA.add("90");
        List<String> vuelo7LPA = new ArrayList<>();vuelo7LPA.add("BCN");vuelo7LPA.add("07:45");vuelo7LPA.add("18:55");vuelo7LPA.add("90");
        List<String> vuelo8LPA = new ArrayList<>();vuelo8LPA.add("BIO");vuelo8LPA.add("07:45");vuelo8LPA.add("18:55");vuelo8LPA.add("90");
        List<String> vuelo9LPA = new ArrayList<>();vuelo9LPA.add("RGS");vuelo9LPA.add("07:45");vuelo9LPA.add("18:55");vuelo9LPA.add("90");
        List<String> vuelo10LPA = new ArrayList<>();vuelo10LPA.add("ODB");vuelo10LPA.add("07:45");vuelo10LPA.add("18:55");vuelo10LPA.add("90");
        List<String> vuelo11LPA = new ArrayList<>();vuelo11LPA.add("GRX");vuelo11LPA.add("07:45");vuelo11LPA.add("18:55");vuelo11LPA.add("90");
        List<String> vuelo12LPA = new ArrayList<>();vuelo12LPA.add("GRO");vuelo12LPA.add("07:45");vuelo12LPA.add("18:55");vuelo12LPA.add("90");
        List<String> vuelo13LPA = new ArrayList<>();vuelo13LPA.add("FUE");vuelo13LPA.add("07:45");vuelo13LPA.add("18:55");vuelo13LPA.add("90");
        List<String> vuelo14LPA = new ArrayList<>();vuelo14LPA.add("LCG");vuelo14LPA.add("07:45");vuelo14LPA.add("18:55");vuelo14LPA.add("90");
        List<String> vuelo15LPA = new ArrayList<>();vuelo15LPA.add("ACE");vuelo15LPA.add("07:45");vuelo15LPA.add("18:55");vuelo15LPA.add("90");
        List<String> vuelo16LPA = new ArrayList<>();vuelo16LPA.add("HSK");vuelo16LPA.add("07:45");vuelo16LPA.add("18:55");vuelo16LPA.add("90");
        List<String> vuelo17LPA = new ArrayList<>();vuelo17LPA.add("IBZ");vuelo17LPA.add("07:45");vuelo17LPA.add("18:55");vuelo17LPA.add("90");

        List<String>[] LPA = new List[]{vuelo1LPA,vuelo2LPA,vuelo3LPA,vuelo4LPA,vuelo5LPA,vuelo6LPA,vuelo7LPA,vuelo8LPA,vuelo9LPA,vuelo10LPA,vuelo11LPA,vuelo12LPA,vuelo13LPA,vuelo14LPA,vuelo15LPA,vuelo16LPA,vuelo17LPA};
        agrupacion.put("LPA", List.of(LPA));

        //Aeropuerto de Puerto del Rosario (FUE)
        List<String> vuelo1FUE = new ArrayList<>();vuelo1FUE.add("MAD");vuelo1FUE.add("07:45");vuelo1FUE.add("18:55");vuelo1FUE.add("90");
        List<String> vuelo2FUE = new ArrayList<>();vuelo2FUE.add("ABC");vuelo2FUE.add("07:45");vuelo2FUE.add("18:55");vuelo2FUE.add("90");
        List<String> vuelo3FUE = new ArrayList<>();vuelo3FUE.add("ALC");vuelo3FUE.add("07:45");vuelo3FUE.add("18:55");vuelo3FUE.add("90");
        List<String> vuelo4FUE = new ArrayList<>();vuelo4FUE.add("LEI");vuelo4FUE.add("07:45");vuelo4FUE.add("18:55");vuelo4FUE.add("90");
        List<String> vuelo5FUE = new ArrayList<>();vuelo5FUE.add("OVD");vuelo5FUE.add("07:45");vuelo5FUE.add("18:55");vuelo5FUE.add("90");
        List<String> vuelo6FUE = new ArrayList<>();vuelo6FUE.add("BJZ");vuelo6FUE.add("07:45");vuelo6FUE.add("18:55");vuelo6FUE.add("90");
        List<String> vuelo7FUE = new ArrayList<>();vuelo7FUE.add("BCN");vuelo7FUE.add("07:45");vuelo7FUE.add("18:55");vuelo7FUE.add("90");
        List<String> vuelo8FUE = new ArrayList<>();vuelo8FUE.add("BIO");vuelo8FUE.add("07:45");vuelo8FUE.add("18:55");vuelo8FUE.add("90");
        List<String> vuelo9FUE = new ArrayList<>();vuelo9FUE.add("RGS");vuelo9FUE.add("07:45");vuelo9FUE.add("18:55");vuelo9FUE.add("90");
        List<String> vuelo10FUE = new ArrayList<>();vuelo10FUE.add("ODB");vuelo10FUE.add("07:45");vuelo10FUE.add("18:55");vuelo10FUE.add("90");
        List<String> vuelo11FUE = new ArrayList<>();vuelo11FUE.add("GRX");vuelo11FUE.add("07:45");vuelo11FUE.add("18:55");vuelo11FUE.add("90");
        List<String> vuelo12FUE = new ArrayList<>();vuelo12FUE.add("GRO");vuelo12FUE.add("07:45");vuelo12FUE.add("18:55");vuelo12FUE.add("90");
        List<String> vuelo13FUE = new ArrayList<>();vuelo13FUE.add("LPA");vuelo13FUE.add("07:45");vuelo13FUE.add("18:55");vuelo13FUE.add("90");
        List<String> vuelo14FUE = new ArrayList<>();vuelo14FUE.add("LCG");vuelo14FUE.add("07:45");vuelo14FUE.add("18:55");vuelo14FUE.add("90");
        List<String> vuelo15FUE = new ArrayList<>();vuelo15FUE.add("ACE");vuelo15FUE.add("07:45");vuelo15FUE.add("18:55");vuelo15FUE.add("90");
        List<String> vuelo16FUE = new ArrayList<>();vuelo16FUE.add("HSK");vuelo16FUE.add("07:45");vuelo16FUE.add("18:55");vuelo16FUE.add("90");
        List<String> vuelo17FUE = new ArrayList<>();vuelo17FUE.add("IBZ");vuelo17FUE.add("07:45");vuelo17FUE.add("18:55");vuelo17FUE.add("90");

        List<String>[] FUE = new List[]{vuelo1FUE,vuelo2FUE,vuelo3FUE,vuelo4FUE,vuelo5FUE,vuelo6FUE,vuelo7FUE,vuelo8FUE,vuelo9FUE,vuelo10FUE,vuelo11FUE,vuelo12FUE,vuelo13FUE,vuelo14FUE,vuelo15FUE,vuelo16FUE,vuelo17FUE};
        agrupacion.put("FUE", List.of(FUE));

        //Aeropuerto de Culledero (LCG)
        List<String> vuelo1LCG = new ArrayList<>();vuelo1LCG.add("MAD");vuelo1LCG.add("07:45");vuelo1LCG.add("18:55");vuelo1LCG.add("90");
        List<String> vuelo2LCG = new ArrayList<>();vuelo2LCG.add("ABC");vuelo2LCG.add("07:45");vuelo2LCG.add("18:55");vuelo2LCG.add("90");
        List<String> vuelo3LCG = new ArrayList<>();vuelo3LCG.add("ALC");vuelo3LCG.add("07:45");vuelo3LCG.add("18:55");vuelo3LCG.add("90");
        List<String> vuelo4LCG = new ArrayList<>();vuelo4LCG.add("LEI");vuelo4LCG.add("07:45");vuelo4LCG.add("18:55");vuelo4LCG.add("90");
        List<String> vuelo5LCG = new ArrayList<>();vuelo5LCG.add("OVD");vuelo5LCG.add("07:45");vuelo5LCG.add("18:55");vuelo5LCG.add("90");
        List<String> vuelo6LCG = new ArrayList<>();vuelo6LCG.add("BJZ");vuelo6LCG.add("07:45");vuelo6LCG.add("18:55");vuelo6LCG.add("90");
        List<String> vuelo7LCG = new ArrayList<>();vuelo7LCG.add("BCN");vuelo7LCG.add("07:45");vuelo7LCG.add("18:55");vuelo7LCG.add("90");
        List<String> vuelo8LCG = new ArrayList<>();vuelo8LCG.add("BIO");vuelo8LCG.add("07:45");vuelo8LCG.add("18:55");vuelo8LCG.add("90");
        List<String> vuelo9LCG = new ArrayList<>();vuelo9LCG.add("RGS");vuelo9LCG.add("07:45");vuelo9LCG.add("18:55");vuelo9LCG.add("90");
        List<String> vuelo10LCG = new ArrayList<>();vuelo10LCG.add("ODB");vuelo10LCG.add("07:45");vuelo10LCG.add("18:55");vuelo10LCG.add("90");
        List<String> vuelo11LCG = new ArrayList<>();vuelo11LCG.add("GRX");vuelo11LCG.add("07:45");vuelo11LCG.add("18:55");vuelo11LCG.add("90");
        List<String> vuelo12LCG = new ArrayList<>();vuelo12LCG.add("GRO");vuelo12LCG.add("07:45");vuelo12LCG.add("18:55");vuelo12LCG.add("90");
        List<String> vuelo13LCG = new ArrayList<>();vuelo13LCG.add("LPA");vuelo13LCG.add("07:45");vuelo13LCG.add("18:55");vuelo13LCG.add("90");
        List<String> vuelo14LCG = new ArrayList<>();vuelo14LCG.add("FUE");vuelo14LCG.add("07:45");vuelo14LCG.add("18:55");vuelo14LCG.add("90");
        List<String> vuelo15LCG = new ArrayList<>();vuelo15LCG.add("ACE");vuelo15LCG.add("07:45");vuelo15LCG.add("18:55");vuelo15LCG.add("90");
        List<String> vuelo16LCG = new ArrayList<>();vuelo16LCG.add("HSK");vuelo16LCG.add("07:45");vuelo16LCG.add("18:55");vuelo16LCG.add("90");
        List<String> vuelo17LCG = new ArrayList<>();vuelo17LCG.add("IBZ");vuelo17LCG.add("07:45");vuelo17LCG.add("18:55");vuelo17LCG.add("90");

        List<String>[] LCG = new List[]{vuelo1LCG,vuelo2LCG,vuelo3LCG,vuelo4LCG,vuelo5LCG,vuelo6LCG,vuelo7LCG,vuelo8LCG,vuelo9LCG,vuelo10LCG,vuelo11LCG,vuelo12LCG,vuelo13LCG,vuelo14LCG,vuelo15LCG,vuelo16LCG,vuelo17LCG};
        agrupacion.put("LCG", List.of(LCG));

        //Aeropuerto de San Bartolomé (ACE)
        List<String> vuelo1ACE = new ArrayList<>();vuelo1ACE.add("MAD");vuelo1ACE.add("07:45");vuelo1ACE.add("18:55");vuelo1ACE.add("90");
        List<String> vuelo2ACE = new ArrayList<>();vuelo2ACE.add("ABC");vuelo2ACE.add("07:45");vuelo2ACE.add("18:55");vuelo2ACE.add("90");
        List<String> vuelo3ACE = new ArrayList<>();vuelo3ACE.add("ALC");vuelo3ACE.add("07:45");vuelo3ACE.add("18:55");vuelo3ACE.add("90");
        List<String> vuelo4ACE = new ArrayList<>();vuelo4ACE.add("LEI");vuelo4ACE.add("07:45");vuelo4ACE.add("18:55");vuelo4ACE.add("90");
        List<String> vuelo5ACE = new ArrayList<>();vuelo5ACE.add("OVD");vuelo5ACE.add("07:45");vuelo5ACE.add("18:55");vuelo5ACE.add("90");
        List<String> vuelo6ACE = new ArrayList<>();vuelo6ACE.add("BJZ");vuelo6ACE.add("07:45");vuelo6ACE.add("18:55");vuelo6ACE.add("90");
        List<String> vuelo7ACE = new ArrayList<>();vuelo7ACE.add("BCN");vuelo7ACE.add("07:45");vuelo7ACE.add("18:55");vuelo7ACE.add("90");
        List<String> vuelo8ACE = new ArrayList<>();vuelo8ACE.add("BIO");vuelo8ACE.add("07:45");vuelo8ACE.add("18:55");vuelo8ACE.add("90");
        List<String> vuelo9ACE = new ArrayList<>();vuelo9ACE.add("RGS");vuelo9ACE.add("07:45");vuelo9ACE.add("18:55");vuelo9ACE.add("90");
        List<String> vuelo10ACE = new ArrayList<>();vuelo10ACE.add("ODB");vuelo10ACE.add("07:45");vuelo10ACE.add("18:55");vuelo10ACE.add("90");
        List<String> vuelo11ACE = new ArrayList<>();vuelo11ACE.add("GRX");vuelo11ACE.add("07:45");vuelo11ACE.add("18:55");vuelo11ACE.add("90");
        List<String> vuelo12ACE = new ArrayList<>();vuelo12ACE.add("GRO");vuelo12ACE.add("07:45");vuelo12ACE.add("18:55");vuelo12ACE.add("90");
        List<String> vuelo13ACE = new ArrayList<>();vuelo13ACE.add("LPA");vuelo13ACE.add("07:45");vuelo13ACE.add("18:55");vuelo13ACE.add("90");
        List<String> vuelo14ACE = new ArrayList<>();vuelo14ACE.add("LCG");vuelo14ACE.add("07:45");vuelo14ACE.add("18:55");vuelo14ACE.add("90");
        List<String> vuelo15ACE = new ArrayList<>();vuelo15ACE.add("FUE");vuelo15ACE.add("07:45");vuelo15ACE.add("18:55");vuelo15ACE.add("90");
        List<String> vuelo16ACE = new ArrayList<>();vuelo16ACE.add("HSK");vuelo16ACE.add("07:45");vuelo16ACE.add("18:55");vuelo16ACE.add("90");
        List<String> vuelo17ACE = new ArrayList<>();vuelo17ACE.add("IBZ");vuelo17ACE.add("07:45");vuelo17ACE.add("18:55");vuelo17ACE.add("90");

        List<String>[] ACE = new List[]{vuelo1ACE,vuelo2ACE,vuelo3ACE,vuelo4ACE,vuelo5ACE,vuelo6ACE,vuelo7ACE,vuelo8ACE,vuelo9ACE,vuelo10ACE,vuelo11ACE,vuelo12ACE,vuelo13ACE,vuelo14ACE,vuelo15ACE,vuelo16ACE,vuelo17ACE};
        agrupacion.put("ACE", List.of(ACE));

        //Aeropuerto de Alcalá del Obispo (HSK)
        List<String> vuelo1HSK = new ArrayList<>();vuelo1HSK.add("MAD");vuelo1HSK.add("07:45");vuelo1HSK.add("18:55");vuelo1HSK.add("90");
        List<String> vuelo2HSK = new ArrayList<>();vuelo2HSK.add("ABC");vuelo2HSK.add("07:45");vuelo2HSK.add("18:55");vuelo2HSK.add("90");
        List<String> vuelo3HSK = new ArrayList<>();vuelo3HSK.add("ALC");vuelo3HSK.add("07:45");vuelo3HSK.add("18:55");vuelo3HSK.add("90");
        List<String> vuelo4HSK = new ArrayList<>();vuelo4HSK.add("LEI");vuelo4HSK.add("07:45");vuelo4HSK.add("18:55");vuelo4HSK.add("90");
        List<String> vuelo5HSK = new ArrayList<>();vuelo5HSK.add("OVD");vuelo5HSK.add("07:45");vuelo5HSK.add("18:55");vuelo5HSK.add("90");
        List<String> vuelo6HSK = new ArrayList<>();vuelo6HSK.add("BJZ");vuelo6HSK.add("07:45");vuelo6HSK.add("18:55");vuelo6HSK.add("90");
        List<String> vuelo7HSK = new ArrayList<>();vuelo7HSK.add("BCN");vuelo7HSK.add("07:45");vuelo7HSK.add("18:55");vuelo7HSK.add("90");
        List<String> vuelo8HSK = new ArrayList<>();vuelo8HSK.add("BIO");vuelo8HSK.add("07:45");vuelo8HSK.add("18:55");vuelo8HSK.add("90");
        List<String> vuelo9HSK = new ArrayList<>();vuelo9HSK.add("RGS");vuelo9HSK.add("07:45");vuelo9HSK.add("18:55");vuelo9HSK.add("90");
        List<String> vuelo10HSK = new ArrayList<>();vuelo10HSK.add("ODB");vuelo10HSK.add("07:45");vuelo10HSK.add("18:55");vuelo10HSK.add("90");
        List<String> vuelo11HSK = new ArrayList<>();vuelo11HSK.add("GRX");vuelo11HSK.add("07:45");vuelo11HSK.add("18:55");vuelo11HSK.add("90");
        List<String> vuelo12HSK = new ArrayList<>();vuelo12HSK.add("GRO");vuelo12HSK.add("07:45");vuelo12HSK.add("18:55");vuelo12HSK.add("90");
        List<String> vuelo13HSK = new ArrayList<>();vuelo13HSK.add("LPA");vuelo13HSK.add("07:45");vuelo13HSK.add("18:55");vuelo13HSK.add("90");
        List<String> vuelo14HSK = new ArrayList<>();vuelo14HSK.add("LCG");vuelo14HSK.add("07:45");vuelo14HSK.add("18:55");vuelo14HSK.add("90");
        List<String> vuelo15HSK = new ArrayList<>();vuelo15HSK.add("FUE");vuelo15HSK.add("07:45");vuelo15HSK.add("18:55");vuelo15HSK.add("90");
        List<String> vuelo16HSK = new ArrayList<>();vuelo16HSK.add("ACE");vuelo16HSK.add("07:45");vuelo16HSK.add("18:55");vuelo16HSK.add("90");
        List<String> vuelo17HSK = new ArrayList<>();vuelo17HSK.add("IBZ");vuelo17HSK.add("07:45");vuelo17HSK.add("18:55");vuelo17HSK.add("90");

        List<String>[] HSK = new List[]{vuelo1HSK,vuelo2HSK,vuelo3HSK,vuelo4HSK,vuelo5HSK,vuelo6HSK,vuelo7HSK,vuelo8HSK,vuelo9HSK,vuelo10HSK,vuelo11HSK,vuelo12HSK,vuelo13HSK,vuelo14HSK,vuelo15HSK,vuelo16HSK,vuelo17HSK};
        agrupacion.put("HSK", List.of(HSK));

        //Aeropuerto de San José (IBZ)
        List<String> vuelo1IBZ = new ArrayList<>();vuelo1IBZ.add("MAD");vuelo1IBZ.add("07:45");vuelo1IBZ.add("18:55");vuelo1IBZ.add("90");
        List<String> vuelo2IBZ = new ArrayList<>();vuelo2IBZ.add("ABC");vuelo2IBZ.add("07:45");vuelo2IBZ.add("18:55");vuelo2IBZ.add("90");
        List<String> vuelo3IBZ = new ArrayList<>();vuelo3IBZ.add("ALC");vuelo3IBZ.add("07:45");vuelo3IBZ.add("18:55");vuelo3IBZ.add("90");
        List<String> vuelo4IBZ = new ArrayList<>();vuelo4IBZ.add("LEI");vuelo4IBZ.add("07:45");vuelo4IBZ.add("18:55");vuelo4IBZ.add("90");
        List<String> vuelo5IBZ = new ArrayList<>();vuelo5IBZ.add("OVD");vuelo5IBZ.add("07:45");vuelo5IBZ.add("18:55");vuelo5IBZ.add("90");
        List<String> vuelo6IBZ = new ArrayList<>();vuelo6IBZ.add("BJZ");vuelo6IBZ.add("07:45");vuelo6IBZ.add("18:55");vuelo6IBZ.add("90");
        List<String> vuelo7IBZ = new ArrayList<>();vuelo7IBZ.add("BCN");vuelo7IBZ.add("07:45");vuelo7IBZ.add("18:55");vuelo7IBZ.add("90");
        List<String> vuelo8IBZ = new ArrayList<>();vuelo8IBZ.add("BIO");vuelo8IBZ.add("07:45");vuelo8IBZ.add("18:55");vuelo8IBZ.add("90");
        List<String> vuelo9IBZ = new ArrayList<>();vuelo9IBZ.add("RGS");vuelo9IBZ.add("07:45");vuelo9IBZ.add("18:55");vuelo9IBZ.add("90");
        List<String> vuelo10IBZ = new ArrayList<>();vuelo10IBZ.add("ODB");vuelo10IBZ.add("07:45");vuelo10IBZ.add("18:55");vuelo10IBZ.add("90");
        List<String> vuelo11IBZ = new ArrayList<>();vuelo11IBZ.add("GRX");vuelo11IBZ.add("07:45");vuelo11IBZ.add("18:55");vuelo11IBZ.add("90");
        List<String> vuelo12IBZ = new ArrayList<>();vuelo12IBZ.add("GRO");vuelo12IBZ.add("07:45");vuelo12IBZ.add("18:55");vuelo12IBZ.add("90");
        List<String> vuelo13IBZ = new ArrayList<>();vuelo13IBZ.add("LPA");vuelo13IBZ.add("07:45");vuelo13IBZ.add("18:55");vuelo13IBZ.add("90");
        List<String> vuelo14IBZ = new ArrayList<>();vuelo14IBZ.add("LCG");vuelo14IBZ.add("07:45");vuelo14IBZ.add("18:55");vuelo14IBZ.add("90");
        List<String> vuelo15IBZ = new ArrayList<>();vuelo15IBZ.add("FUE");vuelo15IBZ.add("07:45");vuelo15IBZ.add("18:55");vuelo15IBZ.add("90");
        List<String> vuelo16IBZ = new ArrayList<>();vuelo16IBZ.add("ACE");vuelo16IBZ.add("07:45");vuelo16IBZ.add("18:55");vuelo16IBZ.add("90");
        List<String> vuelo17IBZ = new ArrayList<>();vuelo17IBZ.add("HSK");vuelo17IBZ.add("07:45");vuelo17IBZ.add("18:55");vuelo17IBZ.add("90");

        List<String>[] IBZ = new List[]{vuelo1IBZ,vuelo2IBZ,vuelo3IBZ,vuelo4IBZ,vuelo5IBZ,vuelo6IBZ,vuelo7IBZ,vuelo8IBZ,vuelo9IBZ,vuelo10IBZ,vuelo11IBZ,vuelo12IBZ,vuelo13IBZ,vuelo14IBZ,vuelo15IBZ,vuelo16IBZ,vuelo17IBZ};
        agrupacion.put("IBZ", List.of(IBZ));


        ApoyoPuntoVenta apoyoPuntoVenta = new ApoyoPuntoVenta();
        System.out.print("\nOrigen: ");
        String origen = scanner.nextLine();
        System.out.print("Destino: ");
        String destino = scanner.nextLine();
        String origen_dicc = IATAdic.get(origen);
        String destino_dicc = IATAdic.get(destino);
        LocalTime salida1 = null;
        LocalTime llegada1 = null;
        LocalTime salida2 = null;
        LocalTime llegada2  = null;
        if (agrupacion.containsKey(origen_dicc)){
            for (List<String> vuelo : agrupacion.get(origen_dicc)){
                int numero = vuelo.indexOf(destino_dicc);
                for (String vuelo2 : vuelo){
                    for (int i = 0; i == numero; i++){
                        int duracion = Integer.parseInt(vuelo.get(3));
                        //vuelo 1
                        salida1 = LocalTime.parse(vuelo.get(1));
                        llegada1 = salida1.plusMinutes(duracion);
                        //vuelo 2
                        salida2 = LocalTime.parse(vuelo.get(2));
                        llegada2 = salida2.plusMinutes(duracion);

                    }
                }

            }
        }
        System.out.println(origen + "(" + origen_dicc + ") --> " + destino + "(" + destino_dicc + ") " + salida1 + " " + llegada1 + " Precio: " + apoyoPuntoVenta.preciorandom() + "€");
        System.out.println(origen + "(" + origen_dicc + ") --> " + destino + "(" + destino_dicc + ") " + salida2 + " " + llegada2 + " Precio: " + apoyoPuntoVenta.preciorandom() + "€");
    }
}

