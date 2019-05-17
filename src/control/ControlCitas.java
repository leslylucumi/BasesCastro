/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Citas;

/**
 *
 * @author LeslyLC
 */
public class ControlCitas {
    
      public boolean insertarCita(Citas obje) {
        String sql="Insert into citas (id_animal_veterinario,id_veterinario_animal)"+
                "value('"+obje.getId_animal_veterinario()+"','"+obje.getId_veterinario_animal()+"')";
        
        boolean f=false;
        f=obje.insertarCita(sql);
        
        return f;
    }
    
}
