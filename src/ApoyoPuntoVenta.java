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
        IATAdic.put("Tenerife", "TFN");
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
        IATAdic.put("Teruel", "TEV");   // asd
        IATAdic.put("Huesca", "HSK");
        IATAdic.put("León", "LEN");
        IATAdic.put("Valladolid", "VLL");
        IATAdic.put("Burgos", "RGS");
        IATAdic.put("Salamanca", "SLM");

        // Aeropuerto Sevilla (SVQ)
        List<List<String>> SVQ = new ArrayList<>();
        List<String> vuelo1SVQ = new ArrayList<>();
        vuelo1SVQ.add("BCN");
        vuelo1SVQ.add("07:45");
        vuelo1SVQ.add("18:55");
        vuelo1SVQ.add("90");
        List<String> vuelo2SVQ = new ArrayList<>();
        vuelo2SVQ.add("MAD");
        vuelo2SVQ.add("08:25");
        vuelo2SVQ.add("21:00");
        vuelo2SVQ.add("60");
        List<String> vuelo3SVQ = new ArrayList<>();
        vuelo3SVQ.add("BIO");
        vuelo3SVQ.add("08:55");
        vuelo3SVQ.add("20:15");
        vuelo3SVQ.add("85");
        SVQ.add(vuelo1SVQ);
        SVQ.add(vuelo2SVQ);
        SVQ.add(vuelo3SVQ);

        // Aeropuerto Madrid (MAD)
        List<List<String>> MAD = new ArrayList<>();
        List<String> vuelo1MAD = new ArrayList<>();
        vuelo1MAD.add("SVQ");
        vuelo1MAD.add("09:15");
        vuelo1MAD.add("20:30");
        vuelo1MAD.add("75");
        List<String> vuelo2MAD = new ArrayList<>();
        vuelo2MAD.add("BCN");
        vuelo2MAD.add("10:00");
        vuelo2MAD.add("21:45");
        vuelo2MAD.add("90");
        List<String> vuelo3MAD = new ArrayList<>();
        vuelo3MAD.add("AGP");
        vuelo3MAD.add("11:30");
        vuelo3MAD.add("23:00");
        vuelo3MAD.add("105");
        MAD.add(vuelo1MAD);
        MAD.add(vuelo2MAD);
        MAD.add(vuelo3MAD);

        // Aeropuerto Barcelona (BCN)
        List<List<String>> BCN = new ArrayList<>();
        List<String> vuelo1BCN = new ArrayList<>();
        vuelo1BCN.add("MAD");
        vuelo1BCN.add("07:30");
        vuelo1BCN.add("09:15");
        vuelo1BCN.add("105");
        List<String> vuelo2BCN = new ArrayList<>();
        vuelo2BCN.add("SVQ");
        vuelo2BCN.add("09:00");
        vuelo2BCN.add("10:45");
        vuelo2BCN.add("90");
        List<String> vuelo3BCN = new ArrayList<>();
        vuelo3BCN.add("PMI");
        vuelo3BCN.add("11:30");
        vuelo3BCN.add("13:45");
        vuelo3BCN.add("90");
        BCN.add(vuelo1BCN);
        BCN.add(vuelo2BCN);
        BCN.add(vuelo3BCN);

        // Aeropuerto Valencia (VLC)
        List<List<String>> VLC = new ArrayList<>();
        List<String> vuelo1VLC = new ArrayList<>();
        vuelo1VLC.add("BCN");
        vuelo1VLC.add("08:00");
        vuelo1VLC.add("09:45");
        vuelo1VLC.add("105");
        List<String> vuelo2VLC = new ArrayList<>();
        vuelo2VLC.add("MAD");
        vuelo2VLC.add("10:30");
        vuelo2VLC.add("12:15");
        vuelo2VLC.add("105");
        List<String> vuelo3VLC = new ArrayList<>();
        vuelo3VLC.add("AGP");
        vuelo3VLC.add("14:00");
        vuelo3VLC.add("15:45");
        vuelo3VLC.add("105");
        VLC.add(vuelo1VLC);
        VLC.add(vuelo2VLC);
        VLC.add(vuelo3VLC);

        // Aeropuerto Bilbao (BIO)
        List<List<String>> BIO = new ArrayList<>();
        List<String> vuelo1BIO = new ArrayList<>();
        vuelo1BIO.add("MAD");
        vuelo1BIO.add("09:00");
        vuelo1BIO.add("10:30");
        vuelo1BIO.add("90");
        List<String> vuelo2BIO = new ArrayList<>();
        vuelo2BIO.add("SVQ");
        vuelo2BIO.add("11:00");
        vuelo2BIO.add("12:45");
        vuelo2BIO.add("90");
        List<String> vuelo3BIO = new ArrayList<>();
        vuelo3BIO.add("BCN");
        vuelo3BIO.add("14:30");
        vuelo3BIO.add("16:15");
        vuelo3BIO.add("90");
        BIO.add(vuelo1BIO);
        BIO.add(vuelo2BIO);
        BIO.add(vuelo3BIO);

        // Aeropuerto Málaga (AGP)
        List<List<String>> AGP = new ArrayList<>();
        List<String> vuelo1AGP = new ArrayList<>();
        vuelo1AGP.add("MAD");
        vuelo1AGP.add("08:30");
        vuelo1AGP.add("10:00");
        vuelo1AGP.add("90");
        List<String> vuelo2AGP = new ArrayList<>();
        vuelo2AGP.add("BCN");
        vuelo2AGP.add("10:30");
        vuelo2AGP.add("12:15");
        vuelo2AGP.add("105");
        List<String> vuelo3AGP = new ArrayList<>();
        vuelo3AGP.add("SVQ");
        vuelo3AGP.add("14:00");
        vuelo3AGP.add("15:45");
        vuelo3AGP.add("105");
        AGP.add(vuelo1AGP);
        AGP.add(vuelo2AGP);
        AGP.add(vuelo3AGP);

        // Aeropuerto Alicante (ALC)
        List<List<String>> ALC = new ArrayList<>();
        List<String> vuelo1ALC = new ArrayList<>();
        vuelo1ALC.add("MAD");
        vuelo1ALC.add("08:00");
        vuelo1ALC.add("09:30");
        vuelo1ALC.add("90");
        List<String> vuelo2ALC = new ArrayList<>();
        vuelo2ALC.add("BCN");
        vuelo2ALC.add("10:30");
        vuelo2ALC.add("12:15");
        vuelo2ALC.add("105");
        List<String> vuelo3ALC = new ArrayList<>();
        vuelo3ALC.add("SVQ");
        vuelo3ALC.add("14:00");
        vuelo3ALC.add("15:45");
        vuelo3ALC.add("105");
        ALC.add(vuelo1ALC);
        ALC.add(vuelo2ALC);
        ALC.add(vuelo3ALC);

        // Aeropuerto Palma de Mallorca (PMI)
        List<List<String>> PMI = new ArrayList<>();
        List<String> vuelo1PMI = new ArrayList<>();
        vuelo1PMI.add("BCN");
        vuelo1PMI.add("07:30");
        vuelo1PMI.add("09:15");
        vuelo1PMI.add("105");
        List<String> vuelo2PMI = new ArrayList<>();
        vuelo2PMI.add("MAD");
        vuelo2PMI.add("10:00");
        vuelo2PMI.add("11:45");
        vuelo2PMI.add("105");
        List<String> vuelo3PMI = new ArrayList<>();
        vuelo3PMI.add("AGP");
        vuelo3PMI.add("14:30");
        vuelo3PMI.add("16:15");
        vuelo3PMI.add("105");
        PMI.add(vuelo1PMI);
        PMI.add(vuelo2PMI);
        PMI.add(vuelo3PMI);

        // Aeropuerto Las Palmas (LPA)
        List<List<String>> LPA = new ArrayList<>();
        List<String> vuelo1LPA = new ArrayList<>();
        vuelo1LPA.add("MAD");
        vuelo1LPA.add("08:30");
        vuelo1LPA.add("10:00");
        vuelo1LPA.add("90");
        List<String> vuelo2LPA = new ArrayList<>();
        vuelo2LPA.add("BCN");
        vuelo2LPA.add("10:30");
        vuelo2LPA.add("12:15");
        vuelo2LPA.add("105");
        List<String> vuelo3LPA = new ArrayList<>();
        vuelo3LPA.add("SVQ");
        vuelo3LPA.add("14:00");
        vuelo3LPA.add("15:45");
        vuelo3LPA.add("105");
        LPA.add(vuelo1LPA);
        LPA.add(vuelo2LPA);
        LPA.add(vuelo3LPA);

        // Aeropuerto Tenerife (TFN)
        List<List<String>> TFN = new ArrayList<>();
        List<String> vuelo1TFN = new ArrayList<>();
        vuelo1TFN.add("MAD");
        vuelo1TFN.add("08:00");
        vuelo1TFN.add("09:45");
        vuelo1TFN.add("105");
        List<String> vuelo2TFN = new ArrayList<>();
        vuelo2TFN.add("BCN");
        vuelo2TFN.add("10:30");
        vuelo2TFN.add("12:15");
        vuelo2TFN.add("105");
        List<String> vuelo3TFN = new ArrayList<>();
        vuelo3TFN.add("SVQ");
        vuelo3TFN.add("14:00");
        vuelo3TFN.add("15:45");
        vuelo3TFN.add("105");
        TFN.add(vuelo1TFN);
        TFN.add(vuelo2TFN);
        TFN.add(vuelo3TFN);

        // Aeropuerto Gran Canaria (LPA)
        List<List<String>> LPA2 = new ArrayList<>();
        List<String> vuelo1LPA2 = new ArrayList<>();
        vuelo1LPA2.add("MAD");
        vuelo1LPA2.add("08:30");
        vuelo1LPA2.add("10:00");
        vuelo1LPA2.add("90");
        List<String> vuelo2LPA2 = new ArrayList<>();
        vuelo2LPA2.add("BCN");
        vuelo2LPA2.add("10:30");
        vuelo2LPA2.add("12:15");
        vuelo2LPA2.add("105");
        List<String> vuelo3LPA2 = new ArrayList<>();
        vuelo3LPA2.add("SVQ");
        vuelo3LPA2.add("14:00");
        vuelo3LPA2.add("15:45");
        vuelo3LPA2.add("105");
        LPA2.add(vuelo1LPA2);
        LPA2.add(vuelo2LPA2);
        LPA2.add(vuelo3LPA2);

        // Aeropuerto Fuerteventura (FUE)
        List<List<String>> FUE = new ArrayList<>();
        List<String> vuelo1FUE = new ArrayList<>();
        vuelo1FUE.add("MAD");
        vuelo1FUE.add("08:30");
        vuelo1FUE.add("10:00");
        vuelo1FUE.add("90");
        List<String> vuelo2FUE = new ArrayList<>();
        vuelo2FUE.add("BCN");
        vuelo2FUE.add("10:30");
        vuelo2FUE.add("12:15");
        vuelo2FUE.add("105");
        List<String> vuelo3FUE = new ArrayList<>();
        vuelo3FUE.add("SVQ");
        vuelo3FUE.add("14:00");
        vuelo3FUE.add("15:45");
        vuelo3FUE.add("105");
        FUE.add(vuelo1FUE);
        FUE.add(vuelo2FUE);
        FUE.add(vuelo3FUE);

        // Aeropuerto Lanzarote (ACE)
        List<List<String>> ACE = new ArrayList<>();
        List<String> vuelo1ACE = new ArrayList<>();
        vuelo1ACE.add("MAD");
        vuelo1ACE.add("08:30");
        vuelo1ACE.add("10:00");
        vuelo1ACE.add("90");
        List<String> vuelo2ACE = new ArrayList<>();
        vuelo2ACE.add("BCN");
        vuelo2ACE.add("10:30");
        vuelo2ACE.add("12:15");
        vuelo2ACE.add("105");
        List<String> vuelo3ACE = new ArrayList<>();
        vuelo3ACE.add("SVQ");
        vuelo3ACE.add("14:00");
        vuelo3ACE.add("15:45");
        vuelo3ACE.add("105");
        ACE.add(vuelo1ACE);
        ACE.add(vuelo2ACE);
        ACE.add(vuelo3ACE);

        // Aeropuerto Ibiza (IBZ)
        List<List<String>> IBZ = new ArrayList<>();
        List<String> vuelo1IBZ = new ArrayList<>();
        vuelo1IBZ.add("MAD");
        vuelo1IBZ.add("08:30");
        vuelo1IBZ.add("10:00");
        vuelo1IBZ.add("90");
        List<String> vuelo2IBZ = new ArrayList<>();
        vuelo2IBZ.add("BCN");
        vuelo2IBZ.add("10:30");
        vuelo2IBZ.add("12:15");
        vuelo2IBZ.add("105");
        List<String> vuelo3IBZ = new ArrayList<>();
        vuelo3IBZ.add("SVQ");
        vuelo3IBZ.add("14:00");
        vuelo3IBZ.add("15:45");
        vuelo3IBZ.add("105");
        IBZ.add(vuelo1IBZ);
        IBZ.add(vuelo2IBZ);
        IBZ.add(vuelo3IBZ);

        // Aeropuerto Menorca (MAH)
        List<List<String>> MAH = new ArrayList<>();
        List<String> vuelo1MAH = new ArrayList<>();
        vuelo1MAH.add("MAD");
        vuelo1MAH.add("08:30");
        vuelo1MAH.add("10:00");
        vuelo1MAH.add("90");
        List<String> vuelo2MAH = new ArrayList<>();
        vuelo2MAH.add("BCN");
        vuelo2MAH.add("10:30");
        vuelo2MAH.add("12:15");
        vuelo2MAH.add("105");
        List<String> vuelo3MAH = new ArrayList<>();
        vuelo3MAH.add("SVQ");
        vuelo3MAH.add("14:00");
        vuelo3MAH.add("15:45");
        vuelo3MAH.add("105");
        MAH.add(vuelo1MAH);
        MAH.add(vuelo2MAH);
        MAH.add(vuelo3MAH);

        // Aeropuerto Tenerife Sur (TFS)
        List<List<String>> TFS = new ArrayList<>();
        List<String> vuelo1TFS = new ArrayList<>();
        vuelo1TFS.add("MAD");
        vuelo1TFS.add("08:30");
        vuelo1TFS.add("10:00");
        vuelo1TFS.add("90");
        List<String> vuelo2TFS = new ArrayList<>();
        vuelo2TFS.add("BCN");
        vuelo2TFS.add("10:30");
        vuelo2TFS.add("12:15");
        vuelo2TFS.add("105");
        List<String> vuelo3TFS = new ArrayList<>();
        vuelo3TFS.add("SVQ");
        vuelo3TFS.add("14:00");
        vuelo3TFS.add("15:45");
        vuelo3TFS.add("105");
        TFS.add(vuelo1TFS);
        TFS.add(vuelo2TFS);
        TFS.add(vuelo3TFS);

        // Aeropuerto Tenerife Norte (TFN)
        List<List<String>> TFN2 = new ArrayList<>();
        List<String> vuelo1TFN2 = new ArrayList<>();
        vuelo1TFN2.add("MAD");
        vuelo1TFN2.add("08:30");
        vuelo1TFN2.add("10:00");
        vuelo1TFN2.add("90");
        List<String> vuelo2TFN2 = new ArrayList<>();
        vuelo2TFN2.add("BCN");
        vuelo2TFN2.add("10:30");
        vuelo2TFN2.add("12:15");
        vuelo2TFN2.add("105");
        List<String> vuelo3TFN2 = new ArrayList<>();
        vuelo3TFN2.add("SVQ");
        vuelo3TFN2.add("14:00");
        vuelo3TFN2.add("15:45");
        vuelo3TFN2.add("105");
        TFN2.add(vuelo1TFN2);
        TFN2.add(vuelo2TFN2);
        TFN2.add(vuelo3TFN2);

        // Aeropuerto Granada (GRX)
        List<List<String>> GRX = new ArrayList<>();
        List<String> vuelo1GRX = new ArrayList<>();
        vuelo1GRX.add("MAD");
        vuelo1GRX.add("08:30");
        vuelo1GRX.add("10:00");
        vuelo1GRX.add("90");
        List<String> vuelo2GRX = new ArrayList<>();
        vuelo2GRX.add("BCN");
        vuelo2GRX.add("10:30");
        vuelo2GRX.add("12:15");
        vuelo2GRX.add("105");
        List<String> vuelo3GRX = new ArrayList<>();
        vuelo3GRX.add("SVQ");
        vuelo3GRX.add("14:00");
        vuelo3GRX.add("15:45");
        vuelo3GRX.add("105");
        GRX.add(vuelo1GRX);
        GRX.add(vuelo2GRX);
        GRX.add(vuelo3GRX);

        // Aeropuerto Santiago de Compostela (SCQ)
        List<List<String>> SCQ = new ArrayList<>();
        List<String> vuelo1SCQ = new ArrayList<>();
        vuelo1SCQ.add("MAD");
        vuelo1SCQ.add("08:30");
        vuelo1SCQ.add("10:00");
        vuelo1SCQ.add("90");
        List<String> vuelo2SCQ = new ArrayList<>();
        vuelo2SCQ.add("BCN");
        vuelo2SCQ.add("10:30");
        vuelo2SCQ.add("12:15");
        vuelo2SCQ.add("105");
        List<String> vuelo3SCQ = new ArrayList<>();
        vuelo3SCQ.add("SVQ");
        vuelo3SCQ.add("14:00");
        vuelo3SCQ.add("15:45");
        vuelo3SCQ.add("105");
        SCQ.add(vuelo1SCQ);
        SCQ.add(vuelo2SCQ);
        SCQ.add(vuelo3SCQ);

        // Aeropuerto Vigo (VGO)
        List<List<String>> VGO = new ArrayList<>();
        List<String> vuelo1VGO = new ArrayList<>();
        vuelo1VGO.add("MAD");
        vuelo1VGO.add("08:30");
        vuelo1VGO.add("10:00");
        vuelo1VGO.add("90");
        List<String> vuelo2VGO = new ArrayList<>();
        vuelo2VGO.add("BCN");
        vuelo2VGO.add("10:30");
        vuelo2VGO.add("12:15");
        vuelo2VGO.add("105");
        List<String> vuelo3VGO = new ArrayList<>();
        vuelo3VGO.add("SVQ");
        vuelo3VGO.add("14:00");
        vuelo3VGO.add("15:45");
        vuelo3VGO.add("105");
        VGO.add(vuelo1VGO);
        VGO.add(vuelo2VGO);
        VGO.add(vuelo3VGO);

        // Aeropuerto A Coruña (LCG)
        List<List<String>> LCG = new ArrayList<>();
        List<String> vuelo1LCG = new ArrayList<>();
        vuelo1LCG.add("MAD");
        vuelo1LCG.add("08:30");
        vuelo1LCG.add("10:00");
        vuelo1LCG.add("90");
        List<String> vuelo2LCG = new ArrayList<>();
        vuelo2LCG.add("BCN");
        vuelo2LCG.add("10:30");
        vuelo2LCG.add("12:15");
        vuelo2LCG.add("105");
        List<String> vuelo3LCG = new ArrayList<>();
        vuelo3LCG.add("SVQ");
        vuelo3LCG.add("14:00");
        vuelo3LCG.add("15:45");
        vuelo3LCG.add("105");
        LCG.add(vuelo1LCG);
        LCG.add(vuelo2LCG);
        LCG.add(vuelo3LCG);

        // Aeropuerto Oviedo (OVD)
        List<List<String>> OVD = new ArrayList<>();
        List<String> vuelo1OVD = new ArrayList<>();
        vuelo1OVD.add("MAD");
        vuelo1OVD.add("08:30");
        vuelo1OVD.add("10:00");
        vuelo1OVD.add("90");
        List<String> vuelo2OVD = new ArrayList<>();
        vuelo2OVD.add("BCN");
        vuelo2OVD.add("10:30");
        vuelo2OVD.add("12:15");
        vuelo2OVD.add("105");
        List<String> vuelo3OVD = new ArrayList<>();
        vuelo3OVD.add("SVQ");
        vuelo3OVD.add("14:00");
        vuelo3OVD.add("15:45");
        vuelo3OVD.add("105");
        OVD.add(vuelo1OVD);
        OVD.add(vuelo2OVD);
        OVD.add(vuelo3OVD);

        // Aeropuerto Santander (SDR)
        List<List<String>> SDR = new ArrayList<>();
        List<String> vuelo1SDR = new ArrayList<>();
        vuelo1SDR.add("MAD");
        vuelo1SDR.add("08:30");
        vuelo1SDR.add("10:00");
        vuelo1SDR.add("90");
        List<String> vuelo2SDR = new ArrayList<>();
        vuelo2SDR.add("BCN");
        vuelo2SDR.add("10:30");
        vuelo2SDR.add("12:15");
        vuelo2SDR.add("105");
        List<String> vuelo3SDR = new ArrayList<>();
        vuelo3SDR.add("SVQ");
        vuelo3SDR.add("14:00");
        vuelo3SDR.add("15:45");
        vuelo3SDR.add("105");
        SDR.add(vuelo1SDR);
        SDR.add(vuelo2SDR);
        SDR.add(vuelo3SDR);

        // Aeropuerto Pamplona (PNA)
        List<List<String>> PNA = new ArrayList<>();
        List<String> vuelo1PNA = new ArrayList<>();
        vuelo1PNA.add("MAD");
        vuelo1PNA.add("08:30");
        vuelo1PNA.add("10:00");
        vuelo1PNA.add("90");
        List<String> vuelo2PNA = new ArrayList<>();
        vuelo2PNA.add("BCN");
        vuelo2PNA.add("10:30");
        vuelo2PNA.add("12:15");
        vuelo2PNA.add("105");
        List<String> vuelo3PNA = new ArrayList<>();
        vuelo3PNA.add("SVQ");
        vuelo3PNA.add("14:00");
        vuelo3PNA.add("15:45");
        vuelo3PNA.add("105");
        PNA.add(vuelo1PNA);
        PNA.add(vuelo2PNA);
        PNA.add(vuelo3PNA);

        // Aeropuerto Logroño (RJL)
        List<List<String>> RJL = new ArrayList<>();
        List<String> vuelo1RJL = new ArrayList<>();
        vuelo1RJL.add("MAD");
        vuelo1RJL.add("08:30");
        vuelo1RJL.add("10:00");
        vuelo1RJL.add("90");
        List<String> vuelo2RJL = new ArrayList<>();
        vuelo2RJL.add("BCN");
        vuelo2RJL.add("10:30");
        vuelo2RJL.add("12:15");
        vuelo2RJL.add("105");
        List<String> vuelo3RJL = new ArrayList<>();
        vuelo3RJL.add("SVQ");
        vuelo3RJL.add("14:00");
        vuelo3RJL.add("15:45");
        vuelo3RJL.add("105");
        RJL.add(vuelo1RJL);
        RJL.add(vuelo2RJL);
        RJL.add(vuelo3RJL);

        // Aeropuerto San Sebastián (EAS)
        List<List<String>> EAS = new ArrayList<>();
        List<String> vuelo1EAS = new ArrayList<>();
        vuelo1EAS.add("MAD");
        vuelo1EAS.add("08:30");
        vuelo1EAS.add("10:00");
        vuelo1EAS.add("90");
        List<String> vuelo2EAS = new ArrayList<>();
        vuelo2EAS.add("BCN");
        vuelo2EAS.add("10:30");
        vuelo2EAS.add("12:15");
        vuelo2EAS.add("105");
        List<String> vuelo3EAS = new ArrayList<>();
        vuelo3EAS.add("SVQ");
        vuelo3EAS.add("14:00");
        vuelo3EAS.add("15:45");
        vuelo3EAS.add("105");
        EAS.add(vuelo1EAS);
        EAS.add(vuelo2EAS);
        EAS.add(vuelo3EAS);

        // Aeropuerto Vitoria (VIT)
        List<List<String>> VIT = new ArrayList<>();
        List<String> vuelo1VIT = new ArrayList<>();
        vuelo1VIT.add("MAD");
        vuelo1VIT.add("08:30");
        vuelo1VIT.add("10:00");
        vuelo1VIT.add("90");
        List<String> vuelo2VIT = new ArrayList<>();
        vuelo2VIT.add("BCN");
        vuelo2VIT.add("10:30");
        vuelo2VIT.add("12:15");
        vuelo2VIT.add("105");
        List<String> vuelo3VIT = new ArrayList<>();
        vuelo3VIT.add("SVQ");
        vuelo3VIT.add("14:00");
        vuelo3VIT.add("15:45");
        vuelo3VIT.add("105");
        VIT.add(vuelo1VIT);
        VIT.add(vuelo2VIT);
        VIT.add(vuelo3VIT);

        // Aeropuerto Zaragoza (ZAZ)
        List<List<String>> ZAZ = new ArrayList<>();
        List<String> vuelo1ZAZ = new ArrayList<>();
        vuelo1ZAZ.add("MAD");
        vuelo1ZAZ.add("08:30");
        vuelo1ZAZ.add("10:00");
        vuelo1ZAZ.add("90");
        List<String> vuelo2ZAZ = new ArrayList<>();
        vuelo2ZAZ.add("BCN");
        vuelo2ZAZ.add("10:30");
        vuelo2ZAZ.add("12:15");
        vuelo2ZAZ.add("105");
        List<String> vuelo3ZAZ = new ArrayList<>();
        vuelo3ZAZ.add("SVQ");
        vuelo3ZAZ.add("14:00");
        vuelo3ZAZ.add("15:45");
        vuelo3ZAZ.add("105");
        ZAZ.add(vuelo1ZAZ);
        ZAZ.add(vuelo2ZAZ);
        ZAZ.add(vuelo3ZAZ);

        // Aeropuerto Teruel (TEV)
        List<List<String>> TEV = new ArrayList<>();
        List<String> vuelo1TEV = new ArrayList<>();
        vuelo1TEV.add("SVQ");
        vuelo1TEV.add("07:00");
        vuelo1TEV.add("08:30");
        vuelo1TEV.add("90");
        List<String> vuelo2TEV = new ArrayList<>();
        vuelo2TEV.add("BCN");
        vuelo2TEV.add("09:00");
        vuelo2TEV.add("11:15");
        vuelo2TEV.add("135");
        List<String> vuelo3TEV = new ArrayList<>();
        vuelo3TEV.add("MAD");
        vuelo3TEV.add("13:00");
        vuelo3TEV.add("14:45");
        vuelo3TEV.add("105");
        TEV.add(vuelo1TEV);
        TEV.add(vuelo2TEV);
        TEV.add(vuelo3TEV);

        // Aeropuerto Huesca (HSK)
        List<List<String>> HSK = new ArrayList<>();
        List<String> vuelo1HSK = new ArrayList<>();
        vuelo1HSK.add("SVQ");
        vuelo1HSK.add("07:00");
        vuelo1HSK.add("08:30");
        vuelo1HSK.add("90");
        List<String> vuelo2HSK = new ArrayList<>();
        vuelo2HSK.add("BCN");
        vuelo2HSK.add("09:00");
        vuelo2HSK.add("11:15");
        vuelo2HSK.add("135");
        List<String> vuelo3HSK = new ArrayList<>();
        vuelo3HSK.add("MAD");
        vuelo3HSK.add("13:00");
        vuelo3HSK.add("14:45");
        vuelo3HSK.add("105");
        HSK.add(vuelo1HSK);
        HSK.add(vuelo2HSK);
        HSK.add(vuelo3HSK);

        // Aeropuerto León (LEN)
        List<List<String>> LEN = new ArrayList<>();
        List<String> vuelo1LEN = new ArrayList<>();
        vuelo1LEN.add("SVQ");
        vuelo1LEN.add("07:00");
        vuelo1LEN.add("08:30");
        vuelo1LEN.add("90");
        List<String> vuelo2LEN = new ArrayList<>();
        vuelo2LEN.add("BCN");
        vuelo2LEN.add("09:00");
        vuelo2LEN.add("11:15");
        vuelo2LEN.add("135");
        List<String> vuelo3LEN = new ArrayList<>();
        vuelo3LEN.add("MAD");
        vuelo3LEN.add("13:00");
        vuelo3LEN.add("14:45");
        vuelo3LEN.add("105");
        LEN.add(vuelo1LEN);
        LEN.add(vuelo2LEN);
        LEN.add(vuelo3LEN);

        // Aeropuerto Valladolid (VLL)
        List<List<String>> VLL = new ArrayList<>();
        List<String> vuelo1VLL = new ArrayList<>();
        vuelo1VLL.add("SVQ");
        vuelo1VLL.add("07:00");
        vuelo1VLL.add("08:30");
        vuelo1VLL.add("90");
        List<String> vuelo2VLL = new ArrayList<>();
        vuelo2VLL.add("BCN");
        vuelo2VLL.add("09:00");
        vuelo2VLL.add("11:15");
        vuelo2VLL.add("135");
        List<String> vuelo3VLL = new ArrayList<>();
        vuelo3VLL.add("MAD");
        vuelo3VLL.add("13:00");
        vuelo3VLL.add("14:45");
        vuelo3VLL.add("105");
        VLL.add(vuelo1VLL);
        VLL.add(vuelo2VLL);
        VLL.add(vuelo3VLL);

        // Aeropuerto Burgos (RGS)
        List<List<String>> RGS = new ArrayList<>();
        List<String> vuelo1RGS = new ArrayList<>();
        vuelo1RGS.add("SVQ");
        vuelo1RGS.add("07:00");
        vuelo1RGS.add("08:30");
        vuelo1RGS.add("90");
        List<String> vuelo2RGS = new ArrayList<>();
        vuelo2RGS.add("BCN");
        vuelo2RGS.add("09:00");
        vuelo2RGS.add("11:15");
        vuelo2RGS.add("135");
        List<String> vuelo3RGS = new ArrayList<>();
        vuelo3RGS.add("MAD");
        vuelo3RGS.add("13:00");
        vuelo3RGS.add("14:45");
        vuelo3RGS.add("105");
        RGS.add(vuelo1RGS);
        RGS.add(vuelo2RGS);
        RGS.add(vuelo3RGS);

        // Aeropuerto Salamanca (SLM)
        List<List<String>> SLM = new ArrayList<>();
        List<String> vuelo1SLM = new ArrayList<>();
        vuelo1SLM.add("SVQ");
        vuelo1SLM.add("07:00");
        vuelo1SLM.add("08:30");
        vuelo1SLM.add("90");
        List<String> vuelo2SLM = new ArrayList<>();
        vuelo2SLM.add("BCN");
        vuelo2SLM.add("09:00");
        vuelo2SLM.add("11:15");
        vuelo2SLM.add("135");
        List<String> vuelo3SLM = new ArrayList<>();
        vuelo3SLM.add("MAD");
        vuelo3SLM.add("13:00");
        vuelo3SLM.add("14:45");
        vuelo3SLM.add("105");
        SLM.add(vuelo1SLM);
        SLM.add(vuelo2SLM);
        SLM.add(vuelo3SLM);




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
