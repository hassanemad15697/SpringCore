/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//Load Spring Container File
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Annotation/ApplicationContext.xml");

//Retrieve Bean from Spring Container
        UserInterface user1 = context.getBean("user", UserInterface.class);
//Calling Method From Bean
        
        user1.getPerson();
        
//Close Spring Container File
        context.close();
    }
}
