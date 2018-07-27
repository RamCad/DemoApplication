/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.oops;

/**
 *
 * @author ramcharan.adapa
 */
public class Encapsulation {

    public int weight;

    private int pWeight;

    public int getpWeight() {
        return pWeight;
    }

    public void setpWeight(int pWeight) {
        if (pWeight > 0) {
            this.pWeight = pWeight;
        }
        else{
            System.out.println("Weight can't be negative");
        }
    }

}
