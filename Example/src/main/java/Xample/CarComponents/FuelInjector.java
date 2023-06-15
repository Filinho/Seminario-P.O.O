/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xample.CarComponents;

/**
 *
 * @author Ivanderlei Filho &lt;imsf@aluno.ifnmg.edu.br&gt;
 */
public class FuelInjector implements Switch{
    FuelPump fuelPump;
    public FuelInjector(){
        fuelPump = new FuelPump();
    }

    public void inject(){
        fuelPump.pump();
        System.out.println("Injection in Progress");
    }

    @Override
    public void on() {
        inject();
        System.out.println("Fuel Injector: ON");
    }

    @Override
    public void off() {
       System.out.println("Fuel Injector: OFF");
    }
}
