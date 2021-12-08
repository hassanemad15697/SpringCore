/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanScope;


/**
 *
 * @author Hassan
 */
public class Person implements PersonInterface {

    @Override
    public void startPerson() {
        System.out.println("I'm Male Person");
    }

}
