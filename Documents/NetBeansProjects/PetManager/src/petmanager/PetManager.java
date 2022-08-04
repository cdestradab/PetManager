/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.*;
import java.util.Date;

/**
 *
 * @author Cristian Estrada
 */
public class PetManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        clsDog dog1 = new clsDog("Criollo", false, "001", "Morrocondo", 1999, "Azul", "Sano");
        
        clsCat cat1 = new clsCat("Angora", "002", "Firulayo", 1998, "Amarillo", "Malito");
        
        Date current_date = new Date();
        int current_year = current_date.getYear();
        
        int agePet1 = current_year - dog1.getBorn_year();
        int agePet2 = current_year - cat1.getBorn_year();
        
        if(agePet1 > agePet2) {
            System.out.println("La mascota " + dog1.getName() + " es mayor que la mascota " + cat1.getName());
        }else{
            if(agePet2 > agePet1){
                System.out.println("La mascota " + cat1.getName() + " es mayor que la mascota " + dog1.getName());
            } else {
                System.out.println("La mascota " + cat1.getName() + " tiene la misma edad que la mascota " + dog1.getName());
            }
        }
        
        dog1.Sound();
        
        cat1.Eat();
        cat1.Move();
        cat1.Sound();
        
        dog1.WalkAround();
        cat1.SelfCleaning();
    } 
}
