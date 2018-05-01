import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;

public class Persona extends PersonaApp.personaPOA{
    
    private ORB orb;
    Conexion conex = new Conexion();

    @Override
    public boolean insertarPersona(int cedula, String nombre, String apellido, String genero, int edad, String estado) {
        boolean resultado = false;
        try {
            String query = "insert into persona(cedula,nombre,apellido,genero,edad,estado)" + "values ('"+cedula+"','"+nombre+"','"+apellido+"','"+genero+"','"+edad+"','"+estado+"')";
            
           conex.conexion();
           Statement st = conex.conex.createStatement();
           int valor = st.executeUpdate(query);
           if(valor > 0){
               resultado = true;
           }
               //Cerramos los recursos.
           st.close();
           conex.conex.close();
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error "+e.getMessage());
        }
        return resultado;
    }
    @Override
    
    public String consultarPersona(int cedula) {
        
        String resultado = "" ;
        try {
            String query = "Select * from persona WHERE cedula =" + cedula;
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - "
                         + rs.getString(2)+ " - "
                         + rs.getString(3)+ " - "
                         + rs.getString(4)+ " - "
                         + rs.getLong(5)+ " - "
                         + rs.getString(6) + "\n";
            }
            st.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Ocurrio un Error: "+e.getMessage());
        }
      
      return resultado;
        
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
      String resultado = "" ;
        try {
            String query = "Select * from persona";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - "
                         + rs.getString(2)+ " - "
                         + rs.getString(3)+ " - "
                         + rs.getString(4)+ " - "
                         + rs.getLong(5)+ " - "
                         + rs.getString(6) + "\n";
            }
            st.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Ocurrio un Error: "+e.getMessage());
        }
      
      return resultado;
    }

    @Override
    public void shutdawn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
