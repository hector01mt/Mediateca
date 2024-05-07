package vista;

import modelo.RevistaMetodos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Revista extends JFrame {

    modelo.Revista rm = new modelo.Revista();
    RevistaMetodos rm1 = new RevistaMetodos();
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

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10)); // GridLayout de 2 columnas, sin límite de filas

        JLabel label1 = new JLabel("Título:");
        textField1 = new JTextField(20);

        JLabel label2 = new JLabel("Editorial:");
        textField2 = new JTextField(20);

        JLabel label3 = new JLabel("Periodicidad:");
        textField3 = new JTextField(20);

        JLabel label4 = new JLabel("Año:");
        textField4 = new JTextField(20);

        agregarButton = new JButton("Agregar");
        editarButton = new JButton("Editar");
        eliminarButton = new JButton("Eliminar");

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregar();
            }
        });

        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editar();
            }
        });

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

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

        getContentPane().add(panel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void agregar(){
        String titulo = textField1.getText();
        String editorial = textField2.getText();
        String periodicidad = textField3.getText();
        String anio = textField4.getText();

        rm.setTitulo(titulo);
        rm.setEditorial(editorial);
        rm.setPerioicidad(periodicidad);
        rm.setFechaPublicacion(anio);
        rm1.Agregar(rm);
    }

    public void editar(){
        String titulo = textField1.getText();
        String editorial = textField2.getText();
        String periodicidad = textField3.getText();
        String anio = textField4.getText();

        rm.setTitulo(titulo);
        rm.setEditorial(editorial);
        rm.setPerioicidad(periodicidad);
        rm.setFechaPublicacion(anio);
        rm1.Editar(rm);

    }
}























