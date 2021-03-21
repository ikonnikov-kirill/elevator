/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

import java.util.Scanner;

/**
 *
 * @author workway
 */
public class Remote {

    private Controller blankController;
    Scanner scanner = new Scanner(System.in);
    int select = 0;

    public Remote() {
        System.out.println("Elevator remote created");

    }

    private void pressButton() {
        while (true) {

            System.out.println("Select from 1-25 or, 0 - exit");
            select = scanner.nextInt();

            if (select >= 1 & select <= 25) {
                System.out.println(select + " selected, signal sent to detector");
                sendSignalController(select);
            }
            if (select == 0) {
                System.exit(0);
            }
            if (select < 0 & select > 25) {
                System.out.println("selection non existent");
            }
        }
    }

    public void connectRemote(Controller blankController1) {
        this.blankController = blankController1;
        pressButton();
    }

    public void sendSignalController(int select) {
        blankController.remoteSignal(select);
    }

}
