/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.Statement;
import modelo.Animal;
import modelo.ConnectBD;
import modelo.Veterinario;

/**
 *
 * @author Acer
 */
public class ControlAnimal {
    
    public boolean insertarAnimal (Animal obje) {
//        String sql="Insert into Animales "+
//                "value('"+obje.getId()+"', '"+obje.getEdad()+"', '"+obje.getImganimalcara()+"', '"+
//                obje.getImganimalcuerpo()+"', '"+obje.getImganimal()+"', '"+obje.getGenero()+"', '"+obje.getDescripcion()+"', '"+obje.getNombre()+"', '"+obje.getPeso()+"', '"+
//                obje.getId_Especie()+"','" +obje.getId_Habitat()+"','" +obje.getId_Alimentacion()+"')";
////        
//        boolean f=false;
//        f=obje.insertarAnimal(sql);
////        
//        return f;

     boolean t=false;
        String sql="insert into animales(id_animal,edad,img_animalcara,img_animalcuerpo,img_animal, genero, descripcion,nombre,peso,id_especie_animal,id_habitat_animal,id_clasif_animal)"+
                "values(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        t=obje.insertarAnimal(obje,sql);
        
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
                
                    obja = new Animal (rs.getInt(2), rs.getBlob(3).toString(), rs.getString(4), rs.getString(5), rs.getString(6),
                            rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10),rs.getInt(11),rs.getInt(12));

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
     public boolean ModificarAnimales(Animal obja, int id_animal) {
        boolean c = false;

        try {

           String img_animal; 
           
            if (obja.getImganimal()!= null) {
                img_animal = "'" + obja.getImganimal()+ "'";
            } else {
                img_animal = null;
            }
           

            String sql = "update veterinarios set edad =" + obja.getEdad()+ ", img_animalcara =" + obja.getImganimalcara() + ", img_animalcuerpo =" + obja.getImganimalcuerpo() + ","
                    + "img_animal = " + obja.getImganimal() + " ,genero =" + obja.getGenero()+ " ,descripcion =" + obja.getDescripcion()+ " ,nombre =" + obja.getNombre()+ ", "
                    + "peso =" + obja.getPeso() + " ,id_especie_animal =" + obja.getId_Especie() + " ,id_especie_animal =" + obja.getId_Especie() +" ,id_clasif_animal =" + obja.getId_Alimentacion()
                    + " where id_animal=" + id_animal; 
            
            c = obja.modificarAnimal(sql);

        } catch (Exception e) {

            System.out.println(e.toString());
        }

        return c;

    }
}

