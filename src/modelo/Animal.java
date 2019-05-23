/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class Animal {

    private int id;
    private int edad;
    private String imganimalcara;
    private String imganimalcuerpo;
    private String imganimal;
    private String genero;
    private String descripcion;
    private String nombre;
    private double peso;
    private int id_Especie;
    private int id_Habitat;
    private int id_Alimentacion;

    public Animal(int id, int edad, String genero, String descripcion, String nombre, double peso, int id_Especie, int id_Habitat, int id_Alimentacion) {
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.peso = peso;
        this.id_Especie = id_Especie;
        this.id_Habitat = id_Habitat;
        this.id_Alimentacion = id_Alimentacion;
    }

    //  private String dirc;
    public Animal(int id, int edad, String imganimalcara, String imganimalcuerpo, String imganimal, String genero, String descripcion, String nombre, double peso, int id_Especie, int id_Habitat, int id_Alimentacion) {
        this.id = id;
        this.edad = edad;
        this.imganimalcara = imganimalcara;
        this.imganimalcuerpo = imganimalcuerpo;
        this.imganimal = imganimal;
        this.genero = genero;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.peso = peso;
        this.id_Especie = id_Especie;
        this.id_Habitat = id_Habitat;
        this.id_Alimentacion = id_Alimentacion;
    }

    public Animal(int edad, String imganimalcara, String imganimalcuerpo, String imganimal, String genero, String descripcion, String nombre, double peso, int id_Especie, int id_Habitat, int id_Alimentacion) {
        this.edad = edad;
        this.imganimalcara = imganimalcara;
        this.imganimalcuerpo = imganimalcuerpo;
        this.imganimal = imganimal;
        this.genero = genero;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.peso = peso;
        this.id_Especie = id_Especie;
        this.id_Habitat = id_Habitat;
        this.id_Alimentacion = id_Alimentacion;
    }

    public Animal(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Especie() {
        return id_Especie;
    }

    public void setId_Especie(int id_Especie) {
        this.id_Especie = id_Especie;
    }

    public int getId_Habitat() {
        return id_Habitat;
    }

    public void setId_Habitat(int id_Habitat) {
        this.id_Habitat = id_Habitat;
    }

    public int getId_Alimentacion() {
        return id_Alimentacion;
    }

    public void setId_Alimentacion(int id_Alimentacion) {
        this.id_Alimentacion = id_Alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getImganimalcara() {
        return imganimalcara;
    }

    public void setImganimalcara(String imganimalcara) {
        this.imganimalcara = imganimalcara;
    }

    public String getImganimalcuerpo() {
        return imganimalcuerpo;
    }

    public void setImganimalcuerpo(String imganimalcuerpo) {
        this.imganimalcuerpo = imganimalcuerpo;
    }

    public String getImganimal() {
        return imganimal;
    }

    public void setImganimal(String imganimal) {
        this.imganimal = imganimal;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", edad=" + edad + ", imganimalcara=" + imganimalcara + ", imganimalcuerpo=" + imganimalcuerpo + ", imganimal=" + imganimal + ", genero=" + genero + ", descripcion=" + descripcion + ", nombre=" + nombre + ", peso=" + peso + ", id_Especie=" + id_Especie + ", id_Habitat=" + id_Habitat + ", id_Alimentacion=" + id_Alimentacion + '}';
    }

    public boolean insertarAnimal(Animal obje, String sql) {

        boolean t = false;
        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        FileInputStream fis3 = null;
        PreparedStatement ps = null;
        ConnectBD obj = new ConnectBD();
        try {
            if (obj.crearConexion()) {
                obj.getConexion().setAutoCommit(false);
                File file1 = new File(obje.getImganimalcara());
                File file2 = new File(obje.getImganimalcuerpo());
                File file3 = new File(obje.getImganimal());
                System.out.println("nn " + file1.getPath());
                fis1 = new FileInputStream(file1);
                fis2 = new FileInputStream(file2);
                fis3 = new FileInputStream(file3);
                ps = obj.getConexion().prepareStatement(sql);
                ps.setInt(1, obje.getId());
                ps.setInt(2, obje.getEdad());
                ps.setBinaryStream(3, fis1, (int) file1.length());
                ps.setBinaryStream(4, fis2, (int) file2.length());
                ps.setBinaryStream(5, fis3, (int) file3.length());
                ps.setString(6, obje.getGenero());
                ps.setString(7, obje.getDescripcion());
                ps.setString(8, obje.getNombre());
                ps.setDouble(9, obje.getPeso());
                ps.setInt(10, obje.getId_Especie());
                ps.setInt(11, obje.getId_Habitat());
                ps.setInt(12, obje.getId_Alimentacion());

                ps.executeUpdate();
                obj.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            t = false;
            System.out.println("Error " + ex.toString());
        } finally {
            try {
                ps.close();
                fis1.close();
                fis2.close();
                fis3.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                t = false;
                System.out.println("Errro " + ex.toString());
            }
        }
        return t;

    }

    public boolean modificarAnimal(Animal obja, String sql) {
        ConnectBD objCon = new ConnectBD();

        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        FileInputStream fis3 = null;
        PreparedStatement ps = null;
        boolean a = false;

        try {
            if (objCon.crearConexion()) {
                objCon.getConexion().setAutoCommit(false);
                File file1 = new File(obja.getImganimalcara());
                File file2 = new File(obja.getImganimalcuerpo());
                File file3 = new File(obja.getImganimal());
                System.out.println("nn " + file1.getPath());
                //ojo con esta parte
                
                    fis3 = new FileInputStream(file3);
                
                fis1 = new FileInputStream(file1);
                fis2 = new FileInputStream(file2);

                ps = objCon.getConexion().prepareStatement(sql);
                //ps.setInt(1, obja.getId());
                ps.setInt(1, obja.getEdad());
                ps.setBinaryStream(2, fis1, (int) file1.length());
                ps.setBinaryStream(3, fis2, (int) file2.length());
                ps.setBinaryStream(4, fis3, (int) file3.length());
                ps.setString(5, obja.getGenero());
                ps.setString(6, obja.getDescripcion());
                ps.setString(7, obja.getNombre());
                ps.setDouble(8, obja.getPeso());
                ps.setInt(9, obja.getId_Especie());
                ps.setInt(10, obja.getId_Habitat());
                ps.setInt(11, obja.getId_Alimentacion());

//           Statement stat;
//           stat = objCon.getConexion().createStatement();
//           stat.executeUpdate(sql);}
                ps.executeUpdate();
                objCon.getConexion().commit();

                a = true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            a = false;
            System.out.println("Error " + ex.toString());
        } finally {
            try {
                //ps.close();
                fis1.close();
                fis2.close();
               
                    fis3.close();
                
//                
            } catch (Exception ex) {
                ex.printStackTrace();
                a = false;
                System.out.println("Errro " + ex.toString());
            }
        }

        return a;
    }

}
