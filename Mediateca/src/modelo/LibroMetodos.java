package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LibroMetodos {

    Conexion conectar=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public int Editar(Libro l) {
        String sql = "update libros set titulo=? autor=? numero_pagina=? editorial=? ano_publicacion=? unidades_disponibles=? where id=?";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,l.getTitulo());
            ps.setString(2,l.getAutor());
            ps.setString(3,l.getNumeroPaginas());
            ps.setString(4,l.getEditorial());
            ps.setString(5,l.getAnoPublicacion());
            ps.setString(6,l.getUnidadesDisponibles());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return 1;
    }

    public int Agregar(Libro l){
        String sql="insert into libros(titulo, autor, numero_pagina, editorial, ano_publicacion, unidades_disponibles) values(?,?,?,?,?,?)";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,l.getTitulo());
            ps.setString(2,l.getAutor());
            ps.setString(3,l.getNumeroPaginas());
            ps.setString(4,l.getEditorial());
            ps.setString(5,l.getAnoPublicacion());
            ps.setString(6,l.getUnidadesDisponibles());
            ps.executeUpdate();

        }catch (Exception e){

        }
        return 1;
    }

    public void Eliminar(int id){
        String sql="delete from libros where id="+id;
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();

        }catch (Exception e){

        }

    }
}





















