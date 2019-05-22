/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import modelo.ConnectBD;
import modelo.Cuidador;



/**
 *
 * @author Acer
 */
public class ControlCuidador {
      public boolean insertarCuidador(Cuidador objc) {
       String sql = "{ call agregarCuidador(?,?,?,?,?,?,?,?,?,?) }";
        boolean f = false;
         f=objc.insertarCuidador(sql, objc);
        return f;
  
       
    }
      
      public Cuidador ModificarCuidador(int id_Cuidador) {
          ConnectBD objCon = new ConnectBD();
          String sql = "select * from cuidadores where id_cuidador=" + id_Cuidador + "";
        ResultSet rs = null;
        Cuidador objc = null;
       if (objCon.crearConexion()) {
            try {
                Statement stat = objCon.getConexion().createStatement();
                rs = stat.executeQuery(sql);
                while (rs.next()) {
                    objc = new Cuidador (rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
                            rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));

                    System.out.println(rs.getString(2));
                }
                objCon.getConexion().close();
            } catch (Exception e) {

                System.out.println(e.toString());
            }
        }
       

        return objc;

      }
      
      public   LinkedList<Cuidador> Consultarcuidadores(){
          ConnectBD objCon = new ConnectBD();
          String sql = "select * from cuidadores";
        ResultSet rs = null;
        Cuidador objc = null;
        LinkedList<Cuidador> Lcuidador=new LinkedList<Cuidador>() ;
       if (objCon.crearConexion()) {
            try {
                Statement stat = objCon.getConexion().createStatement();
                rs = stat.executeQuery(sql);
               
                while (rs.next()) {
                    
                     
                    objc = new Cuidador (rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
                            rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                    
                    
                    
                    Lcuidador.add(objc);
 
                   
                }
                objCon.getConexion().close();
            } catch (Exception e) {

                System.out.println(e.toString());
            }
        }
       

        return Lcuidador;
      
      }
      
      public boolean ModificarCuidadores(Cuidador objc, int id_cuidador) {
        boolean c = false;

        try {

            String nombrec2;
            String apellidoc2;
            String telc2;
           // String id_veterinario;
           
            if (objc.getNombrec2()!= null) {
                nombrec2 = "'" + objc.getNombrec2()+ "'";
            } else {
                nombrec2 = null;
            }
            if (objc.getApellidoc2()!= null) {
                apellidoc2 = "'" + objc.getApellidoc2()+ "'";
            } else {
                apellidoc2 = null;
            }
            if (objc.getTelc2()!= null) {
                telc2 = "'" + objc.getTelc2()+ "'";
            } else {
                telc2 = null;
            }

            String sql = "update cuidadores set nombrec1 =" + objc.getNombrec1() + ", nombrec2 =" + nombrec2 + ", apellidoc1 =" + objc.getApellidoc1() + ","
                    + "apellidoc2 = " + apellidoc2 + " ,edadc =" + objc.getEdadc() + " ,correoc =" + objc.getCorreoc() + " ,telc1 =" + objc.getTelc1() + ", "
                    + "telc2 =" + telc2 + " ,dirc =" + objc.getDirc() + " where id_cuidador=" + id_cuidador; 
            
            c = objc.modificarCuidador(sql);

        } catch (Exception e) {

            System.out.println(e.toString());
        }

        return c;

    }
}

