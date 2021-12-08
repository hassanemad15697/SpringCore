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
public class User implements UserInterface {

    private PersonInterface person;
    
    public User(PersonInterface person) {
        this.person = person;
    }

    @Override
    public void startUser() {
        System.out.println("I'm User");
    }

    @Override
    public void getPerson() {
        person.startPerson();
    }


}
