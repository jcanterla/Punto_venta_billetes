import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class interfaz_tercer_bloque {
    public static void main(String[] args) {
        // Crear marco principal
        JFrame marco = new JFrame("Air Camela");


        // Crear paneles
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // Panel 2
        // Agregar JSlider al panel 2
        JLabel etiqueta = new JLabel("Filas: ");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 26, 12);
        // Pintar y espaciar la info del slider
        slider.setPaintTrack(true);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(2);
        slider.setValue(1);
        // Colocar texto inicial con el valor del JSlider
        etiqueta.setText("Filas: " + slider.getValue());
        panel2.setLayout(new BorderLayout());
        panel2.add(etiqueta, BorderLayout.NORTH);
        panel2.add(slider, BorderLayout.CENTER);
        // Movimiento del slider
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                etiqueta.setText("Filas: " + slider.getValue());
            }
        });


        // Panel 3
        // Agregar JRadioButton al panel 3
        JRadioButton boton1 = new JRadioButton("Pasillo");
        JRadioButton boton2 = new JRadioButton("Centro");
        JRadioButton boton3 = new JRadioButton("Ventana");
        boton3.setSelected(true);
        // Agregar botones al grupo para seleccionar solamente 1
        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(boton1);
        grupo2.add(boton2);
        grupo2.add(boton3);
        // Agregar botones al panel 3
        panel3.add(boton1);
        panel3.add(boton2);
        panel3.add(boton3);

        // Panel 4
        // Agregar JCheckBox al panel 4
        JCheckBox check1 = new JCheckBox("Embarque Prior.");
        JCheckBox check2 = new JCheckBox("Equipaje");
        check1.setSelected(true);
        check2.setSelected(true);
        // Agregar botones al panel 4
        panel4.add(check1);
        panel4.add(check2);

        // Panel 5


        // Configurar borde y título para el panel 1
        panel1.setBorder(new TitledBorder(new LineBorder(Color.blue),"Detalles", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel2.setBorder(new TitledBorder(new LineBorder(Color.blue),"Asiento", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel3.setBorder(new TitledBorder(new LineBorder(Color.blue),"Posición", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel4.setBorder(new TitledBorder(new LineBorder(Color.blue),"Extras", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel5.setBorder(new TitledBorder(new LineBorder(Color.blue),"Importes", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel1.add(panel2);
        panel1.add(panel3);
        panel1.add(panel4);


        // Agregar los paneles al marco principal con un BorderLayout
        marco.add(panel1, BorderLayout.WEST);
        marco.add(panel5, BorderLayout.CENTER);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Visiblidad y tamaño del marco principal
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        marco.pack();
        marco.setVisible(true);
    }
}
