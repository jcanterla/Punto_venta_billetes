import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();

        // Panel 2
        // Agregar JSlider al panel 2
        JLabel etiqueta = new JLabel("Filas: ");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 26, 1);
        // Pintar y espaciar la info del slider
        slider.setPaintTrack(true);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(2);
        slider.setValue(1); // Valor inicial ajustado a 1
        etiqueta.setText("Filas: " + slider.getValue());
        panel2.setLayout(new BorderLayout());
        panel2.add(etiqueta, BorderLayout.NORTH);
        panel2.add(slider, BorderLayout.CENTER);

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

        check2.setSelected(true);
        // Agregar botones al panel 4
        panel4.add(check1);
        panel4.add(check2);

        // Panel 5
        JLabel etiqueta1 = new JLabel("Asiento: ");
        JLabel etiqueta2 = new JLabel("Embarque: ");
        JLabel etiqueta3 = new JLabel("Equipaje: ");
        JTextField campo1 = new JTextField(7); // Aumentamos el tamaño para acomodar el formato
        campo1.setFont(new Font("Arial", Font.BOLD, 12));
        campo1.setText("12.00€"); // Valor inicial ajustado a 12.00€
        JTextField campo2 = new JTextField(7); // Aumentamos el tamaño para acomodar el formato
        campo2.setFont(new Font("Arial", Font.BOLD, 12));
        campo2.setText("0.00€"); // Valor inicial ajustado a 0.00€
        JTextField campo3 = new JTextField(7); // Aumentamos el tamaño para acomodar el formato
        campo3.setFont(new Font("Arial", Font.BOLD, 12));
        campo3.setText("10.00€"); // Valor inicial ajustado a 10.00€
        JLabel etiqueta4 = new JLabel("Precio Final: ");
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 15));
        JTextField campo4 = new JTextField(7);
        campo4.setFont(new Font("Arial", Font.BOLD, 15));
        campo4.setEditable(false); // Hacemos el campo de texto no editable
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
        panel5_2.setLayout(new FlowLayout());
        panel5_2.add(boton4, BorderLayout.NORTH);
        panel5_2.add(boton5, BorderLayout.CENTER);
        panel5.add(panel5_2, BorderLayout.EAST);

        // Movimiento del slider
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                etiqueta.setText("Filas: " + slider.getValue());
                int valorSlider = slider.getValue();
                double precio = calcularPrecio(valorSlider);
                DecimalFormat formato = new DecimalFormat("#0.00€"); // Formato con dos decimales y símbolo de euro
                campo1.setText(formato.format(precio));
                calcularPrecioFinal(campo1, campo2, campo3, campo4); // Calculamos la suma final cada vez que cambia el slider
            }
        });



        check1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (check1.isSelected()) {
                    campo2.setText("10.00€");
                } else {
                    campo2.setText("0.00€"); // Cambio realizado para que muestre 0.00€ cuando no esté seleccionado
                }
                calcularPrecioFinal(campo1, campo2, campo3, campo4);
            }
        });
        check2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (check2.isSelected()) {
                    campo3.setText("10.00€");
                } else {
                    campo3.setText("0.00€"); // Cambio realizado para que muestre 0.00€ cuando no esté seleccionado
                }
                calcularPrecioFinal(campo1, campo2, campo3, campo4);
            }
        });

        // Escuchador de cambios en el campo1
        campo1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarPrecioFinal();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarPrecioFinal();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarPrecioFinal();
            }

            private void actualizarPrecioFinal() {
                calcularPrecioFinal(campo1, campo2, campo3, campo4);
            }
        });



        // Panel 6

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
        panel6.setBorder(new TitledBorder(new LineBorder(Color.blue),"Asientos", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel1.add(panel2);
        panel1.add(panel3);
        panel1.add(panel4);

        // Agregar los paneles al marco principal con un BorderLayout
        marco.add(panel1, BorderLayout.WEST);
        marco.add(panel7, BorderLayout.CENTER);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Visiblidad y tamaño del marco principal
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        marco.pack();
        marco.setVisible(true);
        marco.setResizable(false);
        marco.setLocationRelativeTo(null);
    }

    private static double calcularPrecio(int filas) {
        if (filas >= 1 && filas <= 6) {
            return 12.0;
        } else if (filas >= 7 && filas <= 19) {
            return 8.0;
        } else if (filas >= 20 && filas <= 26) {
            return 4.0;
        } else {
            return 0.0; // Valor predeterminado en caso de que esté fuera de rango
        }
    }

    private static void calcularPrecioFinal(JTextField campo1, JTextField campo2, JTextField campo3, JTextField campo4) {
        double precioAsiento = extraerPrecio(campo1);
        double precioEmbarque = extraerPrecio(campo2);
        double precioEquipaje = extraerPrecio(campo3);
        double precioFinal = precioAsiento + precioEmbarque + precioEquipaje;
        DecimalFormat formato = new DecimalFormat("#0.00€"); // Formato con dos decimales y símbolo de euro
        campo4.setText(formato.format(precioFinal));
    }

    private static double extraerPrecio(JTextField campo) {
        String texto = campo.getText().replace("€", "").trim(); // Eliminar el símbolo de euro y espacios
        try {
            return Double.parseDouble(texto);
        } catch (NumberFormatException e) {
            return 0.0; // Devolver 0.0 si no se puede convertir a double
        }
    }
}
