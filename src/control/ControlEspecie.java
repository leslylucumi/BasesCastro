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
import modelo.Especie;
import modelo.Habitat;

/**
 *
 * @author dacastro
 */
public class ControlEspecie {

    public LinkedList<Especie> consultarEspecies() {
        LinkedList<Especie> le = new LinkedList<>();
        ResultSet rs;
        Especie obje = new Especie();
        String sql = "select * from especies";
        rs = obje.consultarEspecie(sql);
        int id;
        String e;

        if (rs != null) {
            try {
                while (rs.next()) {
                    id = rs.getInt("id_especie");
                    e = rs.getString("nombre_especie");
                    obje = new Especie(id, e);
                    le.add(obje);
                }
            } catch (SQLException se) {

            }

        }

        return le;
    }

    public Especie ModificarEspecie(int id) {
        ConnectBD objCon = new ConnectBD();
        String sql = "select * from especies where id_especie=" + id + "";
        ResultSet rs = null;
        Especie obje = null;
        if (objCon.crearConexion()) {
            try {
                Statement stat = objCon.getConexion().createStatement();
                rs = stat.executeQuery(sql);
                while (rs.next()) {
                    obje = new Especie(rs.getString(2));

                    System.out.println(rs.getString(2));
                }
                objCon.getConexion().close();
            } catch (Exception e) {

                System.out.println(e.toString());
            }
        }

        return obje;

    }

    public boolean ModificarEspecies(Especie obje, int id) {
        boolean c = false;

        try {

//            String descripcion;
            // String id_veterinario;
//            if (objc.getDescripcion()!= null) {
//                descripcion = "'" + objc.getDescripcion()+ "'";
//            } else {
//                descripcion = null;
//            }
            String sql = "update especies set nombre_especie ='" + obje.getNombreE() 
                    + "' where id_especie=" + id;

            c = obje.ModificarEspecie(sql);

        } catch (Exception e) {

            System.out.println(e.toString());
        }

        return c;

    }
}
