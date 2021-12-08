/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoXML;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${address}")
    private String address;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public String getAddress() {
        return address;
    }

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
