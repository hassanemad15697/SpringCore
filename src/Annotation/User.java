/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Hassan
 */
@Component
@Scope("prototype")
public class User implements UserInterface {

    @Autowired
    @Qualifier("personFemale")
    private PersonInterface person;

//    @Autowired
//    public User(PersonInterface person) {
//        this.person = person;
//    }
//    @Autowired
//    public void setPerson(PersonInterface person) {
//        this.person = person;
//    }

    @Override
    public void startUser() {
        System.out.println("I'm User");
    }

    @Override
    public void getPerson() {
        person.startPerson();
    }

    @PostConstruct
    public void doStart() {
        System.out.println("Start.......");
    }
    @PreDestroy
    public void doEnd() {
        System.out.println(".......End");
    }
}
