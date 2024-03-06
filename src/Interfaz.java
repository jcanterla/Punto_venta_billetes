import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Interfaz {
    public static void main(String[] args) {
        // Crear el marco principal
        JFrame marco = new JFrame("Adivina el resultado de la suma");

        // Paneles para organizar los componentes
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();

        //añadir paneles al planel 3
        panel3.add(panel1);
        panel3.add(panel2);
        panel3.add(panel5);

        // Etiqueta para mostrar el título
        JLabel label1 = new JLabel("Punto venta Billetes ");

        // Configuración de la fuente de la etiqueta
        label1.setFont(new Font("Arial", Font.BOLD, 32));

        //meses spinner panel2
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        SpinnerListModel seleccion = new SpinnerListModel(meses);
        JLabel label3 = new JLabel("mes");
        JSpinner spinnermeses = new JSpinner(seleccion);
        spinnermeses.setPreferredSize(new Dimension(100, 20));

        //meses spinner panel5

        String[] meses5 = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        SpinnerListModel seleccion5 = new SpinnerListModel(meses);
        JLabel label5 = new JLabel("mes");
        JSpinner spinnermeses5 = new JSpinner(seleccion);
        spinnermeses.setPreferredSize(new Dimension(100, 20));


        // Botones de radio para las opciones de viaje
        JRadioButton radio1 = new JRadioButton("Ida solo");
        JRadioButton radio2 = new JRadioButton("Ida y vuelta");

        // Spinner para seleccionar el día panel2
        SpinnerModel dias = new SpinnerNumberModel(1, 1, 31, 1);
        JLabel label2 = new JLabel("Dia");
        JSpinner spinner = new JSpinner(dias);
        spinner.setPreferredSize(new Dimension(100, 20));

        // Spinner para seleccionar el año panel2

        JLabel label4 = new JLabel("año");
        SpinnerModel años = new SpinnerNumberModel(2024, 2024, 3000, 1);
        JSpinner spinner3 = new JSpinner(años);

        // Spinner para seleccionar el día panel5
        JLabel label6 = new JLabel("Dia");
        JSpinner spinner5 = new JSpinner(dias);
        spinner5.setPreferredSize(new Dimension(100, 20));

        // Spinner para seleccionar el año panel5
        JLabel añosetiqueta = new JLabel("año");
        JSpinner sppineraños5 = new JSpinner(años);


        // Agrupar los botones de radio para que solo se pueda seleccionar uno
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radio1);
        grupo.add(radio2);

        // Agregar los elementos al panel 1
        panel1.add(radio1);
        panel1.add(radio2);

        // Agregar los elementos al panel 2
        panel2.add(label2);
        panel2.add(spinner);
        panel2.add(label3);
        panel2.add(spinnermeses);
        panel2.add(label4);
        panel2.add(spinner3);



        //Añadir los paneles al panel 5

        panel5.add(label6);
        panel5.add(spinner5);
        panel5.add(label5);
        panel5.add(spinnermeses5);
        panel5.add(añosetiqueta);
        panel5.add(sppineraños5);

        // Añadir los elementos al panel 6
        JLabel label7 = new JLabel("Vuelta solo");
        JButton boton = new JButton("Buscar");
        panel6.add(boton);
        label6.add(label7);

        // Añadir los elementos al panel 7
        panel7.add(panel6);

        // Configurar el borde y el título para el panel 3
        panel1.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Modalidad", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel2.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "ida", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 13)));
        panel5.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Vuelta", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 13)));
        panel6.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Trayecto", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 13)));

        // Añadir los componentes al panel 4
        panel4.add(label1);

        // Configurar la visibilidad y el tamaño del marco principal
        marco.setVisible(true);
        marco.setSize(800, 400);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));

        // Agregar los paneles al marco principal con un BorderLayout
        marco.add(panel3, BorderLayout.WEST);
        marco.add(panel4, BorderLayout.NORTH);
        marco.add(panel7, BorderLayout.EAST);


        // Configurar el borde para la etiqueta
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));



        //funcionalidades botones radio
        radio1.addActionListener(e -> {
            spinner5.setEnabled(false);
            spinnermeses5.setEnabled(false);
            sppineraños5.setEnabled(false);
        });
        radio2.addActionListener(e -> {
            spinner5.setEnabled(true);
            spinnermeses5.setEnabled(true);
            sppineraños5.setEnabled(true);
        });
    }
}
