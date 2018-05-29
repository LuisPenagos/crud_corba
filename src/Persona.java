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
            String query = "insert into persona(cedula,nombre,apellido,genero,edad,estado)" + "values "
                    + "('"+cedula+"','"+nombre+"','"+apellido+"','"+genero+"','"+edad+"','"+estado+"')";
            
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
    
    public boolean insertarGenero(int id, String nombre) {
        boolean resultado = false;
        try {
            String query = "insert into genero(id,nombre)" + "values " + "('"+id+"','"+nombre+"')";
            
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
    
    public String listarGenero() {
      String resultado = "" ;
        try {
            String query = "Select * from genero";
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


    public String consultarGenero(int id) {
        
        String resultado = "" ;
        try {
            String query = "Select * from genero WHERE id =" + id;
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


    public boolean actualizarGenero(int id, String nombre) {
        
        boolean resultado = false;
        try {
            String query = "update genero set nombre = '"+nombre+"' WHERE id = " +id;
            
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

 
    public boolean eliminarGenero(int id) {
        
         boolean resultado = false;
        try {
            String query = "Delete from genero WHERE id =" + id;
            
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
        
         boolean resultado = false;
        try {
            String query = "Delete from persona WHERE cedula =" + cedula;
            
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
    public boolean actualizarPersona(int cedula, String nombre, String apellido, String genero, int edad, String estado) {
        
        boolean resultado = false;
        try {
            String query = "update persona set nombre = '"+nombre+"' , apellido = '"+apellido+"' , genero = '"+genero+"' , edad = '"+edad+"' , estado = '"+estado+"' WHERE cedula = " +cedula;
            
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


    public boolean insertarEstado(int id, String nombre) {
        boolean resultado = false;
        try {
            String query = "insert into estado(id,nombre)" + "values "
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
    
    public ResultSet listaEstados(){
    
        ResultSet resultado = null;
        
        try {
            String query = "Select id, nombre from estado";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error: "+e.getMessage());
        }

        return resultado;
    }
    
    public ResultSet cargarTablaPersona(){
    
        ResultSet resultado = null;
        
        try {
            String query = "Select cedula, nombre, apellido, genero, edad, estado from persona";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error"+e.getMessage());
        }

        return resultado;
    }
    
    public ResultSet cargarTablaGenero(){
    
        ResultSet resultado = null;
        
        try {
            String query = "Select id, nombre from genero";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error"+e.getMessage());
        }

        return resultado;
    }
    
}
