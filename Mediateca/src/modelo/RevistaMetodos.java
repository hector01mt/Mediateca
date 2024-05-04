package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RevistaMetodos {
    Conexion conectar=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public int Editar(Revista r) {
        String sql = "update revistas set titulo=? editorial=? periodicidad=? fecha_publicacion=? unidades_disponibles=? where id=?";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,r.getTitulo());
            ps.setString(2,r.getEditorial());
            ps.setString(3,r.getPerioicidad());
            ps.setString(4,r.getFechaPublicacion());
            ps.setString(5,r.getUnidadesDisponibles());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return 1;
    }

    public int Agregar(Revista r) {
        String sql = "Insert into revistas(titulo, editorial, periodicidad, fecha_publicacion, unidades_disponibles) values(?,?,?,?,?) ";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,r.getTitulo());
            ps.setString(2,r.getEditorial());
            ps.setString(3,r.getPerioicidad());
            ps.setString(4,r.getFechaPublicacion());
            ps.setString(5,r.getUnidadesDisponibles());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return 1;
    }

    public void Eliminar(int id){
        String sql="delete from revistas where id="+id;
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();

        }catch (Exception e){

        }

    }


}
