/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoXML;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author Hassan
 */
@Configuration
@ComponentScan("NoXML")
@PropertySource("classpath:NoXML/data.properties")
public class SpringContainer {
    
}
