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
public class B {
    private C c=new C();
    public void process(String s){
        c.m1(s);
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
    
}
