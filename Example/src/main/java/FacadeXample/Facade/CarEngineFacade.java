/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadeXample.Facade;

import FacadeXample.CarComponents.AirFlowControler;
import FacadeXample.CarComponents.CatalyticConverter;
import FacadeXample.CarComponents.CoolingControler;
import FacadeXample.CarComponents.FuelInjector;
import FacadeXample.CarComponents.Starter;
import FacadeXample.CarComponents.Switch;

/**
 *
 * @author Ivanderlei Filho &lt;imsf@aluno.ifnmg.edu.br&gt;
 */
public class CarEngineFacade implements Switch{
    private final AirFlowControler airFlowControler;
    private final CoolingControler cooling;
    private final FuelInjector injector;
    private final CatalyticConverter catalytic;
    private final Starter starter;

    public CarEngineFacade() {
        airFlowControler = new AirFlowControler();
        cooling = new CoolingControler();
        injector = new FuelInjector();
        catalytic = new CatalyticConverter();
        starter = new Starter();
    }
    
    
    @Override
    public void on() {
       injector.on();
       airFlowControler.on();
       injector.on();
       starter.start();
       cooling.on();
       catalytic.on(); 
    }

    @Override
    public void off() {
        System.out.println("Stopping Engine");
        injector.off();
        catalytic.off();
        airFlowControler.off();
        cooling.off();

    }
    
}
