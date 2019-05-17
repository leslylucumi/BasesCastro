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
 * @author LeslyLC
 */
public class Citas {
    private int id_animal_veterinario;
    private int id_veterinario_animal;

    public Citas(int id_animal_veterinario, int id_veterinario_animal) {
        this.id_animal_veterinario = id_animal_veterinario;
        this.id_veterinario_animal = id_veterinario_animal;
    }

    public Citas() {
    }

    public int getId_animal_veterinario() {
        return id_animal_veterinario;
    }

    public void setId_animal_veterinario(int id_animal_veterinario) {
        this.id_animal_veterinario = id_animal_veterinario;
    }

    public int getId_veterinario_animal() {
        return id_veterinario_animal;
    }

    public void setId_veterinario_animal(int id_veterinario_animal) {
        this.id_veterinario_animal = id_veterinario_animal;
    }

    @Override
    public String toString() {
        return "Citas{" + "id_animal_veterinario=" + id_animal_veterinario + ", id_veterinario_animal=" + id_veterinario_animal + '}';
    }
    
         public boolean insertarCita(String sql) {
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
    
    
}
