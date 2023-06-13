/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package FacadeXample;

import FacadeXample.Facade.CarEngineFacade;

/**
 *
 * @author Ivanderlei Filho &lt;imsf@aluno.ifnmg.edu.br&gt;
 */
public class FacadeXample {

    public static void main(String[] args) {
        CarEngineFacade subaru = new CarEngineFacade();
        subaru.on();
        System.out.println(" ");
        subaru.off();
    }
}
