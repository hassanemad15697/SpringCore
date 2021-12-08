/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoXML_CustomBean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author Hassan
 */
@Configuration
@PropertySource("classpath:NoXML_CustomBean/data.properties")
public class SpringContainer {
    @Bean
    public UserInterface user()
    {
        return new User(person());
    }
    @Bean
    public PersonInterface person()
    {
        return new PersonMale();
    }
    
}
