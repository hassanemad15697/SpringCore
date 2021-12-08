/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOC_XML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Hassan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Load Spring Container File
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("IOC_XML/ApplicationContext.xml");
        //Retrieve Bean from Spring Container
        SportInterface football=context.getBean("mySport",SportInterface.class);
        //Calling Method From Bean
        football.start();
        //Close Spring Container File
        context.close();
    }
    
}
