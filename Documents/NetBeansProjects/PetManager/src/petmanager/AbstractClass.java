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
public class AbstractClass {
    public static void main(String[] args) {
        clsDoctor doctor = new clsDoctor("Lucia", "si tiene");
        clsVeterinary veterinary = new clsVeterinary("Santa Lucila", "994-4545", "Avenida siempre viva 123", doctor);

        veterinary.setData(veterinary.getName() + " - " + veterinary.getAddress());
        
        String data = veterinary.getHospitalInformation();
        String type = veterinary.getPatientType();
        String surgery = veterinary.Surgery();
        
        System.out.println("Data: " + data);
        System.out.println("Type: "+ type);
        System.out.println("Surgery: " + surgery);
    }
}
