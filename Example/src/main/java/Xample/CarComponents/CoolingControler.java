/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xample.CarComponents;

/**
 *
 * @author Ivanderlei Filho &lt;imsf@aluno.ifnmg.edu.br&gt;
 */
public class CoolingControler implements Switch{


    private Radiator radiator;
    private TemperatureSensor sensor;
    
    public CoolingControler() {
        radiator = new Radiator();
        sensor = new TemperatureSensor();
    }
    
    @Override
    public void on() {
        if(sensor.getTemperature() > 80){
            radiator.on();
            sensor.setTemperature(60);
            System.out.println("Cooling Controler: ON - Stabilizing Temperature");
        } else{
            System.out.println("Cooling Controler: ON -  Temperature is Already Stabilized");
        }
      
    }

    @Override
    public void off() {
        System.out.println("Cooling Controler: OFF");
    }
    
    
}
