/**
 * File name: TutorTest.java
 * Author: Feng Cheng, ID#:040719618
 * Course: CST8288 - OOP Design pattern
 * Project1
 * Date: 2018-07-07
 * Professor: George Kriger
 * Purpose: use of patterns, domain entities
 */
package tutoring.test;

import org.junit.Test;
import tutoring.domain.Tutor;
import static org.junit.Assert.*;

/**
 *
 * @author Feng
 */
public class TutorTest {

    /**
     * Test of getTutorID method, of class Tutor.
     */
    @Test
    public void testGetTutorID() {
        System.out.println("getTutorID");
        Tutor instance = new Tutor();
        instance.setTutorID(457);
        Integer expResult = 457;
        Integer result = instance.getTutorID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTutorID method, of class Tutor.
     */
    @Test
    public void testSetTutorID() {
        System.out.println("setTutorID");
        Integer tutorID = 457;
        Tutor instance = new Tutor();
        Integer expResult = 457;
        instance.setTutorID(tutorID);
        assertEquals(expResult, instance.getTutorID());

    }

    /**
     * Test of getLastName method, of class Tutor.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Tutor instance = new Tutor();
        instance.setLastName("Cheng");
        String expResult = "Cheng";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Tutor.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "Cheng";
        Tutor instance = new Tutor();
        String expResult = "Cheng";
        instance.setLastName(lastName);
        assertEquals(expResult, instance.getLastName());
    }

    /**
     * Test of getFirstName method, of class Tutor.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Tutor instance = new Tutor();
        instance.setFirstName("Feng");
        String expResult = "Feng";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Tutor.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "Feng";
        Tutor instance = new Tutor();
        String expResult = "Feng";
        instance.setFirstName(firstName);
        assertEquals(expResult, instance.getFirstName());

    }

    /**
     * Test of getEmail method, of class Tutor.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Tutor instance = new Tutor();
        instance.setEmail("abc@gmail.com");
        String expResult = "abc@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Tutor.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "abc@gmail.com";
        Tutor instance = new Tutor();
        String expResult = "abc@gmail.com";
        instance.setEmail(email);
        assertEquals(expResult, instance.getEmail());

    }

    /**
     * Test of getPhoneNumber method, of class Tutor.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Tutor instance = new Tutor();
        instance.setPhoneNumber("555-5555");
        String expResult = "555-5555";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoneNumber method, of class Tutor.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "555-5555";
        Tutor instance = new Tutor();
        String expResult = "555-5555";
        instance.setPhoneNumber(phoneNumber);
        assertEquals(expResult, instance.getPhoneNumber());
    }

    /**
     * Test of getStatus method, of class Tutor.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Tutor instance = new Tutor();
        instance.setStatus("av");
        String expResult = "av";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Tutor.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "av";
        Tutor instance = new Tutor();
        String expResult = "av";
        instance.setStatus(status);
        assertEquals(expResult, instance.getStatus());
    }

    /**
     * Test of getExperience_ExperienceID method, of class Tutor.
     */
    @Test
    public void testGetExperience_ExperienceID() {
        System.out.println("getExperience_ExperienceID");
        Tutor instance = new Tutor();
        instance.setExperience_ExperienceID(101);
        Integer expResult = 101;
        Integer result = instance.getExperience_ExperienceID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExperience_ExperienceID method, of class Tutor.
     */
    @Test
    public void testSetExperience_ExperienceID() {
        System.out.println("setExperience_ExperienceID");
        Integer experience_ExperienceID = 101;
        Tutor instance = new Tutor();
        Integer expResult = 101;
        instance.setExperience_ExperienceID(experience_ExperienceID);
        assertEquals(expResult, instance.getExperience_ExperienceID());
    }

}
