/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoXML_CustomBean;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Hassan
 */
public class Main {

    public static void main(String[] args) {
        //Load Spring Container Class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContainer.class);
        //Retrieve Bean from Spring Container
        UserInterface user = context.getBean("user", UserInterface.class);
        //Calling Method From Bean
        user.getPerson();
        System.out.println(user.getName() + " " + user.getAge() + " " + user.getAddress());
        //Close Spring Container File
        context.close();
    }

}
