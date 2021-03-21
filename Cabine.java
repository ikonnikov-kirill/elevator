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
public class Cabine {

    private int floor = 1;

    public Cabine() {
        System.out.println("Elevator cabine created, and located at floor " + floor);

    }

    public int getFloor () {
        return this.floor;
    }
    public void setFloor (int newFloor) {
        this.floor=newFloor;
    }
    
    public void door (int floor) {
        System.out.println("Doors open at floor "+floor);
        System.out.println("Doors closed at floor "+floor);
    }
}
