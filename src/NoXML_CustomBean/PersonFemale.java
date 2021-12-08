/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoXML_CustomBean;


import org.springframework.stereotype.Component;

/**
 *
 * @author Hassan
 */
 
public class PersonFemale implements PersonInterface{

    @Override
    public void startPerson() {
        System.out.println("I am a Female Person");
    }
    
}
