/**
 * File name: CourseTest.java
 * Author: Feng Cheng, ID#:040719618
 * Course: CST8288 - OOP Design pattern
 * Project1
 * Date: 2018-07-07
 * Professor: George Kriger
 * Purpose: use of patterns, domain entities
 */
package tutoring.test;

import org.junit.Test;
import tutoring.domain.Course;
import static org.junit.Assert.*;

/**
 *
 * @author Feng
 */
public class CourseTest {

    /**
     * Test of getCourseCode method, of class Course.
     */
    @Test
    public void testGetCourseCode() {
        System.out.println("getCourseCode");
        Course instance = new Course();
        instance.setCourseCode("CST8288");
        String expResult = "CST8288";
        String result = instance.getCourseCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseCode method, of class Course.
     */
    @Test
    public void testSetCourseCode() {
        System.out.println("setCourseCode");
        String courseCode = "CST8288";
        Course instance = new Course();
        instance.setCourseCode(courseCode);
        String expResult = "CST8288";
        assertEquals(expResult, instance.getCourseCode());
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        Course instance = new Course();
        instance.setCourseName("Design Pattern");
        String expResult = "Design Pattern";
        String result = instance.getCourseName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "Design Pattern";
        Course instance = new Course();
        instance.setCourseName(courseName);
        String expResult = "Design Pattern";
        assertEquals(expResult, instance.getCourseName());

    }

    /**
     * Test of getCourseDescription method, of class Course.
     */
    @Test
    public void testGetCourseDescription() {
        System.out.println("getCourseDescription");
        Course instance = new Course();
        instance.setCourseDescription("Programming");
        String expResult = "Programming";
        String result = instance.getCourseDescription();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCourseDescription method, of class Course.
     */
    @Test
    public void testSetCourseDescription() {
        System.out.println("setCourseDescription");
        String courseDescription = "Programming";
        Course instance = new Course();
        instance.setCourseDescription(courseDescription);
        String expResult = "Programming";
        assertEquals(expResult, instance.getCourseDescription());

    }

}
