/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

/**
 *
 * @author workway
 */
public class Engine {

    private Cabine blankCabine;
    private int select;

    public Engine() {
        System.out.println("Elevator engine created");
    }

    public void connectEngine(Cabine cabine) {
        this.blankCabine = cabine;
    }

    public void moveUp(int select) {
        System.out.println("engine moving cabine up to floor " + select);
        System.out.println("Elevator at floor " + select);
       blankCabine.setFloor(select);
    }

    public void moveDown(int select) {
        System.out.println("engine moving cabine down to floor " + select);
        System.out.println("Elevator at floor " + select);
        blankCabine.setFloor(select);
    }
}
