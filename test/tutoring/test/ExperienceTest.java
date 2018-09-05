/**
 * File name: ExperienceTest.java
 * Author: Feng Cheng, ID#:040719618
 * Course: CST8288 - OOP Design pattern
 * Project1
 * Date: 2018-07-07
 * Professor: George Kriger
 * Purpose: use of patterns, domain entities
 */
package tutoring.test;

import org.junit.Test;
import tutoring.domain.Experience;
import static org.junit.Assert.*;

/**
 *
 * @author Feng
 */
public class ExperienceTest {

    /**
     * Test of getExperienceID method, of class Experience.
     */
    @Test
    public void testGetExperienceID() {
        System.out.println("getExperienceID");
        Experience instance = new Experience();
        instance.setExperienceID(111);
        Integer expResult = 111;
        Integer result = instance.getExperienceID();
        assertEquals(expResult, result);

    }

    /**
     * Test of setExperienceID method, of class Experience.
     */
    @Test
    public void testSetExperienceID() {
        System.out.println("setExperienceID");
        Integer experienceID = 111;
        Experience instance = new Experience();
        instance.setExperienceID(experienceID);
        Integer expResult = 111;
        assertEquals(expResult, instance.getExperienceID());

    }

    /**
     * Test of getDescription method, of class Experience.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Experience instance = new Experience();
        instance.setDescription("Programming Language");
        String expResult = "Programming Language";
        String result = instance.getDescription();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDescription method, of class Experience.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "Programming Language";
        Experience instance = new Experience();
        String expResult = "Programming Language";
        instance.setDescription(description);
        assertEquals(expResult, instance.getDescription());

    }

}
