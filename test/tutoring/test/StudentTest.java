/**
 * File name: StudentTest.java
 * Author: Feng Cheng, ID#:040719618
 * Course: CST8288 - OOP Design pattern
 * Project1
 * Date: 2018-07-07
 * Professor: George Kriger
 * Purpose: use of patterns, domain entities
 */
package tutoring.test;

import org.junit.Test;
import tutoring.domain.Student;
import static org.junit.Assert.*;

/**
 *
 * @author Feng
 */
public class StudentTest {

    /**
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = new Student();
        instance.setStudentID(457);
        Integer expResult = 457;
        Integer result = instance.getStudentID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentID method, of class Student.
     */
    @Test
    public void testSetStudentID() {
        System.out.println("setStudentID");
        Integer studentID = 457;
        Student instance = new Student();
        instance.setStudentID(studentID);
        Integer expResult = 457;
        assertEquals(expResult, instance.getStudentID());
    }

    /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Student instance = new Student();
        instance.setLastName("Cheng");
        String expResult = "Cheng";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "Cheng";
        Student instance = new Student();
        String expResult = "Cheng";
        instance.setLastName(lastName);
        assertEquals(expResult, instance.getLastName());
    }

    /**
     * Test of getFirstName method, of class Student.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Student instance = new Student();
        instance.setFirstName("Feng");
        String expResult = "Feng";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Student.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "Feng";
        Student instance = new Student();
        String expResult = "Feng";
        instance.setFirstName(firstName);
        assertEquals(expResult, instance.getFirstName());
    }

    /**
     * Test of getEmail method, of class Student.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Student instance = new Student();
        instance.setEmail("abc@gmail.com");
        String expResult = "abc@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Student.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "abc@gmail.com";
        Student instance = new Student();
        String expResult = "abc@gmail.com";
        instance.setEmail(email);
        assertEquals(expResult, instance.getEmail());
    }

    /**
     * Test of getPhoneNumber method, of class Student.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Student instance = new Student();
        instance.setPhoneNumber("555-5555");
        String expResult = "555-5555";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoneNumber method, of class Student.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "555-5555";
        Student instance = new Student();
        String expResult = "555-5555";
        instance.setPhoneNumber(phoneNumber);
        assertEquals(expResult, instance.getPhoneNumber());
    }

}
