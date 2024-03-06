
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class interfazsegundaparte {

    public void crearInterfaz() {
        // Crear el marco principal
        JFrame marco = new JFrame("Air Carmela");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Paneles para organizar los componentes
        JPanel panelNorte = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();
        JPanel panel11 = new JPanel();
        JPanel panel12 = new JPanel();

        // Configurar paneles
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));

        // Agregar elementos a los paneles
        // Panel 1 (Modalidad)
        JRadioButton radio1 = new JRadioButton("Ida solo");
        JRadioButton radio2 = new JRadioButton("Ida y vuelta");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radio1);
        grupo.add(radio2);
        panel1.add(radio1);
        panel1.add(radio2);

        // Panel 2 (Ida)
        // Configurar spinner para seleccionar la fecha de ida
        SpinnerModel diasida = new SpinnerNumberModel(1, 1, 31, 1);
        SpinnerModel aniosIda = new SpinnerNumberModel(2024, 2024, 3000, 1);
        JLabel label2 = new JLabel("Dia");
        JSpinner spinnerDiaIda = new JSpinner(diasida);
        JComponent editor = spinnerDiaIda.getEditor();
        if (editor instanceof JSpinner.DefaultEditor) {
            JTextField textField = ((JSpinner.DefaultEditor) editor).getTextField();
            textField.setEditable(false);
        }
        JLabel label3 = new JLabel("Mes");
        String[] mesesIda = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        SpinnerListModel seleccionMesIda = new SpinnerListModel(mesesIda);
        JSpinner spinnerMesIda = new JSpinner(seleccionMesIda);
        Component editor1 = spinnerMesIda.getEditor();
        if (editor1 instanceof JSpinner.DefaultEditor) {
            JTextField textField = ((JSpinner.DefaultEditor) editor1).getTextField();
            textField.setEditable(false);
        }
        spinnerMesIda.setPreferredSize(new Dimension(70, 20));
        JLabel label4 = new JLabel("Anio");
        JSpinner spinnerAnioIda = new JSpinner(aniosIda);
        JComponent editor2 = spinnerAnioIda.getEditor();
        if (editor2 instanceof JSpinner.DefaultEditor) {
            JTextField textField = ((JSpinner.DefaultEditor) editor2).getTextField();
            textField.setEditable(false);
        }
        panel2.add(label2);
        panel2.add(spinnerDiaIda);
        panel2.add(label3);
        panel2.add(spinnerMesIda);
        panel2.add(label4);
        panel2.add(spinnerAnioIda);

        // Panel 5 (Vuelta)
        // Configurar spinner para seleccionar la fecha de vuelta
        SpinnerModel diasidayvuelta = new SpinnerNumberModel(1, 1, 31, 1);
        SpinnerModel aniosvuelta = new SpinnerNumberModel(2024, 2024, 3000, 1);
        JLabel label5 = new JLabel("Dia");
        JSpinner spinnerDiaVuelta = new JSpinner(diasidayvuelta);
        JComponent editor3 = spinnerDiaVuelta.getEditor();
        if (editor3 instanceof JSpinner.DefaultEditor) {
            JTextField textField = ((JSpinner.DefaultEditor) editor3).getTextField();
            textField.setEditable(false);
        }
        JLabel label6 = new JLabel("Mes");
        SpinnerListModel seleccionMesVuelta = new SpinnerListModel(mesesIda);
        JSpinner spinnerMesVuelta = new JSpinner(seleccionMesVuelta);
        JComponent editor4 = spinnerMesVuelta.getEditor();
        if (editor4 instanceof JSpinner.DefaultEditor) {
            JTextField textField = ((JSpinner.DefaultEditor) editor4).getTextField();
            textField.setEditable(false);
        }
        spinnerMesVuelta.setPreferredSize(new Dimension(70, 20));
        JLabel label7 = new JLabel("Anio");
        JSpinner spinnerAnioVuelta = new JSpinner(aniosvuelta);
        JComponent editor5 = spinnerAnioVuelta.getEditor();
        if (editor5 instanceof JSpinner.DefaultEditor) {
            JTextField textField = ((JSpinner.DefaultEditor) editor5).getTextField();
            textField.setEditable(false);
        }
        panel5.add(label5);
        panel5.add(spinnerDiaVuelta);
        panel5.add(label6);
        panel5.add(spinnerMesVuelta);
        panel5.add(label7);
        panel5.add(spinnerAnioVuelta);

        // Diccionario para los códigos IATA de los aeropuertos
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

        // Panel 6 (Origen)
        JLabel Origen = new JLabel("Origen: ");
        JComboBox campoOrigen = new JComboBox();
        for (String ciudad : IATAdic.keySet()) {
            campoOrigen.addItem(ciudad);
        }
        campoOrigen.addItem("---------");
        campoOrigen.setSelectedIndex(campoOrigen.getItemCount() - 1);
        panel6.add(Origen);
        panel6.add(campoOrigen);

        // Panel 8 (Destino)
        JLabel Destino = new JLabel("Destino: ");
        JComboBox campoDestino = new JComboBox();
        for (String ciudad : IATAdic.keySet()) {
            campoDestino.addItem(ciudad);
        }
        campoDestino.addItem("---------");
        campoDestino.setSelectedIndex(campoDestino.getItemCount() - 1);
        panel8.add(Destino);
        panel8.add(campoDestino);


        // Panel 9 (Número de personas y botón de búsqueda)
        JLabel Npersonas = new JLabel("Nº Personas: ");
        JSpinner numpasajeros = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        JButton buscar = new JButton("Buscar");
        panel9.add(Npersonas);
        panel9.add(numpasajeros);
        panel9.add(buscar);

        // Configurar bordes y títulos para los paneles
        panel1.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Modalidad", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panel2.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Ida", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 13)));
        panel5.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Vuelta", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 13)));
        panel7.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Trayecto", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 13)));

        // Agregar elementos a los paneles contenedores
        panel3.add(panel1);
        panel3.add(panel2);
        panel3.add(panel5);
        panel7.add(panel6);
        panel7.add(panel8);
        panel7.add(panel9);
        panel7.setPreferredSize(new Dimension(400, 200));

        // Agregar elementos al panel 4 (Título)
        JLabel label1 = new JLabel("Punto De venta Billetes ");
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        panel4.add(label1);

        // Configurar el diseño y agregar los paneles al marco principal
        marco.setLayout(new BorderLayout());
        panelNorte.setLayout(new BorderLayout());
        panelNorte.add(panel3, BorderLayout.WEST);
        panelNorte.add(panel4, BorderLayout.NORTH);
        panelNorte.add(panel7, BorderLayout.EAST);
        marco.add(panelNorte, BorderLayout.NORTH);


        // Configurar el borde para la etiqueta
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Funcionalidades de los botones de radio
        radio1.addActionListener(e -> {
            spinnerDiaVuelta.setEnabled(false);
            spinnerMesVuelta.setEnabled(false);
            spinnerAnioVuelta.setEnabled(false);
        });

        radio2.addActionListener(e -> {
            spinnerDiaVuelta.setEnabled(true);
            spinnerMesVuelta.setEnabled(true);
            spinnerAnioVuelta.setEnabled(true);
        });

        // Sincronizar los spinners de fecha de ida y vuelta
        spinnerDiaIda.addChangeListener(e -> {
            if (radio2.isSelected()) {
                spinnerDiaVuelta.setValue(spinnerDiaIda.getValue());
            }
        });

        spinnerMesIda.addChangeListener(e -> {
            if (radio2.isSelected()) {
                spinnerMesVuelta.setValue(spinnerMesIda.getValue());
            }
        });

        spinnerAnioIda.addChangeListener(e -> {
            if (radio2.isSelected()) {
                spinnerAnioVuelta.setValue(spinnerAnioIda.getValue());
            }
        });

        final boolean[] mostrarTitulo2 = {true};

        // Funcionalidad del botón de búsqueda
        buscar.addActionListener(e -> {
            String fechaida = spinnerDiaIda.getValue() + "-" + spinnerMesIda.getValue() + "-" + spinnerAnioIda.getValue();
            String fechavuelta = radio2.isSelected() ? spinnerDiaVuelta.getValue() + " de " + spinnerMesVuelta.getValue() + " de " + spinnerAnioVuelta.getValue() : "No aplica";
            String origen = campoOrigen.getSelectedItem().toString();
            String destino = campoDestino.getSelectedItem().toString();
            String pasajeros = numpasajeros.getValue().toString();
            String mensaje = null;
            int opcionSeleccionada = 0;
            if (radio2.isSelected() && !origen.equals("---------") && !destino.equals("---------")) {
                mensaje = ("Ida" + ": " + origen + "/" + destino + " " + fechaida + "\n" + "Vuelta" + ": " + destino + "/" + origen + " " + fechavuelta + "\n" + "(" + pasajeros + " persona" + ")");
                String[] opciones = {"Si", "No", "Cancelar"};
                opcionSeleccionada = JOptionPane.showOptionDialog(null, mensaje, "Búsqueda", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
                );
            } else if (Integer.parseInt(pasajeros) > 1 && radio1.isSelected() && !origen.equals("---------") && !destino.equals("---------")) {
                mensaje = ("Ida" + ": " + origen + "/" + destino + " " + fechaida + "\n" + "(" + pasajeros + " " + " personas" + ")");
                String[] opciones = {"Si", "No", "Cancelar"};
                opcionSeleccionada = JOptionPane.showOptionDialog(null, mensaje, "Búsqueda", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
                );
            } else if (radio1.isSelected() && !origen.equals("---------") && !destino.equals("---------")) {
                mensaje = ("Ida" + ": " + origen + "/" + destino + " " + fechaida + "\n" + "(" + pasajeros + " " + " persona" + ")");
                String[] opciones = {"Si", "No", "Cancelar"};
                opcionSeleccionada = JOptionPane.showOptionDialog(null, mensaje, "Búsqueda", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
                );
            } else if (origen.equals("---------") || destino.equals("---------")) {
                JOptionPane.showMessageDialog(null, "Error: Debes seleccionar un origen y un destino.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error: Debes seleccionar una modalidad.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            // Opciones para mostrar el cuadro de diálogo con el mensaje y los botones

            if (opcionSeleccionada == 0) {

                boolean opcionSeleccionada1 = radio2.isSelected();

                if (opcionSeleccionada1) {

                    // Segunda Parte

                    panel10.removeAll();
                    panel11.removeAll();
                    panel12.removeAll();


                    JLabel titulo2 = new JLabel("LOS VUELOS DISPONIBLES SON: ");
                    JPanel Paneles = new JPanel();
                    titulo2.setFont(new Font("Arial", Font.BOLD, 15));
                    JPanel titulopanel1 = new JPanel();
                    titulopanel1.add(titulo2);
                    Paneles.add(panel11);
                    Paneles.add(panel12);
                    JButton botonTerceraParte = new JButton("Confirmar elección");
                    panel10.add(titulopanel1, BorderLayout.NORTH);
                    panel10.add(Paneles, BorderLayout.CENTER);
                    panel10.add(botonTerceraParte, BorderLayout.SOUTH);
                    titulopanel1.add(titulo2);

                    titulo2.setFont(new Font("Arial", Font.BOLD, 15));
                    panel10.setLayout(new BoxLayout(panel10, BoxLayout.Y_AXIS));


                    List<String> Vuelos = new ArrayList<>();
                    List<String> Vuelos2 = new ArrayList<>();
                    List<String> Vuelos3 = new ArrayList<>();
                    List<String> Vuelos4 = new ArrayList<>();

                    Vuelos.add(ApoyoPuntoVenta.Opcion5(origen, destino));
                    Vuelos2.add(ApoyoPuntoVenta.Opcion6(origen, destino));
                    Vuelos3.add(ApoyoPuntoVenta.Opcion5(destino, origen));
                    Vuelos4.add(ApoyoPuntoVenta.Opcion6(destino, origen));

                    ButtonGroup grupoBotones = new ButtonGroup();
                    ButtonGroup grupoBotones1 = new ButtonGroup();

                    JRadioButton radioButton = new JRadioButton(String.valueOf(Vuelos.getFirst()));
                    radioButton.setActionCommand(String.valueOf(Vuelos.getFirst()));
                    grupoBotones1.add(radioButton);
                    panel11.add(radioButton);

                    JRadioButton radioButton1 = new JRadioButton(String.valueOf(Vuelos2.getFirst()));
                    radioButton.setActionCommand(String.valueOf(Vuelos2.getFirst()));
                    grupoBotones1.add(radioButton1);
                    panel11.add(radioButton1);

                    JRadioButton radioButton2 = new JRadioButton(String.valueOf(Vuelos3.getFirst()));
                    radioButton.setActionCommand(String.valueOf(Vuelos3.getFirst()));
                    grupoBotones.add(radioButton2);
                    panel12.add(radioButton2);

                    JRadioButton radioButton3 = new JRadioButton(String.valueOf(Vuelos4.getFirst()));
                    radioButton.setActionCommand(String.valueOf(Vuelos4.getFirst()));
                    grupoBotones.add(radioButton3);
                    panel12.add(radioButton3);

                    panel11.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Ida", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
                    panel11.setLayout(new BoxLayout(panel11, BoxLayout.Y_AXIS));
                    panel12.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Vuelta", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
                    panel12.setLayout(new BoxLayout(panel12, BoxLayout.Y_AXIS));

                    marco.add(panel10, BorderLayout.CENTER);
                    marco.setLocationRelativeTo(null);
                    marco.pack();

                    botonTerceraParte.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Crear marco principal

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
                            panel5_2.setLayout(new BorderLayout());
                            panel5_2.add(boton4, BorderLayout.NORTH);
                            panel5_2.add(boton5, BorderLayout.CENTER);
                            panel5_2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                            panel5.add(panel5_2, BorderLayout.EAST);

                            // Panel 6
                            JLabel imagen = new JLabel();
                            ImageIcon icono4 = new ImageIcon("src/ico_bill_av_iv.png");

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

                            boton4.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    JOptionPane.showMessageDialog(null, "Ya puedes retirar tu billete", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                                    imagen.setIcon(icono4);
                                    panel6.add(imagen);
                                    panel6.revalidate();
                                    panel6.repaint();
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
                            // Visiblidad y tamaño del marco principal
                            panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
                            marco.add(panelTercero, BorderLayout.SOUTH);
                            marco.pack();
                            marco.setVisible(true);


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

                    });

                } else {

                    // Segunda Parte

                    panel10.removeAll();
                    panel11.removeAll();
                    panel12.removeAll();

                    JLabel titulo2 = new JLabel("LOS VUELOS DISPONIBLES SON: ");
                    JPanel titulopanel = new JPanel();
                    titulopanel.add(titulo2);
                    JButton botonTerceraParte = new JButton("Confirmar elección");
                    JPanel botonTerceraPartePanel = new JPanel();
                    botonTerceraPartePanel.add(botonTerceraParte);
                    panel10.setLayout(new BorderLayout());
                    panel10.add(titulopanel, BorderLayout.NORTH);
                    panel10.add(botonTerceraPartePanel, BorderLayout.SOUTH);


                    titulo2.setFont(new Font("Arial", Font.BOLD, 15));


                    List<String> Vuelos = new ArrayList<>();
                    List<String> Vuelos2 = new ArrayList<>();

                    Vuelos.add(ApoyoPuntoVenta.Opcion5(origen, destino));
                    Vuelos2.add(ApoyoPuntoVenta.Opcion6(origen, destino));

                    ButtonGroup grupoBotones1 = new ButtonGroup();

                    JRadioButton radioButton = new JRadioButton(String.valueOf(Vuelos.getFirst()));
                    radioButton.setActionCommand(String.valueOf(Vuelos.getFirst()));
                    grupoBotones1.add(radioButton);
                    panel11.add(radioButton);

                    JRadioButton radioButton1 = new JRadioButton(String.valueOf(Vuelos2.getFirst()));
                    radioButton.setActionCommand(String.valueOf(Vuelos2.getFirst()));
                    grupoBotones1.add(radioButton1);
                    panel11.add(radioButton1);

                    panel11.setLayout(new BoxLayout(panel11, BoxLayout.Y_AXIS));
                    panel11.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Ida", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
                    JPanel panelOrden = new JPanel();
                    panelOrden.add(panel11);

                    if (mostrarTitulo2[0]) {
                        panel10.add(panelOrden, BorderLayout.CENTER);
                        marco.add(panel10, BorderLayout.CENTER);
                        marco.setLocationRelativeTo(null);
                    }

                    botonTerceraParte.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Crear marco principal

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
                            panel5_2.setLayout(new BorderLayout());
                            panel5_2.add(boton4, BorderLayout.NORTH);
                            panel5_2.add(boton5, BorderLayout.CENTER);
                            panel5_2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                            panel5.add(panel5_2, BorderLayout.EAST);

                            // Panel 6
                            JLabel imagen = new JLabel();
                            ImageIcon icono3 = new ImageIcon("src/ico_bill_av_ida.png");

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

                            boton4.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    JOptionPane.showMessageDialog(null, "Ya puedes retirar tu billete", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                                    imagen.setIcon(icono3);
                                    panel6.add(imagen);
                                    panel6.revalidate();
                                    panel6.repaint();
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
                            // Visiblidad y tamaño del marco principal
                            panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
                            marco.add(panelTercero, BorderLayout.SOUTH);
                            marco.pack();
                            marco.setVisible(true);


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

                    });


                    marco.add(panel10, BorderLayout.CENTER);
                    marco.setLocationRelativeTo(null);
                    marco.pack();
                }






            } else if (opcionSeleccionada == 1) {
                marco.dispose();
                crearInterfaz();

            }

        });

        campoOrigen.addActionListener(e -> {
            String ciudadOrigen = (String) campoOrigen.getSelectedItem();
            String ciudadDestino = (String) campoDestino.getSelectedItem();
            if (ciudadDestino.equals(ciudadOrigen)) {
                JOptionPane.showMessageDialog(null, "Error: El origen y el destino no pueden ser el mismo.", "Error", JOptionPane.ERROR_MESSAGE);
                campoOrigen.setSelectedIndex(campoOrigen.getItemCount() - 1);
            }

        });

        campoDestino.addActionListener(e -> {
            String ciudadOrigen = (String) campoOrigen.getSelectedItem();
            String ciudadDestino = (String) campoDestino.getSelectedItem();
            if (ciudadDestino.equals(ciudadOrigen)) {
                JOptionPane.showMessageDialog(null, "Error: El origen y el destino no pueden ser el mismo.", "Error", JOptionPane.ERROR_MESSAGE);
                campoDestino.setSelectedIndex(campoDestino.getItemCount() - 1);
            }
        });


        // Hacer visible el marco principal
        marco.setResizable(false);
        marco.pack();
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
    }

}