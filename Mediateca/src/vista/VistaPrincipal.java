package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipal extends JFrame {
    private JButton librosButton;
    private JButton revistaButton;
    private JButton cdButton;
    private JButton dvdButton;

    public VistaPrincipal() {

        setTitle("Mi Aplicación");
        setSize(400, 300); // Establecer el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        librosButton = new JButton("Libros");
        revistaButton = new JButton("Revistas");
        cdButton = new JButton("CDs");
        dvdButton = new JButton("DVDs");

        setLayout(new java.awt.FlowLayout());

        add(librosButton);
        add(revistaButton);
        add(cdButton);
        add(dvdButton);
        librosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Libros l = new Libros();
                l.setVisible(true);
            }
        });
        revistaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Revista r = new Revista();
                r.setVisible(true);

            }
        });
        cdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cd c = new Cd();
                c.setVisible(true);
            }
        });
        dvdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dvd d = new Dvd();
                d.setVisible(true);
            }
        });
    }


    public static void main(String[] args) {

        VistaPrincipal vp = new VistaPrincipal();
        vp.setVisible(true);



    }
}
