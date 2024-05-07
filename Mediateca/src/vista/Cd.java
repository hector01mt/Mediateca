package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cd extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public Cd() {
        setTitle("Gestión de CDs");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10)); // GridLayout de 2 columnas, sin límite de filas

        // Componentes para la entrada de datos
        JLabel label1 = new JLabel("Título:");
        textField1 = new JTextField(20);

        JLabel label2 = new JLabel("Artista:");
        textField2 = new JTextField(20);

        JLabel label3 = new JLabel("Género:");
        textField3 = new JTextField(20);

        JLabel label4 = new JLabel("Duracion:");
        textField4 = new JTextField(20);

        JLabel label5 = new JLabel("Numero de canciones:");
        textField5 = new JTextField(20);

        // Botones de acción
        button1 = new JButton("Agregar");
        button2 = new JButton("Editar");
        button3 = new JButton("Eliminar");

        // Agregar ActionListener a cada botón
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button3.addActionListener(new ActionListener() {
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

        panel.add(label5);
        panel.add(textField5);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Establecer el panel como contenido del JFrame
        getContentPane().add(panel, BorderLayout.CENTER);

        pack(); // Ajustar el tamaño del JFrame automáticamente
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true); // Hacer visible la ventana
    }

}
