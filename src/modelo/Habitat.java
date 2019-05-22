/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.ConnectBD;

/**
 *
 * @author germanny.lezama
 */
public class Habitat {
    private int id;
    private String NombreH; 
    private String zona; 
    private String descripcion; 

    public Habitat(int id, String NombreH, String descripcion) {
        this.id = id;
        this.NombreH = NombreH;
        this.descripcion = descripcion;
    }

    public Habitat(int id, String NombreH) {
        this.id = id;
        this.NombreH = NombreH;
    }
    

    public Habitat(int id, String zona,String NombreH, String descripcion) {
        this.id = id;
        this.zona = zona;
        this.descripcion = descripcion;
    }

    public Habitat(String NombreH, String descripcion) {
        this.NombreH = NombreH;
        this.descripcion = descripcion;  
    }

    public Habitat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreH() {
        return NombreH;
    }

    public void setNombreH(String NombreH) {
        this.NombreH = NombreH;
    }

    @Override
    public String toString() {
        return "Habitat{" + "id=" + id + ", NombreH=" + NombreH + ", zona=" + zona + ", descripcion=" + descripcion + '}';
    }
   
    
    public ResultSet consultarhabitat(String sql) {
        
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

    public boolean ModificarHabitat(String sql) {
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
