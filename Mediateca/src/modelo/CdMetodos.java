package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CdMetodos {
    Conexion conectar=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public int Editar(Cd c) {
        String sql = "update cds set titulo=? artista=? genero=? duracion=? numero_canciones=? unidades_disponibles where id=?";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,c.getTitulo());
            ps.setString(2,c.getArtista());
            ps.setString(3,c.getGenero());
            ps.setString(4,c.getDuracion());
            ps.setString(5,c.getNumeroCanciones());
            ps.setString(6,c.getUnidadesDisponibles());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return 1;
    }

    public int Agregar(Cd c) {
        String sql = "Insert into cds(titulo, artista, genero, duracion, numero_canciones, unidades_disponibles) values(?,?,?,?,?,?) ";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,c.getTitulo());
            ps.setString(2,c.getArtista());
            ps.setString(3,c.getGenero());
            ps.setString(4,c.getDuracion());
            ps.setString(5,c.getNumeroCanciones());
            ps.setString(6,c.getUnidadesDisponibles());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return 1;
    }

    public void Eliminar(int id) {
        String sql = "delete from cds where id=" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {

        }
    }


}
