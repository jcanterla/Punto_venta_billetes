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

        IATAdic.put("Sevilla", "SVQ");
        IATAdic.put("Madrid", "MAD");
        IATAdic.put("Barcelona", "BCN");
        IATAdic.put("Valencia", "VLC");
        IATAdic.put("Bilbao", "BIO");
        IATAdic.put("Málaga", "AGP");
        IATAdic.put("Alicante", "ALC");
        IATAdic.put("Palma de Mallorca", "PMI");
        IATAdic.put("Las Palmas", "LPA");
        IATAdic.put("Gran Canaria", "LPA");
        IATAdic.put("Fuerteventura", "FUE");
        IATAdic.put("Lanzarote", "ACE");
        IATAdic.put("Ibiza", "IBZ");
        IATAdic.put("Menorca", "MAH");
        IATAdic.put("Tenerife Sur", "TFS");
        IATAdic.put("Tenerife Norte", "TFN");
        IATAdic.put("Granada", "GRX");
        IATAdic.put("Santiago de Compostela", "SCQ");
        IATAdic.put("Vigo", "VGO");
        IATAdic.put("A Coruña", "LCG");
        IATAdic.put("Oviedo", "OVD");
        IATAdic.put("Santander", "SDR");
        IATAdic.put("Pamplona", "PNA");
        IATAdic.put("Logroño", "RJL");
        IATAdic.put("San Sebastián", "EAS");
        IATAdic.put("Vitoria", "VIT");
        IATAdic.put("Zaragoza", "ZAZ");
        IATAdic.put("Teruel", "TEV");
        IATAdic.put("Huesca", "HSK");
        IATAdic.put("León", "LEN");
        IATAdic.put("Valladolid", "VLL");
        IATAdic.put("Burgos", "RGS");
        IATAdic.put("Salamanca", "SLM");

       HashMap<String, List<List<String>>> agrupacion = new HashMap<>();
        // Aeropuerto Sevilla (SVQ)
        List<String> vuelo1SVQ = new ArrayList<>();vuelo1SVQ.add("BCN");vuelo1SVQ.add("07:45");vuelo1SVQ.add("18:55");vuelo1SVQ.add("90");
        List<String> vuelo2SVQ = new ArrayList<>();vuelo2SVQ.add("MAD");vuelo2SVQ.add("08:25");vuelo2SVQ.add("21:00");vuelo2SVQ.add("60");
        List<String> vuelo3SVQ = new ArrayList<>();vuelo3SVQ.add("BIO");vuelo3SVQ.add("08:55");vuelo3SVQ.add("20:15");vuelo3SVQ.add("85");
        List<String> vuelo4SVQ = new ArrayList<>();vuelo4SVQ.add("AGP");vuelo4SVQ.add("09:30");vuelo4SVQ.add("22:00");vuelo4SVQ.add("75");
        List<String> vuelo5SVQ = new ArrayList<>();vuelo5SVQ.add("VLC");vuelo5SVQ.add("10:00");vuelo5SVQ.add("23:00");vuelo5SVQ.add("90");
        List<String> vuelo6SVQ = new ArrayList<>();vuelo6SVQ.add("PMI");vuelo6SVQ.add("10:30");vuelo6SVQ.add("23:45");vuelo6SVQ.add("105");
        List<String> vuelo7SVQ = new ArrayList<>();vuelo7SVQ.add("LPA");vuelo7SVQ.add("11:00");vuelo7SVQ.add("00:30");vuelo7SVQ.add("120");
        List<String> vuelo9SVQ = new ArrayList<>();vuelo9SVQ.add("FUE");vuelo9SVQ.add("12:00");vuelo9SVQ.add("01:45");vuelo9SVQ.add("105");
        List<String> vuelo10SVQ = new ArrayList<>();vuelo10SVQ.add("ACE");vuelo10SVQ.add("12:30");vuelo10SVQ.add("02:15");vuelo10SVQ.add("105");
        List<String> vuelo11SVQ = new ArrayList<>();vuelo11SVQ.add("IBZ");vuelo11SVQ.add("13:00");vuelo11SVQ.add("02:45");vuelo11SVQ.add("105");
        List<String> vuelo12SVQ = new ArrayList<>();vuelo12SVQ.add("MAH");vuelo12SVQ.add("13:30");vuelo12SVQ.add("03:15");vuelo12SVQ.add("105");
        List<String> vuelo13SVQ = new ArrayList<>();vuelo13SVQ.add("TFS");vuelo13SVQ.add("14:00");vuelo13SVQ.add("03:45");vuelo13SVQ.add("105");
        List<String> vuelo14SVQ = new ArrayList<>();vuelo14SVQ.add("TFN");vuelo14SVQ.add("14:30");vuelo14SVQ.add("04:15");vuelo14SVQ.add("105");
        List<String> vuelo15SVQ = new ArrayList<>();vuelo15SVQ.add("GRX");vuelo15SVQ.add("15:00");vuelo15SVQ.add("04:45");vuelo15SVQ.add("105");
        List<String> vuelo16SVQ = new ArrayList<>();vuelo16SVQ.add("SCQ");vuelo16SVQ.add("15:30");vuelo16SVQ.add("05:15");vuelo16SVQ.add("105");
        List<String> vuelo17SVQ = new ArrayList<>();vuelo17SVQ.add("VGO");vuelo17SVQ.add("16:00");vuelo17SVQ.add("05:45");vuelo17SVQ.add("105");
        List<String> vuelo18SVQ = new ArrayList<>();vuelo18SVQ.add("LCG");vuelo18SVQ.add("16:30");vuelo18SVQ.add("06:15");vuelo18SVQ.add("105");
        List<String> vuelo19SVQ = new ArrayList<>();vuelo19SVQ.add("OVD");vuelo19SVQ.add("17:00");vuelo19SVQ.add("06:45");vuelo19SVQ.add("105");
        List<String> vuelo20SVQ = new ArrayList<>();vuelo20SVQ.add("SDR");vuelo20SVQ.add("17:30");vuelo20SVQ.add("07:15");vuelo20SVQ.add("105");
        List<String> vuelo21SVQ = new ArrayList<>();vuelo21SVQ.add("PNA");vuelo21SVQ.add("18:00");vuelo21SVQ.add("07:45");vuelo21SVQ.add("105");
        List<String> vuelo22SVQ = new ArrayList<>();vuelo22SVQ.add("RJL");vuelo22SVQ.add("18:30");vuelo22SVQ.add("08:15");vuelo22SVQ.add("105");
        List<String> vuelo23SVQ = new ArrayList<>();vuelo23SVQ.add("EAS");vuelo23SVQ.add("19:00");vuelo23SVQ.add("08:45");vuelo23SVQ.add("105");
        List<String> vuelo24SVQ = new ArrayList<>();vuelo24SVQ.add("VIT");vuelo24SVQ.add("19:30");vuelo24SVQ.add("09:15");vuelo24SVQ.add("105");
        List<String> vuelo25SVQ = new ArrayList<>();vuelo25SVQ.add("ZAZ");vuelo25SVQ.add("20:00");vuelo25SVQ.add("09:45");vuelo25SVQ.add("105");
        List<String> vuelo26SVQ = new ArrayList<>();vuelo26SVQ.add("TEV");vuelo26SVQ.add("20:30");vuelo26SVQ.add("10:15");vuelo26SVQ.add("105");
        List<String> vuelo27SVQ = new ArrayList<>();vuelo27SVQ.add("HSK");vuelo27SVQ.add("21:00");vuelo27SVQ.add("10:45");vuelo27SVQ.add("105");
        List<String> vuelo28SVQ = new ArrayList<>();vuelo28SVQ.add("LEN");vuelo28SVQ.add("21:30");vuelo28SVQ.add("11:15");vuelo28SVQ.add("105");
        List<String> vuelo29SVQ = new ArrayList<>();vuelo29SVQ.add("VLL");vuelo29SVQ.add("22:00");vuelo29SVQ.add("11:45");vuelo29SVQ.add("105");
        List<String> vuelo30SVQ = new ArrayList<>();vuelo30SVQ.add("RGS");vuelo30SVQ.add("22:30");vuelo30SVQ.add("12:15");vuelo30SVQ.add("105");
        List<String> vuelo31SVQ = new ArrayList<>();vuelo31SVQ.add("SLM");vuelo31SVQ.add("23:00");vuelo31SVQ.add("12:45");vuelo31SVQ.add("105");
        List<String>[] SVQ = new List[]{vuelo1SVQ, vuelo2SVQ, vuelo3SVQ, vuelo4SVQ, vuelo5SVQ, vuelo6SVQ, vuelo7SVQ, vuelo9SVQ, vuelo10SVQ, vuelo11SVQ, vuelo12SVQ, vuelo13SVQ, vuelo14SVQ, vuelo15SVQ, vuelo16SVQ, vuelo17SVQ, vuelo18SVQ, vuelo19SVQ, vuelo20SVQ, vuelo21SVQ, vuelo22SVQ, vuelo23SVQ, vuelo24SVQ, vuelo25SVQ, vuelo26SVQ, vuelo27SVQ, vuelo28SVQ, vuelo29SVQ, vuelo30SVQ, vuelo31SVQ};
        agrupacion.put("SVQ", List.of(SVQ));

        // Aeropuerto Madrid (MAD)
        List<String> vuelo1MAD = new ArrayList<>();vuelo1MAD.add("BCN");vuelo1MAD.add("07:30");vuelo1MAD.add("09:15");vuelo1MAD.add("105");
        List<String> vuelo2MAD = new ArrayList<>();vuelo2MAD.add("SVQ");vuelo2MAD.add("09:00");vuelo2MAD.add("10:45");vuelo2MAD.add("90");
        List<String> vuelo3MAD = new ArrayList<>();vuelo3MAD.add("PMI");vuelo3MAD.add("11:30");vuelo3MAD.add("13:45");vuelo3MAD.add("90");
        List<String> vuelo4MAD = new ArrayList<>();vuelo4MAD.add("LPA");vuelo4MAD.add("12:00");vuelo4MAD.add("14:30");vuelo4MAD.add("105");
        List<String> vuelo5MAD = new ArrayList<>();vuelo5MAD.add("FUE");vuelo5MAD.add("13:00");vuelo5MAD.add("15:45");vuelo5MAD.add("105");
        List<String> vuelo6MAD = new ArrayList<>();vuelo6MAD.add("ACE");vuelo6MAD.add("13:30");vuelo6MAD.add("16:15");vuelo6MAD.add("105");
        List<String> vuelo7MAD = new ArrayList<>();vuelo7MAD.add("IBZ");vuelo7MAD.add("14:00");vuelo7MAD.add("16:45");vuelo7MAD.add("105");
        List<String> vuelo8MAD = new ArrayList<>();vuelo8MAD.add("MAH");vuelo8MAD.add("14:30");vuelo8MAD.add("17:15");vuelo8MAD.add("105");
        List<String> vuelo9MAD = new ArrayList<>();vuelo9MAD.add("TFS");vuelo9MAD.add("15:00");vuelo9MAD.add("17:45");vuelo9MAD.add("105");
        List<String> vuelo10MAD = new ArrayList<>();vuelo10MAD.add("TFN");vuelo10MAD.add("15:30");vuelo10MAD.add("18:15");vuelo10MAD.add("105");
        List<String> vuelo11MAD = new ArrayList<>();vuelo11MAD.add("GRX");vuelo11MAD.add("16:00");vuelo11MAD.add("18:45");vuelo11MAD.add("105");
        List<String> vuelo12MAD = new ArrayList<>();vuelo12MAD.add("SCQ");vuelo12MAD.add("16:30");vuelo12MAD.add("19:15");vuelo12MAD.add("105");
        List<String> vuelo13MAD = new ArrayList<>();vuelo13MAD.add("VGO");vuelo13MAD.add("17:00");vuelo13MAD.add("19:45");vuelo13MAD.add("105");
        List<String> vuelo14MAD = new ArrayList<>();vuelo14MAD.add("LCG");vuelo14MAD.add("17:30");vuelo14MAD.add("20:15");vuelo14MAD.add("105");
        List<String> vuelo15MAD = new ArrayList<>();vuelo15MAD.add("OVD");vuelo15MAD.add("18:00");vuelo15MAD.add("20:45");vuelo15MAD.add("105");
        List<String> vuelo16MAD = new ArrayList<>();vuelo16MAD.add("SDR");vuelo16MAD.add("18:30");vuelo16MAD.add("21:15");vuelo16MAD.add("105");
        List<String> vuelo17MAD = new ArrayList<>();vuelo17MAD.add("PNA");vuelo17MAD.add("19:00");vuelo17MAD.add("21:45");vuelo17MAD.add("105");
        List<String> vuelo18MAD = new ArrayList<>();vuelo18MAD.add("RJL");vuelo18MAD.add("19:30");vuelo18MAD.add("22:15");vuelo18MAD.add("105");
        List<String> vuelo19MAD = new ArrayList<>();vuelo19MAD.add("EAS");vuelo19MAD.add("20:00");vuelo19MAD.add("22:45");vuelo19MAD.add("105");
        List<String> vuelo20MAD = new ArrayList<>();vuelo20MAD.add("VIT");vuelo20MAD.add("20:30");vuelo20MAD.add("23:15");vuelo20MAD.add("105");
        List<String> vuelo21MAD = new ArrayList<>();vuelo21MAD.add("ZAZ");vuelo21MAD.add("21:00");vuelo21MAD.add("23:45");vuelo21MAD.add("105");
        List<String> vuelo22MAD = new ArrayList<>();vuelo22MAD.add("TEV");vuelo22MAD.add("21:30");vuelo22MAD.add("00:15");vuelo22MAD.add("105");
        List<String> vuelo23MAD = new ArrayList<>();vuelo23MAD.add("HSK");vuelo23MAD.add("22:00");vuelo23MAD.add("00:45");vuelo23MAD.add("105");
        List<String> vuelo24MAD = new ArrayList<>();vuelo24MAD.add("LEN");vuelo24MAD.add("22:30");vuelo24MAD.add("01:15");vuelo24MAD.add("105");
        List<String> vuelo25MAD = new ArrayList<>();vuelo25MAD.add("VLL");vuelo25MAD.add("23:00");vuelo25MAD.add("01:45");vuelo25MAD.add("105");
        List<String> vuelo26MAD = new ArrayList<>();vuelo26MAD.add("RGS");vuelo26MAD.add("23:30");vuelo26MAD.add("02:15");vuelo26MAD.add("105");
        List<String> vuelo27MAD = new ArrayList<>();vuelo27MAD.add("SLM");vuelo27MAD.add("00:00");vuelo27MAD.add("02:45");vuelo27MAD.add("105");
        List<String> vuelo28MAD = new ArrayList<>();vuelo28MAD.add("SVQ");vuelo28MAD.add("00:30");vuelo28MAD.add("03:15");vuelo28MAD.add("105");
        List<String> vuelo29MAD = new ArrayList<>();vuelo29MAD.add("VLC");vuelo29MAD.add("01:30");vuelo29MAD.add("04:15");vuelo29MAD.add("105");
        List<String> vuelo30MAD = new ArrayList<>();vuelo30MAD.add("BIO");vuelo30MAD.add("02:00");vuelo30MAD.add("04:45");vuelo30MAD.add("105");
        List<String> vuelo31MAD = new ArrayList<>();vuelo31MAD.add("AGP");vuelo31MAD.add("02:30");vuelo31MAD.add("05:15");vuelo31MAD.add("105");
        List<String> vuelo32MAD = new ArrayList<>();vuelo32MAD.add("ALC");vuelo32MAD.add("03:00");vuelo32MAD.add("05:45");vuelo32MAD.add("105");
        List<String>[] MAD = new List[]{vuelo1MAD, vuelo2MAD, vuelo3MAD, vuelo4MAD, vuelo5MAD, vuelo6MAD, vuelo7MAD, vuelo8MAD, vuelo9MAD, vuelo10MAD, vuelo11MAD, vuelo12MAD, vuelo13MAD, vuelo14MAD, vuelo15MAD, vuelo16MAD, vuelo17MAD, vuelo18MAD, vuelo19MAD, vuelo20MAD, vuelo21MAD, vuelo22MAD, vuelo23MAD, vuelo24MAD, vuelo25MAD, vuelo26MAD, vuelo27MAD, vuelo28MAD, vuelo29MAD, vuelo30MAD, vuelo31MAD, vuelo32MAD};
        agrupacion.put("MAD", List.of(MAD));
        // Aeropuerto Barcelona (BCN)
        List<String> vuelo1BCN = new ArrayList<>();vuelo1BCN.add("MAD");vuelo1BCN.add("07:30");vuelo1BCN.add("09:15");vuelo1BCN.add("105");
        List<String> vuelo2BCN = new ArrayList<>();vuelo2BCN.add("SVQ");vuelo2BCN.add("09:00");vuelo2BCN.add("10:45");vuelo2BCN.add("90");
        List<String> vuelo3BCN = new ArrayList<>();vuelo3BCN.add("PMI");vuelo3BCN.add("11:30");vuelo3BCN.add("13:45");vuelo3BCN.add("90");
        List<String> vuelo4BCN = new ArrayList<>();vuelo4BCN.add("LPA");vuelo4BCN.add("12:00");vuelo4BCN.add("14:30");vuelo4BCN.add("105");
        List<String> vuelo5BCN = new ArrayList<>();vuelo5BCN.add("FUE");vuelo5BCN.add("13:00");vuelo5BCN.add("15:45");vuelo5BCN.add("105");
        List<String> vuelo6BCN = new ArrayList<>();vuelo6BCN.add("ACE");vuelo6BCN.add("13:30");vuelo6BCN.add("16:15");vuelo6BCN.add("105");
        List<String> vuelo7BCN = new ArrayList<>();vuelo7BCN.add("IBZ");vuelo7BCN.add("14:00");vuelo7BCN.add("16:45");vuelo7BCN.add("105");
        List<String> vuelo8BCN = new ArrayList<>();vuelo8BCN.add("MAH");vuelo8BCN.add("14:30");vuelo8BCN.add("17:15");vuelo8BCN.add("105");
        List<String> vuelo9BCN = new ArrayList<>();vuelo9BCN.add("TFS");vuelo9BCN.add("15:00");vuelo9BCN.add("17:45");vuelo9BCN.add("105");
        List<String> vuelo10BCN = new ArrayList<>();vuelo10BCN.add("TFN");vuelo10BCN.add("15:30");vuelo10BCN.add("18:15");vuelo10BCN.add("105");
        List<String> vuelo11BCN = new ArrayList<>();vuelo11BCN.add("GRX");vuelo11BCN.add("16:00");vuelo11BCN.add("18:45");vuelo11BCN.add("105");
        List<String> vuelo12BCN = new ArrayList<>();vuelo12BCN.add("SCQ");vuelo12BCN.add("16:30");vuelo12BCN.add("19:15");vuelo12BCN.add("105");
        List<String> vuelo13BCN = new ArrayList<>();vuelo13BCN.add("VGO");vuelo13BCN.add("17:00");vuelo13BCN.add("19:45");vuelo13BCN.add("105");
        List<String> vuelo14BCN = new ArrayList<>();vuelo14BCN.add("LCG");vuelo14BCN.add("17:30");vuelo14BCN.add("20:15");vuelo14BCN.add("105");
        List<String> vuelo15BCN = new ArrayList<>();vuelo15BCN.add("OVD");vuelo15BCN.add("18:00");vuelo15BCN.add("20:45");vuelo15BCN.add("105");
        List<String> vuelo16BCN = new ArrayList<>();vuelo16BCN.add("SDR");vuelo16BCN.add("18:30");vuelo16BCN.add("21:15");vuelo16BCN.add("105");
        List<String> vuelo17BCN = new ArrayList<>();vuelo17BCN.add("PNA");vuelo17BCN.add("19:00");vuelo17BCN.add("21:45");vuelo17BCN.add("105");
        List<String> vuelo18BCN = new ArrayList<>();vuelo18BCN.add("RJL");vuelo18BCN.add("19:30");vuelo18BCN.add("22:15");vuelo18BCN.add("105");
        List<String> vuelo19BCN = new ArrayList<>();vuelo19BCN.add("EAS");vuelo19BCN.add("20:00");vuelo19BCN.add("22:45");vuelo19BCN.add("105");
        List<String> vuelo20BCN = new ArrayList<>();vuelo20BCN.add("VIT");vuelo20BCN.add("20:30");vuelo20BCN.add("23:15");vuelo20BCN.add("105");
        List<String> vuelo21BCN = new ArrayList<>();vuelo21BCN.add("ZAZ");vuelo21BCN.add("21:00");vuelo21BCN.add("23:45");vuelo21BCN.add("105");
        List<String> vuelo22BCN = new ArrayList<>();vuelo22BCN.add("TEV");vuelo22BCN.add("21:30");vuelo22BCN.add("00:15");vuelo22BCN.add("105");
        List<String> vuelo23BCN = new ArrayList<>();vuelo23BCN.add("HSK");vuelo23BCN.add("22:00");vuelo23BCN.add("00:45");vuelo23BCN.add("105");
        List<String> vuelo24BCN = new ArrayList<>();vuelo24BCN.add("LEN");vuelo24BCN.add("22:30");vuelo24BCN.add("01:15");vuelo24BCN.add("105");
        List<String> vuelo25BCN = new ArrayList<>();vuelo25BCN.add("VLL");vuelo25BCN.add("23:00");vuelo25BCN.add("01:45");vuelo25BCN.add("105");
        List<String> vuelo26BCN = new ArrayList<>();vuelo26BCN.add("RGS");vuelo26BCN.add("23:30");vuelo26BCN.add("02:15");vuelo26BCN.add("105");
        List<String> vuelo27BCN = new ArrayList<>();vuelo27BCN.add("SLM");vuelo27BCN.add("00:00");vuelo27BCN.add("02:45");vuelo27BCN.add("105");
        List<String> vuelo28BCN = new ArrayList<>();vuelo28BCN.add("SVQ");vuelo28BCN.add("00:30");vuelo28BCN.add("03:15");vuelo28BCN.add("105");
        List<String> vuelo29BCN = new ArrayList<>();vuelo29BCN.add("VLC");vuelo29BCN.add("01:30");vuelo29BCN.add("04:15");vuelo29BCN.add("105");
        List<String> vuelo30BCN = new ArrayList<>();vuelo30BCN.add("BIO");vuelo30BCN.add("02:00");vuelo30BCN.add("04:45");vuelo30BCN.add("105");
        List<String> vuelo31BCN = new ArrayList<>();vuelo31BCN.add("AGP");vuelo31BCN.add("02:30");vuelo31BCN.add("05:15");vuelo31BCN.add("105");
        List<String> vuelo32BCN = new ArrayList<>();vuelo32BCN.add("ALC");vuelo32BCN.add("03:00");vuelo32BCN.add("05:45");vuelo32BCN.add("105");
        List<String>[] BCN = new List[]{vuelo1BCN, vuelo2BCN, vuelo3BCN, vuelo4BCN, vuelo5BCN, vuelo6BCN, vuelo7BCN, vuelo8BCN, vuelo9BCN, vuelo10BCN, vuelo11BCN, vuelo12BCN, vuelo13BCN, vuelo14BCN, vuelo15BCN, vuelo16BCN, vuelo17BCN, vuelo18BCN, vuelo19BCN, vuelo20BCN, vuelo21BCN, vuelo22BCN, vuelo23BCN, vuelo24BCN, vuelo25BCN, vuelo26BCN, vuelo27BCN, vuelo28BCN, vuelo29BCN, vuelo30BCN, vuelo31BCN, vuelo32BCN};
        agrupacion.put("BCN", List.of(BCN));
        // Aeropuerto Valencia (VLC)
        List<String> vuelo1VLC = new ArrayList<>();vuelo1VLC.add("MAD");vuelo1VLC.add("07:30");vuelo1VLC.add("09:15");vuelo1VLC.add("105");
        List<String> vuelo2VLC = new ArrayList<>();vuelo2VLC.add("SVQ");vuelo2VLC.add("09:00");vuelo2VLC.add("10:45");vuelo2VLC.add("90");
        List<String> vuelo3VLC = new ArrayList<>();vuelo3VLC.add("PMI");vuelo3VLC.add("11:30");vuelo3VLC.add("13:45");vuelo3VLC.add("90");
        List<String> vuelo4VLC = new ArrayList<>();vuelo4VLC.add("LPA");vuelo4VLC.add("12:00");vuelo4VLC.add("14:30");vuelo4VLC.add("105");
        List<String> vuelo5VLC = new ArrayList<>();vuelo5VLC.add("FUE");vuelo5VLC.add("13:00");vuelo5VLC.add("15:45");vuelo5VLC.add("105");
        List<String> vuelo6VLC = new ArrayList<>();vuelo6VLC.add("ACE");vuelo6VLC.add("13:30");vuelo6VLC.add("16:15");vuelo6VLC.add("105");
        List<String> vuelo7VLC = new ArrayList<>();vuelo7VLC.add("IBZ");vuelo7VLC.add("14:00");vuelo7VLC.add("16:45");vuelo7VLC.add("105");
        List<String> vuelo8VLC = new ArrayList<>();vuelo8VLC.add("MAH");vuelo8VLC.add("14:30");vuelo8VLC.add("17:15");vuelo8VLC.add("105");
        List<String> vuelo9VLC = new ArrayList<>();vuelo9VLC.add("TFS");vuelo9VLC.add("15:00");vuelo9VLC.add("17:45");vuelo9VLC.add("105");
        List<String> vuelo10VLC = new ArrayList<>();vuelo10VLC.add("TFN");vuelo10VLC.add("15:30");vuelo10VLC.add("18:15");vuelo10VLC.add("105");
        List<String> vuelo11VLC = new ArrayList<>();vuelo11VLC.add("GRX");vuelo11VLC.add("16:00");vuelo11VLC.add("18:45");vuelo11VLC.add("105");
        List<String> vuelo12VLC = new ArrayList<>();vuelo12VLC.add("SCQ");vuelo12VLC.add("16:30");vuelo12VLC.add("19:15");vuelo12VLC.add("105");
        List<String> vuelo13VLC = new ArrayList<>();vuelo13VLC.add("VGO");vuelo13VLC.add("17:00");vuelo13VLC.add("19:45");vuelo13VLC.add("105");
        List<String> vuelo14VLC = new ArrayList<>();vuelo14VLC.add("LCG");vuelo14VLC.add("17:30");vuelo14VLC.add("20:15");vuelo14VLC.add("105");
        List<String> vuelo15VLC = new ArrayList<>();vuelo15VLC.add("OVD");vuelo15VLC.add("18:00");vuelo15VLC.add("20:45");vuelo15VLC.add("105");
        List<String> vuelo16VLC = new ArrayList<>();vuelo16VLC.add("SDR");vuelo16VLC.add("18:30");vuelo16VLC.add("21:15");vuelo16VLC.add("105");
        List<String> vuelo17VLC = new ArrayList<>();vuelo17VLC.add("PNA");vuelo17VLC.add("19:00");vuelo17VLC.add("21:45");vuelo17VLC.add("105");
        List<String> vuelo18VLC = new ArrayList<>();vuelo18VLC.add("RJL");vuelo18VLC.add("19:30");vuelo18VLC.add("22:15");vuelo18VLC.add("105");
        List<String> vuelo19VLC = new ArrayList<>();vuelo19VLC.add("EAS");vuelo19VLC.add("20:00");vuelo19VLC.add("22:45");vuelo19VLC.add("105");
        List<String> vuelo20VLC = new ArrayList<>();vuelo20VLC.add("VIT");vuelo20VLC.add("20:30");vuelo20VLC.add("23:15");vuelo20VLC.add("105");
        List<String> vuelo21VLC = new ArrayList<>();vuelo21VLC.add("ZAZ");vuelo21VLC.add("21:00");vuelo21VLC.add("23:45");vuelo21VLC.add("105");
        List<String> vuelo22VLC = new ArrayList<>();vuelo22VLC.add("TEV");vuelo22VLC.add("21:30");vuelo22VLC.add("00:15");vuelo22VLC.add("105");
        List<String> vuelo23VLC = new ArrayList<>();vuelo23VLC.add("HSK");vuelo23VLC.add("22:00");vuelo23VLC.add("00:45");vuelo23VLC.add("105");
        List<String> vuelo24VLC = new ArrayList<>();vuelo24VLC.add("LEN");vuelo24VLC.add("22:30");vuelo24VLC.add("01:15");vuelo24VLC.add("105");
        List<String> vuelo25VLC = new ArrayList<>();vuelo25VLC.add("VLL");vuelo25VLC.add("23:00");vuelo25VLC.add("01:45");vuelo25VLC.add("105");
        List<String> vuelo26VLC = new ArrayList<>();vuelo26VLC.add("RGS");vuelo26VLC.add("23:30");vuelo26VLC.add("02:15");vuelo26VLC.add("105");
        List<String> vuelo27VLC = new ArrayList<>();vuelo27VLC.add("SLM");vuelo27VLC.add("00:00");vuelo27VLC.add("02:45");vuelo27VLC.add("105");
        List<String> vuelo28VLC = new ArrayList<>();vuelo28VLC.add("SVQ");vuelo28VLC.add("00:30");vuelo28VLC.add("03:15");vuelo28VLC.add("105");
        List<String> vuelo29VLC = new ArrayList<>();vuelo29VLC.add("BCN");vuelo29VLC.add("07:30");vuelo29VLC.add("09:15");vuelo29VLC.add("105");
        List<String> vuelo30VLC = new ArrayList<>();vuelo30VLC.add("BIO");vuelo30VLC.add("02:00");vuelo30VLC.add("04:45");vuelo30VLC.add("105");
        List<String> vuelo31VLC = new ArrayList<>();vuelo31VLC.add("AGP");vuelo31VLC.add("02:30");vuelo31VLC.add("05:15");vuelo31VLC.add("105");
        List<String> vuelo32VLC = new ArrayList<>();vuelo32VLC.add("ALC");vuelo32VLC.add("03:00");vuelo32VLC.add("05:45");vuelo32VLC.add("105");
        List<String>[] VLC = new List[]{vuelo1VLC, vuelo2VLC, vuelo3VLC, vuelo4VLC, vuelo5VLC, vuelo6VLC, vuelo7VLC, vuelo8VLC, vuelo9VLC, vuelo10VLC, vuelo11VLC, vuelo12VLC, vuelo13VLC, vuelo14VLC, vuelo15VLC, vuelo16VLC, vuelo17VLC, vuelo18VLC, vuelo19VLC, vuelo20VLC, vuelo21VLC, vuelo22VLC, vuelo23VLC, vuelo24VLC, vuelo25VLC, vuelo26VLC, vuelo27VLC, vuelo28VLC, vuelo29VLC, vuelo30VLC, vuelo31VLC, vuelo32VLC};
        agrupacion.put("VLC", List.of(VLC));

        // Aeropuerto Bilbao (BIO)

        List<String> vuelo1BIO = new ArrayList<>();vuelo1BIO.add("MAD");vuelo1BIO.add("09:00");vuelo1BIO.add("10:30");vuelo1BIO.add("90");
        List<String> vuelo2BIO = new ArrayList<>();vuelo2BIO.add("SVQ");vuelo2BIO.add("11:00");vuelo2BIO.add("12:45");vuelo2BIO.add("90");
        List<String> vuelo3BIO = new ArrayList<>();vuelo3BIO.add("BCN");vuelo3BIO.add("14:30");vuelo3BIO.add("16:15");vuelo3BIO.add("90");
        List<String> vuelo4BIO = new ArrayList<>();vuelo4BIO.add("AGP");vuelo4BIO.add("15:00");vuelo4BIO.add("16:45");vuelo4BIO.add("90");
        List<String> vuelo5BIO = new ArrayList<>();vuelo5BIO.add("ALC");vuelo5BIO.add("16:30");vuelo5BIO.add("18:15");vuelo5BIO.add("90");
        List<String> vuelo6BIO = new ArrayList<>();vuelo6BIO.add("PMI");vuelo6BIO.add("17:00");vuelo6BIO.add("18:45");vuelo6BIO.add("90");
        List<String> vuelo7BIO = new ArrayList<>();vuelo7BIO.add("LPA");vuelo7BIO.add("18:30");vuelo7BIO.add("20:15");vuelo7BIO.add("90");
        List<String> vuelo8BIO = new ArrayList<>();vuelo8BIO.add("TFS");vuelo8BIO.add("19:00");vuelo8BIO.add("20:45");vuelo8BIO.add("90");
        List<String> vuelo9BIO = new ArrayList<>();vuelo9BIO.add("TFN");vuelo9BIO.add("20:30");vuelo9BIO.add("22:15");vuelo9BIO.add("90");
        List<String> vuelo10BIO = new ArrayList<>();vuelo10BIO.add("GRX");vuelo10BIO.add("21:00");vuelo10BIO.add("22:45");vuelo10BIO.add("90");
        List<String> vuelo11BIO = new ArrayList<>();vuelo11BIO.add("SCQ");vuelo11BIO.add("21:30");vuelo11BIO.add("23:15");vuelo11BIO.add("90");
        List<String> vuelo12BIO = new ArrayList<>();vuelo12BIO.add("VGO");vuelo12BIO.add("22:00");vuelo12BIO.add("23:45");vuelo12BIO.add("90");
        List<String> vuelo13BIO = new ArrayList<>();vuelo13BIO.add("LCG");vuelo13BIO.add("22:30");vuelo13BIO.add("00:15");vuelo13BIO.add("90");
        List<String> vuelo14BIO = new ArrayList<>();vuelo14BIO.add("OVD");vuelo14BIO.add("23:00");vuelo14BIO.add("00:45");vuelo14BIO.add("90");
        List<String> vuelo15BIO = new ArrayList<>();vuelo15BIO.add("SDR");vuelo15BIO.add("23:30");vuelo15BIO.add("01:15");vuelo15BIO.add("90");
        List<String> vuelo16BIO = new ArrayList<>();vuelo16BIO.add("PNA");vuelo16BIO.add("00:00");vuelo16BIO.add("01:45");vuelo16BIO.add("90");
        List<String> vuelo17BIO = new ArrayList<>();vuelo17BIO.add("RJL");vuelo17BIO.add("00:30");vuelo17BIO.add("02:15");vuelo17BIO.add("90");
        List<String> vuelo18BIO = new ArrayList<>();vuelo18BIO.add("EAS");vuelo18BIO.add("01:00");vuelo18BIO.add("02:45");vuelo18BIO.add("90");
        List<String> vuelo19BIO = new ArrayList<>();vuelo19BIO.add("VIT");vuelo19BIO.add("01:30");vuelo19BIO.add("03:15");vuelo19BIO.add("90");
        List<String> vuelo20BIO = new ArrayList<>();vuelo20BIO.add("ZAZ");vuelo20BIO.add("02:00");vuelo20BIO.add("03:45");vuelo20BIO.add("90");
        List<String> vuelo21BIO = new ArrayList<>();vuelo21BIO.add("TEV");vuelo21BIO.add("02:30");vuelo21BIO.add("04:15");vuelo21BIO.add("90");
        List<String> vuelo22BIO = new ArrayList<>();vuelo22BIO.add("HSK");vuelo22BIO.add("03:00");vuelo22BIO.add("04:45");vuelo22BIO.add("90");
        List<String> vuelo23BIO = new ArrayList<>();vuelo23BIO.add("LEN");vuelo23BIO.add("03:30");vuelo23BIO.add("05:15");vuelo23BIO.add("90");
        List<String> vuelo24BIO = new ArrayList<>();vuelo24BIO.add("VLL");vuelo24BIO.add("04:00");vuelo24BIO.add("05:45");vuelo24BIO.add("90");
        List<String> vuelo25BIO = new ArrayList<>();vuelo25BIO.add("RGS");vuelo25BIO.add("04:30");vuelo25BIO.add("06:15");vuelo25BIO.add("90");
        List<String> vuelo26BIO = new ArrayList<>();vuelo26BIO.add("SLM");vuelo26BIO.add("05:00");vuelo26BIO.add("06:45");vuelo26BIO.add("90");
        List<String> vuelo27BIO = new ArrayList<>();vuelo27BIO.add("SVQ");vuelo27BIO.add("05:30");vuelo27BIO.add("07:15");vuelo27BIO.add("105");
        List<String> vuelo28BIO = new ArrayList<>();vuelo28BIO.add("VLC");vuelo28BIO.add("06:00");vuelo28BIO.add("07:45");vuelo28BIO.add("105");
        List<String> vuelo29BIO = new ArrayList<>();vuelo29BIO.add("BCN");vuelo29BIO.add("06:30");vuelo29BIO.add("08:15");vuelo29BIO.add("105");
        List<String> vuelo30BIO = new ArrayList<>();vuelo30BIO.add("AGP");vuelo30BIO.add("07:00");vuelo30BIO.add("08:45");vuelo30BIO.add("105");
        List<String> vuelo31BIO = new ArrayList<>();vuelo31BIO.add("ALC");vuelo31BIO.add("07:30");vuelo31BIO.add("09:15");vuelo31BIO.add("105");
        List<String> vuelo32BIO = new ArrayList<>();vuelo32BIO.add("PMI");vuelo32BIO.add("08:00");vuelo32BIO.add("09:45");vuelo32BIO.add("105");
        List<String>[] BIO = new List[]{vuelo1BIO, vuelo2BIO, vuelo3BIO, vuelo4BIO, vuelo5BIO, vuelo6BIO, vuelo7BIO, vuelo8BIO, vuelo9BIO, vuelo10BIO, vuelo11BIO, vuelo12BIO, vuelo13BIO, vuelo14BIO, vuelo15BIO, vuelo16BIO, vuelo17BIO, vuelo18BIO, vuelo19BIO, vuelo20BIO, vuelo21BIO, vuelo22BIO, vuelo23BIO, vuelo24BIO, vuelo25BIO, vuelo26BIO, vuelo27BIO, vuelo28BIO, vuelo29BIO, vuelo30BIO, vuelo31BIO, vuelo32BIO};
        agrupacion.put("BIO", List.of(BIO));

        // Aeropuerto Málaga (AGP)
        List<String> vuelo1AGP = new ArrayList<>();vuelo1AGP.add("MAD");vuelo1AGP.add("09:00");vuelo1AGP.add("10:30");vuelo1AGP.add("90");
        List<String> vuelo2AGP = new ArrayList<>();vuelo2AGP.add("SVQ");vuelo2AGP.add("11:00");vuelo2AGP.add("12:45");vuelo2AGP.add("90");
        List<String> vuelo3AGP = new ArrayList<>();vuelo3AGP.add("BCN");vuelo3AGP.add("14:30");vuelo3AGP.add("16:15");vuelo3AGP.add("90");
        List<String> vuelo4AGP = new ArrayList<>();vuelo4AGP.add("AGP");vuelo4AGP.add("15:00");vuelo4AGP.add("16:45");vuelo4AGP.add("90");
        List<String> vuelo5AGP = new ArrayList<>();vuelo5AGP.add("ALC");vuelo5AGP.add("16:30");vuelo5AGP.add("18:15");vuelo5AGP.add("90");
        List<String> vuelo6AGP = new ArrayList<>();vuelo6AGP.add("PMI");vuelo6AGP.add("17:00");vuelo6AGP.add("18:45");vuelo6AGP.add("90");
        List<String> vuelo7AGP = new ArrayList<>();vuelo7AGP.add("LPA");vuelo7AGP.add("18:30");vuelo7AGP.add("20:15");vuelo7AGP.add("90");
        List<String> vuelo8AGP = new ArrayList<>();vuelo8AGP.add("TFS");vuelo8AGP.add("19:00");vuelo8AGP.add("20:45");vuelo8AGP.add("90");
        List<String> vuelo9AGP = new ArrayList<>();vuelo9AGP.add("TFN");vuelo9AGP.add("20:30");vuelo9AGP.add("22:15");vuelo9AGP.add("90");
        List<String> vuelo10AGP = new ArrayList<>();vuelo10AGP.add("GRX");vuelo10AGP.add("21:00");vuelo10AGP.add("22:45");vuelo10AGP.add("90");
        List<String> vuelo11AGP = new ArrayList<>();vuelo11AGP.add("SCQ");vuelo11AGP.add("21:30");vuelo11AGP.add("23:15");vuelo11AGP.add("90");
        List<String> vuelo12AGP = new ArrayList<>();vuelo12AGP.add("VGO");vuelo12AGP.add("22:00");vuelo12AGP.add("23:45");vuelo12AGP.add("90");
        List<String> vuelo13AGP = new ArrayList<>();vuelo13AGP.add("LCG");vuelo13AGP.add("22:30");vuelo13AGP.add("00:15");vuelo13AGP.add("90");
        List<String> vuelo14AGP = new ArrayList<>();vuelo14AGP.add("OVD");vuelo14AGP.add("23:00");vuelo14AGP.add("00:45");vuelo14AGP.add("90");
        List<String> vuelo15AGP = new ArrayList<>();vuelo15AGP.add("SDR");vuelo15AGP.add("23:30");vuelo15AGP.add("01:15");vuelo15AGP.add("90");
        List<String> vuelo16AGP = new ArrayList<>();vuelo16AGP.add("PNA");vuelo16AGP.add("00:00");vuelo16AGP.add("01:45");vuelo16AGP.add("90");
        List<String> vuelo17AGP = new ArrayList<>();vuelo17AGP.add("RJL");vuelo17AGP.add("00:30");vuelo17AGP.add("02:15");vuelo17AGP.add("90");
        List<String> vuelo18AGP = new ArrayList<>();vuelo18AGP.add("EAS");vuelo18AGP.add("01:00");vuelo18AGP.add("02:45");vuelo18AGP.add("90");
        List<String> vuelo19AGP = new ArrayList<>();vuelo19AGP.add("VIT");vuelo19AGP.add("01:30");vuelo19AGP.add("03:15");vuelo19AGP.add("90");
        List<String> vuelo20AGP = new ArrayList<>();vuelo20AGP.add("ZAZ");vuelo20AGP.add("02:00");vuelo20AGP.add("03:45");vuelo20AGP.add("90");
        List<String> vuelo21AGP = new ArrayList<>();vuelo21AGP.add("TEV");vuelo21AGP.add("02:30");vuelo21AGP.add("04:15");vuelo21AGP.add("90");
        List<String> vuelo22AGP = new ArrayList<>();vuelo22AGP.add("HSK");vuelo22AGP.add("03:00");vuelo22AGP.add("04:45");vuelo22AGP.add("90");
        List<String> vuelo23AGP = new ArrayList<>();vuelo23AGP.add("LEN");vuelo23AGP.add("03:30");vuelo23AGP.add("05:15");vuelo23AGP.add("90");
        List<String> vuelo24AGP = new ArrayList<>();vuelo24AGP.add("VLL");vuelo24AGP.add("04:00");vuelo24AGP.add("05:45");vuelo24AGP.add("90");
        List<String> vuelo25AGP = new ArrayList<>();vuelo25AGP.add("RGS");vuelo25AGP.add("04:30");vuelo25AGP.add("06:15");vuelo25AGP.add("90");
        List<String> vuelo26AGP = new ArrayList<>();vuelo26AGP.add("SLM");vuelo26AGP.add("05:00");vuelo26AGP.add("06:45");vuelo26AGP.add("90");
        List<String> vuelo27AGP = new ArrayList<>();vuelo27AGP.add("SVQ");vuelo27AGP.add("05:30");vuelo27AGP.add("07:15");vuelo27AGP.add("105");
        List<String> vuelo28AGP = new ArrayList<>();vuelo28AGP.add("VLC");vuelo28AGP.add("06:00");vuelo28AGP.add("07:45");vuelo28AGP.add("105");
        List<String> vuelo29AGP = new ArrayList<>();vuelo29AGP.add("BCN");vuelo29AGP.add("06:30");vuelo29AGP.add("08:15");vuelo29AGP.add("105");
        List<String> vuelo30AGP = new ArrayList<>();vuelo30AGP.add("BIO");vuelo30AGP.add("02:00");vuelo30AGP.add("04:45");vuelo30AGP.add("105");
        List<String> vuelo31AGP = new ArrayList<>();vuelo31AGP.add("ALC");vuelo31AGP.add("07:30");vuelo31AGP.add("09:15");vuelo31AGP.add("105");
        List<String> vuelo32AGP = new ArrayList<>();vuelo32AGP.add("PMI");vuelo32AGP.add("08:00");vuelo32AGP.add("09:45");vuelo32AGP.add("105");
        List<String>[] AGP = new List[]{vuelo1AGP, vuelo2AGP, vuelo3AGP, vuelo4AGP, vuelo5AGP, vuelo6AGP, vuelo7AGP, vuelo8AGP, vuelo9AGP, vuelo10AGP, vuelo11AGP, vuelo12AGP, vuelo13AGP, vuelo14AGP, vuelo15AGP, vuelo16AGP, vuelo17AGP, vuelo18AGP, vuelo19AGP, vuelo20AGP, vuelo21AGP, vuelo22AGP, vuelo23AGP, vuelo24AGP, vuelo25AGP, vuelo26AGP, vuelo27AGP, vuelo28AGP, vuelo29AGP, vuelo30AGP, vuelo31AGP, vuelo32AGP};
        agrupacion.put("AGP", List.of(AGP));
        // Aeropuerto Alicante (ALC)
        List<String> vuelo1ALC = new ArrayList<>();vuelo1ALC.add("MAD");vuelo1ALC.add("08:00");vuelo1ALC.add("09:30");vuelo1ALC.add("90");
        List<String> vuelo2ALC = new ArrayList<>();vuelo2ALC.add("BCN");vuelo2ALC.add("10:30");vuelo2ALC.add("12:15");vuelo2ALC.add("105");
        List<String> vuelo3ALC = new ArrayList<>();vuelo3ALC.add("SVQ");vuelo3ALC.add("14:00");vuelo3ALC.add("15:45");vuelo3ALC.add("105");
        List<String> vuelo4ALC = new ArrayList<>();vuelo4ALC.add("PMI");vuelo4ALC.add("15:30");vuelo4ALC.add("17:15");vuelo4ALC.add("105");
        List<String> vuelo5ALC = new ArrayList<>();vuelo5ALC.add("LPA");vuelo5ALC.add("16:00");vuelo5ALC.add("17:45");vuelo5ALC.add("105");
        List<String> vuelo6ALC = new ArrayList<>();vuelo6ALC.add("TFN");vuelo6ALC.add("17:30");vuelo6ALC.add("19:15");vuelo6ALC.add("105");
        List<String> vuelo7ALC = new ArrayList<>();vuelo7ALC.add("GRX");vuelo7ALC.add("18:00");vuelo7ALC.add("19:45");vuelo7ALC.add("105");
        List<String> vuelo8ALC = new ArrayList<>();vuelo8ALC.add("SCQ");vuelo8ALC.add("18:30");vuelo8ALC.add("20:15");vuelo8ALC.add("105");
        List<String> vuelo9ALC = new ArrayList<>();vuelo9ALC.add("VGO");vuelo9ALC.add("19:00");vuelo9ALC.add("20:45");vuelo9ALC.add("105");
        List<String> vuelo10ALC = new ArrayList<>();vuelo10ALC.add("LCG");vuelo10ALC.add("19:30");vuelo10ALC.add("21:15");vuelo10ALC.add("105");
        List<String> vuelo11ALC = new ArrayList<>();vuelo11ALC.add("OVD");vuelo11ALC.add("20:00");vuelo11ALC.add("21:45");vuelo11ALC.add("105");
        List<String> vuelo12ALC = new ArrayList<>();vuelo12ALC.add("SDR");vuelo12ALC.add("20:30");vuelo12ALC.add("22:15");vuelo12ALC.add("105");
        List<String> vuelo13ALC = new ArrayList<>();vuelo13ALC.add("PNA");vuelo13ALC.add("21:00");vuelo13ALC.add("22:45");vuelo13ALC.add("105");
        List<String> vuelo14ALC = new ArrayList<>();vuelo14ALC.add("RJL");vuelo14ALC.add("21:30");vuelo14ALC.add("23:15");vuelo14ALC.add("105");
        List<String> vuelo15ALC = new ArrayList<>();vuelo15ALC.add("EAS");vuelo15ALC.add("22:00");vuelo15ALC.add("23:45");vuelo15ALC.add("105");
        List<String> vuelo16ALC = new ArrayList<>();vuelo16ALC.add("VIT");vuelo16ALC.add("22:30");vuelo16ALC.add("00:15");vuelo16ALC.add("105");
        List<String> vuelo17ALC = new ArrayList<>();vuelo17ALC.add("ZAZ");vuelo17ALC.add("23:00");vuelo17ALC.add("00:45");vuelo17ALC.add("105");
        List<String> vuelo18ALC = new ArrayList<>();vuelo18ALC.add("TEV");vuelo18ALC.add("23:30");vuelo18ALC.add("01:15");vuelo18ALC.add("105");
        List<String> vuelo19ALC = new ArrayList<>();vuelo19ALC.add("HSK");vuelo19ALC.add("00:00");vuelo19ALC.add("01:45");vuelo19ALC.add("105");
        List<String> vuelo20ALC = new ArrayList<>();vuelo20ALC.add("LEN");vuelo20ALC.add("00:30");vuelo20ALC.add("02:15");vuelo20ALC.add("105");
        List<String> vuelo21ALC = new ArrayList<>();vuelo21ALC.add("VLL");vuelo21ALC.add("01:00");vuelo21ALC.add("02:45");vuelo21ALC.add("105");
        List<String> vuelo22ALC = new ArrayList<>();vuelo22ALC.add("RGS");vuelo22ALC.add("01:30");vuelo22ALC.add("03:15");vuelo22ALC.add("105");
        List<String> vuelo23ALC = new ArrayList<>();vuelo23ALC.add("SLM");vuelo23ALC.add("02:00");vuelo23ALC.add("03:45");vuelo23ALC.add("105");
        List<String> vuelo24ALC = new ArrayList<>();vuelo24ALC.add("SVQ");vuelo24ALC.add("02:30");vuelo24ALC.add("05:15");vuelo24ALC.add("105");
        List<String> vuelo25ALC = new ArrayList<>();vuelo25ALC.add("VLC");vuelo25ALC.add("03:00");vuelo25ALC.add("05:45");vuelo25ALC.add("105");
        List<String> vuelo26ALC = new ArrayList<>();vuelo26ALC.add("BCN");vuelo26ALC.add("03:30");vuelo26ALC.add("06:15");vuelo26ALC.add("105");
        List<String> vuelo27ALC = new ArrayList<>();vuelo27ALC.add("BIO");vuelo27ALC.add("04:00");vuelo27ALC.add("06:45");vuelo27ALC.add("105");
        List<String> vuelo28ALC = new ArrayList<>();vuelo28ALC.add("AGP");vuelo28ALC.add("04:30");vuelo28ALC.add("07:15");vuelo28ALC.add("105");
        List<String> vuelo29ALC = new ArrayList<>();vuelo29ALC.add("PMI");vuelo29ALC.add("05:00");vuelo29ALC.add("07:45");vuelo29ALC.add("105");
        List<String> vuelo30ALC = new ArrayList<>();vuelo30ALC.add("LPA");vuelo30ALC.add("05:30");vuelo30ALC.add("08:15");vuelo30ALC.add("105");
        List<String> vuelo31ALC = new ArrayList<>();vuelo31ALC.add("TFS");vuelo31ALC.add("06:00");vuelo31ALC.add("08:45");vuelo31ALC.add("105");
        List<String> vuelo32ALC = new ArrayList<>();vuelo32ALC.add("TFN");vuelo32ALC.add("06:30");vuelo32ALC.add("09:15");vuelo32ALC.add("105");
        List<String> vuelo33ALC = new ArrayList<>();vuelo33ALC.add("GRX");vuelo33ALC.add("07:00");vuelo33ALC.add("09:45");vuelo33ALC.add("105");
        List<String>[] ALC = new List[]{vuelo1ALC, vuelo2ALC, vuelo3ALC, vuelo4ALC, vuelo5ALC, vuelo6ALC, vuelo7ALC, vuelo8ALC, vuelo9ALC, vuelo10ALC, vuelo11ALC, vuelo12ALC, vuelo13ALC, vuelo14ALC, vuelo15ALC, vuelo16ALC, vuelo17ALC, vuelo18ALC, vuelo19ALC, vuelo20ALC, vuelo21ALC, vuelo22ALC, vuelo23ALC, vuelo24ALC, vuelo25ALC, vuelo26ALC, vuelo27ALC, vuelo28ALC, vuelo29ALC, vuelo30ALC, vuelo31ALC, vuelo32ALC, vuelo33ALC};
        agrupacion.put("ALC", List.of(ALC));
        // Aeropuerto Palma de Mallorca (PMI)
        List<String> vuelo1PMI = new ArrayList<>();vuelo1PMI.add("BCN");vuelo1PMI.add("07:30");vuelo1PMI.add("09:15");vuelo1PMI.add("105");
        List<String> vuelo2PMI = new ArrayList<>();vuelo2PMI.add("MAD");vuelo2PMI.add("10:00");vuelo2PMI.add("11:45");vuelo2PMI.add("105");
        List<String> vuelo3PMI = new ArrayList<>();vuelo3PMI.add("AGP");vuelo3PMI.add("14:30");vuelo3PMI.add("16:15");vuelo3PMI.add("105");
        List<String> vuelo4PMI = new ArrayList<>();vuelo4PMI.add("ALC");vuelo4PMI.add("15:00");vuelo4PMI.add("16:45");vuelo4PMI.add("105");
        List<String> vuelo5PMI = new ArrayList<>();vuelo5PMI.add("SVQ");vuelo5PMI.add("16:30");vuelo5PMI.add("18:15");vuelo5PMI.add("105");
        List<String> vuelo6PMI = new ArrayList<>();vuelo6PMI.add("LPA");vuelo6PMI.add("17:00");vuelo6PMI.add("18:45");vuelo6PMI.add("105");
        List<String> vuelo7PMI = new ArrayList<>();vuelo7PMI.add("TFN");vuelo7PMI.add("18:30");vuelo7PMI.add("20:15");vuelo7PMI.add("105");
        List<String> vuelo8PMI = new ArrayList<>();vuelo8PMI.add("GRX");vuelo8PMI.add("19:00");vuelo8PMI.add("20:45");vuelo8PMI.add("105");
        List<String> vuelo9PMI = new ArrayList<>();vuelo9PMI.add("SCQ");vuelo9PMI.add("19:30");vuelo9PMI.add("21:15");vuelo9PMI.add("105");
        List<String> vuelo10PMI = new ArrayList<>();vuelo10PMI.add("VGO");vuelo10PMI.add("20:00");vuelo10PMI.add("21:45");vuelo10PMI.add("105");
        List<String> vuelo11PMI = new ArrayList<>();vuelo11PMI.add("LCG");vuelo11PMI.add("20:30");vuelo11PMI.add("22:15");vuelo11PMI.add("105");
        List<String> vuelo12PMI = new ArrayList<>();vuelo12PMI.add("OVD");vuelo12PMI.add("21:00");vuelo12PMI.add("22:45");vuelo12PMI.add("105");
        List<String> vuelo13PMI = new ArrayList<>();vuelo13PMI.add("SDR");vuelo13PMI.add("21:30");vuelo13PMI.add("23:15");vuelo13PMI.add("105");
        List<String> vuelo14PMI = new ArrayList<>();vuelo14PMI.add("PNA");vuelo14PMI.add("22:00");vuelo14PMI.add("23:45");vuelo14PMI.add("105");
        List<String> vuelo15PMI = new ArrayList<>();vuelo15PMI.add("RJL");vuelo15PMI.add("22:30");vuelo15PMI.add("00:15");vuelo15PMI.add("105");
        List<String> vuelo16PMI = new ArrayList<>();vuelo16PMI.add("EAS");vuelo16PMI.add("23:00");vuelo16PMI.add("00:45");vuelo16PMI.add("105");
        List<String> vuelo17PMI = new ArrayList<>();vuelo17PMI.add("VIT");vuelo17PMI.add("23:30");vuelo17PMI.add("01:15");vuelo17PMI.add("105");
        List<String> vuelo18PMI = new ArrayList<>();vuelo18PMI.add("ZAZ");vuelo18PMI.add("00:00");vuelo18PMI.add("01:45");vuelo18PMI.add("105");
        List<String> vuelo19PMI = new ArrayList<>();vuelo19PMI.add("TEV");vuelo19PMI.add("00:30");vuelo19PMI.add("02:15");vuelo19PMI.add("105");
        List<String> vuelo20PMI = new ArrayList<>();vuelo20PMI.add("HSK");vuelo20PMI.add("01:00");vuelo20PMI.add("02:45");vuelo20PMI.add("105");
        List<String> vuelo21PMI = new ArrayList<>();vuelo21PMI.add("LEN");vuelo21PMI.add("01:30");vuelo21PMI.add("03:15");vuelo21PMI.add("105");
        List<String> vuelo22PMI = new ArrayList<>();vuelo22PMI.add("VLL");vuelo22PMI.add("02:00");vuelo22PMI.add("03:45");vuelo22PMI.add("105");
        List<String> vuelo23PMI = new ArrayList<>();vuelo23PMI.add("RGS");vuelo23PMI.add("02:30");vuelo23PMI.add("04:15");vuelo23PMI.add("105");
        List<String> vuelo24PMI = new ArrayList<>();vuelo24PMI.add("SLM");vuelo24PMI.add("03:00");vuelo24PMI.add("04:45");vuelo24PMI.add("105");
        List<String> vuelo25PMI = new ArrayList<>();vuelo25PMI.add("SVQ");vuelo25PMI.add("03:30");vuelo25PMI.add("05:15");vuelo25PMI.add("105");
        List<String> vuelo26PMI = new ArrayList<>();vuelo26PMI.add("VLC");vuelo26PMI.add("04:00");vuelo26PMI.add("05:45");vuelo26PMI.add("105");
        List<String> vuelo27PMI = new ArrayList<>();vuelo27PMI.add("BCN");vuelo27PMI.add("04:30");vuelo27PMI.add("06:15");vuelo27PMI.add("105");
        List<String> vuelo28PMI = new ArrayList<>();vuelo28PMI.add("BIO");vuelo28PMI.add("05:00");vuelo28PMI.add("06:45");vuelo28PMI.add("105");
        List<String> vuelo29PMI = new ArrayList<>();vuelo29PMI.add("AGP");vuelo29PMI.add("05:30");vuelo29PMI.add("07:15");vuelo29PMI.add("105");
        List<String> vuelo30PMI = new ArrayList<>();vuelo30PMI.add("ALC");vuelo30PMI.add("06:00");vuelo30PMI.add("07:45");vuelo30PMI.add("105");
        List<String> vuelo31PMI = new ArrayList<>();vuelo31PMI.add("PMI");vuelo31PMI.add("06:30");vuelo31PMI.add("08:15");vuelo31PMI.add("105");
        List<String> vuelo32PMI = new ArrayList<>();vuelo32PMI.add("LPA");vuelo32PMI.add("07:00");vuelo32PMI.add("08:45");vuelo32PMI.add("105");
        List<String>[] PMI = new List[]{vuelo1PMI, vuelo2PMI, vuelo3PMI, vuelo4PMI, vuelo5PMI, vuelo6PMI, vuelo7PMI, vuelo8PMI, vuelo9PMI, vuelo10PMI, vuelo11PMI, vuelo12PMI, vuelo13PMI, vuelo14PMI, vuelo15PMI, vuelo16PMI, vuelo17PMI, vuelo18PMI, vuelo19PMI, vuelo20PMI, vuelo21PMI, vuelo22PMI, vuelo23PMI, vuelo24PMI, vuelo25PMI, vuelo26PMI, vuelo27PMI, vuelo28PMI, vuelo29PMI, vuelo30PMI, vuelo31PMI, vuelo32PMI};
        agrupacion.put("PMI", List.of(PMI));
        // Aeropuerto Las Palmas (LPA)
        List<String> vuelo1LPA = new ArrayList<>();vuelo1LPA.add("MAD");vuelo1LPA.add("09:00");vuelo1LPA.add("10:30");vuelo1LPA.add("90");
        List<String> vuelo2LPA = new ArrayList<>();vuelo2LPA.add("SVQ");vuelo2LPA.add("11:00");vuelo2LPA.add("12:45");vuelo2LPA.add("90");
        List<String> vuelo3LPA = new ArrayList<>();vuelo3LPA.add("BCN");vuelo3LPA.add("14:30");vuelo3LPA.add("16:15");vuelo3LPA.add("90");
        List<String> vuelo4LPA = new ArrayList<>();vuelo4LPA.add("AGP");vuelo4LPA.add("15:00");vuelo4LPA.add("16:45");vuelo4LPA.add("90");
        List<String> vuelo5LPA = new ArrayList<>();vuelo5LPA.add("ALC");vuelo5LPA.add("16:30");vuelo5LPA.add("18:15");vuelo5LPA.add("90");
        List<String> vuelo6LPA = new ArrayList<>();vuelo6LPA.add("PMI");vuelo6LPA.add("17:00");vuelo6LPA.add("18:45");vuelo6LPA.add("90");
        List<String> vuelo7LPA = new ArrayList<>();vuelo7LPA.add("LPA");vuelo7LPA.add("18:30");vuelo7LPA.add("20:15");vuelo7LPA.add("90");
        List<String> vuelo8LPA = new ArrayList<>();vuelo8LPA.add("TFS");vuelo8LPA.add("19:00");vuelo8LPA.add("20:45");vuelo8LPA.add("90");
        List<String> vuelo9LPA = new ArrayList<>();vuelo9LPA.add("TFN");vuelo9LPA.add("20:30");vuelo9LPA.add("22:15");vuelo9LPA.add("90");
        List<String> vuelo10LPA = new ArrayList<>();vuelo10LPA.add("GRX");vuelo10LPA.add("21:00");vuelo10LPA.add("22:45");vuelo10LPA.add("90");
        List<String> vuelo11LPA = new ArrayList<>();vuelo11LPA.add("SCQ");vuelo11LPA.add("21:30");vuelo11LPA.add("23:15");vuelo11LPA.add("90");
        List<String> vuelo12LPA = new ArrayList<>();vuelo12LPA.add("VGO");vuelo12LPA.add("22:00");vuelo12LPA.add("23:45");vuelo12LPA.add("90");
        List<String> vuelo13LPA = new ArrayList<>();vuelo13LPA.add("LCG");vuelo13LPA.add("22:30");vuelo13LPA.add("00:15");vuelo13LPA.add("90");
        List<String> vuelo14LPA = new ArrayList<>();vuelo14LPA.add("OVD");vuelo14LPA.add("23:00");vuelo14LPA.add("00:45");vuelo14LPA.add("90");
        List<String> vuelo15LPA = new ArrayList<>();vuelo15LPA.add("SDR");vuelo15LPA.add("23:30");vuelo15LPA.add("01:15");vuelo15LPA.add("90");
        List<String> vuelo16LPA = new ArrayList<>();vuelo16LPA.add("PNA");vuelo16LPA.add("00:00");vuelo16LPA.add("01:45");vuelo16LPA.add("90");
        List<String> vuelo17LPA = new ArrayList<>();vuelo17LPA.add("RJL");vuelo17LPA.add("00:30");vuelo17LPA.add("02:15");vuelo17LPA.add("90");
        List<String> vuelo18LPA = new ArrayList<>();vuelo18LPA.add("EAS");vuelo18LPA.add("01:00");vuelo18LPA.add("02:45");vuelo18LPA.add("90");
        List<String> vuelo19LPA = new ArrayList<>();vuelo19LPA.add("VIT");vuelo19LPA.add("01:30");vuelo19LPA.add("03:15");vuelo19LPA.add("90");
        List<String> vuelo20LPA = new ArrayList<>();vuelo20LPA.add("ZAZ");vuelo20LPA.add("02:00");vuelo20LPA.add("03:45");vuelo20LPA.add("90");
        List<String> vuelo21LPA = new ArrayList<>();vuelo21LPA.add("TEV");vuelo21LPA.add("02:30");vuelo21LPA.add("04:15");vuelo21LPA.add("90");
        List<String> vuelo22LPA = new ArrayList<>();vuelo22LPA.add("HSK");vuelo22LPA.add("03:00");vuelo22LPA.add("04:45");vuelo22LPA.add("90");
        List<String> vuelo23LPA = new ArrayList<>();vuelo23LPA.add("LEN");vuelo23LPA.add("03:30");vuelo23LPA.add("05:15");vuelo23LPA.add("90");
        List<String> vuelo24LPA = new ArrayList<>();vuelo24LPA.add("VLL");vuelo24LPA.add("04:00");vuelo24LPA.add("05:45");vuelo24LPA.add("90");
        List<String> vuelo25LPA = new ArrayList<>();vuelo25LPA.add("RGS");vuelo25LPA.add("04:30");vuelo25LPA.add("06:15");vuelo25LPA.add("90");
        List<String> vuelo26LPA = new ArrayList<>();vuelo26LPA.add("SLM");vuelo26LPA.add("05:00");vuelo26LPA.add("06:45");vuelo26LPA.add("90");
        List<String> vuelo27LPA = new ArrayList<>();vuelo27LPA.add("SVQ");vuelo27LPA.add("05:30");vuelo27LPA.add("07:15");vuelo27LPA.add("105");
        List<String> vuelo28LPA = new ArrayList<>();vuelo28LPA.add("VLC");vuelo28LPA.add("06:00");vuelo28LPA.add("07:45");vuelo28LPA.add("105");
        List<String> vuelo29LPA = new ArrayList<>();vuelo29LPA.add("BCN");vuelo29LPA.add("06:30");vuelo29LPA.add("08:15");vuelo29LPA.add("105");
        List<String> vuelo30LPA = new ArrayList<>();vuelo30LPA.add("BIO");vuelo30LPA.add("02:00");vuelo30LPA.add("04:45");vuelo30LPA.add("105");
        List<String> vuelo31LPA = new ArrayList<>();vuelo31LPA.add("ALC");vuelo31LPA.add("07:30");vuelo31LPA.add("09:15");vuelo31LPA.add("105");
        List<String> vuelo32LPA = new ArrayList<>();vuelo32LPA.add("PMI");vuelo32LPA.add("08:00");vuelo32LPA.add("09:45");vuelo32LPA.add("105");
        List<String>[] LPA = new List[]{vuelo1LPA, vuelo2LPA, vuelo3LPA, vuelo4LPA, vuelo5LPA, vuelo6LPA, vuelo7LPA, vuelo8LPA, vuelo9LPA, vuelo10LPA, vuelo11LPA, vuelo12LPA, vuelo13LPA, vuelo14LPA, vuelo15LPA, vuelo16LPA, vuelo17LPA, vuelo18LPA, vuelo19LPA, vuelo20LPA, vuelo21LPA, vuelo22LPA, vuelo23LPA, vuelo24LPA, vuelo25LPA, vuelo26LPA, vuelo27LPA, vuelo28LPA, vuelo29LPA, vuelo30LPA, vuelo31LPA, vuelo32LPA};
        agrupacion.put("LPA", List.of(LPA));

        // Aeropuerto Tenerife (TFN)
        List<String> vuelo1TFN = new ArrayList<>();vuelo1TFN.add("MAD");vuelo1TFN.add("09:00");vuelo1TFN.add("10:30");vuelo1TFN.add("90");
        List<String> vuelo2TFN = new ArrayList<>();vuelo2TFN.add("SVQ");vuelo2TFN.add("11:00");vuelo2TFN.add("12:45");vuelo2TFN.add("90");
        List<String> vuelo3TFN = new ArrayList<>();vuelo3TFN.add("BCN");vuelo3TFN.add("14:30");vuelo3TFN.add("16:15");vuelo3TFN.add("90");
        List<String> vuelo4TFN = new ArrayList<>();vuelo4TFN.add("AGP");vuelo4TFN.add("15:00");vuelo4TFN.add("16:45");vuelo4TFN.add("90");
        List<String> vuelo5TFN = new ArrayList<>();vuelo5TFN.add("ALC");vuelo5TFN.add("16:30");vuelo5TFN.add("18:15");vuelo5TFN.add("90");
        List<String> vuelo6TFN = new ArrayList<>();vuelo6TFN.add("PMI");vuelo6TFN.add("17:00");vuelo6TFN.add("18:45");vuelo6TFN.add("90");
        List<String> vuelo7TFN = new ArrayList<>();vuelo7TFN.add("LPA");vuelo7TFN.add("18:30");vuelo7TFN.add("20:15");vuelo7TFN.add("90");
        List<String> vuelo8TFN = new ArrayList<>();vuelo8TFN.add("TFS");vuelo8TFN.add("19:00");vuelo8TFN.add("20:45");vuelo8TFN.add("90");
        List<String> vuelo9TFN = new ArrayList<>();vuelo9TFN.add("TFN");vuelo9TFN.add("20:30");vuelo9TFN.add("22:15");vuelo9TFN.add("90");
        List<String> vuelo10TFN = new ArrayList<>();vuelo10TFN.add("GRX");vuelo10TFN.add("21:00");vuelo10TFN.add("22:45");vuelo10TFN.add("90");
        List<String> vuelo11TFN = new ArrayList<>();vuelo11TFN.add("SCQ");vuelo11TFN.add("21:30");vuelo11TFN.add("23:15");vuelo11TFN.add("90");
        List<String> vuelo12TFN = new ArrayList<>();vuelo12TFN.add("VGO");vuelo12TFN.add("22:00");vuelo12TFN.add("23:45");vuelo12TFN.add("90");
        List<String> vuelo13TFN = new ArrayList<>();vuelo13TFN.add("LCG");vuelo13TFN.add("22:30");vuelo13TFN.add("00:15");vuelo13TFN.add("90");
        List<String> vuelo14TFN = new ArrayList<>();vuelo14TFN.add("OVD");vuelo14TFN.add("23:00");vuelo14TFN.add("00:45");vuelo14TFN.add("90");
        List<String> vuelo15TFN = new ArrayList<>();vuelo15TFN.add("SDR");vuelo15TFN.add("23:30");vuelo15TFN.add("01:15");vuelo15TFN.add("90");
        List<String> vuelo16TFN = new ArrayList<>();vuelo16TFN.add("PNA");vuelo16TFN.add("00:00");vuelo16TFN.add("01:45");vuelo16TFN.add("90");
        List<String> vuelo17TFN = new ArrayList<>();vuelo17TFN.add("RJL");vuelo17TFN.add("00:30");vuelo17TFN.add("02:15");vuelo17TFN.add("90");
        List<String> vuelo18TFN = new ArrayList<>();vuelo18TFN.add("EAS");vuelo18TFN.add("01:00");vuelo18TFN.add("02:45");vuelo18TFN.add("90");
        List<String> vuelo19TFN = new ArrayList<>();vuelo19TFN.add("VIT");vuelo19TFN.add("01:30");vuelo19TFN.add("03:15");vuelo19TFN.add("90");
        List<String> vuelo20TFN = new ArrayList<>();vuelo20TFN.add("ZAZ");vuelo20TFN.add("02:00");vuelo20TFN.add("03:45");vuelo20TFN.add("90");
        List<String> vuelo21TFN = new ArrayList<>();vuelo21TFN.add("TEV");vuelo21TFN.add("02:30");vuelo21TFN.add("04:15");vuelo21TFN.add("90");
        List<String> vuelo22TFN = new ArrayList<>();vuelo22TFN.add("HSK");vuelo22TFN.add("03:00");vuelo22TFN.add("04:45");vuelo22TFN.add("90");
        List<String> vuelo23TFN = new ArrayList<>();vuelo23TFN.add("LEN");vuelo23TFN.add("03:30");vuelo23TFN.add("05:15");vuelo23TFN.add("90");
        List<String> vuelo24TFN = new ArrayList<>();vuelo24TFN.add("VLL");vuelo24TFN.add("04:00");vuelo24TFN.add("05:45");vuelo24TFN.add("90");
        List<String> vuelo25TFN = new ArrayList<>();vuelo25TFN.add("RGS");vuelo25TFN.add("04:30");vuelo25TFN.add("06:15");vuelo25TFN.add("90");
        List<String> vuelo26TFN = new ArrayList<>();vuelo26TFN.add("SLM");vuelo26TFN.add("05:00");vuelo26TFN.add("06:45");vuelo26TFN.add("90");
        List<String> vuelo27TFN = new ArrayList<>();vuelo27TFN.add("SVQ");vuelo27TFN.add("05:30");vuelo27TFN.add("07:15");vuelo27TFN.add("105");
        List<String> vuelo28TFN = new ArrayList<>();vuelo28TFN.add("VLC");vuelo28TFN.add("06:00");vuelo28TFN.add("07:45");vuelo28TFN.add("105");
        List<String> vuelo29TFN = new ArrayList<>();vuelo29TFN.add("BCN");vuelo29TFN.add("06:30");vuelo29TFN.add("08:15");vuelo29TFN.add("105");
        List<String> vuelo30TFN = new ArrayList<>();vuelo30TFN.add("BIO");vuelo30TFN.add("02:00");vuelo30TFN.add("04:45");vuelo30TFN.add("105");
        List<String> vuelo31TFN = new ArrayList<>();vuelo31TFN.add("ALC");vuelo31TFN.add("07:30");vuelo31TFN.add("09:15");vuelo31TFN.add("105");
        List<String> vuelo32TFN = new ArrayList<>();vuelo32TFN.add("PMI");vuelo32TFN.add("08:00");vuelo32TFN.add("09:45");vuelo32TFN.add("105");
        List<String>[] TFN = new List[]{vuelo1LPA, vuelo2LPA, vuelo3LPA, vuelo4LPA, vuelo5LPA, vuelo6LPA, vuelo7LPA, vuelo8LPA, vuelo9LPA, vuelo10LPA, vuelo11LPA, vuelo12LPA, vuelo13LPA, vuelo14LPA, vuelo15LPA, vuelo16LPA, vuelo17LPA, vuelo18LPA, vuelo19LPA, vuelo20LPA, vuelo21LPA, vuelo22LPA, vuelo23LPA, vuelo24LPA, vuelo25LPA, vuelo26LPA, vuelo27LPA, vuelo28LPA, vuelo29LPA, vuelo30LPA, vuelo31LPA, vuelo32LPA};
        agrupacion.put("TFN", List.of(TFN));

        // Aeropuerto Ibiza (IBZ)
        List<String> vuelo1IBZ = new ArrayList<>();vuelo1IBZ.add("MAD");vuelo1IBZ.add("08:30");vuelo1IBZ.add("10:00");vuelo1IBZ.add("90");
        List<String> vuelo2IBZ = new ArrayList<>();vuelo2IBZ.add("BCN");vuelo2IBZ.add("10:30");vuelo2IBZ.add("12:15");vuelo2IBZ.add("105");
        List<String> vuelo3IBZ = new ArrayList<>();vuelo3IBZ.add("SVQ");vuelo3IBZ.add("14:00");vuelo3IBZ.add("15:45");vuelo3IBZ.add("105");
        List<String>[] IBZ = new List[]{vuelo1LPA, vuelo2LPA, vuelo3LPA};
        agrupacion.put("IBZ", List.of(IBZ));
        // Aeropuerto Menorca (MAH)
        List<String> vuelo1MAH = new ArrayList<>();vuelo1MAH.add("MAD");vuelo1MAH.add("08:30");vuelo1MAH.add("10:00");vuelo1MAH.add("90");
        List<String> vuelo2MAH = new ArrayList<>();vuelo2MAH.add("BCN");vuelo2MAH.add("10:30");vuelo2MAH.add("12:15");vuelo2MAH.add("105");
        List<String> vuelo3MAH = new ArrayList<>();vuelo3MAH.add("SVQ");vuelo3MAH.add("14:00");vuelo3MAH.add("15:45");vuelo3MAH.add("105");
        List<String>[] MAH = new List[]{vuelo1MAH, vuelo2MAH, vuelo3MAH};
        agrupacion.put("MAH", List.of(MAH));
        // Aeropuerto Tenerife Sur (TFS)
        List<String> vuelo1TFS = new ArrayList<>();vuelo1TFS.add("MAD");vuelo1TFS.add("08:30");vuelo1TFS.add("10:00");vuelo1TFS.add("90");
        List<String> vuelo2TFS = new ArrayList<>();vuelo2TFS.add("BCN");vuelo2TFS.add("10:30");vuelo2TFS.add("12:15");vuelo2TFS.add("105");
        List<String> vuelo3TFS = new ArrayList<>();vuelo3TFS.add("SVQ");vuelo3TFS.add("14:00");vuelo3TFS.add("15:45");vuelo3TFS.add("105");
        List<String>[] TFS = new List[]{vuelo1TFS, vuelo2TFS, vuelo3TFS};
        agrupacion.put("TFS", List.of(TFS));
        // Aeropuerto Tenerife Norte (TFN)
        List<String> vuelo1TFN2 = new ArrayList<>();vuelo1TFN2.add("MAD");vuelo1TFN2.add("08:30");vuelo1TFN2.add("10:00");vuelo1TFN2.add("90");
        List<String> vuelo2TFN2 = new ArrayList<>();vuelo2TFN2.add("BCN");vuelo2TFN2.add("10:30");vuelo2TFN2.add("12:15");vuelo2TFN2.add("105");
        List<String> vuelo3TFN2 = new ArrayList<>();vuelo3TFN2.add("SVQ");vuelo3TFN2.add("14:00");vuelo3TFN2.add("15:45");vuelo3TFN2.add("105");
        List<String>[] TFN2 = new List[]{vuelo1TFN2, vuelo2TFN2, vuelo3TFN2};
        agrupacion.put("TFN", List.of(TFN2));
        // Aeropuerto Granada (GRX)
        List<String> vuelo1GRX = new ArrayList<>();vuelo1GRX.add("MAD");vuelo1GRX.add("08:30");vuelo1GRX.add("10:00");vuelo1GRX.add("90");
        List<String> vuelo2GRX = new ArrayList<>();vuelo2GRX.add("BCN");vuelo2GRX.add("10:30");vuelo2GRX.add("12:15");vuelo2GRX.add("105");
        List<String> vuelo3GRX = new ArrayList<>();vuelo3GRX.add("SVQ");vuelo3GRX.add("14:00");vuelo3GRX.add("15:45");vuelo3GRX.add("105");
        List<String>[]  GRX = new List[]{vuelo1GRX, vuelo2GRX, vuelo3GRX};
        agrupacion.put("GRX", List.of(GRX));
        // Aeropuerto Santiago de Compostela (SCQ)
        List<String> vuelo1SCQ = new ArrayList<>();vuelo1SCQ.add("MAD");vuelo1SCQ.add("08:30");vuelo1SCQ.add("10:00");vuelo1SCQ.add("90");
        List<String> vuelo2SCQ = new ArrayList<>();vuelo2SCQ.add("BCN");vuelo2SCQ.add("10:30");vuelo2SCQ.add("12:15");vuelo2SCQ.add("105");
        List<String> vuelo3SCQ = new ArrayList<>();vuelo3SCQ.add("SVQ");vuelo3SCQ.add("14:00");vuelo3SCQ.add("15:45");vuelo3SCQ.add("105");
        List<String>[] SCQ = new List[]{vuelo1SCQ, vuelo2SCQ, vuelo3SCQ};
        agrupacion.put("SCQ", List.of(SCQ));
        // Aeropuerto Vigo (VGO)
        List<String> vuelo1VGO = new ArrayList<>();vuelo1VGO.add("MAD");vuelo1VGO.add("08:30");vuelo1VGO.add("10:00");vuelo1VGO.add("90");
        List<String> vuelo2VGO = new ArrayList<>();vuelo2VGO.add("BCN");vuelo2VGO.add("10:30");vuelo2VGO.add("12:15");vuelo2VGO.add("105");
        List<String> vuelo3VGO = new ArrayList<>();vuelo3VGO.add("SVQ");vuelo3VGO.add("14:00");vuelo3VGO.add("15:45");vuelo3VGO.add("105");
        List<String>[] VGO = new List[]{vuelo1VGO, vuelo2VGO, vuelo3VGO};
        agrupacion.put("VGO", List.of(VGO));
        // Aeropuerto A Coruña (LCG
        List<String> vuelo1LCG = new ArrayList<>();vuelo1LCG.add("MAD");vuelo1LCG.add("08:30");vuelo1LCG.add("10:00");vuelo1LCG.add("90");
        List<String> vuelo2LCG = new ArrayList<>();vuelo2LCG.add("BCN");vuelo2LCG.add("10:30");vuelo2LCG.add("12:15");vuelo2LCG.add("105");
        List<String> vuelo3LCG = new ArrayList<>();vuelo3LCG.add("SVQ");vuelo3LCG.add("14:00");vuelo3LCG.add("15:45");vuelo3LCG.add("105");
        List<String>[]  LCG = new List[]{vuelo1LCG, vuelo2LCG, vuelo3LCG};
        agrupacion.put("LCG", List.of(LCG));
        // Aeropuerto Oviedo (OVD)
        List<String> vuelo1OVD = new ArrayList<>();vuelo1OVD.add("MAD");vuelo1OVD.add("08:30");vuelo1OVD.add("10:00");vuelo1OVD.add("90");
        List<String> vuelo2OVD = new ArrayList<>();vuelo2OVD.add("BCN");vuelo2OVD.add("10:30");vuelo2OVD.add("12:15");vuelo2OVD.add("105");
        List<String> vuelo3OVD = new ArrayList<>();vuelo3OVD.add("SVQ");vuelo3OVD.add("14:00");vuelo3OVD.add("15:45");vuelo3OVD.add("105");
        List<String>[] OVD = new List[]{vuelo1OVD, vuelo2OVD, vuelo3OVD};
        agrupacion.put("OVD", List.of(OVD));
        // Aeropuerto Santander (SDR)
        List<String> vuelo1SDR = new ArrayList<>();vuelo1SDR.add("MAD");vuelo1SDR.add("08:30");vuelo1SDR.add("10:00");vuelo1SDR.add("90");
        List<String> vuelo2SDR = new ArrayList<>();vuelo2SDR.add("BCN");vuelo2SDR.add("10:30");vuelo2SDR.add("12:15");vuelo2SDR.add("105");
        List<String> vuelo3SDR = new ArrayList<>();vuelo3SDR.add("SVQ");vuelo3SDR.add("14:00");vuelo3SDR.add("15:45");vuelo3SDR.add("105");
        List<String>[] SDR = new List[]{vuelo1SDR, vuelo2SDR, vuelo3SDR};
        agrupacion.put("SDR", List.of(SDR));
        // Aeropuerto Pamplona (PNA)
        List<String> vuelo1PNA = new ArrayList<>();vuelo1PNA.add("MAD");vuelo1PNA.add("08:30");vuelo1PNA.add("10:00");vuelo1PNA.add("90");
        List<String> vuelo2PNA = new ArrayList<>();vuelo2PNA.add("BCN");vuelo2PNA.add("10:30");vuelo2PNA.add("12:15");vuelo2PNA.add("105");
        List<String> vuelo3PNA = new ArrayList<>();vuelo3PNA.add("SVQ");vuelo3PNA.add("14:00");vuelo3PNA.add("15:45");vuelo3PNA.add("105");
        List<String>[] PNA = new List[]{vuelo1PNA, vuelo2PNA, vuelo3PNA};
        agrupacion.put("PNA", List.of(PNA));

        // Aeropuerto Logroño (RJL)
        List<String> vuelo1RJL = new ArrayList<>();vuelo1RJL.add("MAD");vuelo1RJL.add("08:30");vuelo1RJL.add("10:00");vuelo1RJL.add("90");
        List<String> vuelo2RJL = new ArrayList<>();vuelo2RJL.add("BCN");vuelo2RJL.add("10:30");vuelo2RJL.add("12:15");vuelo2RJL.add("105");
        List<String> vuelo3RJL = new ArrayList<>();vuelo3RJL.add("SVQ");vuelo3RJL.add("14:00");vuelo3RJL.add("15:45");vuelo3RJL.add("105");
        List<String>[] RJL = new List[]{vuelo1RJL, vuelo2RJL, vuelo3RJL};
        agrupacion.put("RJL", List.of(RJL));


        // Aeropuerto San Sebastián (EAS)
        List<String> vuelo1EAS = new ArrayList<>();vuelo1EAS.add("MAD");vuelo1EAS.add("08:30");vuelo1EAS.add("10:00");vuelo1EAS.add("90");
        List<String> vuelo2EAS = new ArrayList<>();vuelo2EAS.add("BCN");vuelo2EAS.add("10:30");vuelo2EAS.add("12:15");vuelo2EAS.add("105");
        List<String> vuelo3EAS = new ArrayList<>();vuelo3EAS.add("SVQ");vuelo3EAS.add("14:00");vuelo3EAS.add("15:45");vuelo3EAS.add("105");
        List<String>[] EAS = new List[]{vuelo1EAS, vuelo2EAS, vuelo3EAS};
        agrupacion.put("EAS", List.of(EAS));

        // Aeropuerto Vitoria (VIT)
        List<String> vuelo1VIT = new ArrayList<>();vuelo1VIT.add("MAD");vuelo1VIT.add("08:30");vuelo1VIT.add("10:00");vuelo1VIT.add("90");
        List<String> vuelo2VIT = new ArrayList<>();vuelo2VIT.add("BCN");vuelo2VIT.add("10:30");vuelo2VIT.add("12:15");vuelo2VIT.add("105");
        List<String> vuelo3VIT = new ArrayList<>();vuelo3VIT.add("SVQ");vuelo3VIT.add("14:00");vuelo3VIT.add("15:45");vuelo3VIT.add("105");
        List<String>[] VIT = new List[]{vuelo1VIT, vuelo2VIT, vuelo3VIT};
        agrupacion.put("VIT", List.of(VIT));

        // Aeropuerto Zaragoza (ZAZ)
        List<String> vuelo1ZAZ = new ArrayList<>();vuelo1ZAZ.add("MAD");vuelo1ZAZ.add("08:30");vuelo1ZAZ.add("10:00");vuelo1ZAZ.add("90");
        List<String> vuelo2ZAZ = new ArrayList<>();vuelo2ZAZ.add("BCN");vuelo2ZAZ.add("10:30");vuelo2ZAZ.add("12:15");vuelo2ZAZ.add("105");
        List<String> vuelo3ZAZ = new ArrayList<>();vuelo3ZAZ.add("SVQ");vuelo3ZAZ.add("14:00");vuelo3ZAZ.add("15:45");vuelo3ZAZ.add("105");
        List<String>[] ZAZ = new List[]{vuelo1ZAZ, vuelo2ZAZ, vuelo3ZAZ};
        agrupacion.put("ZAZ", List.of(ZAZ));

        // Aeropuerto Teruel (TEV)
        List<String> vuelo1TEV = new ArrayList<>();vuelo1TEV.add("SVQ");vuelo1TEV.add("07:00");vuelo1TEV.add("08:30");vuelo1TEV.add("90");
        List<String> vuelo2TEV = new ArrayList<>();vuelo2TEV.add("BCN");vuelo2TEV.add("09:00");vuelo2TEV.add("11:15");vuelo2TEV.add("135");
        List<String> vuelo3TEV = new ArrayList<>();vuelo3TEV.add("MAD");vuelo3TEV.add("13:00");vuelo3TEV.add("14:45");vuelo3TEV.add("105");
        List<String>[] TEV = new List[]{vuelo1TEV, vuelo2TEV, vuelo3TEV};
        agrupacion.put("TEV", List.of(TEV));

        // Aeropuerto Huesca (HSK)
        List<String> vuelo1HSK = new ArrayList<>();vuelo1HSK.add("SVQ");vuelo1HSK.add("07:00");vuelo1HSK.add("08:30");vuelo1HSK.add("90");
        List<String> vuelo2HSK = new ArrayList<>();vuelo2HSK.add("BCN");vuelo2HSK.add("09:00");vuelo2HSK.add("11:15");vuelo2HSK.add("135");
        List<String> vuelo3HSK = new ArrayList<>();vuelo3HSK.add("MAD");vuelo3HSK.add("13:00");vuelo3HSK.add("14:45");vuelo3HSK.add("105");
        List<String> vuelo4HSK = new ArrayList<>();vuelo4HSK.add("MAD");vuelo4HSK.add("15:00");vuelo4HSK.add("16:45");vuelo4HSK.add("105");
        List<String> vuelo5HSK = new ArrayList<>();vuelo5HSK.add("BCN");vuelo5HSK.add("17:00");vuelo5HSK.add("19:15");vuelo5HSK.add("135");
        List<String>[] HSK = new List[]{vuelo1HSK, vuelo2HSK, vuelo3HSK, vuelo4HSK, vuelo5HSK};
        agrupacion.put("HSK", List.of(HSK));
        // Aeropuerto León (LEN)
        List<String> vuelo1LEN = new ArrayList<>();vuelo1LEN.add("SVQ");vuelo1LEN.add("07:00");vuelo1LEN.add("08:30");vuelo1LEN.add("90");
        List<String> vuelo2LEN = new ArrayList<>();vuelo2LEN.add("BCN");vuelo2LEN.add("09:00");vuelo2LEN.add("11:15");vuelo2LEN.add("135");
        List<String> vuelo3LEN = new ArrayList<>();vuelo3LEN.add("MAD");vuelo3LEN.add("13:00");vuelo3LEN.add("14:45");vuelo3LEN.add("105");
        List<String>[] LEN = new List[]{vuelo1LEN, vuelo2LEN, vuelo3LEN};
        agrupacion.put("LEN", List.of(LEN));
        // Aeropuerto Valladolid (VLL)
        List<String> vuelo1VLL = new ArrayList<>();vuelo1VLL.add("SVQ");vuelo1VLL.add("07:00");vuelo1VLL.add("08:30");vuelo1VLL.add("90");
        List<String> vuelo2VLL = new ArrayList<>();vuelo2VLL.add("BCN");vuelo2VLL.add("09:00");vuelo2VLL.add("11:15");vuelo2VLL.add("135");
        List<String> vuelo3VLL = new ArrayList<>();vuelo3VLL.add("MAD");vuelo3VLL.add("13:00");vuelo3VLL.add("14:45");vuelo3VLL.add("105");
        List<String>[] VLL = new List[]{vuelo1VLL, vuelo2VLL, vuelo3VLL};
        agrupacion.put("VLL", List.of(VLL));
        // Aeropuerto Burgos (RGS)
        List<String> vuelo1RGS = new ArrayList<>();vuelo1RGS.add("SVQ");vuelo1RGS.add("07:00");vuelo1RGS.add("08:30");vuelo1RGS.add("90");
        List<String> vuelo2RGS = new ArrayList<>();vuelo2RGS.add("BCN");vuelo2RGS.add("09:00");vuelo2RGS.add("11:15");vuelo2RGS.add("135");
        List<String> vuelo3RGS = new ArrayList<>();vuelo3RGS.add("MAD");vuelo3RGS.add("13:00");vuelo3RGS.add("14:45");vuelo3RGS.add("105");
        List<String>[] RGS = new List[]{vuelo1RGS, vuelo2RGS, vuelo3RGS};
        agrupacion.put("RGS", List.of(RGS));
        // Aeropuerto Salamanca (SLM)
        List<String> vuelo1SLM = new ArrayList<>();vuelo1SLM.add("SVQ");vuelo1SLM.add("07:00");vuelo1SLM.add("08:30");vuelo1SLM.add("90");
        List<String> vuelo2SLM = new ArrayList<>();vuelo2SLM.add("BCN");vuelo2SLM.add("09:00");vuelo2SLM.add("11:15");vuelo2SLM.add("135");
        List<String> vuelo3SLM = new ArrayList<>();vuelo3SLM.add("MAD");vuelo3SLM.add("13:00");vuelo3SLM.add("14:45");vuelo3SLM.add("105");
        List<String>[] SLM = new List[]{vuelo1SLM, vuelo2SLM, vuelo3SLM};
        agrupacion.put("SLM", List.of(SLM));

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

