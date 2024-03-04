import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.HashMap;

public class interfaz_primera_parte {

        public void crearInterfaz() {
            // Crear el marco principal
            JFrame marco = new JFrame("Air Carmela");
            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco.setSize(750, 250);


            // Paneles para organizar los componentes
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            JPanel panel4 = new JPanel();
            JPanel panel5 = new JPanel();
            JPanel panel6 = new JPanel();
            JPanel panel7 = new JPanel();
            JPanel panel8 = new JPanel();
            JPanel panel9 = new JPanel();

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
            marco.add(panel3, BorderLayout.WEST);
            marco.add(panel4, BorderLayout.NORTH);
            marco.add(panel7, BorderLayout.EAST);

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
                    //AQUI  LA PARTE DE JAVI
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
        }
    }

