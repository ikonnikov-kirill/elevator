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
public class Main {
    public static void main(String[] args) {
        Remote oneRemote = new Remote();
        Elevator oneElevator = new Elevator(oneRemote);
        
    }
}
