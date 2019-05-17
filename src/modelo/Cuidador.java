/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class Cuidador {
    private String nombrec1;
    private String nombrec2;
    private String apellidoc1;
    private String apellidoc2;
    private int edadc;
    private String correoc;
    private String telc1;
    private String telc2;
    private String dirc;
    private int id_cuidador;

    public Cuidador(int id_cuidador, String nombrec1, String nombrec2, String apellidoc1, String apellidoc2, int edadc, String correoc, String telc1, String telc2, String dirc) {
        this.nombrec1 = nombrec1;
        this.nombrec2 = nombrec2;
        this.apellidoc1 = apellidoc1;
        this.apellidoc2 = apellidoc2;
        this.edadc = edadc;
        this.correoc = correoc;
        this.telc1 = telc1;
        this.telc2 = telc2;
        this.dirc = dirc;
        this.id_cuidador = id_cuidador;
    } 

    public Cuidador(String nombrec1, String nombrec2, String apellidoc1, String apellidoc2, int edadc, String correoc, String telc1, String telc2, String dirc) {
        this.nombrec1 = nombrec1;
        this.nombrec2 = nombrec2;
        this.apellidoc1 = apellidoc1;
        this.apellidoc2 = apellidoc2;
        this.edadc = edadc;
        this.correoc = correoc;
        this.telc1 = telc1;
        this.telc2 = telc2;
        this.dirc = dirc;
    }
    


    public String getNombrec1() {
        return nombrec1;
    }

    public void setNombrec1(String nombrec1) {
        this.nombrec1 = nombrec1;
    }

    public String getNombrec2() {
        return nombrec2;
    }

    public void setNombrec2(String nombrec2) {
        this.nombrec2 = nombrec2;
    }

    public String getApellidoc1() {
        return apellidoc1;
    }

    public void setApellidoc1(String apellidoc1) {
        this.apellidoc1 = apellidoc1;
    }

    public String getApellidoc2() {
        return apellidoc2;
    }

    public void setApellidoc2(String apellidoc2) {
        this.apellidoc2 = apellidoc2;
    }

    public int getEdadc() {
        return edadc;
    }

    public void setEdadc(int edadc) {
        this.edadc = edadc;
    }

    public String getCorreoc() {
        return correoc;
    }

    public void setCorreoc(String correoc) {
        this.correoc = correoc;
    }

    public String getTelc1() {
        return telc1;
    }

    public void setTelc1(String telc1) {
        this.telc1 = telc1;
    }

    public String getTelc2() {
        return telc2;
    }

    public void setTelc2(String telc2) {
        this.telc2 = telc2;
    }

    public String getDirc() {
        return dirc;
    }

    public void setDirc(String dirc) {
        this.dirc = dirc;
    }

    public int getId_cuidador() {
        return id_cuidador;
    }

    public void setId_cuidador(int id_cuidador) {
        this.id_cuidador = id_cuidador;
    }

    @Override
    public String toString() {
        return "Cuidador{" + "nombrec1=" + nombrec1 + ", nombrec2=" + nombrec2 + ", apellidoc1=" + apellidoc1 + ", apellidoc2=" + apellidoc2 + ", edadc=" + edadc + ", correoc=" + correoc + ", telc1=" + telc1 + ", telc2=" + telc2 + ", dirc=" + dirc + ", id_cuidador=" + id_cuidador + '}';
    }

    
      public boolean insertarCuidador(String sql, Cuidador objc) {
         ConnectBD objCon = new ConnectBD();
         
         PreparedStatement ps = null; 
         CallableStatement Statement = null; 

       if (objCon.crearConexion()) {
           try {
         //Para el procedureeeeeeeeeeeeeeeeeeeee
               Statement = objCon.getConexion().prepareCall(sql);
               Statement.setInt(1, objc.getId_cuidador());
               Statement.setString(2, objc.getNombrec1());
               Statement.setString(3, objc.getNombrec2());
               Statement.setString(4, objc.getApellidoc1());
               Statement.setString(5, objc.getApellidoc2());
               Statement.setInt(6, objc.getEdadc());
               Statement.setString(7, objc.getCorreoc());
               Statement.setString(8, objc.getTelc1());
               Statement.setString(9, objc.getTelc2());
               Statement.setString(10, objc.getDirc());
               
               
               Statement.execute();
              
           } catch (SQLException ex) {
               ex.printStackTrace();
               System.out.println(ex.toString());
               return false;
           }
       }
       return true;
       
    
   }
        public boolean modificarCuidador(String sql) {
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
