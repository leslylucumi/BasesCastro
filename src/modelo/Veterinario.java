/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author angela_maria.marin
 */
public class Veterinario {
    private String nombrev1;
    private String nombrev2;
    private String apellidov1;
    private String apellidov2;
    private int edadv;
    private String correov;
    private String telv1;
    private String telv2;
    private String dirv;
    private int id_veterinario;

    public Veterinario(String nombrev1, int id_veterinario) {
        this.nombrev1 = nombrev1;
        this.id_veterinario = id_veterinario;
    }
    

    public Veterinario(int id_veterinario,String nombrev1, String nombrev2, String apellidov1, String apellidov2, int edadv, String correov, String telv1, String telv2, String dirv) {
        this.nombrev1 = nombrev1;
        this.nombrev2 = nombrev2;
        this.apellidov1 = apellidov1;
        this.apellidov2 = apellidov2;
        this.edadv = edadv;
        this.correov = correov;
        this.telv1 = telv1;
        this.telv2 = telv2;
        this.dirv = dirv;
        this.id_veterinario = id_veterinario;
    }

    public Veterinario(String nombrev1, String nombrev2, String apellidov1, String apellidov2, int edadv, String correov, String telv1, String telv2, String dirv) {
        this.nombrev1 = nombrev1;
        this.nombrev2 = nombrev2;
        this.apellidov1 = apellidov1;
        this.apellidov2 = apellidov2;
        this.edadv = edadv;
        this.correov = correov;
        this.telv1 = telv1;
        this.telv2 = telv2;
        this.dirv = dirv;
    }

    public String getNombrev1() {
        return nombrev1;
    }

    public void setNombrev1(String nombrev1) {
        this.nombrev1 = nombrev1;
    }

    public String getNombrev2() {
        return nombrev2;
    }

    public void setNombrev2(String nombrev2) {
        this.nombrev2 = nombrev2;
    }

    public String getApellidov1() {
        return apellidov1;
    }

    public void setApellidov1(String apellidov1) {
        this.apellidov1 = apellidov1;
    }

    public String getApellidov2() {
        return apellidov2;
    }

    public void setApellidov2(String apellidov2) {
        this.apellidov2 = apellidov2;
    }

    public int getEdadv() {
        return edadv;
    }

    public void setEdadv(int edadv) {
        this.edadv = edadv;
    }

    public String getCorreov() {
        return correov;
    }

    public void setCorreov(String correov) {
        this.correov = correov;
    }

    public String getTelv1() {
        return telv1;
    }

    public void setTelv1(String telv1) {
        this.telv1 = telv1;
    }

    public String getTelv2() {
        return telv2;
    }

    public void setTelv2(String telv2) {
        this.telv2 = telv2;
    }

    public String getDirv() {
        return dirv;
    }

    public void setDirv(String dirv) {
        this.dirv = dirv;
    }

    public int getId_veterinario() {
        return id_veterinario;
    }

    public void setId_veterinario(int id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    @Override
    public String toString() {
        return "Veterinario{" + "nombrev1=" + nombrev1 + ", nombrev2=" + nombrev2 + ", apellidov1=" + apellidov1 + ", apellidov2=" + apellidov2 + ", edadv=" + edadv + ", correov=" + correov + ", telv1=" + telv1 + ", telv2=" + telv2 + ", dirv=" + dirv + ", id_veterinario=" + id_veterinario + '}';
    }

    
     public boolean insertarVeterinario(String sql) {
          ConnectBD objCon = new ConnectBD();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        return true;
    }
    
    
    public boolean modificarVeterinario(String sql) {
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
