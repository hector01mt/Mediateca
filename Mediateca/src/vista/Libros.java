package vista;

import modelo.Libro;
import modelo.LibroMetodos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Libros extends JFrame {

    Libro l = new Libro();
    LibroMetodos lm = new LibroMetodos();
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton agregarButton;
    private JButton editarButton;
    private JButton eliminarButton;

    public Libros() {
        setTitle("Gestión de Libros");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10)); // GridLayout de 2 columnas, sin límite de filas

        JLabel label1 = new JLabel("Título:");
        textField1 = new JTextField(20);

        JLabel label2 = new JLabel("Autor:");
        textField2 = new JTextField(20);

        JLabel label3 = new JLabel("Paginas:");
        textField3 = new JTextField(20);

        JLabel label4 = new JLabel("Editorial:");
        textField4 = new JTextField(20);

        JLabel label5 = new JLabel("Año:");
        textField5 = new JTextField(20);

        agregarButton = new JButton("Agregar");
        editarButton = new JButton("Editar");
        eliminarButton = new JButton("Eliminar");

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

        panel.add(agregarButton);
        panel.add(editarButton);
        panel.add(eliminarButton);

        getContentPane().add(panel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregar();
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
    }

    public void agregar(){
        String titulo = textField1.getText();
        String autor = textField2.getText();
        String paginas = textField3.getText();
        String editorial = textField4.getText();
        String anio = textField5.getText();

        l.setTitulo(titulo);
        l.setAutor(autor);
        l.setNumeroPaginas(paginas);
        l.setEditorial(editorial);
        l.setAnoPublicacion(anio);
        lm.Agregar(l);
    }

    public void editar(){
        String titulo = textField1.getText();
        String autor = textField2.getText();
        String paginas = textField3.getText();
        String editorial = textField4.getText();
        String anio = textField5.getText();

        l.setTitulo(titulo);
        l.setAutor(autor);
        l.setNumeroPaginas(paginas);
        l.setEditorial(editorial);
        l.setAnoPublicacion(anio);
        lm.Editar(l);
    }


}


























