/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observertojavaobserver;

/**
 *
 * @author Ayna
 */
public class ObserverToJavaObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Senior observer1 = new Senior(); 
        Marketing observer2 = new Marketing();         
        HeadQuater observable = new HeadQuater();
        observable.addObserver(observer1); 
        observable.addObserver(observer2);
        observable.setSomeData(6); 
        observable.setSomeData(7);
    }   
}
