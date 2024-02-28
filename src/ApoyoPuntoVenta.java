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
        IATAdic.put("Jerez de la Frontera", "XRY");
        IATAdic.put("La Virgen del Camino", "LEN");
        IATAdic.put("Agoncillo", "RJL");
        IATAdic.put("Madrid","MCV");
        IATAdic.put("Málaga","AGP");
        IATAdic.put("Melilla","MLN");
        IATAdic.put("Mahón","MAH");
        IATAdic.put("Corvera","RMU");
        IATAdic.put("Palma de Mallorca","PMI");
        IATAdic.put("Noáin","PNA");
        IATAdic.put("Reus","REU");
        IATAdic.put("Sabadell","QSA");
        IATAdic.put("Machacón","SLM");
        IATAdic.put("Fuenterabía","EAS");
        IATAdic.put("Santiago de Compostela","SCQ");
        IATAdic.put("Sevilla","SVQ");
        IATAdic.put("Camargo","SDR");
        IATAdic.put("Marrachí","SBO");
        IATAdic.put("San Cristóbal de La Laguna","TFN");
        IATAdic.put("San Miguel de Abona","TFS");
        IATAdic.put("Villa de Mazo","SPC");
        IATAdic.put("Alajeró","GMZ");
        IATAdic.put("Valverde","VDE");
        IATAdic.put("Manises","VLC");
        IATAdic.put("Villanubla","VLL");
        IATAdic.put("Vigo","VGO");
        IATAdic.put("Vitoria","VIT");
        IATAdic.put("Zaragoza","ZAZ");
        IATAdic.put("Montferrer Castellbó","LEU");
        IATAdic.put("Benlloch","CDT");
        IATAdic.put("Cañada de Calatrava","CQM");
        IATAdic.put("Alguaire","ILD");
        IATAdic.put("Teruel","TEV");

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
        List<String> vuelo18MAD = new ArrayList<>();vuelo18MAD.add("XRY");vuelo18MAD.add("07:45");vuelo18MAD.add("18:55");vuelo18MAD.add("90");
        List<String> vuelo19MAD = new ArrayList<>();vuelo19MAD.add("LEN");vuelo19MAD.add("07:45");vuelo19MAD.add("18:55");vuelo19MAD.add("90");
        List<String> vuelo20MAD = new ArrayList<>();vuelo20MAD.add("RJL");vuelo20MAD.add("07:45");vuelo20MAD.add("18:55");vuelo20MAD.add("90");
        List<String> vuelo21MAD = new ArrayList<>();vuelo21MAD.add("MCV");vuelo21MAD.add("07:45");vuelo21MAD.add("18:55");vuelo21MAD.add("90");
        List<String> vuelo22MAD = new ArrayList<>();vuelo22MAD.add("AGP");vuelo22MAD.add("07:45");vuelo22MAD.add("18:55");vuelo22MAD.add("90");
        List<String> vuelo23MAD = new ArrayList<>();vuelo23MAD.add("MLN");vuelo23MAD.add("07:45");vuelo23MAD.add("18:55");vuelo23MAD.add("90");
        List<String> vuelo24MAD = new ArrayList<>();vuelo24MAD.add("MAH");vuelo24MAD.add("07:45");vuelo24MAD.add("18:55");vuelo24MAD.add("90");
        List<String> vuelo25MAD = new ArrayList<>();vuelo25MAD.add("RMU");vuelo25MAD.add("07:45");vuelo25MAD.add("18:55");vuelo25MAD.add("90");
        List<String> vuelo26MAD = new ArrayList<>();vuelo26MAD.add("PMI");vuelo26MAD.add("07:45");vuelo26MAD.add("18:55");vuelo26MAD.add("90");
        List<String> vuelo27MAD = new ArrayList<>();vuelo27MAD.add("PNA");vuelo27MAD.add("07:45");vuelo27MAD.add("18:55");vuelo27MAD.add("90");
        List<String> vuelo28MAD = new ArrayList<>();vuelo28MAD.add("REU");vuelo28MAD.add("07:45");vuelo28MAD.add("18:55");vuelo28MAD.add("90");
        List<String> vuelo29MAD = new ArrayList<>();vuelo29MAD.add("QSA");vuelo29MAD.add("07:45");vuelo29MAD.add("18:55");vuelo29MAD.add("90");
        List<String> vuelo30MAD = new ArrayList<>();vuelo30MAD.add("SLM");vuelo30MAD.add("07:45");vuelo30MAD.add("18:55");vuelo30MAD.add("90");
        List<String> vuelo31MAD = new ArrayList<>();vuelo31MAD.add("EAS");vuelo31MAD.add("07:45");vuelo31MAD.add("18:55");vuelo31MAD.add("90");
        List<String> vuelo32MAD = new ArrayList<>();vuelo32MAD.add("SCQ");vuelo32MAD.add("07:45");vuelo32MAD.add("18:55");vuelo32MAD.add("90");
        List<String> vuelo33MAD = new ArrayList<>();vuelo33MAD.add("SVQ");vuelo33MAD.add("07:45");vuelo33MAD.add("18:55");vuelo33MAD.add("90");
        List<String> vuelo34MAD = new ArrayList<>();vuelo34MAD.add("SDR");vuelo34MAD.add("07:45");vuelo34MAD.add("18:55");vuelo34MAD.add("90");
        List<String> vuelo35MAD = new ArrayList<>();vuelo35MAD.add("SBO");vuelo35MAD.add("07:45");vuelo35MAD.add("18:55");vuelo35MAD.add("90");
        List<String> vuelo36MAD = new ArrayList<>();vuelo36MAD.add("TFN");vuelo36MAD.add("07:45");vuelo36MAD.add("18:55");vuelo36MAD.add("90");
        List<String> vuelo37MAD = new ArrayList<>();vuelo37MAD.add("TFS");vuelo37MAD.add("07:45");vuelo37MAD.add("18:55");vuelo37MAD.add("90");
        List<String> vuelo38MAD = new ArrayList<>();vuelo38MAD.add("SPC");vuelo38MAD.add("07:45");vuelo38MAD.add("18:55");vuelo38MAD.add("90");
        List<String> vuelo39MAD = new ArrayList<>();vuelo39MAD.add("GMZ");vuelo39MAD.add("07:45");vuelo39MAD.add("18:55");vuelo39MAD.add("90");
        List<String> vuelo40MAD = new ArrayList<>();vuelo40MAD.add("VDE");vuelo40MAD.add("07:45");vuelo40MAD.add("18:55");vuelo40MAD.add("90");
        List<String> vuelo41MAD = new ArrayList<>();vuelo41MAD.add("VLC");vuelo41MAD.add("07:45");vuelo41MAD.add("18:55");vuelo41MAD.add("90");
        List<String> vuelo42MAD = new ArrayList<>();vuelo42MAD.add("VLL");vuelo42MAD.add("07:45");vuelo42MAD.add("18:55");vuelo42MAD.add("90");
        List<String> vuelo43MAD = new ArrayList<>();vuelo43MAD.add("VGO");vuelo43MAD.add("07:45");vuelo43MAD.add("18:55");vuelo43MAD.add("90");
        List<String> vuelo44MAD = new ArrayList<>();vuelo44MAD.add("VIT");vuelo44MAD.add("07:45");vuelo44MAD.add("18:55");vuelo44MAD.add("90");
        List<String> vuelo45MAD = new ArrayList<>();vuelo45MAD.add("ZAZ");vuelo45MAD.add("07:45");vuelo45MAD.add("18:55");vuelo45MAD.add("90");
        List<String> vuelo46MAD = new ArrayList<>();vuelo46MAD.add("LEU");vuelo46MAD.add("07:45");vuelo46MAD.add("18:55");vuelo46MAD.add("90");
        List<String> vuelo47MAD = new ArrayList<>();vuelo47MAD.add("CDT");vuelo47MAD.add("07:45");vuelo47MAD.add("18:55");vuelo47MAD.add("90");
        List<String> vuelo48MAD = new ArrayList<>();vuelo48MAD.add("CQM");vuelo48MAD.add("07:45");vuelo48MAD.add("18:55");vuelo48MAD.add("90");
        List<String> vuelo49MAD = new ArrayList<>();vuelo49MAD.add("ILD");vuelo49MAD.add("07:45");vuelo49MAD.add("18:55");vuelo49MAD.add("90");
        List<String> vuelo50MAD = new ArrayList<>();vuelo50MAD.add("TEV");vuelo50MAD.add("07:45");vuelo50MAD.add("18:55");vuelo50MAD.add("90");
        List<String>[] MAD = new List[]{vuelo1MAD,vuelo2MAD,vuelo3MAD,vuelo4MAD,vuelo5MAD,vuelo6MAD,vuelo7MAD,vuelo8MAD,vuelo9MAD,vuelo10MAD,vuelo11MAD,vuelo12MAD,vuelo13MAD,vuelo14MAD,vuelo15MAD,vuelo16MAD,vuelo17MAD,vuelo18MAD,vuelo19MAD,vuelo20MAD,vuelo21MAD,vuelo22MAD,vuelo23MAD,vuelo24MAD,vuelo25MAD,vuelo26MAD,vuelo27MAD,vuelo28MAD,vuelo29MAD,vuelo30MAD,vuelo31MAD,vuelo32MAD,vuelo33MAD,vuelo34MAD,vuelo35MAD,vuelo36MAD,vuelo37MAD,vuelo38MAD,vuelo39MAD,vuelo40MAD,vuelo41MAD,vuelo42MAD,vuelo43MAD,vuelo44MAD,vuelo45MAD,vuelo46MAD,vuelo47MAD,vuelo48MAD,vuelo49MAD,vuelo50MAD};
        agrupacion.put("MAD", List.of(MAD));

        // Aeropuerto Albacete (ABC)



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

