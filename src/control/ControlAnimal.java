/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import modelo.Animal;
import modelo.ConnectBD;
import modelo.Veterinario;

/**
 *
 * @author Acer
 */
public class ControlAnimal {

    public boolean insertarAnimal(Animal obje) {
//        String sql="Insert into Animales "+
//                "value('"+obje.getId()+"', '"+obje.getEdad()+"', '"+obje.getImganimalcara()+"', '"+
//                obje.getImganimalcuerpo()+"', '"+obje.getImganimal()+"', '"+obje.getGenero()+"', '"+obje.getDescripcion()+"', '"+obje.getNombre()+"', '"+obje.getPeso()+"', '"+
//                obje.getId_Especie()+"','" +obje.getId_Habitat()+"','" +obje.getId_Alimentacion()+"')";
////        
//        boolean f=false;
//        f=obje.insertarAnimal(sql);
////        
//        return f;

        boolean t = false;
        String sql = "insert into animales(id_animal,edad,img_animalcara,img_animalcuerpo,img_animal, genero, descripcion,nombre,peso,id_especie_animal,id_habitat_animal,id_clasif_animal)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?)";

        t = obje.insertarAnimal(obje, sql);

        return t;
    }

    public Animal ModificarAnimal(int id_animal) {
        ConnectBD objCon = new ConnectBD();
        String sql = "select * from animales where id_animal=" + id_animal + "";
        ResultSet rs = null;
        Animal obja = null;

        if (objCon.crearConexion()) {

            String a = "";
            try {
                Statement stat = objCon.getConexion().createStatement();
                rs = stat.executeQuery(sql);
                while (rs.next()) {

                    obja = new Animal(rs.getInt(2), rs.getBlob(3).toString(), rs.getBlob(4).toString(), rs.getString(5).toString(), rs.getString(6),
                            rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10), rs.getInt(11), rs.getInt(12));

                    System.out.println(rs.getString(2));
                    System.out.println(rs.getBlob(3));
                    System.out.println(rs.getBlob(3).toString());
                    a = rs.getString(3);
                }

                objCon.getConexion().close();
            } catch (Exception e) {

                System.out.println(e.toString());
            }
        }

        return obja;

    }
//   
    
        public LinkedList<Animal> ConsultarAnimales () {
        ConnectBD objCon = new ConnectBD();
        String sql = "select* from animales";
        ResultSet rs = null;
        Animal obja = null;
        LinkedList<Animal> LAnimales=new LinkedList<Animal>();

        if (objCon.crearConexion()) {

            String a = "";
            try {
                Statement stat = objCon.getConexion().createStatement();
                rs = stat.executeQuery(sql);
                while (rs.next()) {

                    obja = new Animal(rs.getByte(1),rs.getInt(2), rs.getString(6),
                            rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10), rs.getInt(11), rs.getInt(12));
                    LAnimales.add(obja);
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getBlob(3));
                    System.out.println(rs.getBlob(3).toString());
                    a = rs.getString(3);
                }

                objCon.getConexion().close();
            } catch (Exception e) {

                System.out.println(e.toString());
            }
        }

        return LAnimales;

    }

    public boolean ModificarAnimales(Animal obja, int id_animal) {
        boolean c = false;

        try {

            String img_animal, img_animalcara, Imganimalcuerpo;

            if (obja.getImganimal() != null || obja.getImganimal() != "") {
                img_animal = "'" + obja.getImganimal() + "'";
            } else {
                ConnectBD objCon = new ConnectBD();
                String sql = "select * from animales where id_animal=" + id_animal + "";
                ResultSet rs = null;
                if (objCon.crearConexion()) {

                    String a = "";
                    try {
                        Statement stat = objCon.getConexion().createStatement();
                        rs = stat.executeQuery(sql);
                        while (rs.next()) {

                            obja = new Animal(rs.getInt(2), rs.getBlob(3).toString(), rs.getBlob(4).toString(), rs.getString(5).toString(), rs.getString(6),
                                    rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10), rs.getInt(11), rs.getInt(12));

                        }

                        objCon.getConexion().close();
                    } catch (Exception e) {

                        System.out.println(e.toString());
                    }
                }
            }

            if (obja.getImganimalcara() != null || obja.getImganimalcara() != "") {
                img_animalcara = "'" + obja.getImganimalcara() + "'";
            } else {
                img_animalcara = null;
            }

            if (obja.getImganimalcuerpo() != null || obja.getImganimalcuerpo() != "") {
                Imganimalcuerpo = "'" + obja.getImganimalcuerpo() + "'";
            } else {

                Imganimalcuerpo = null;
            }

            String sql = "update animales set edad = ?, img_animalcara = ?,  img_animalcuerpo =?, "
                    + "img_animal = ?,genero = ? ,descripcion = ? ,nombre = ? ,peso =  ?  "
                    + ",id_especie_animal = ? ,id_habitat_animal = ?,id_clasif_animal = ?"
                    + " where id_animal=" + id_animal;

            c = obja.modificarAnimal(obja, sql);

        } catch (Exception e) {

            System.out.println(e.toString());
        }

        return c;

    }
}
