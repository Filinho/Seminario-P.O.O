/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xample.CarComponents;

/**
 *
 * @author Ivanderlei Filho &lt;imsf@aluno.ifnmg.edu.br&gt;
 */
public final class AirFlowControler  implements Switch {
    AirFlowMeter meter;
    
    public AirFlowControler() {
        meter = new AirFlowMeter();
        
        if(meter.getMeansurements()  < 120){
            on();
        } else off();
      
        
    }
    @Override
    public void on(){
        System.out.println("Current Air Flow{" + meter.getMeansurements() + "}, AirFlow Controler : ON");
        
        meter.setMeansurements(120);
        
        off();
    }
    
    @Override
    public void off(){

        System.out.println("Current Air Flow{" + meter.getMeansurements() + "}, AirFlow Controler : OFF");
    }
    
    
    
}   
