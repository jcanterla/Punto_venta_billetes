import java.time.*;
import java.time.format.*;
import java.util.*;

public class ApoyoPuntoVenta {


    public static final Scanner scanner = new Scanner(System.in);
    public static HashMap<String, String> IATAdic = new HashMap<>();
    public static HashMap<String, List<List<String>>> agrupacion = new HashMap<>();

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

    public static LocalTime Opcion2() {
        try {
            System.out.print("\nHora de despegue (hh:mm): ");
            String hora = scanner.nextLine();
            DateTimeFormatter formatohora = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime horaconformato = LocalTime.parse(hora, formatohora);
            System.out.print("Duración (en minutos): ");
            int minutos = scanner.nextInt();
            return horaconformato.plusMinutes(minutos);
        } catch (DateTimeParseException exc) {;
            System.out.println("\n\t\t\u001B[0;1mHora no valida\033[0m");
            return null;
        }
    }

    public static String Opcion3(){
        //Introducir mes por teclado
        int mes = 0;
        do {
            
            try {
                System.out.print("\nIntroduzca el mes en formato numérico: ");
                mes = scanner.nextInt();
                if (mes < 1 || mes > 12) {
                    System.out.println("Mes incorrecto. Debe estar entre 1 y 12");
                }
            }catch (Exception e){
                System.out.println("\t\tIntroduzca un numero entero");
                scanner.nextLine();
                continue;

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
    public static String Opcion5(String origen, String destino){



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





        // Aeropuerto Alcobendas (MAD)
        List<String> vuelo1MAD = new ArrayList<>(); vuelo1MAD.add("ABC"); vuelo1MAD.add("07:45"); vuelo1MAD.add("18:55"); vuelo1MAD.add("95");
        List<String> vuelo2MAD = new ArrayList<>(); vuelo2MAD.add("ALC"); vuelo2MAD.add("10:30"); vuelo2MAD.add("21:40"); vuelo2MAD.add("100");
        List<String> vuelo3MAD = new ArrayList<>(); vuelo3MAD.add("LEI"); vuelo3MAD.add("14:15"); vuelo3MAD.add("01:25"); vuelo3MAD.add("105");
        List<String> vuelo4MAD = new ArrayList<>(); vuelo4MAD.add("OVD"); vuelo4MAD.add("11:20"); vuelo4MAD.add("22:30"); vuelo4MAD.add("98");
        List<String> vuelo5MAD = new ArrayList<>(); vuelo5MAD.add("BJZ"); vuelo5MAD.add("06:25"); vuelo5MAD.add("17:35"); vuelo5MAD.add("102");
        List<String> vuelo6MAD = new ArrayList<>(); vuelo6MAD.add("BCN"); vuelo6MAD.add("08:50"); vuelo6MAD.add("19:10"); vuelo6MAD.add("99");
        List<String> vuelo7MAD = new ArrayList<>(); vuelo7MAD.add("BIO"); vuelo7MAD.add("12:40"); vuelo7MAD.add("23:50"); vuelo7MAD.add("97");
        List<String> vuelo8MAD = new ArrayList<>(); vuelo8MAD.add("RGS"); vuelo8MAD.add("09:15"); vuelo8MAD.add("20:25"); vuelo8MAD.add("103");
        List<String> vuelo9MAD = new ArrayList<>(); vuelo9MAD.add("ODB"); vuelo9MAD.add("16:05"); vuelo9MAD.add("03:15"); vuelo9MAD.add("100");
        List<String> vuelo10MAD = new ArrayList<>(); vuelo10MAD.add("GRX"); vuelo10MAD.add("20:00"); vuelo10MAD.add("07:10"); vuelo10MAD.add("95");
        List<String> vuelo11MAD = new ArrayList<>(); vuelo11MAD.add("GRO"); vuelo11MAD.add("17:30"); vuelo11MAD.add("04:40"); vuelo11MAD.add("101");
        List<String> vuelo12MAD = new ArrayList<>(); vuelo12MAD.add("LPA"); vuelo12MAD.add("22:55"); vuelo12MAD.add("10:05"); vuelo12MAD.add("97");
        List<String> vuelo13MAD = new ArrayList<>(); vuelo13MAD.add("FUE"); vuelo13MAD.add("02:10"); vuelo13MAD.add("13:20"); vuelo13MAD.add("105");
        List<String> vuelo14MAD = new ArrayList<>(); vuelo14MAD.add("LCG"); vuelo14MAD.add("05:35"); vuelo14MAD.add("16:45"); vuelo14MAD.add("99");
        List<String> vuelo15MAD = new ArrayList<>(); vuelo15MAD.add("ACE"); vuelo15MAD.add("19:45"); vuelo15MAD.add("06:55"); vuelo15MAD.add("100");
        List<String> vuelo16MAD = new ArrayList<>(); vuelo16MAD.add("HSK"); vuelo16MAD.add("15:20"); vuelo16MAD.add("02:30"); vuelo16MAD.add("98");
        List<String> vuelo17MAD = new ArrayList<>(); vuelo17MAD.add("IBZ"); vuelo17MAD.add("18:05"); vuelo17MAD.add("05:15"); vuelo17MAD.add("96");

        List<String>[] MAD = new List[]{vuelo1MAD,vuelo2MAD,vuelo3MAD,vuelo4MAD,vuelo5MAD,vuelo6MAD,vuelo7MAD,vuelo8MAD,vuelo9MAD,vuelo10MAD,vuelo11MAD,vuelo12MAD,vuelo13MAD,vuelo14MAD,vuelo15MAD,vuelo16MAD,vuelo17MAD};
        agrupacion.put("MAD", List.of(MAD));

        // Aeropuerto Albacete (ABC)
        List<String> vuelo1ABC = new ArrayList<>(); vuelo1ABC.add("MAD"); vuelo1ABC.add("06:30"); vuelo1ABC.add("17:40"); vuelo1ABC.add("92");
        List<String> vuelo2ABC = new ArrayList<>(); vuelo2ABC.add("ALC"); vuelo2ABC.add("09:15"); vuelo2ABC.add("20:25"); vuelo2ABC.add("98");
        List<String> vuelo3ABC = new ArrayList<>(); vuelo3ABC.add("LEI"); vuelo3ABC.add("13:20"); vuelo3ABC.add("00:30"); vuelo3ABC.add("105");
        List<String> vuelo4ABC = new ArrayList<>(); vuelo4ABC.add("OVD"); vuelo4ABC.add("10:45"); vuelo4ABC.add("22:55"); vuelo4ABC.add("97");
        List<String> vuelo5ABC = new ArrayList<>(); vuelo5ABC.add("BJZ"); vuelo5ABC.add("08:00"); vuelo5ABC.add("19:10"); vuelo5ABC.add("100");
        List<String> vuelo6ABC = new ArrayList<>(); vuelo6ABC.add("BCN"); vuelo6ABC.add("12:10"); vuelo6ABC.add("23:20"); vuelo6ABC.add("93");
        List<String> vuelo7ABC = new ArrayList<>(); vuelo7ABC.add("BIO"); vuelo7ABC.add("14:35"); vuelo7ABC.add("01:45"); vuelo7ABC.add("99");
        List<String> vuelo8ABC = new ArrayList<>(); vuelo8ABC.add("RGS"); vuelo8ABC.add("15:50"); vuelo8ABC.add("03:00"); vuelo8ABC.add("101");
        List<String> vuelo9ABC = new ArrayList<>(); vuelo9ABC.add("ODB"); vuelo9ABC.add("18:20"); vuelo9ABC.add("05:30"); vuelo9ABC.add("96");
        List<String> vuelo10ABC = new ArrayList<>(); vuelo10ABC.add("GRX"); vuelo10ABC.add("21:05"); vuelo10ABC.add("08:15"); vuelo10ABC.add("94");
        List<String> vuelo11ABC = new ArrayList<>(); vuelo11ABC.add("GRO"); vuelo11ABC.add("16:40"); vuelo11ABC.add("03:50"); vuelo11ABC.add("103");
        List<String> vuelo12ABC = new ArrayList<>(); vuelo12ABC.add("LPA"); vuelo12ABC.add("19:55"); vuelo12ABC.add("07:05"); vuelo12ABC.add("95");
        List<String> vuelo13ABC = new ArrayList<>(); vuelo13ABC.add("FUE"); vuelo13ABC.add("01:30"); vuelo13ABC.add("12:40"); vuelo13ABC.add("107");
        List<String> vuelo14ABC = new ArrayList<>(); vuelo14ABC.add("LCG"); vuelo14ABC.add("04:25"); vuelo14ABC.add("15:35"); vuelo14ABC.add("91");
        List<String> vuelo15ABC = new ArrayList<>(); vuelo15ABC.add("ACE"); vuelo15ABC.add("22:15"); vuelo15ABC.add("09:25"); vuelo15ABC.add("102");
        List<String> vuelo16ABC = new ArrayList<>(); vuelo16ABC.add("HSK"); vuelo16ABC.add("17:55"); vuelo16ABC.add("05:05"); vuelo16ABC.add("98");
        List<String> vuelo17ABC = new ArrayList<>(); vuelo17ABC.add("IBZ"); vuelo17ABC.add("20:40"); vuelo17ABC.add("07:50"); vuelo17ABC.add("97");

        List<String>[] ABC = new List[]{vuelo1ABC,vuelo2ABC,vuelo3ABC,vuelo4ABC,vuelo5ABC,vuelo6ABC,vuelo7ABC,vuelo8ABC,vuelo9ABC,vuelo10ABC,vuelo11ABC,vuelo12ABC,vuelo13ABC,vuelo14ABC,vuelo15ABC,vuelo16ABC,vuelo17ABC};
        agrupacion.put("ABC", List.of(ABC));

        // Aeropuerto Elche (ALC)
        List<String> vuelo1ALC = new ArrayList<>(); vuelo1ALC.add("MAD"); vuelo1ALC.add("08:30"); vuelo1ALC.add("19:45"); vuelo1ALC.add("95");
        List<String> vuelo2ALC = new ArrayList<>(); vuelo2ALC.add("ABC"); vuelo2ALC.add("09:45"); vuelo2ALC.add("20:55"); vuelo2ALC.add("100");
        List<String> vuelo3ALC = new ArrayList<>(); vuelo3ALC.add("LEI"); vuelo3ALC.add("10:20"); vuelo3ALC.add("21:35"); vuelo3ALC.add("92");
        List<String> vuelo4ALC = new ArrayList<>(); vuelo4ALC.add("OVD"); vuelo4ALC.add("11:15"); vuelo4ALC.add("22:25"); vuelo4ALC.add("97");
        List<String> vuelo5ALC = new ArrayList<>(); vuelo5ALC.add("BJZ"); vuelo5ALC.add("13:00"); vuelo5ALC.add("00:10"); vuelo5ALC.add("98");
        List<String> vuelo6ALC = new ArrayList<>(); vuelo6ALC.add("BCN"); vuelo6ALC.add("14:40"); vuelo6ALC.add("01:50"); vuelo6ALC.add("101");
        List<String> vuelo7ALC = new ArrayList<>(); vuelo7ALC.add("BIO"); vuelo7ALC.add("15:55"); vuelo7ALC.add("03:05"); vuelo7ALC.add("96");
        List<String> vuelo8ALC = new ArrayList<>(); vuelo8ALC.add("RGS"); vuelo8ALC.add("17:30"); vuelo8ALC.add("04:40"); vuelo8ALC.add("105");
        List<String> vuelo9ALC = new ArrayList<>(); vuelo9ALC.add("ODB"); vuelo9ALC.add("18:45"); vuelo9ALC.add("06:25"); vuelo9ALC.add("99");
        List<String> vuelo10ALC = new ArrayList<>(); vuelo10ALC.add("GRX"); vuelo10ALC.add("19:20"); vuelo10ALC.add("07:10"); vuelo10ALC.add("103");
        List<String> vuelo11ALC = new ArrayList<>(); vuelo11ALC.add("GRO"); vuelo11ALC.add("20:55"); vuelo11ALC.add("08:45"); vuelo11ALC.add("94");
        List<String> vuelo12ALC = new ArrayList<>(); vuelo12ALC.add("LPA"); vuelo12ALC.add("22:10"); vuelo12ALC.add("09:20"); vuelo12ALC.add("102");
        List<String> vuelo13ALC = new ArrayList<>(); vuelo13ALC.add("FUE"); vuelo13ALC.add("23:40"); vuelo13ALC.add("10:55"); vuelo13ALC.add("91");
        List<String> vuelo14ALC = new ArrayList<>(); vuelo14ALC.add("LCG"); vuelo14ALC.add("01:15"); vuelo14ALC.add("12:30"); vuelo14ALC.add("104");
        List<String> vuelo15ALC = new ArrayList<>(); vuelo15ALC.add("ACE"); vuelo15ALC.add("02:30"); vuelo15ALC.add("13:45"); vuelo15ALC.add("97");
        List<String> vuelo16ALC = new ArrayList<>(); vuelo16ALC.add("HSK"); vuelo16ALC.add("03:45"); vuelo16ALC.add("15:00"); vuelo16ALC.add("100");
        List<String> vuelo17ALC = new ArrayList<>(); vuelo17ALC.add("IBZ"); vuelo17ALC.add("05:00"); vuelo17ALC.add("16:15"); vuelo17ALC.add("93");

        List<String>[] ALC = new List[]{vuelo1ALC,vuelo2ALC,vuelo3ALC,vuelo4ALC,vuelo5ALC,vuelo6ALC,vuelo7ALC,vuelo8ALC,vuelo9ALC,vuelo10ALC,vuelo11ALC,vuelo12ALC,vuelo13ALC,vuelo14ALC,vuelo15ALC,vuelo16ALC,vuelo17ALC};
        agrupacion.put("ALC", List.of(ALC));

        // Aeropuerto El Alquián (LEI)
        List<String> vuelo1LEI = new ArrayList<>(); vuelo1LEI.add("MAD"); vuelo1LEI.add("09:15"); vuelo1LEI.add("20:30"); vuelo1LEI.add("98");
        List<String> vuelo2LEI = new ArrayList<>(); vuelo2LEI.add("ABC"); vuelo2LEI.add("10:45"); vuelo2LEI.add("22:00"); vuelo2LEI.add("101");
        List<String> vuelo3LEI = new ArrayList<>(); vuelo3LEI.add("ALC"); vuelo3LEI.add("12:00"); vuelo3LEI.add("23:15"); vuelo3LEI.add("95");
        List<String> vuelo4LEI = new ArrayList<>(); vuelo4LEI.add("OVD"); vuelo4LEI.add("13:30"); vuelo4LEI.add("00:45"); vuelo4LEI.add("97");
        List<String> vuelo5LEI = new ArrayList<>(); vuelo5LEI.add("BJZ"); vuelo5LEI.add("14:45"); vuelo5LEI.add("02:00"); vuelo5LEI.add("94");
        List<String> vuelo6LEI = new ArrayList<>(); vuelo6LEI.add("BCN"); vuelo6LEI.add("16:10"); vuelo6LEI.add("03:25"); vuelo6LEI.add("103");
        List<String> vuelo7LEI = new ArrayList<>(); vuelo7LEI.add("BIO"); vuelo7LEI.add("17:25"); vuelo7LEI.add("04:40"); vuelo7LEI.add("100");
        List<String> vuelo8LEI = new ArrayList<>(); vuelo8LEI.add("RGS"); vuelo8LEI.add("18:40"); vuelo8LEI.add("05:55"); vuelo8LEI.add("102");
        List<String> vuelo9LEI = new ArrayList<>(); vuelo9LEI.add("ODB"); vuelo9LEI.add("19:55"); vuelo9LEI.add("07:10"); vuelo9LEI.add("99");
        List<String> vuelo10LEI = new ArrayList<>(); vuelo10LEI.add("GRX"); vuelo10LEI.add("21:20"); vuelo10LEI.add("08:35"); vuelo10LEI.add("96");
        List<String> vuelo11LEI = new ArrayList<>(); vuelo11LEI.add("GRO"); vuelo11LEI.add("22:35"); vuelo11LEI.add("09:50"); vuelo11LEI.add("105");
        List<String> vuelo12LEI = new ArrayList<>(); vuelo12LEI.add("LPA"); vuelo12LEI.add("23:50"); vuelo12LEI.add("11:05"); vuelo12LEI.add("91");
        List<String> vuelo13LEI = new ArrayList<>(); vuelo13LEI.add("FUE"); vuelo13LEI.add("01:05"); vuelo13LEI.add("12:20"); vuelo13LEI.add("104");
        List<String> vuelo14LEI = new ArrayList<>(); vuelo14LEI.add("LCG"); vuelo14LEI.add("02:20"); vuelo14LEI.add("13:35"); vuelo14LEI.add("97");
        List<String> vuelo15LEI = new ArrayList<>(); vuelo15LEI.add("ACE"); vuelo15LEI.add("03:35"); vuelo15LEI.add("14:50"); vuelo15LEI.add("101");
        List<String> vuelo16LEI = new ArrayList<>(); vuelo16LEI.add("HSK"); vuelo16LEI.add("04:50"); vuelo16LEI.add("16:05"); vuelo16LEI.add("98");
        List<String> vuelo17LEI = new ArrayList<>(); vuelo17LEI.add("IBZ"); vuelo17LEI.add("06:05"); vuelo17LEI.add("17:20"); vuelo17LEI.add("92");

        List<String>[] LEI = new List[]{vuelo1LEI,vuelo2LEI,vuelo3LEI,vuelo4LEI,vuelo5LEI,vuelo6LEI,vuelo7LEI,vuelo8LEI,vuelo9LEI,vuelo10LEI,vuelo11LEI,vuelo12LEI,vuelo13LEI,vuelo14LEI,vuelo15LEI,vuelo16LEI,vuelo17LEI};
        agrupacion.put("LEI", List.of(LEI));

        // Aeropuerto Castrillón (OVD)
        List<String> vuelo1OVD = new ArrayList<>(); vuelo1OVD.add("MAD"); vuelo1OVD.add("08:00"); vuelo1OVD.add("19:15"); vuelo1OVD.add("99");
        List<String> vuelo2OVD = new ArrayList<>(); vuelo2OVD.add("ABC"); vuelo2OVD.add("09:30"); vuelo2OVD.add("20:45"); vuelo2OVD.add("102");
        List<String> vuelo3OVD = new ArrayList<>(); vuelo3OVD.add("ALC"); vuelo3OVD.add("10:45"); vuelo3OVD.add("22:00"); vuelo3OVD.add("97");
        List<String> vuelo4OVD = new ArrayList<>(); vuelo4OVD.add("LEI"); vuelo4OVD.add("12:15"); vuelo4OVD.add("23:30"); vuelo4OVD.add("100");
        List<String> vuelo5OVD = new ArrayList<>(); vuelo5OVD.add("BJZ"); vuelo5OVD.add("13:30"); vuelo5OVD.add("00:45"); vuelo5OVD.add("103");
        List<String> vuelo6OVD = new ArrayList<>(); vuelo6OVD.add("BCN"); vuelo6OVD.add("14:45"); vuelo6OVD.add("02:00"); vuelo6OVD.add("98");
        List<String> vuelo7OVD = new ArrayList<>(); vuelo7OVD.add("BIO"); vuelo7OVD.add("16:00"); vuelo7OVD.add("03:15"); vuelo7OVD.add("96");
        List<String> vuelo8OVD = new ArrayList<>(); vuelo8OVD.add("RGS"); vuelo8OVD.add("17:15"); vuelo8OVD.add("04:30"); vuelo8OVD.add("101");
        List<String> vuelo9OVD = new ArrayList<>(); vuelo9OVD.add("ODB"); vuelo9OVD.add("18:30"); vuelo9OVD.add("05:45"); vuelo9OVD.add("92");
        List<String> vuelo10OVD = new ArrayList<>(); vuelo10OVD.add("GRX"); vuelo10OVD.add("19:45"); vuelo10OVD.add("07:00"); vuelo10OVD.add("104");
        List<String> vuelo11OVD = new ArrayList<>(); vuelo11OVD.add("GRO"); vuelo11OVD.add("21:00"); vuelo11OVD.add("08:15"); vuelo11OVD.add("95");
        List<String> vuelo12OVD = new ArrayList<>(); vuelo12OVD.add("LPA"); vuelo12OVD.add("22:15"); vuelo12OVD.add("09:30"); vuelo12OVD.add("99");
        List<String> vuelo13OVD = new ArrayList<>(); vuelo13OVD.add("FUE"); vuelo13OVD.add("23:30"); vuelo13OVD.add("10:45"); vuelo13OVD.add("100");
        List<String> vuelo14OVD = new ArrayList<>(); vuelo14OVD.add("LCG"); vuelo14OVD.add("00:45"); vuelo14OVD.add("12:00"); vuelo14OVD.add("97");
        List<String> vuelo15OVD = new ArrayList<>(); vuelo15OVD.add("ACE"); vuelo15OVD.add("02:00"); vuelo15OVD.add("13:15"); vuelo15OVD.add("102");
        List<String> vuelo16OVD = new ArrayList<>(); vuelo16OVD.add("HSK"); vuelo16OVD.add("03:15"); vuelo16OVD.add("14:30"); vuelo16OVD.add("103");
        List<String> vuelo17OVD = new ArrayList<>(); vuelo17OVD.add("IBZ"); vuelo17OVD.add("04:30"); vuelo17OVD.add("15:45"); vuelo17OVD.add("96");

        List<String>[] OVD = new List[]{vuelo1OVD,vuelo2OVD,vuelo3OVD,vuelo4OVD,vuelo5OVD,vuelo6OVD,vuelo7OVD,vuelo8OVD,vuelo9OVD,vuelo10OVD,vuelo11OVD,vuelo12OVD,vuelo13OVD,vuelo14OVD,vuelo15OVD,vuelo16OVD,vuelo17OVD};
        agrupacion.put("OVD", List.of(OVD));

        // Aeropuerto Talavera la Real (BJZ)
        List<String> vuelo1BJZ = new ArrayList<>();vuelo1BJZ.add("MAD");vuelo1BJZ.add("07:45");vuelo1BJZ.add("18:55");vuelo1BJZ.add("90");
        List<String> vuelo2BJZ = new ArrayList<>();vuelo2BJZ.add("ABC");vuelo2BJZ.add("08:30");vuelo2BJZ.add("19:45");vuelo2BJZ.add("135");
        List<String> vuelo3BJZ = new ArrayList<>();vuelo3BJZ.add("ALC");vuelo3BJZ.add("09:15");vuelo3BJZ.add("20:30");vuelo3BJZ.add("135");
        List<String> vuelo4BJZ = new ArrayList<>();vuelo4BJZ.add("LEI");vuelo4BJZ.add("10:00");vuelo4BJZ.add("21:15");vuelo4BJZ.add("135");
        List<String> vuelo5BJZ = new ArrayList<>();vuelo5BJZ.add("OVD");vuelo5BJZ.add("10:45");vuelo5BJZ.add("22:00");vuelo5BJZ.add("135");
        List<String> vuelo6BJZ = new ArrayList<>();vuelo6BJZ.add("BCN");vuelo6BJZ.add("11:30");vuelo6BJZ.add("23:45");vuelo6BJZ.add("195");
        List<String> vuelo7BJZ = new ArrayList<>();vuelo7BJZ.add("BIO");vuelo7BJZ.add("12:15");vuelo7BJZ.add("00:30");vuelo7BJZ.add("195");
        List<String> vuelo8BJZ = new ArrayList<>();vuelo8BJZ.add("RGS");vuelo8BJZ.add("13:00");vuelo8BJZ.add("01:15");vuelo8BJZ.add("195");
        List<String> vuelo9BJZ = new ArrayList<>();vuelo9BJZ.add("DUR");vuelo9BJZ.add("13:45");vuelo9BJZ.add("02:30");vuelo9BJZ.add("165");
        List<String> vuelo10BJZ = new ArrayList<>();vuelo10BJZ.add("AMS");vuelo10BJZ.add("14:30");vuelo10BJZ.add("03:45");vuelo10BJZ.add("195");
        List<String> vuelo11BJZ = new ArrayList<>();vuelo11BJZ.add("CDG");vuelo11BJZ.add("15:15");vuelo11BJZ.add("04:00");vuelo11BJZ.add("165");
        List<String> vuelo12BJZ = new ArrayList<>();vuelo12BJZ.add("FRA");vuelo12BJZ.add("16:00");vuelo12BJZ.add("05:15");vuelo12BJZ.add("195");
        List<String> vuelo13BJZ = new ArrayList<>();vuelo13BJZ.add("LHR");vuelo13BJZ.add("16:45");vuelo13BJZ.add("06:30");vuelo13BJZ.add("195");
        List<String> vuelo14BJZ = new ArrayList<>();vuelo14BJZ.add("IST");vuelo14BJZ.add("17:30");vuelo14BJZ.add("07:45");vuelo14BJZ.add("195");
        List<String> vuelo15BJZ = new ArrayList<>();vuelo15BJZ.add("DXB");vuelo15BJZ.add("18:15");vuelo15BJZ.add("09:00");vuelo15BJZ.add("225");
        List<String> vuelo16BJZ = new ArrayList<>();vuelo16BJZ.add("JFK");vuelo16BJZ.add("18:45");vuelo16BJZ.add("10:15");vuelo16BJZ.add("210");
        List<String> vuelo17BJZ = new ArrayList<>();vuelo17BJZ.add("SFO");vuelo17BJZ.add("19:30");vuelo17BJZ.add("11:30");vuelo17BJZ.add("210");

        List<String>[] BJZ = new List[]{vuelo1BJZ,vuelo2BJZ,vuelo3BJZ,vuelo4BJZ,vuelo5BJZ,vuelo6BJZ,vuelo7BJZ,vuelo8BJZ,
                vuelo9BJZ,vuelo10BJZ,vuelo11BJZ,vuelo12BJZ,vuelo13BJZ,vuelo14BJZ,vuelo15BJZ,vuelo16BJZ,vuelo17BJZ};
        agrupacion.put("BJZ", List.of(BJZ));

        // Aeropuerto El Prat de Llobregat (BCN)
        List<String> vuelo1BCN = new ArrayList<>();vuelo1BCN.add("MAD");vuelo1BCN.add("08:00");vuelo1BCN.add("19:15");vuelo1BCN.add("135");
        List<String> vuelo2BCN = new ArrayList<>();vuelo2BCN.add("ABC");vuelo2BCN.add("08:45");vuelo2BCN.add("20:00");vuelo2BCN.add("135");
        List<String> vuelo3BCN = new ArrayList<>();vuelo3BCN.add("ALC");vuelo3BCN.add("09:30");vuelo3BCN.add("21:45");vuelo3BCN.add("195");
        List<String> vuelo4BCN = new ArrayList<>();vuelo4BCN.add("LEI");vuelo4BCN.add("10:15");vuelo4BCN.add("22:30");vuelo4BCN.add("195");
        List<String> vuelo5BCN = new ArrayList<>();vuelo5BCN.add("OVD");vuelo5BCN.add("11:00");vuelo5BCN.add("23:15");vuelo5BCN.add("195");
        List<String> vuelo6BCN = new ArrayList<>();vuelo6BCN.add("BJZ");vuelo6BCN.add("11:45");vuelo6BCN.add("00:30");vuelo6BCN.add("165");
        List<String> vuelo7BCN = new ArrayList<>();vuelo7BCN.add("BIO");vuelo7BCN.add("12:30");vuelo7BCN.add("01:45");vuelo7BCN.add("195");
        List<String> vuelo8BCN = new ArrayList<>();vuelo8BCN.add("RGS");vuelo8BCN.add("13:15");vuelo8BCN.add("03:00");vuelo8BCN.add("225");
        List<String> vuelo9BCN = new ArrayList<>();vuelo9BCN.add("ODB");vuelo9BCN.add("14:00");vuelo9BCN.add("04:15");vuelo9BCN.add("195");
        List<String> vuelo10BCN = new ArrayList<>();vuelo10BCN.add("GRX");vuelo10BCN.add("14:45");vuelo10BCN.add("05:30");vuelo10BCN.add("195");
        List<String> vuelo11BCN = new ArrayList<>();vuelo11BCN.add("GRO");vuelo11BCN.add("15:30");vuelo11BCN.add("06:45");vuelo11BCN.add("195");
        List<String> vuelo12BCN = new ArrayList<>();vuelo12BCN.add("LPA");vuelo12BCN.add("16:15");vuelo12BCN.add("08:00");vuelo12BCN.add("195");
        List<String> vuelo13BCN = new ArrayList<>();vuelo13BCN.add("FUE");vuelo13BCN.add("17:00");vuelo13BCN.add("09:15");vuelo13BCN.add("195");
        List<String> vuelo14BCN = new ArrayList<>();vuelo14BCN.add("LCG");vuelo14BCN.add("17:45");vuelo14BCN.add("10:30");vuelo14BCN.add("195");
        List<String> vuelo15BCN = new ArrayList<>();vuelo15BCN.add("ACE");vuelo15BCN.add("18:30");vuelo15BCN.add("11:45");vuelo15BCN.add("195");
        List<String> vuelo16BCN = new ArrayList<>();vuelo16BCN.add("HSK");vuelo16BCN.add("19:15");vuelo16BCN.add("13:00");vuelo16BCN.add("195");
        List<String> vuelo17BCN = new ArrayList<>();vuelo17BCN.add("IBZ");vuelo17BCN.add("20:00");vuelo17BCN.add("14:15");vuelo17BCN.add("195");

        List<String>[] BCN = new List[]{vuelo1BCN,vuelo2BCN,vuelo3BCN,vuelo4BCN,vuelo5BCN,vuelo6BCN,vuelo7BCN,vuelo8BCN,vuelo9BCN,vuelo10BCN,vuelo11BCN,vuelo12BCN,vuelo13BCN,vuelo14BCN,vuelo15BCN,vuelo16BCN,vuelo17BCN};
        agrupacion.put("BCN", List.of(BCN));

        // Aeropuerto de Lujua (BIO)
        List<String> vuelo1BIO = new ArrayList<>();vuelo1BIO.add("MAD");vuelo1BIO.add("07:30");vuelo1BIO.add("18:45");vuelo1BIO.add("135");
        List<String> vuelo2BIO = new ArrayList<>();vuelo2BIO.add("ABC");vuelo2BIO.add("08:15");vuelo2BIO.add("20:30");vuelo2BIO.add("195");
        List<String> vuelo3BIO = new ArrayList<>();vuelo3BIO.add("ALC");vuelo3BIO.add("09:00");vuelo3BIO.add("21:15");vuelo3BIO.add("195");
        List<String> vuelo4BIO = new ArrayList<>();vuelo4BIO.add("LEI");vuelo4BIO.add("09:45");vuelo4BIO.add("22:30");vuelo4BIO.add("225");
        List<String> vuelo5BIO = new ArrayList<>();vuelo5BIO.add("OVD");vuelo5BIO.add("10:30");vuelo5BIO.add("23:45");vuelo5BIO.add("255");
        List<String> vuelo6BIO = new ArrayList<>();vuelo6BIO.add("BJZ");vuelo6BIO.add("11:15");vuelo6BIO.add("01:00");vuelo6BIO.add("225");
        List<String> vuelo7BIO = new ArrayList<>();vuelo7BIO.add("BCN");vuelo7BIO.add("12:00");vuelo7BIO.add("02:15");vuelo7BIO.add("195");
        List<String> vuelo8BIO = new ArrayList<>();vuelo8BIO.add("RGS");vuelo8BIO.add("12:45");vuelo8BIO.add("03:30");vuelo8BIO.add("225");
        List<String> vuelo9BIO = new ArrayList<>();vuelo9BIO.add("ODB");vuelo9BIO.add("13:30");vuelo9BIO.add("04:45");vuelo9BIO.add("195");
        List<String> vuelo10BIO = new ArrayList<>();vuelo10BIO.add("GRX");vuelo10BIO.add("14:15");vuelo10BIO.add("06:00");vuelo10BIO.add("225");
        List<String> vuelo11BIO = new ArrayList<>();vuelo11BIO.add("GRO");vuelo11BIO.add("15:00");vuelo11BIO.add("07:15");vuelo11BIO.add("225");
        List<String> vuelo12BIO = new ArrayList<>();vuelo12BIO.add("LPA");vuelo12BIO.add("15:45");vuelo12BIO.add("08:30");vuelo12BIO.add("225");
        List<String> vuelo13BIO = new ArrayList<>();vuelo13BIO.add("FUE");vuelo13BIO.add("16:30");vuelo13BIO.add("09:45");vuelo13BIO.add("225");
        List<String> vuelo14BIO = new ArrayList<>();vuelo14BIO.add("LCG");vuelo14BIO.add("17:15");vuelo14BIO.add("11:00");vuelo14BIO.add("225");
        List<String> vuelo15BIO = new ArrayList<>();vuelo15BIO.add("ACE");vuelo15BIO.add("18:00");vuelo15BIO.add("12:15");vuelo15BIO.add("225");
        List<String> vuelo16BIO = new ArrayList<>();vuelo16BIO.add("HSK");vuelo16BIO.add("18:45");vuelo16BIO.add("13:30");vuelo16BIO.add("225");
        List<String> vuelo17BIO = new ArrayList<>();vuelo17BIO.add("IBZ");vuelo17BIO.add("19:30");vuelo17BIO.add("14:45");vuelo17BIO.add("225");

        List<String>[] BIO = new List[]{vuelo1BIO,vuelo2BIO,vuelo3BIO,vuelo4BIO,vuelo5BIO,vuelo6BIO,vuelo7BIO,vuelo8BIO,vuelo9BIO,vuelo10BIO,vuelo11BIO,vuelo12BIO,vuelo13BIO,vuelo14BIO,vuelo15BIO,vuelo16BIO,vuelo17BIO};
        agrupacion.put("BIO", List.of(BIO));

        // Aeropuerto de Burgos (RGS)
        List<String> vuelo1RGS = new ArrayList<>();vuelo1RGS.add("MAD");vuelo1RGS.add("07:30");vuelo1RGS.add("18:45");vuelo1RGS.add("120");
        List<String> vuelo2RGS = new ArrayList<>();vuelo2RGS.add("ABC");vuelo2RGS.add("08:15");vuelo2RGS.add("20:30");vuelo2RGS.add("135");
        List<String> vuelo3RGS = new ArrayList<>();vuelo3RGS.add("ALC");vuelo3RGS.add("09:00");vuelo3RGS.add("21:45");vuelo3RGS.add("150");
        List<String> vuelo4RGS = new ArrayList<>();vuelo4RGS.add("LEI");vuelo4RGS.add("09:45");vuelo4RGS.add("22:00");vuelo4RGS.add("165");
        List<String> vuelo5RGS = new ArrayList<>();vuelo5RGS.add("OVD");vuelo5RGS.add("10:30");vuelo5RGS.add("23:15");vuelo5RGS.add("180");
        List<String> vuelo6RGS = new ArrayList<>();vuelo6RGS.add("BJZ");vuelo6RGS.add("11:15");vuelo6RGS.add("00:30");vuelo6RGS.add("195");
        List<String> vuelo7RGS = new ArrayList<>();vuelo7RGS.add("BCN");vuelo7RGS.add("12:00");vuelo7RGS.add("01:45");vuelo7RGS.add("210");
        List<String> vuelo8RGS = new ArrayList<>();vuelo8RGS.add("BIO");vuelo8RGS.add("12:45");vuelo8RGS.add("03:00");vuelo8RGS.add("225");
        List<String> vuelo9RGS = new ArrayList<>();vuelo9RGS.add("ODB");vuelo9RGS.add("13:30");vuelo9RGS.add("04:15");vuelo9RGS.add("240");
        List<String> vuelo10RGS = new ArrayList<>();vuelo10RGS.add("GRX");vuelo10RGS.add("14:15");vuelo10RGS.add("05:30");vuelo10RGS.add("255");
        List<String> vuelo11RGS = new ArrayList<>();vuelo11RGS.add("GRO");vuelo11RGS.add("15:00");vuelo11RGS.add("06:45");vuelo11RGS.add("270");
        List<String> vuelo12RGS = new ArrayList<>();vuelo12RGS.add("LPA");vuelo12RGS.add("15:45");vuelo12RGS.add("08:00");vuelo12RGS.add("285");
        List<String> vuelo13RGS = new ArrayList<>();vuelo13RGS.add("FUE");vuelo13RGS.add("16:30");vuelo13RGS.add("09:15");vuelo13RGS.add("300");
        List<String> vuelo14RGS = new ArrayList<>();vuelo14RGS.add("LCG");vuelo14RGS.add("17:15");vuelo14RGS.add("10:30");vuelo14RGS.add("315");
        List<String> vuelo15RGS = new ArrayList<>();vuelo15RGS.add("ACE");vuelo15RGS.add("18:00");vuelo15RGS.add("11:45");vuelo15RGS.add("330");
        List<String> vuelo16RGS = new ArrayList<>();vuelo16RGS.add("HSK");vuelo16RGS.add("18:45");vuelo16RGS.add("13:00");vuelo16RGS.add("345");
        List<String> vuelo17RGS = new ArrayList<>();vuelo17RGS.add("IBZ");vuelo17RGS.add("19:30");vuelo17RGS.add("14:15");vuelo17RGS.add("360");

        List<String>[] RGS = new List[]{vuelo1RGS,vuelo2RGS,vuelo3RGS,vuelo4RGS,vuelo5RGS,vuelo6RGS,vuelo7RGS,vuelo8RGS,vuelo9RGS,vuelo10RGS,vuelo11RGS,vuelo12RGS,vuelo13RGS,vuelo14RGS,vuelo15RGS,vuelo16RGS,vuelo17RGS};
        agrupacion.put("RGS", List.of(RGS));

        // Aeropuerto de Córdoba (ODB)
        List<String> vuelo1ODB = new ArrayList<>();vuelo1ODB.add("MAD");vuelo1ODB.add("07:45");vuelo1ODB.add("18:55");vuelo1ODB.add("90");
        List<String> vuelo2ODB = new ArrayList<>();vuelo2ODB.add("ABC");vuelo2ODB.add("08:30");vuelo2ODB.add("20:45");vuelo2ODB.add("105");
        List<String> vuelo3ODB = new ArrayList<>();vuelo3ODB.add("ALC");vuelo3ODB.add("09:15");vuelo3ODB.add("22:00");vuelo3ODB.add("120");
        List<String> vuelo4ODB = new ArrayList<>();vuelo4ODB.add("LEI");vuelo4ODB.add("10:00");vuelo4ODB.add("23:15");vuelo4ODB.add("135");
        List<String> vuelo5ODB = new ArrayList<>();vuelo5ODB.add("OVD");vuelo5ODB.add("10:45");vuelo5ODB.add("00:30");vuelo5ODB.add("150");
        List<String> vuelo6ODB = new ArrayList<>();vuelo6ODB.add("BJZ");vuelo6ODB.add("11:30");vuelo6ODB.add("01:45");vuelo6ODB.add("165");
        List<String> vuelo7ODB = new ArrayList<>();vuelo7ODB.add("BCN");vuelo7ODB.add("12:15");vuelo7ODB.add("03:00");vuelo7ODB.add("180");
        List<String> vuelo8ODB = new ArrayList<>();vuelo8ODB.add("BIO");vuelo8ODB.add("13:00");vuelo8ODB.add("04:15");vuelo8ODB.add("195");
        List<String> vuelo9ODB = new ArrayList<>();vuelo9ODB.add("RGS");vuelo9ODB.add("13:45");vuelo9ODB.add("05:30");vuelo9ODB.add("210");
        List<String> vuelo10ODB = new ArrayList<>();vuelo10ODB.add("GRX");vuelo10ODB.add("14:30");vuelo10ODB.add("06:45");vuelo10ODB.add("225");
        List<String> vuelo11ODB = new ArrayList<>();vuelo11ODB.add("GRO");vuelo11ODB.add("15:15");vuelo11ODB.add("08:00");vuelo11ODB.add("240");
        List<String> vuelo12ODB = new ArrayList<>();vuelo12ODB.add("LPA");vuelo12ODB.add("16:00");vuelo12ODB.add("09:15");vuelo12ODB.add("255");
        List<String> vuelo13ODB = new ArrayList<>();vuelo13ODB.add("FUE");vuelo13ODB.add("16:45");vuelo13ODB.add("10:30");vuelo13ODB.add("270");
        List<String> vuelo14ODB = new ArrayList<>();vuelo14ODB.add("LCG");vuelo14ODB.add("17:30");vuelo14ODB.add("11:45");vuelo14ODB.add("285");
        List<String> vuelo15ODB = new ArrayList<>();vuelo15ODB.add("ACE");vuelo15ODB.add("18:15");vuelo15ODB.add("13:00");vuelo15ODB.add("300");
        List<String> vuelo16ODB = new ArrayList<>();vuelo16ODB.add("HSK");vuelo16ODB.add("19:00");vuelo16ODB.add("14:15");vuelo16ODB.add("315");
        List<String> vuelo17ODB = new ArrayList<>();vuelo17ODB.add("IBZ");vuelo17ODB.add("19:45");vuelo17ODB.add("15:30");vuelo17ODB.add("330");

        List<String>[] ODB = new List[]{vuelo1ODB,vuelo2ODB,vuelo3ODB,vuelo4ODB,vuelo5ODB,vuelo6ODB,vuelo7ODB,vuelo8ODB,vuelo9ODB,vuelo10ODB,vuelo11ODB,vuelo12ODB,vuelo13ODB,vuelo14ODB,vuelo15ODB,vuelo16ODB,vuelo17ODB};
        agrupacion.put("ODB", List.of(ODB));

        // Aeropuerto de Santa Fe (GRX)
        List<String> vuelo1GRX = new ArrayList<>();vuelo1GRX.add("MAD");vuelo1GRX.add("07:45");vuelo1GRX.add("18:55");vuelo1GRX.add("90");
        List<String> vuelo2GRX = new ArrayList<>();vuelo2GRX.add("ABC");vuelo2GRX.add("08:30");vuelo2GRX.add("20:45");vuelo2GRX.add("105");
        List<String> vuelo3GRX = new ArrayList<>();vuelo3GRX.add("ALC");vuelo3GRX.add("09:15");vuelo3GRX.add("22:00");vuelo3GRX.add("120");
        List<String> vuelo4GRX = new ArrayList<>();vuelo4GRX.add("LEI");vuelo4GRX.add("10:00");vuelo4GRX.add("23:15");vuelo4GRX.add("135");
        List<String> vuelo5GRX = new ArrayList<>();vuelo5GRX.add("OVD");vuelo5GRX.add("10:45");vuelo5GRX.add("00:30");vuelo5GRX.add("150");
        List<String> vuelo6GRX = new ArrayList<>();vuelo6GRX.add("BJZ");vuelo6GRX.add("11:30");vuelo6GRX.add("01:45");vuelo6GRX.add("165");
        List<String> vuelo7GRX = new ArrayList<>();vuelo7GRX.add("BCN");vuelo7GRX.add("12:15");vuelo7GRX.add("03:00");vuelo7GRX.add("180");
        List<String> vuelo8GRX = new ArrayList<>();vuelo8GRX.add("BIO");vuelo8GRX.add("13:00");vuelo8GRX.add("04:15");vuelo8GRX.add("195");
        List<String> vuelo9GRX = new ArrayList<>();vuelo9GRX.add("RGS");vuelo9GRX.add("13:45");vuelo9GRX.add("05:30");vuelo9GRX.add("210");
        List<String> vuelo10GRX = new ArrayList<>();vuelo10GRX.add("ODB");vuelo10GRX.add("14:30");vuelo10GRX.add("06:45");vuelo10GRX.add("225");
        List<String> vuelo11GRX = new ArrayList<>();vuelo11GRX.add("GRO");vuelo11GRX.add("15:15");vuelo11GRX.add("08:00");vuelo11GRX.add("240");
        List<String> vuelo12GRX = new ArrayList<>();vuelo12GRX.add("LPA");vuelo12GRX.add("16:00");vuelo12GRX.add("09:15");vuelo12GRX.add("255");
        List<String> vuelo13GRX = new ArrayList<>();vuelo13GRX.add("FUE");vuelo13GRX.add("16:45");vuelo13GRX.add("10:30");vuelo13GRX.add("270");
        List<String> vuelo14GRX = new ArrayList<>();vuelo14GRX.add("LCG");vuelo14GRX.add("17:30");vuelo14GRX.add("11:45");vuelo14GRX.add("285");
        List<String> vuelo15GRX = new ArrayList<>();vuelo15GRX.add("ACE");vuelo15GRX.add("18:15");vuelo15GRX.add("13:00");vuelo15GRX.add("300");
        List<String> vuelo16GRX = new ArrayList<>();vuelo16GRX.add("HSK");vuelo16GRX.add("19:00");vuelo16GRX.add("14:15");vuelo16GRX.add("315");
        List<String> vuelo17GRX = new ArrayList<>();vuelo17GRX.add("IBZ");vuelo17GRX.add("19:45");vuelo17GRX.add("15:30");vuelo17GRX.add("330");

        List<String>[] GRX = new List[]{vuelo1GRX,vuelo2GRX,vuelo3GRX,vuelo4GRX,vuelo5GRX,vuelo6GRX,vuelo7GRX,vuelo8GRX,vuelo9GRX,vuelo10GRX,vuelo11GRX,vuelo12GRX,vuelo13GRX,vuelo14GRX,vuelo15GRX,vuelo16GRX,vuelo17GRX};
        agrupacion.put("GRX", List.of(GRX));

        // Aeropuerto de Aiguaviva (GRO)
        List<String> vuelo1GRO = new ArrayList<>();vuelo1GRO.add("MAD");vuelo1GRO.add("08:30");vuelo1GRO.add("20:45");vuelo1GRO.add("95");
        List<String> vuelo2GRO = new ArrayList<>();vuelo2GRO.add("ABC");vuelo2GRO.add("09:15");vuelo2GRO.add("21:30");vuelo2GRO.add("100");
        List<String> vuelo3GRO = new ArrayList<>();vuelo3GRO.add("ALC");vuelo3GRO.add("10:00");vuelo3GRO.add("22:15");vuelo3GRO.add("105");
        List<String> vuelo4GRO = new ArrayList<>();vuelo4GRO.add("LEI");vuelo4GRO.add("10:45");vuelo4GRO.add("23:00");vuelo4GRO.add("110");
        List<String> vuelo5GRO = new ArrayList<>();vuelo5GRO.add("OVD");vuelo5GRO.add("11:30");vuelo5GRO.add("00:45");vuelo5GRO.add("115");
        List<String> vuelo6GRO = new ArrayList<>();vuelo6GRO.add("BJZ");vuelo6GRO.add("12:15");vuelo6GRO.add("01:30");vuelo6GRO.add("120");
        List<String> vuelo7GRO = new ArrayList<>();vuelo7GRO.add("BCN");vuelo7GRO.add("13:00");vuelo7GRO.add("02:15");vuelo7GRO.add("125");
        List<String> vuelo8GRO = new ArrayList<>();vuelo8GRO.add("BIO");vuelo8GRO.add("13:45");vuelo8GRO.add("03:00");vuelo8GRO.add("130");
        List<String> vuelo9GRO = new ArrayList<>();vuelo9GRO.add("RGS");vuelo9GRO.add("14:30");vuelo9GRO.add("03:45");vuelo9GRO.add("135");
        List<String> vuelo10GRO = new ArrayList<>();vuelo10GRO.add("ODB");vuelo10GRO.add("15:15");vuelo10GRO.add("04:30");vuelo10GRO.add("140");
        List<String> vuelo11GRO = new ArrayList<>();vuelo11GRO.add("GRX");vuelo11GRO.add("16:00");vuelo11GRO.add("05:15");vuelo11GRO.add("145");
        List<String> vuelo12GRO = new ArrayList<>();vuelo12GRO.add("LPA");vuelo12GRO.add("16:45");vuelo12GRO.add("06:00");vuelo12GRO.add("150");
        List<String> vuelo13GRO = new ArrayList<>();vuelo13GRO.add("FUE");vuelo13GRO.add("17:30");vuelo13GRO.add("06:45");vuelo13GRO.add("155");
        List<String> vuelo14GRO = new ArrayList<>();vuelo14GRO.add("LCG");vuelo14GRO.add("18:15");vuelo14GRO.add("07:30");vuelo14GRO.add("160");
        List<String> vuelo15GRO = new ArrayList<>();vuelo15GRO.add("ACE");vuelo15GRO.add("19:00");vuelo15GRO.add("08:15");vuelo15GRO.add("165");
        List<String> vuelo16GRO = new ArrayList<>();vuelo16GRO.add("HSK");vuelo16GRO.add("19:45");vuelo16GRO.add("09:00");vuelo16GRO.add("170");
        List<String> vuelo17GRO = new ArrayList<>();vuelo17GRO.add("IBZ");vuelo17GRO.add("20:30");vuelo17GRO.add("09:45");vuelo17GRO.add("175");

        List<String>[] GRO = new List[]{vuelo1GRO,vuelo2GRO,vuelo3GRO,vuelo4GRO,vuelo5GRO,vuelo6GRO,vuelo7GRO,vuelo8GRO,vuelo9GRO,vuelo10GRO,vuelo11GRO,vuelo12GRO,vuelo13GRO,vuelo14GRO,vuelo15GRO,vuelo16GRO,vuelo17GRO};
        agrupacion.put("GRO", List.of(GRO));

        //Aeropuerto de Telde (LPA)
        List<String> vuelo1LPA = new ArrayList<>();vuelo1LPA.add("MAD");vuelo1LPA.add("08:30");vuelo1LPA.add("20:45");vuelo1LPA.add("95");
        List<String> vuelo2LPA = new ArrayList<>();vuelo2LPA.add("ABC");vuelo2LPA.add("09:15");vuelo2LPA.add("21:30");vuelo2LPA.add("100");
        List<String> vuelo3LPA = new ArrayList<>();vuelo3LPA.add("ALC");vuelo3LPA.add("10:00");vuelo3LPA.add("22:15");vuelo3LPA.add("105");
        List<String> vuelo4LPA = new ArrayList<>();vuelo4LPA.add("LEI");vuelo4LPA.add("10:45");vuelo4LPA.add("23:00");vuelo4LPA.add("110");
        List<String> vuelo5LPA = new ArrayList<>();vuelo5LPA.add("OVD");vuelo5LPA.add("11:30");vuelo5LPA.add("00:45");vuelo5LPA.add("115");
        List<String> vuelo6LPA = new ArrayList<>();vuelo6LPA.add("BJZ");vuelo6LPA.add("12:15");vuelo6LPA.add("01:30");vuelo6LPA.add("120");
        List<String> vuelo7LPA = new ArrayList<>();vuelo7LPA.add("BCN");vuelo7LPA.add("13:00");vuelo7LPA.add("02:15");vuelo7LPA.add("125");
        List<String> vuelo8LPA = new ArrayList<>();vuelo8LPA.add("BIO");vuelo8LPA.add("13:45");vuelo8LPA.add("03:00");vuelo8LPA.add("130");
        List<String> vuelo9LPA = new ArrayList<>();vuelo9LPA.add("RGS");vuelo9LPA.add("14:30");vuelo9LPA.add("03:45");vuelo9LPA.add("135");
        List<String> vuelo10LPA = new ArrayList<>();vuelo10LPA.add("ODB");vuelo10LPA.add("15:15");vuelo10LPA.add("04:30");vuelo10LPA.add("140");
        List<String> vuelo11LPA = new ArrayList<>();vuelo11LPA.add("GRX");vuelo11LPA.add("16:00");vuelo11LPA.add("05:15");vuelo11LPA.add("145");
        List<String> vuelo12LPA = new ArrayList<>();vuelo12LPA.add("GRO");vuelo12LPA.add("16:45");vuelo12LPA.add("06:00");vuelo12LPA.add("150");
        List<String> vuelo13LPA = new ArrayList<>();vuelo13LPA.add("FUE");vuelo13LPA.add("17:30");vuelo13LPA.add("06:45");vuelo13LPA.add("155");
        List<String> vuelo14LPA = new ArrayList<>();vuelo14LPA.add("LCG");vuelo14LPA.add("18:15");vuelo14LPA.add("07:30");vuelo14LPA.add("160");
        List<String> vuelo15LPA = new ArrayList<>();vuelo15LPA.add("ACE");vuelo15LPA.add("19:00");vuelo15LPA.add("08:15");vuelo15LPA.add("165");
        List<String> vuelo16LPA = new ArrayList<>();vuelo16LPA.add("HSK");vuelo16LPA.add("19:45");vuelo16LPA.add("09:00");vuelo16LPA.add("170");
        List<String> vuelo17LPA = new ArrayList<>();vuelo17LPA.add("IBZ");vuelo17LPA.add("20:30");vuelo17LPA.add("09:45");vuelo17LPA.add("175");

        List<String>[] LPA = new List[]{vuelo1LPA,vuelo2LPA,vuelo3LPA,vuelo4LPA,vuelo5LPA,vuelo6LPA,vuelo7LPA,vuelo8LPA,vuelo9LPA,vuelo10LPA,vuelo11LPA,vuelo12LPA,vuelo13LPA,vuelo14LPA,vuelo15LPA,vuelo16LPA,vuelo17LPA};
        agrupacion.put("LPA", List.of(LPA));

        //Aeropuerto de Puerto del Rosario (FUE)
        List<String> vuelo1FUE = new ArrayList<>();vuelo1FUE.add("MAD");vuelo1FUE.add("08:30");vuelo1FUE.add("20:45");vuelo1FUE.add("95");
        List<String> vuelo2FUE = new ArrayList<>();vuelo2FUE.add("ABC");vuelo2FUE.add("09:15");vuelo2FUE.add("21:30");vuelo2FUE.add("100");
        List<String> vuelo3FUE = new ArrayList<>();vuelo3FUE.add("ALC");vuelo3FUE.add("10:00");vuelo3FUE.add("22:15");vuelo3FUE.add("105");
        List<String> vuelo4FUE = new ArrayList<>();vuelo4FUE.add("LEI");vuelo4FUE.add("10:45");vuelo4FUE.add("23:00");vuelo4FUE.add("110");
        List<String> vuelo5FUE = new ArrayList<>();vuelo5FUE.add("OVD");vuelo5FUE.add("11:30");vuelo5FUE.add("00:45");vuelo5FUE.add("115");
        List<String> vuelo6FUE = new ArrayList<>();vuelo6FUE.add("BJZ");vuelo6FUE.add("12:15");vuelo6FUE.add("01:30");vuelo6FUE.add("120");
        List<String> vuelo7FUE = new ArrayList<>();vuelo7FUE.add("BCN");vuelo7FUE.add("13:00");vuelo7FUE.add("02:15");vuelo7FUE.add("125");
        List<String> vuelo8FUE = new ArrayList<>();vuelo8FUE.add("BIO");vuelo8FUE.add("13:45");vuelo8FUE.add("03:00");vuelo8FUE.add("130");
        List<String> vuelo9FUE = new ArrayList<>();vuelo9FUE.add("RGS");vuelo9FUE.add("14:30");vuelo9FUE.add("03:45");vuelo9FUE.add("135");
        List<String> vuelo10FUE = new ArrayList<>();vuelo10FUE.add("ODB");vuelo10FUE.add("15:15");vuelo10FUE.add("04:30");vuelo10FUE.add("140");
        List<String> vuelo11FUE = new ArrayList<>();vuelo11FUE.add("GRX");vuelo11FUE.add("16:00");vuelo11FUE.add("05:15");vuelo11FUE.add("145");
        List<String> vuelo12FUE = new ArrayList<>();vuelo12FUE.add("GRO");vuelo12FUE.add("16:45");vuelo12FUE.add("06:00");vuelo12FUE.add("150");
        List<String> vuelo13FUE = new ArrayList<>();vuelo13FUE.add("LPA");vuelo13FUE.add("17:30");vuelo13FUE.add("06:45");vuelo13FUE.add("155");
        List<String> vuelo14FUE = new ArrayList<>();vuelo14FUE.add("LCG");vuelo14FUE.add("18:15");vuelo14FUE.add("07:30");vuelo14FUE.add("160");
        List<String> vuelo15FUE = new ArrayList<>();vuelo15FUE.add("ACE");vuelo15FUE.add("19:00");vuelo15FUE.add("08:15");vuelo15FUE.add("165");
        List<String> vuelo16FUE = new ArrayList<>();vuelo16FUE.add("HSK");vuelo16FUE.add("19:45");vuelo16FUE.add("09:00");vuelo16FUE.add("170");
        List<String> vuelo17FUE = new ArrayList<>();vuelo17FUE.add("IBZ");vuelo17FUE.add("20:30");vuelo17FUE.add("09:45");vuelo17FUE.add("175");

        List<String>[] FUE = new List[]{vuelo1FUE,vuelo2FUE,vuelo3FUE,vuelo4FUE,vuelo5FUE,vuelo6FUE,vuelo7FUE,vuelo8FUE,vuelo9FUE,vuelo10FUE,vuelo11FUE,vuelo12FUE,vuelo13FUE,vuelo14FUE,vuelo15FUE,vuelo16FUE,vuelo17FUE};
        agrupacion.put("FUE", List.of(FUE));

        // Aeropuerto de Culleredo (LCG)
        List<String> vuelo1LCG = new ArrayList<>(); vuelo1LCG.add("MAD"); vuelo1LCG.add("08:00"); vuelo1LCG.add("10:30"); vuelo1LCG.add("120");
        List<String> vuelo2LCG = new ArrayList<>(); vuelo2LCG.add("ABC"); vuelo2LCG.add("09:15"); vuelo2LCG.add("11:45"); vuelo2LCG.add("110");
        List<String> vuelo3LCG = new ArrayList<>(); vuelo3LCG.add("ALC"); vuelo3LCG.add("10:30"); vuelo3LCG.add("13:15"); vuelo3LCG.add("95");
        List<String> vuelo4LCG = new ArrayList<>(); vuelo4LCG.add("LEI"); vuelo4LCG.add("11:45"); vuelo4LCG.add("14:30"); vuelo4LCG.add("90");
        List<String> vuelo5LCG = new ArrayList<>(); vuelo5LCG.add("OVD"); vuelo5LCG.add("13:00"); vuelo5LCG.add("15:45"); vuelo5LCG.add("85");
        List<String> vuelo6LCG = new ArrayList<>(); vuelo6LCG.add("BJZ"); vuelo6LCG.add("14:15"); vuelo6LCG.add("17:00"); vuelo6LCG.add("80");
        List<String> vuelo7LCG = new ArrayList<>(); vuelo7LCG.add("BCN"); vuelo7LCG.add("15:30"); vuelo7LCG.add("18:15"); vuelo7LCG.add("75");
        List<String> vuelo8LCG = new ArrayList<>(); vuelo8LCG.add("BIO"); vuelo8LCG.add("16:45"); vuelo8LCG.add("19:30"); vuelo8LCG.add("70");
        List<String> vuelo9LCG = new ArrayList<>(); vuelo9LCG.add("RGS"); vuelo9LCG.add("18:00"); vuelo9LCG.add("20:45"); vuelo9LCG.add("65");
        List<String> vuelo10LCG = new ArrayList<>(); vuelo10LCG.add("ODB"); vuelo10LCG.add("19:15"); vuelo10LCG.add("21:45"); vuelo10LCG.add("60");
        List<String> vuelo11LCG = new ArrayList<>(); vuelo11LCG.add("GRX"); vuelo11LCG.add("20:30"); vuelo11LCG.add("22:45"); vuelo11LCG.add("55");
        List<String> vuelo12LCG = new ArrayList<>(); vuelo12LCG.add("GRO"); vuelo12LCG.add("21:45"); vuelo12LCG.add("00:15"); vuelo12LCG.add("100");
        List<String> vuelo13LCG = new ArrayList<>(); vuelo13LCG.add("LPA"); vuelo13LCG.add("23:00"); vuelo13LCG.add("01:45"); vuelo13LCG.add("105");
        List<String> vuelo14LCG = new ArrayList<>(); vuelo14LCG.add("FUE"); vuelo14LCG.add("00:15"); vuelo14LCG.add("03:00"); vuelo14LCG.add("110");
        List<String> vuelo15LCG = new ArrayList<>(); vuelo15LCG.add("ACE"); vuelo15LCG.add("01:30"); vuelo15LCG.add("04:15"); vuelo15LCG.add("115");
        List<String> vuelo16LCG = new ArrayList<>(); vuelo16LCG.add("HSK"); vuelo16LCG.add("02:45"); vuelo16LCG.add("05:30"); vuelo16LCG.add("120");
        List<String> vuelo17LCG = new ArrayList<>(); vuelo17LCG.add("IBZ"); vuelo17LCG.add("04:00"); vuelo17LCG.add("06:45"); vuelo17LCG.add("125");

        List<String>[] LCG = new List[]{vuelo1LCG, vuelo2LCG, vuelo3LCG, vuelo4LCG, vuelo5LCG, vuelo6LCG, vuelo7LCG, vuelo8LCG, vuelo9LCG, vuelo10LCG, vuelo11LCG, vuelo12LCG, vuelo13LCG, vuelo14LCG, vuelo15LCG, vuelo16LCG, vuelo17LCG};
        agrupacion.put("LCG", List.of(LCG));

        // Aeropuerto de San Bartolomé (ACE)
        List<String> vuelo1ACE = new ArrayList<>(); vuelo1ACE.add("MAD"); vuelo1ACE.add("09:00"); vuelo1ACE.add("20:30"); vuelo1ACE.add("120");
        List<String> vuelo2ACE = new ArrayList<>(); vuelo2ACE.add("ABC"); vuelo2ACE.add("09:45"); vuelo2ACE.add("21:15"); vuelo2ACE.add("110");
        List<String> vuelo3ACE = new ArrayList<>(); vuelo3ACE.add("ALC"); vuelo3ACE.add("10:30"); vuelo3ACE.add("22:00"); vuelo3ACE.add("105");
        List<String> vuelo4ACE = new ArrayList<>(); vuelo4ACE.add("LEI"); vuelo4ACE.add("11:15"); vuelo4ACE.add("22:45"); vuelo4ACE.add("100");
        List<String> vuelo5ACE = new ArrayList<>(); vuelo5ACE.add("OVD"); vuelo5ACE.add("12:00"); vuelo5ACE.add("23:30"); vuelo5ACE.add("95");
        List<String> vuelo6ACE = new ArrayList<>(); vuelo6ACE.add("BJZ"); vuelo6ACE.add("12:45"); vuelo6ACE.add("00:15"); vuelo6ACE.add("90");
        List<String> vuelo7ACE = new ArrayList<>(); vuelo7ACE.add("BCN"); vuelo7ACE.add("13:30"); vuelo7ACE.add("01:00"); vuelo7ACE.add("85");
        List<String> vuelo8ACE = new ArrayList<>(); vuelo8ACE.add("BIO"); vuelo8ACE.add("14:15"); vuelo8ACE.add("01:45"); vuelo8ACE.add("80");
        List<String> vuelo9ACE = new ArrayList<>(); vuelo9ACE.add("RGS"); vuelo9ACE.add("15:00"); vuelo9ACE.add("02:30"); vuelo9ACE.add("75");
        List<String> vuelo10ACE = new ArrayList<>(); vuelo10ACE.add("ODB"); vuelo10ACE.add("15:45"); vuelo10ACE.add("03:15"); vuelo10ACE.add("70");
        List<String> vuelo11ACE = new ArrayList<>(); vuelo11ACE.add("GRX"); vuelo11ACE.add("16:30"); vuelo11ACE.add("04:00"); vuelo11ACE.add("65");
        List<String> vuelo12ACE = new ArrayList<>(); vuelo12ACE.add("GRO"); vuelo12ACE.add("17:15"); vuelo12ACE.add("04:45"); vuelo12ACE.add("60");
        List<String> vuelo13ACE = new ArrayList<>(); vuelo13ACE.add("LPA"); vuelo13ACE.add("18:00"); vuelo13ACE.add("05:30"); vuelo13ACE.add("55");
        List<String> vuelo14ACE = new ArrayList<>(); vuelo14ACE.add("LCG"); vuelo14ACE.add("18:45"); vuelo14ACE.add("06:15"); vuelo14ACE.add("50");
        List<String> vuelo15ACE = new ArrayList<>(); vuelo15ACE.add("FUE"); vuelo15ACE.add("19:30"); vuelo15ACE.add("07:00"); vuelo15ACE.add("45");
        List<String> vuelo16ACE = new ArrayList<>(); vuelo16ACE.add("HSK"); vuelo16ACE.add("20:15"); vuelo16ACE.add("07:45"); vuelo16ACE.add("40");
        List<String> vuelo17ACE = new ArrayList<>(); vuelo17ACE.add("IBZ"); vuelo17ACE.add("21:00"); vuelo17ACE.add("08:30"); vuelo17ACE.add("35");

        List<String>[] ACE = new List[]{vuelo1ACE, vuelo2ACE, vuelo3ACE, vuelo4ACE, vuelo5ACE, vuelo6ACE, vuelo7ACE,
                vuelo8ACE, vuelo9ACE, vuelo10ACE, vuelo11ACE, vuelo12ACE, vuelo13ACE, vuelo14ACE, vuelo15ACE,
                vuelo16ACE, vuelo17ACE};
        agrupacion.put("ACE", List.of(ACE));

        // Aeropuerto de Alcalá del Obispo (HSK)
        List<String> vuelo1HSK = new ArrayList<>(); vuelo1HSK.add("MAD"); vuelo1HSK.add("08:45"); vuelo1HSK.add("20:00"); vuelo1HSK.add("120");
        List<String> vuelo2HSK = new ArrayList<>(); vuelo2HSK.add("ABC"); vuelo2HSK.add("09:30"); vuelo2HSK.add("20:45"); vuelo2HSK.add("110");
        List<String> vuelo3HSK = new ArrayList<>(); vuelo3HSK.add("ALC"); vuelo3HSK.add("10:15"); vuelo3HSK.add("21:30"); vuelo3HSK.add("105");
        List<String> vuelo4HSK = new ArrayList<>(); vuelo4HSK.add("LEI"); vuelo4HSK.add("11:00"); vuelo4HSK.add("22:15"); vuelo4HSK.add("100");
        List<String> vuelo5HSK = new ArrayList<>(); vuelo5HSK.add("OVD"); vuelo5HSK.add("11:45"); vuelo5HSK.add("23:00"); vuelo5HSK.add("95");
        List<String> vuelo6HSK = new ArrayList<>(); vuelo6HSK.add("BJZ"); vuelo6HSK.add("12:30"); vuelo6HSK.add("23:45"); vuelo6HSK.add("90");
        List<String> vuelo7HSK = new ArrayList<>(); vuelo7HSK.add("BCN"); vuelo7HSK.add("13:15"); vuelo7HSK.add("00:30"); vuelo7HSK.add("85");
        List<String> vuelo8HSK = new ArrayList<>(); vuelo8HSK.add("BIO"); vuelo8HSK.add("14:00"); vuelo8HSK.add("01:15"); vuelo8HSK.add("80");
        List<String> vuelo9HSK = new ArrayList<>(); vuelo9HSK.add("RGS"); vuelo9HSK.add("14:45"); vuelo9HSK.add("02:00"); vuelo9HSK.add("75");
        List<String> vuelo10HSK = new ArrayList<>(); vuelo10HSK.add("ODB"); vuelo10HSK.add("15:30"); vuelo10HSK.add("02:45"); vuelo10HSK.add("70");
        List<String> vuelo11HSK = new ArrayList<>(); vuelo11HSK.add("GRX"); vuelo11HSK.add("16:15"); vuelo11HSK.add("03:30"); vuelo11HSK.add("65");
        List<String> vuelo12HSK = new ArrayList<>(); vuelo12HSK.add("GRO"); vuelo12HSK.add("17:00"); vuelo12HSK.add("04:15"); vuelo12HSK.add("60");
        List<String> vuelo13HSK = new ArrayList<>(); vuelo13HSK.add("LPA"); vuelo13HSK.add("17:45"); vuelo13HSK.add("05:00"); vuelo13HSK.add("55");
        List<String> vuelo14HSK = new ArrayList<>(); vuelo14HSK.add("LCG"); vuelo14HSK.add("18:30"); vuelo14HSK.add("05:45"); vuelo14HSK.add("50");
        List<String> vuelo15HSK = new ArrayList<>(); vuelo15HSK.add("FUE"); vuelo15HSK.add("19:15"); vuelo15HSK.add("06:30"); vuelo15HSK.add("45");
        List<String> vuelo16HSK = new ArrayList<>(); vuelo16HSK.add("ACE"); vuelo16HSK.add("20:00"); vuelo16HSK.add("07:15"); vuelo16HSK.add("40");
        List<String> vuelo17HSK = new ArrayList<>(); vuelo17HSK.add("IBZ"); vuelo17HSK.add("20:45"); vuelo17HSK.add("08:00"); vuelo17HSK.add("35");

        List<String>[] HSK = new List[]{vuelo1HSK, vuelo2HSK, vuelo3HSK, vuelo4HSK, vuelo5HSK, vuelo6HSK, vuelo7HSK,
                vuelo8HSK, vuelo9HSK, vuelo10HSK, vuelo11HSK, vuelo12HSK, vuelo13HSK, vuelo14HSK, vuelo15HSK,
                vuelo16HSK, vuelo17HSK};
        agrupacion.put("HSK", List.of(HSK));


        ApoyoPuntoVenta apoyoPuntoVenta = new ApoyoPuntoVenta();
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
        } else {
            System.out.println("No hay vuelos disponibles");

        }

        String nose = ( origen_dicc + "-" + destino_dicc + " " + salida1 + " " + llegada1 + " ");
        String nose2 = (origen_dicc + "-" + destino_dicc + " " + salida2 + " " + llegada2 + " " + apoyoPuntoVenta.preciorandom() + "€");

        return nose;
    }
    public static String Opcion6 (String origen, String destino){

        ApoyoPuntoVenta apoyoPuntoVenta = new ApoyoPuntoVenta();
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
        } else {
            System.out.println("No hay vuelos disponibles");

        }

        String nose = ( origen_dicc + "-" + destino_dicc + " " + salida1 + " " + llegada1 + " " + apoyoPuntoVenta.preciorandom() + "€");

        return (origen_dicc + "-" + destino_dicc + " " + salida2 + " " + llegada2 + " " + apoyoPuntoVenta.preciorandom() + "€");
    }
    }




