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
public class D extends C {
    @Override
    public void m1(String s){
        A a =new A();
        a.m1(s.toCharArray());
    }
    
}
