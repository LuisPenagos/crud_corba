import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;

public class Persona extends PersonaApp.personaPOA{
    
    private ORB orb;

    @Override
    public boolean insertarPersona(int cedula, String nombre, String apellido, String genero, int edad, String estado) {
        boolean resultado = false;
        try {
            String query = "inset into persona(cedula,nombre,apellido,genero,edad,estado)" + "values ("+cedula+","+nombre+","+apellido+","+genero+","+edad+","+estado+")";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error "+e.getMessage());
        }
        return resultado;
    }

    @Override
    public String consultarPersona(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPersona(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarPersona(int cedula, String nombre, String apellido, String genero, int edad, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdawn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
