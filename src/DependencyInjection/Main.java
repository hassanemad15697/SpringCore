/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//Load Spring Container File
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjection/ApplicationContext.xml");

//Retrieve Bean from Spring Container
        UserInterface user = context.getBean("user", UserInterface.class);

//Calling Method From Bean
        user.startUser();
        user.getPerson();
        System.out.println(user.getName() + " " + user.getAge() + " " + user.getAddress());

//Close Spring Container File
        context.close();
    }
}
