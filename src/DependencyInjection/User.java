/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection;

/**
 *
 * @author Hassan
 */
public class User implements UserInterface {

    private PersonInterface personM;
    //private PersonInterface personF;
    private String name, age, address;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(PersonInterface person) {
        this.personM = person;
    }

    @Override
    public void startUser() {
        System.out.println("I'm User");
    }

    @Override
    public void getPerson() {
       // personM.startPerson();
        personM.startPerson();
    }

    public void setPerson(PersonInterface person) {
        this.personM = person;
    }

}
