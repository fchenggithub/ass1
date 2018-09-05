/**
 * File name: SessionBuilderTest.java
 * Author: Feng Cheng, ID#:040719618
 * Course: CST8288 - OOP Design pattern
 * Project1
 * Date: 2018-07-07
 * Professor: George Kriger
 * Purpose: use of patterns, domain entities
 */
package tutoring.test;

import java.sql.Date;
import java.sql.Time;
import org.junit.Test;
import tutoring.domain.SessionBuilder;
import static org.junit.Assert.*;

/**
 *
 * @author Feng
 */
public class SessionBuilderTest {

    /**
     * Test of getDateKey method, of class SessionBuilder.
     */
    @Test
    public void testGetDateKey() {
        System.out.println("getDateKey");
        String str = "2017-07-07";
        Date date = Date.valueOf(str);
        SessionBuilder instance = SessionBuilder.create().dateKey(date);
        Date expResult = Date.valueOf(str);
        Date result = instance.getDateKey();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTimeKey method, of class SessionBuilder.
     */
    @Test
    public void testGetTimeKey() {
        System.out.println("getTimeKey");
        String str = "11:00:00";
        Time time = Time.valueOf(str);
        SessionBuilder instance = SessionBuilder.create().timeKey(time);
        Time expResult = Time.valueOf(str);
        Time result = instance.getTimeKey();
        assertEquals(expResult, result);

    }

    /**
     * Test of getStudentLastName method, of class SessionBuilder.
     */
    @Test
    public void testGetStudentLastName() {
        System.out.println("getStudentLastName");
        SessionBuilder instance = SessionBuilder.create().studentLastName("Cheng");
        String expResult = "Cheng";
        String result = instance.getStudentLastName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getSessionStatus method, of class SessionBuilder.
     */
    @Test
    public void testGetSessionStatus() {
        System.out.println("getSessionStatus");
        SessionBuilder instance = SessionBuilder.create().sessionStatus(102);
        Integer expResult = 102;
        Integer result = instance.getSessionStatus();
        assertEquals(expResult, result);

    }

    /**
     * Test of getSessionTopic method, of class SessionBuilder.
     */
    @Test
    public void testGetSessionTopic() {
        System.out.println("getSessionTopic");
        SessionBuilder instance = SessionBuilder.create().sessionTopic("Java Programming");
        String expResult = "Java Programming";
        String result = instance.getSessionTopic();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTutor_TutorID method, of class SessionBuilder.
     */
    @Test
    public void testGetTutor_TutorID() {
        System.out.println("getTutor_TutorID");
        SessionBuilder instance = SessionBuilder.create().tutor_TutorID(457);
        Integer expResult = 457;
        Integer result = instance.getTutor_TutorID();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCourse_CourseCode method, of class SessionBuilder.
     */
    @Test
    public void testGetCourse_CourseCode() {
        System.out.println("getCourse_CourseCode");
        SessionBuilder instance = SessionBuilder.create().course_CourseCode("CST8288");
        String expResult = "CST8288";
        String result = instance.getCourse_CourseCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of getStudent_StudentID method, of class SessionBuilder.
     */
    @Test
    public void testGetStudent_StudentID() {
        System.out.println("getStudent_StudentID");
        SessionBuilder instance = SessionBuilder.create().student_StudentID(457);
        Integer expResult = 457;
        Integer result = instance.getStudent_StudentID();
        assertEquals(expResult, result);

    }

    /**
     * Test of dateKey method, of class SessionBuilder.
     */
    @Test
    public void testDateKey() {
        System.out.println("dateKey");
        String str = "2017-07-07";
        Date expResult = Date.valueOf(str);
        SessionBuilder instance = SessionBuilder.create().dateKey(expResult);
        Date result = instance.getDateKey();
        assertEquals(expResult, result);

    }

    /**
     * Test of timeKey method, of class SessionBuilder.
     */
    @Test
    public void testTimeKey() {
        System.out.println("timeKey");
        String str = "11:00:00";
        Time expResult = Time.valueOf(str);
        SessionBuilder instance = SessionBuilder.create().timeKey(expResult);
        Time result = instance.getTimeKey();

        assertEquals(expResult, result);

    }

    /**
     * Test of studentLastName method, of class SessionBuilder.
     */
    @Test
    public void testStudentLastName() {
        System.out.println("studentLastName");
        String studentLastName = "Cheng";
        SessionBuilder instance = SessionBuilder.create().studentLastName(studentLastName);
        String expResult = "Cheng";
        String result = instance.getStudentLastName();
        assertEquals(expResult, result);

    }

    /**
     * Test of sessionStatus method, of class SessionBuilder.
     */
    @Test
    public void testSessionStatus() {
        System.out.println("sessionStatus");
        Integer sessionStatus = 111;
        SessionBuilder instance = SessionBuilder.create().sessionStatus(sessionStatus);
        Integer expResult = 111;
        Integer result = instance.getSessionStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of sessionTopic method, of class SessionBuilder.
     */
    @Test
    public void testSessionTopic() {
        System.out.println("sessionTopic");
        String sessionTopic = "Java Programming";
        SessionBuilder instance = SessionBuilder.create().sessionTopic(sessionTopic);
        String expResult = "Java Programming";
        String result = instance.getSessionTopic();
        assertEquals(expResult, result);

    }

    /**
     * Test of tutor_TutorID method, of class SessionBuilder.
     */
    @Test
    public void testTutor_TutorID() {
        System.out.println("tutor_TutorID");
        Integer tutor_TutorID = 457;
        SessionBuilder instance = SessionBuilder.create().tutor_TutorID(tutor_TutorID);
        Integer expResult = 457;
        Integer result = instance.getTutor_TutorID();
        assertEquals(expResult, result);

    }

    /**
     * Test of course_CourseCode method, of class SessionBuilder.
     */
    @Test
    public void testCourse_CourseCode() {
        System.out.println("course_CourseCode");
        String course_CourseCode = "CST8288";
        SessionBuilder instance = SessionBuilder.create().course_CourseCode(course_CourseCode);
        String expResult = "CST8288";
        String result = instance.getCourse_CourseCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of student_StudentID method, of class SessionBuilder.
     */
    @Test
    public void testStudent_StudentID() {
        System.out.println("student_StudentID");
        Integer student_StudentID = 457;
        SessionBuilder instance = SessionBuilder.create().student_StudentID(student_StudentID);
        Integer expResult = 457;
        Integer result = instance.getStudent_StudentID();
        assertEquals(expResult, result);

    }

}
