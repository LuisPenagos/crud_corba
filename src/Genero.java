
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucho
 */
public class Genero extends PersonaApp.generoPOA{
    
    private ORB orb;
    Conexion conex = new Conexion();
    
    private int id;
    private String nombre;

    public Genero(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    Genero() {
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
    public boolean insertarGenero(int id, String nombre) {
        boolean resultado = false;
        try {
            String query = "insert into genero(id,nombre)" + "values " + "('"+id+"','"+nombre+"')";
            
           conex.conexion();
           Statement stgenero = conex.conex.createStatement();
           int valor = stgenero.executeUpdate(query);
           if(valor > 0){
               resultado = true;
           }
               //Cerramos los recursos.
           stgenero.close();
           conex.conex.close();
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error "+e.getMessage());
        }
        return resultado;
    }

    @Override
    public String listarGenero() {
      String resultado = "" ;
        try {
            String query = "Select * from genero";
            conex.conexion();
            Statement stgenero = conex.conex.createStatement();
            ResultSet rs = stgenero.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - "
                         + rs.getString(2)+ "\n";
            }
            stgenero.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Ocurrio un Error: "+e.getMessage());
        }
      return resultado;
    }

    @Override
    public String consultarGenero(int id) {
        
        String resultado = "" ;
        try {
            String query = "Select * from genero WHERE id =" + id;
            conex.conexion();
            Statement stgenero = conex.conex.createStatement();
            ResultSet rs = stgenero.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - "
                         + rs.getString(2)+ "\n";
            }
            stgenero.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Ocurrio un Error: "+e.getMessage());
        }
      return resultado;
    }

    @Override
    public boolean actualizarGenero(int id, String nombre) {
        
        boolean resultado = false;
        try {
            String query = "update genero set nombre = '"+nombre+"' WHERE id = " +id;
            
           conex.conexion();
           Statement stgenero = conex.conex.createStatement();
           int valor = stgenero.executeUpdate(query);
           if(valor > 0){
               resultado = true;
           }
               //Cerramos los recursos.
           stgenero.close();
           conex.conex.close();
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error "+e.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean eliminarGenero(int id) {
        
         boolean resultado = false;
        try {
            String query = "Delete from genero WHERE id =" + id;
            
           conex.conexion();
           Statement stgenero = conex.conex.createStatement();
           int valor = stgenero.executeUpdate(query);
           if(valor > 0){
               resultado = true;
           }
               //Cerramos los recursos.
           stgenero.close();
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
