/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author MY LAPTOP
 */
public class Adapter {

    
    public static void main(String[] args) {
        C c = new D();
        B b = new B();
        b.setC(c);
        b.process("process");
        
        
    }
    
}
