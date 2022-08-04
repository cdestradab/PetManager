/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Cristian Estrada
 */
public class clsCat extends clsPet{
    private String breed;

    public clsCat(String breed, String code, String name, int born_year, String color, String health_status) {
        super(code, name, born_year, color, health_status);
        this.breed = breed;
    }
    
    
    
    public void SelfCleaning() {
        System.out.println("El gato " + super.getName() + " se está limpiando");
    }
    
    @Override
    public void Sound(){
        System.out.println("El gato " + super.getName() + " hace 'Miau'.");
    }
    

    @Override
    public int getNumberOfBones() {
        return 100;
    }

    @Override
    public String getAnimalType() {
        return "gato";
    }
    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
