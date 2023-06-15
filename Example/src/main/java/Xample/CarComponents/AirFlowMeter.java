/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xample.CarComponents;

import java.util.Random;

/**
 *
 * @author Ivanderlei Filho &lt;imsf@aluno.ifnmg.edu.br&gt;
 */
public class AirFlowMeter {
    private int meansurements;
    public AirFlowMeter() {
        Random rn = new Random();
        meansurements = rn.nextInt() % 200;
    }

    public int getMeansurements() {
        return meansurements;
    }

    public void setMeansurements(int meansurements) {
        this.meansurements = meansurements;
    }
 
}
