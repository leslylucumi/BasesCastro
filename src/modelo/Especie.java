/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.exceptions.MySQLDataException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dacastro
 */
public class Especie {
    
    private int id;
    private String nombreE;

    public Especie() {
    }

    public Especie(int id, String nombreE) {
        this.id = id;
        this.nombreE = nombreE;
    }

    public Especie(String nombreE) {
        this.nombreE = nombreE;
    }
    
    

    /**
     * Get the value of nombreE
     *
     * @return the value of nombreE
     */
    public String getNombreE() {
        return nombreE;
    }

    /**
     * Set the value of nombreE
     *
     * @param nombreE new value of nombreE
     */
    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }


    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Especie{" + "id=" + id + ", nombreE=" + nombreE + '}';
    }

    public ResultSet consultarEspecie(String sql) {
        
        ConnectBD objc=new ConnectBD();
        ResultSet rs=null;
        if(objc.crearConexion()){
            try{
                rs=objc.getSt().executeQuery(sql);
            }catch(SQLException me){
                
            }
        }
        return rs;
    }

    public boolean ModificarEspecie(String sql) {
        ConnectBD objCon = new ConnectBD();
        boolean a = false;
        
       if (objCon.crearConexion()) {
       try {
           Statement stat;
           stat = objCon.getConexion().createStatement();
           stat.executeUpdate(sql);
           a=true;
       } catch (SQLException ex) {
           ex.printStackTrace();
           System.out.println(ex.toString());
           return false;
       }
         
    }  
       return a;
    
    }

}
