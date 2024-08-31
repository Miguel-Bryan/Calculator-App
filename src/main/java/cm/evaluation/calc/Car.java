/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.evaluation.calc;

import java.util.Calendar;

/**
 *
 * @author bryan
 */
public class Car {

    private String Make;
    private String Model;
    private int Year;
    private static int totalCars = 0;

     Car() {
        this.Make ="";
        this.Model="";
        this.Year= 0; 
        totalCars++;
    }

    Car(String Make, String Model, int Year) {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        totalCars++;
    }

    Car(String Make, String Model) {
        this.Make = Make;
        this.Model = Model;
        this.Year = Calendar.getInstance().get(Calendar.YEAR);
        totalCars++;
    }

    public String getMakeModelYear() {
        String Concatenation = Make +" "+ Model+" " + Year;
        return Concatenation;
        
    
    }

    private boolean isValidYear(int Year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return (Year >= 1900 && Year <= currentYear);
        /*if (Year > 0 || Year < Calendar.getInstance().get(Calendar.YEAR)) {

        }
        if (Year >= 1900 || Year <= Calendar.getInstance().get(Calendar.YEAR)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }*/
        
    }

    
   

    public void printTotalCars() {
        System.out.println( totalCars);
    }

    public static void main(String[] args) {
        Car Car1 = new Car();
        Car Car2 = new Car("Toyota", "Camry", 8);
        System.out.println(Car1.getMakeModelYear());
        System.out.println(Car2.getMakeModelYear());
        Car1.printTotalCars();
        Car2.printTotalCars();
    }
}
