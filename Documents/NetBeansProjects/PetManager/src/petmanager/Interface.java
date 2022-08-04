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
public class Interface {
    public static void main(String[] args) {
        clsDog dog = new clsDog("Criollo", false, "001", "Morrocondo", 1999, "Azul", "Sano");
        clsCat cat = new clsCat("Angora", "002", "Firulayo", 1998, "Amarillo", "Malito");
        
        System.out.println(dog.getAnimalType());
        System.out.println("" + cat.getAnimalType());
        
        System.out.println(dog.getNumberOfBones());
        System.out.println("" + cat.getNumberOfBones());
    }
}
