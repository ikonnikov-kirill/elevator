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
public class Elevator {
    private Cabine oneCabine = new Cabine();
    private Engine oneEngine = new Engine();
    private Controller oneController = new Controller();
    
    public Elevator (Remote remote) {
        System.out.println("Whole elevator created");  
           oneController.connectController(oneEngine, oneCabine);
           oneEngine.connectEngine(oneCabine);
           remote.connectRemote(oneController);
    }
}
