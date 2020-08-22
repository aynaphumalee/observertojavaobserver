/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observertojavaobserver;

import java.util.Observable;

/**
 *
 * @author Ayna
 */
public class HeadQuater extends Observable {
    private int someData;
    public void setSomeData(int aData) {
        someData = aData;
        setChanged();
        notifyObservers("From HeadQuater");
    }
    public int getSomeData() {
        return someData;
    }
}
