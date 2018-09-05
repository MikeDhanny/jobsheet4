/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author Mikedhanny
 */
public class Gajah extends Hewan
{
    public static void testClassMethod()
    {
        System.out.println("The Class Method is Hewan...");
    }
    public void testInstanceMethod()
    {
        System.out.println("The instance method in Gajah");
    }
    public static void main (String[] args)
    {
        Gajah myGajah = new Gajah();
        Hewan myHewan = new Gajah();
        Hewan.testClassMethod ();
        myHewan.testInstanceMethod();
        Hewan hewan = new Hewan ();
        Hewan.testClassMethod ();
        myHewan.testInstanceMethod();
        
       }
}


