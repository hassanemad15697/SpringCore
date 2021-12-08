/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoXML;

import org.springframework.stereotype.Component;

/**
 *
 * @author Hassan
 */
@Component
public class PersonMale implements PersonInterface{

    @Override
    public void startPerson() {
        System.out.println("I am a Male Person");
    }
    
}
