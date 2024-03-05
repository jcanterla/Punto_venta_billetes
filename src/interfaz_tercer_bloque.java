import javax.swing.*;
import javax.swing.border.BevelBorder;
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
        JPanel panelTercero = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();

        // PanelTercero
        panelTercero.setLayout(new BorderLayout());
        panelTercero.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

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
        JLabel etiqueta1 = new JLabel("Asiento: ");
        JLabel etiqueta2 = new JLabel("Embarque: ");
        JLabel etiqueta3 = new JLabel("Equipaje: ");
        JTextField campo1 = new JTextField(5);
        campo1.setFont(new Font("Arial", Font.BOLD, 12));
        JTextField campo2 = new JTextField(5);
        campo2.setFont(new Font("Arial", Font.BOLD, 12));
        JTextField campo3 = new JTextField(5);
        campo3.setFont(new Font("Arial", Font.BOLD, 12));
        JLabel etiqueta4 = new JLabel("Precio Final: ");
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));
        JTextField campo4 = new JTextField(5);
        campo4.setFont(new Font("Arial", Font.BOLD, 15));
        panel5.setLayout(new BorderLayout());
        JPanel panel5_1 = new JPanel();
        JPanel panel5_1_1 = new JPanel();
        panel5_1.setLayout(new BorderLayout());
        panel5_1_1.add(etiqueta1);
        panel5_1_1.add(campo1);
        panel5_1_1.add(etiqueta2);
        panel5_1_1.add(campo2);
        panel5_1_1.add(etiqueta3);
        panel5_1_1.add(campo3);
        panel5_1.add(panel5_1_1, BorderLayout.NORTH);
        JPanel panel5_1_2 = new JPanel();
        panel5_1_2.add(etiqueta4);
        panel5_1_2.add(campo4);
        panel5_1.add(panel5_1_2, BorderLayout.CENTER);
        panel5.add(panel5_1, BorderLayout.CENTER);
        // Crear botones al panel 5
        Icon icono1 = new ImageIcon("src/aceptar.png");
        Icon icono2 = new ImageIcon("src/rechazar.png");
        JButton boton4 = new JButton(icono1);
        JButton boton5 = new JButton(icono2);
        JPanel panel5_2 = new JPanel();
        panel5_2.setLayout(new BorderLayout());
        panel5_2.add(boton4, BorderLayout.NORTH);
        panel5_2.add(boton5, BorderLayout.CENTER);
        panel5_2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        panel5.add(panel5_2, BorderLayout.EAST);

        // Panel 6
        JLabel imagen = new JLabel();
        ImageIcon icono3 = new ImageIcon("src/ico_bill_av_ida.png");
        ImageIcon icono4 = new ImageIcon("src/ico_bill_av_iv.png");
        imagen.setIcon(icono3);
        panel6.add(imagen);


        // Panel 7
        panel7.setLayout(new BorderLayout());
        panel7.add(panel5, BorderLayout.NORTH);
        panel7.add(panel6, BorderLayout.CENTER);

        // Configurar borde y título para el panel 1
        panel1.setBorder(new TitledBorder(new LineBorder(Color.blue),"Detalles", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel2.setBorder(new TitledBorder(new LineBorder(Color.blue),"Asiento", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel3.setBorder(new TitledBorder(new LineBorder(Color.blue),"Posición", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel4.setBorder(new TitledBorder(new LineBorder(Color.blue),"Extras", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel5.setBorder(new TitledBorder(new LineBorder(Color.blue),"Importes", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel6.setBorder(new TitledBorder(new LineBorder(Color.blue),"Billete", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel1.add(panel2);
        panel1.add(panel3);
        panel1.add(panel4);


        // Agregar los paneles al marco principal con un BorderLayout
        panelTercero.add(panel1, BorderLayout.WEST);
        panelTercero.add(panel7, BorderLayout.CENTER);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Visiblidad y tamaño del marco principal
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        marco.add(panelTercero);
        marco.pack();
        marco.setVisible(true);
    }
}
