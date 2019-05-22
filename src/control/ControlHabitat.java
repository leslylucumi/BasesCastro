/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import modelo.ConnectBD;
import modelo.Cuidador;
import modelo.Especie;
import modelo.Habitat;

/**
 *
 * @author germanny.lezama
 */
public class ControlHabitat {
      public LinkedList<Habitat> consultarHabitat() {
           LinkedList<Habitat> le=new LinkedList<>();
        ResultSet rs;
        Habitat obje=new Habitat();
        String sql="select * from habitats";
        rs=obje.consultarhabitat(sql);
        int id;
        String e;
        ///comentariocual
        if(rs!=null){
            try{
            while (rs.next()) {                
                id=rs.getInt("id_habitat");
                e=rs.getString("zona");
                obje=new Habitat(id, e);
                le.add(obje);
            }
            }catch(SQLException se){
                
            }
    
        }
        
        return le;
    }
    
      public Habitat ModificarHabitat(int id) {
          ConnectBD objCon = new ConnectBD();
          String sql = "select * from habitats where id_habitat=" + id + "";
        ResultSet rs = null;
        Habitat objh = null;
       if (objCon.crearConexion()) {
            try {
                Statement stat = objCon.getConexion().createStatement();
                rs = stat.executeQuery(sql);
                while (rs.next()) {
                    objh = new Habitat (rs.getString(2), rs.getString(3));

                    System.out.println(rs.getString(2));
                }
                objCon.getConexion().close();
            } catch (Exception e) {

                System.out.println(e.toString());
            }
        }

        return objh;

      }
         public LinkedList<Habitat> ConsultarHabitat() {
          ConnectBD objCon = new ConnectBD();
          String sql = "select* from habitats" ;
        ResultSet rs = null;
        Habitat objh = null;
        LinkedList<Habitat> Lhabitats=new  LinkedList<Habitat> ();
       if (objCon.crearConexion()) {
            try {
                Statement stat = objCon.getConexion().createStatement();
                rs = stat.executeQuery(sql);
                while (rs.next()) {
                    objh = new Habitat (rs.getByte(1),rs.getString(2), rs.getString(3));
                     Lhabitats.add(objh);
                    System.out.println(rs.getString(2));
                }
                objCon.getConexion().close();
            } catch (Exception e) {

                System.out.println(e.toString());
            }
        }

        return Lhabitats;

      }
      public boolean ModificarHabitats(Habitat objc, int id) {
        boolean c = false;

        try {

//            String descripcion;
            
           // String id_veterinario;
           
//            if (objc.getDescripcion()!= null) {
//                descripcion = "'" + objc.getDescripcion()+ "'";
//            } else {
//                descripcion = null;
//            }
            

            String sql = "update habitats set zona ='" + objc.getNombreH()+ "', descripcion_habitat ='" + objc.getDescripcion()
                        + "' where id_habitat=" + id; 
            
            c = objc.ModificarHabitat(sql);

        } catch (Exception e) {

            System.out.println(e.toString());
        }

        return c;

    }
}
