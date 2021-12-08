/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanLifeCycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//Load Spring Container File
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle/ApplicationContext.xml");

//Retrieve Bean from Spring Container
        UserInterface user1 = context.getBean("user", UserInterface.class);
        UserInterface user2 = context.getBean("user", UserInterface.class);
//Calling Method From Bean
        
        System.out.println("Memory Address for User1 : " + user1);
        System.out.println("Memory Address for User2 : " + user2);
        
//Close Spring Container File
        context.close();
    }
}
