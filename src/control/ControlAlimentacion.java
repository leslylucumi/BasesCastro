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
import modelo.Alimentacion;
import modelo.ConnectBD;
import modelo.Habitat;


/**
 *
 * @author Usuario
 */
public class ControlAlimentacion {
    public LinkedList<Alimentacion> consultarAlimentacion(){
        LinkedList<Alimentacion> le=new LinkedList<>();
        ResultSet rs;
        Alimentacion obje=new Alimentacion();
        String sql="select * from clasif_alim";
        rs=obje.consultarAlimentacion(sql);
        int id;
        String e;
        
        if(rs!=null){
            try{
            while (rs.next()) {                
                id=rs.getInt("id_clasif_alim");
                e=rs.getString("nombre_clasif_alim");
                obje=new Alimentacion(id, e);
                le.add(obje);
            }
            }catch(SQLException se){
                
            }
    
        }
        
        return le;
    }
    public Alimentacion ModificarAlimentacion(int id) {
          ConnectBD objCon = new ConnectBD();
          String sql = "select * from clasif_alim where id_clasif_alim=" + id + "";
        ResultSet rs = null;
        Alimentacion obja = null;
       if (objCon.crearConexion()) {
            try {
                Statement stat = objCon.getConexion().createStatement();
                rs = stat.executeQuery(sql);
                while (rs.next()) {
                    obja = new Alimentacion (rs.getString(2));

                    System.out.println(rs.getString(2));
                }
                objCon.getConexion().close();
            } catch (Exception e) {

                System.out.println(e.toString());
            }
        }

        return obja;

      }
    public LinkedList<Alimentacion> ConsultarAlimentacion() {
          ConnectBD objCon = new ConnectBD();
          String sql = "select* from clasif_alim" ;
        ResultSet rs = null;
        Alimentacion obja = null;
        LinkedList<Alimentacion> Lalimentacion=new LinkedList<Alimentacion>();
       if (objCon.crearConexion()) {
            try {
                Statement stat = objCon.getConexion().createStatement();
                rs = stat.executeQuery(sql);
                while (rs.next()) {
                    obja = new Alimentacion (rs.getInt(1),rs.getString(2));
                    Lalimentacion.add(obja);

                    
                }
                objCon.getConexion().close();
            } catch (Exception e) {

                System.out.println(e.toString());
            }
        }

        return Lalimentacion;

      }
      public boolean ModificarAlimentaciones(Alimentacion obja, int id) {
        boolean c = false;

        try {

//            String descripcion;
            
           // String id_veterinario;
           
//            if (objc.getDescripcion()!= null) {
//                descripcion = "'" + objc.getDescripcion()+ "'";
//            } else {
//                descripcion = null;
//            }
            

            String sql = "update clasif_alim set nombre_clasif_alim ='" + obja.getNombreA()
                        + "' where id_clasif_alim=" + id; 
            
            c = obja.ModificarAlimentacion(sql);

        } catch (Exception e) {

            System.out.println(e.toString());
        }

        return c;

    }
}
