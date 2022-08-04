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
public class Polymorphism {
    public static void main(String[] args) {
        //Instancias de las clases hijas
        clsDog dog = new clsDog("Criollo", false, "001", "Morrocondo", 1999, "Azul", "Sano");
        clsCat cat = new clsCat("Angora", "002", "Firulayo", 1998, "Amarillo", "Malito");
        
        //Instancias de las clases padre
        clsDoctor doctor = new clsDoctor("Lucia", "si tiene");
        clsVeterinary veterinary = new clsVeterinary("Santa Lucila", "994-4545", "Avenida siempre viva 123", doctor);
        
        String careDog = veterinary.PetCare(dog);
        System.out.println("El estado de salud de " + dog.getName() + " es " + careDog);

        String careCat = veterinary.PetCare(cat);
        System.out.println("El estado de salud de " + cat.getName() + " es " + careCat);
    }
}
