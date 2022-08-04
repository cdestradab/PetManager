/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;
import Classes.*;

/**
 *
 * @author Cristian Estrada
 */
public class Polymorphism2 {
    public static void main(String[] args) {
        //Instancias de las clases hijas
        clsDog dog = new clsDog("Criollo", false, "001", "Morrocondo", 1999, "Azul", "Sano");
        clsCat cat = new clsCat("Angora", "002", "Firulayo", 1998, "Amarillo", "Malito");
        
        dog.Sound();
        cat.Sound();
        
        
    }
}
