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
public class Controller {

    private Engine blankEngine;
    private Cabine blankCabine;
//    private int select;
//    private int floor;

    public Controller() {
        System.out.println("Elevator controller created");
    }

    public void connectController(Engine engine, Cabine cabine) {
        this.blankEngine = engine;
        this.blankCabine = cabine;
    }

    public void remoteSignal(int select) {

        int floor = blankCabine.getFloor();
        if (select > floor) {
            System.out.println("elevator at floor " + floor);
            blankEngine.moveUp(select);
            blankCabine.door(select);
                    }
        if (select < floor) {
            System.out.println("elevator at floor " + floor);
            blankEngine.moveDown(select);
            blankCabine.door(select);
           }
        if (select == floor) {
            System.out.println("Elevator  at floor " + select);
          blankCabine.door(select);
                   }
    }
}
