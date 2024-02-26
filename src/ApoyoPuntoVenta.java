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
        IATAdic.put("Teruel", "TEV");
        IATAdic.put("Huesca", "HSK");
        IATAdic.put("León", "LEN");
        IATAdic.put("Valladolid", "VLL");
        IATAdic.put("Burgos", "RGS");
        IATAdic.put("Salamanca", "SLM");

        HashMap<String, String> vuelosDic = new HashMap<>();

        List<String> SVQ = new ArrayList<>();
        SVQ.add("SVQ");
        SVQ.add("7:45");
        SVQ.add("18:55");
        SVQ.add("90");

        List<String> MAD = new ArrayList<>();
        MAD.add("MAD");
        MAD.add("8:00");
        MAD.add("19:30");
        MAD.add("120");

        List<String> BCN = new ArrayList<>();
        BCN.add("BCN");
        BCN.add("9:15");
        BCN.add("20:45");
        BCN.add("105");

        List<String> VLC = new ArrayList<>();
        VLC.add("VLC");
        VLC.add("10:30");
        VLC.add("21:45");
        VLC.add("75");

        List<String> BIO = new ArrayList<>();
        BIO.add("BIO");
        BIO.add("11:45");
        BIO.add("22:30");
        BIO.add("150");

        List<String> AGP = new ArrayList<>();
        AGP.add("AGP");
        AGP.add("12:15");
        AGP.add("23:00");
        AGP.add("180");

        List<String> ALC = new ArrayList<>();
        ALC.add("ALC");
        ALC.add("13:30");
        ALC.add("23:45");
        ALC.add("135");

        List<String> PMI = new ArrayList<>();
        PMI.add("PMI");
        PMI.add("14:45");
        PMI.add("0:30");
        PMI.add("165");

        List<String> LPA = new ArrayList<>();
        LPA.add("LPA");
        LPA.add("15:00");
        LPA.add("1:15");
        LPA.add("195");

        List<String> TFN = new ArrayList<>();
        TFN.add("TFN");
        TFN.add("16:15");
        TFN.add("2:30");
        TFN.add("45");

        List<String> FUE = new ArrayList<>();
        FUE.add("FUE");
        FUE.add("17:30");
        FUE.add("3:45");
        FUE.add("60");

        List<String> ACE = new ArrayList<>();
        ACE.add("ACE");
        ACE.add("18:45");
        ACE.add("4:00");
        ACE.add("30");

        List<String> IBZ = new ArrayList<>();
        IBZ.add("IBZ");
        IBZ.add("19:00");
        IBZ.add("5:15");
        IBZ.add("15");

        List<String> MAH = new ArrayList<>();
        MAH.add("MAH");
        MAH.add("20:15");
        MAH.add("6:30");
        MAH.add("90");

        List<String> TFS = new ArrayList<>();
        TFS.add("TFS");
        TFS.add("21:30");
        TFS.add("7:45");
        TFS.add("120");

        List<String> TFN2 = new ArrayList<>();
        TFN2.add("TFN");
        TFN2.add("22:45");
        TFN2.add("8:00");
        TFN2.add("75");

        List<String> GRX = new ArrayList<>();
        GRX.add("GRX");
        GRX.add("0:00");
        GRX.add("9:15");
        GRX.add("105");

        List<String> SCQ = new ArrayList<>();
        SCQ.add("SCQ");
        SCQ.add("1:15");
        SCQ.add("10:30");
        SCQ.add("150");

        List<String> VGO = new ArrayList<>();
        VGO.add("VGO");
        VGO.add("2:30");
        VGO.add("11:45");
        VGO.add("180");

        List<String> LCG = new ArrayList<>();
        LCG.add("LCG");
        LCG.add("3:45");
        LCG.add("13:00");
        LCG.add("135");

        List<String> OVD = new ArrayList<>();
        OVD.add("OVD");
        OVD.add("5:00");
        OVD.add("14:15");
        OVD.add("165");

        List<String> SDR = new ArrayList<>();
        SDR.add("SDR");
        SDR.add("6:15");
        SDR.add("15:30");
        SDR.add("195");

        List<String> PNA = new ArrayList<>();
        PNA.add("PNA");
        PNA.add("7:30");
        PNA.add("16:45");
        PNA.add("45");

        List<String> RJL = new ArrayList<>();
        RJL.add("RJL");
        RJL.add("8:45");
        RJL.add("18:00");
        RJL.add("60");

        List<String> EAS = new ArrayList<>();
        EAS.add("EAS");
        EAS.add("10:00");
        EAS.add("19:15");
        EAS.add("30");

        List<String> VIT = new ArrayList<>();
        VIT.add("VIT");
        VIT.add("11:15");
        VIT.add("20:30");
        VIT.add("15");

        List<String> ZAZ = new ArrayList<>();
        ZAZ.add("ZAZ");
        ZAZ.add("12:30");
        ZAZ.add("21:45");
        ZAZ.add("90");

        List<String> TEV = new ArrayList<>();
        TEV.add("TEV");
        TEV.add("13:45");
        TEV.add("23:00");
        TEV.add("120");

        List<String> HSK = new ArrayList<>();
        HSK.add("HSK");
        HSK.add("15:00");
        HSK.add("0:15");
        HSK.add("75");

        List<String> LEN = new ArrayList<>();
        LEN.add("LEN");
        LEN.add("16:15");
        LEN.add("1:30");
        LEN.add("105");

        List<String> VLL = new ArrayList<>();
        VLL.add("VLL");
        VLL.add("17:30");
        VLL.add("2:45");
        VLL.add("150");

        List<String> RGS = new ArrayList<>();
        RGS.add("RGS");
        RGS.add("18:45");
        RGS.add("4:00");
        RGS.add("180");

        List<String> SLM = new ArrayList<>();
        SLM.add("SLM");
        SLM.add("20:00");
        SLM.add("5:15");
        SLM.add("135");


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
