package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Revista extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton eliminarButton;
    private JButton editarButton;
    private JButton agregarButton;

    public Revista() {
        setTitle("Gestión de Revistas");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10)); // GridLayout de 2 columnas, sin límite de filas

        // Componentes para la entrada de datos
        JLabel label1 = new JLabel("Título:");
        textField1 = new JTextField(20);

        JLabel label2 = new JLabel("Editorial:");
        textField2 = new JTextField(20);

        JLabel label3 = new JLabel("Periodicidad:");
        textField3 = new JTextField(20);

        JLabel label4 = new JLabel("Año:");
        textField4 = new JTextField(20);

        // Botones de acción
        agregarButton = new JButton("Agregar");
        editarButton = new JButton("Editar");
        eliminarButton = new JButton("Eliminar");

        // Agregar ActionListener a cada botón
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // Agregar componentes al panel
        panel.add(label1);
        panel.add(textField1);

        panel.add(label2);
        panel.add(textField2);

        panel.add(label3);
        panel.add(textField3);

        panel.add(label4);
        panel.add(textField4);

        panel.add(agregarButton);
        panel.add(editarButton);
        panel.add(eliminarButton);

        // Establecer el panel como contenido del JFrame
        getContentPane().add(panel, BorderLayout.CENTER);

        pack(); // Ajustar el tamaño del JFrame automáticamente
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true); // Hacer visible la ventana
    }
}
