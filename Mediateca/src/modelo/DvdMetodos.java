package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DvdMetodos {
    Conexion conectar=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public int Editar(Dvd d) {
        String sql = "update dvds set titulo=? director=? duracion=? genero=? where id=?";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,d.getTitulo());
            ps.setString(2,d.getDirector());
            ps.setString(3,d.getDuracion());
            ps.setString(4,d.getGenero());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return 1;
    }

    public int Agregar(Dvd d) {
        String sql = "Insert into dvds(titulo, director, duracion, genero) values(?,?,?,?) ";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,d.getTitulo());
            ps.setString(2,d.getDirector());
            ps.setString(3,d.getDuracion());
            ps.setString(4,d.getGenero());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return 1;
    }

    public void Eliminar(int id) {
        String sql = "delete from dvds where id=" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {

        }
    }
}
