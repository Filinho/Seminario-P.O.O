/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadeXample.CarComponents;

import java.util.Random;

/**
 *
 * @author Ivanderlei Filho &lt;imsf@aluno.ifnmg.edu.br&gt;
 */
public class Radiator implements Switch{
   private int speed;
    
    public Radiator(){
        speed = 0;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Radiator Speed set to " + speed +"%");
    }
    
    
    @Override
    public void on() {
        Random r = new Random();
        
        System.out.println("Radiator: ON");
        setSpeed(r.nextInt() % 100);
    }

    @Override
    public void off() {
        System.out.println("Radiator: OFF");
    }
    
    
}
