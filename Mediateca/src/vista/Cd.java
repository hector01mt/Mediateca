package vista;

import modelo.CdMetodos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cd extends JFrame {

    modelo.Cd c = new modelo.Cd();
    CdMetodos cm = new CdMetodos();
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

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10)); // GridLayout de 2 columnas, sin límite de filas

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

        button1 = new JButton("Agregar");
        button2 = new JButton("Editar");
        button3 = new JButton("Eliminar");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregar();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editar();
            }
        });

        button3.addActionListener(new ActionListener() {
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

        panel.add(label5);
        panel.add(textField5);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        getContentPane().add(panel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void agregar(){
        String titulo = textField1.getText();
        String artista = textField2.getText();
        String genero = textField3.getText();
        String duracion = textField4.getText();
        String numerocanciones = textField5.getText();

        c.setTitulo(titulo);
        c.setArtista(artista);
        c.setGenero(genero);
        c.setDuracion(duracion);
        c.setNumeroCanciones(numerocanciones);
        cm.Agregar(c);

    }

    public void editar(){
        String titulo = textField1.getText();
        String artista = textField2.getText();
        String genero = textField3.getText();
        String duracion = textField4.getText();
        String numerocanciones = textField5.getText();

        c.setTitulo(titulo);
        c.setArtista(artista);
        c.setGenero(genero);
        c.setDuracion(duracion);
        c.setNumeroCanciones(numerocanciones);
        cm.Editar(c);

    }

}
