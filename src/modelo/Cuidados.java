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
public class Cuidados {
  private  int id_animal_cuidador;
   private  int id_cuidador_animal;

    public Cuidados(int id_animal_cuidador, int id_cuidador_animal) {
        this.id_animal_cuidador = id_animal_cuidador;
        this.id_cuidador_animal = id_cuidador_animal;
    }

    public int getId_animal_cuidador() {
        return id_animal_cuidador;
    }

    public void setId_animal_cuidador(int id_animal_cuidador) {
        this.id_animal_cuidador = id_animal_cuidador;
    }

    public int getId_cuidador_animal() {
        return id_cuidador_animal;
    }

    public void setId_cuidador_animal(int id_cuidador_animal) {
        this.id_cuidador_animal = id_cuidador_animal;
    }

    @Override
    public String toString() {
        return "Cuiados{" + "id_animal_cuidador=" + id_animal_cuidador + ", id_cuidador_animal=" + id_cuidador_animal + '}';
    }
   
   public boolean insertarCuidado(String sql) {
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
