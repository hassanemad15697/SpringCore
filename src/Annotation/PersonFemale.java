
package Annotation;

import org.springframework.stereotype.Component;


/**
 *
 * @author Hassan
 */
@Component
public class PersonFemale implements PersonInterface {

    @Override
    public void startPerson() {
        System.out.println("I'm Female Person");
    }

}

