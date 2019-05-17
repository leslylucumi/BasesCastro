/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Cuidados;

/**
 *
 * @author LeslyLC
 */
public class Controlcuidados {
    
    
       public boolean insertarCita(Cuidados obje) {
        String sql="Insert into Cuidados (id_animal_veterinario,id_veterinario_animal)"+
                "value('"+obje.getId_animal_cuidador()+"','"+obje.getId_cuidador_animal()+"')";
        
        boolean f=false;
        f=obje.insertarCuidado(sql);
        
        return f;
    }
    
}
