
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;


public class Estado extends PersonaApp.estadoPOA{
    
    private ORB orb;
    Conexion conex = new Conexion();
    
    private int id;
    private String nombre;
    
    public Estado (int id, String nombre){
    
       setId(id);
       setNombre(nombre);
       
    }

    Estado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String listarEstado() {
      String resultado = "" ;
        try {
            String query = "Select * from estado";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - "
                         + rs.getString(2)+ "\n";
            }
            st.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Ocurrio un Error: "+e.getMessage());
        }
      return resultado;
    }

    @Override
    public String consultarEstado(int id) {
        
        String resultado = "" ;
        try {
            String query = "Select * from estado WHERE id =" + id;
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - "
                         + rs.getString(2)+ "\n";
            }
            st.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Ocurrio un Error: "+e.getMessage());
        }
      return resultado;
    }

    @Override
    public boolean actualizarEstado(int id, String nombre) {
        
        boolean resultado = false;
        try {
            String query = "update estado set nombre = '"+nombre+"' WHERE id = " +id;
            
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
    public boolean insertarEstado(int id, String nombre) {
        boolean resultado = false;
        try {
            String query = "insert into estado(cedula,nombre)" + "values "
                    + "('"+id+"','"+nombre+"')";
            
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
    public boolean eliminarEstado(int id) {
        
         boolean resultado = false;
        try {
            String query = "Delete from estado WHERE id =" + id;
            
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
    public void shutdawn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
