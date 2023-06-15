/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xample.CarComponents;

/**
 *
 * @author Ivanderlei Filho &lt;imsf@aluno.ifnmg.edu.br&gt;
 */
public class CatalyticConverter implements Switch {

    public CatalyticConverter() {
    }
    
    @Override
    public void on(){
        System.out.println("Catalytic Converter : ON");
    }
    
    @Override
    public void off(){
        System.out.println("Catalytic Converter: OFF");
    }
    
}
