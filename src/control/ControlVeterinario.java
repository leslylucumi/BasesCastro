/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.sql.Statement;
import modelo.ConnectBD;
import modelo.Veterinario;

/**
 *
 * @author angela_maria.marin
 */
public class ControlVeterinario {
      public boolean insertarVeterinario(Veterinario obje) {
        String sql="Insert into veterinarios (id_verinario,nombrev1,nombrev2,apellidov1,apellidov2,edadv,correov,telv1,telv2,dirv)"+
                "value('"+obje.getId_veterinario()+"','"+obje.getNombrev1()+"', '"+obje.getNombrev2()+"', '"+obje.getApellidov1()+"', '"+
                obje.getApellidov2()+"', '"+obje.getEdadv()+"', '"+obje.getCorreov()+"', '"+obje.getTelv1()+"', '"+obje.getTelv2()+"', '"+obje.getDirv()+"')";
        
        boolean f=false;
        f=obje.insertarVeterinario(sql);
        
        return f;
    }
       public Veterinario ModificarVeterinario(int id_veterinario) {
        ConnectBD objCon = new ConnectBD();
        String sql = "select * from veterinarios where id_verinario=" + id_veterinario + "";
        ResultSet rs = null;
        Veterinario objv = null;

        if (objCon.crearConexion()) {
            try {
                Statement stat = objCon.getConexion().createStatement();
                rs = stat.executeQuery(sql);
                while (rs.next()) {
                    objv = new Veterinario (rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
                            rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));

                    System.out.println(rs.getString(2));
                }
                objCon.getConexion().close();
            } catch (Exception e) {

                System.out.println(e.toString());
            }
        }

        return objv;

    }
        public boolean ModificarVeterinarios(Veterinario objv, int id_veterinario) {
        boolean c = false;

        try {

            String nombrev2;
            String apellidov2;
            String telv2;
           // String id_veterinario;
           
            if (objv.getNombrev2()!= null) {
                nombrev2 = "'" + objv.getNombrev2()+ "'";
            } else {
                nombrev2 = null;
            }
            if (objv.getApellidov2()!= null) {
                apellidov2 = "'" + objv.getApellidov2()+ "'";
            } else {
                apellidov2 = null;
            }
            if (objv.getTelv2()!= null) {
                telv2 = "'" + objv.getTelv2()+ "'";
            } else {
                telv2 = null;
            }

            String sql = "update veterinarios set nombrev1 =" + objv.getNombrev1() + ", nombrev2 =" + nombrev2 + ", apellidov1 =" + objv.getApellidov1() + ","
                    + "apellidov2 = " + apellidov2 + " ,edadv =" + objv.getEdadv() + " ,correov =" + objv.getCorreov() + " ,telv1 =" + objv.getTelv1() + ", "
                    + "telv2 =" + telv2 + " ,dirv =" + objv.getDirv() + " where id_verinario=" + id_veterinario; 
            
            c = objv.modificarVeterinario(sql);

        } catch (Exception e) {

            System.out.println(e.toString());
        }

        return c;

    }
}
