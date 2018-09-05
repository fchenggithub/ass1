/**
 * File name: Session.java
 * Author: Feng Cheng, ID#:040719618
 * Course: CST8288 - OOP Design pattern
 * Project1
 * Date: 2018-07-07
 * Professor: George Kriger
 * Purpose: use of patterns, domain entities
 */
package tutoring.domain;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Feng
 */
public class Session {

    private Date dateKey;
    private Time timeKey;
    private String studentLastName;
    private Integer sessionStatus;
    private String sessionTopic;
    private Integer tutor_TutorID;
    private String course_CourseCode;
    private Integer student_StudentID;

    /**
     * to get the DateKey
     *
     * @return dateKey
     */
    public Date getDateKey() {
        return dateKey;
    }

    /**
     * to set the dateKey
     *
     * @param dateKey Date
     */
    public void setDateKey(Date dateKey) {
        this.dateKey = dateKey;
    }

    /**
     * to get the timeKey
     *
     * @return timeKey
     */
    public Time getTimeKey() {
        return timeKey;
    }

    /**
     * to set the timeKey
     *
     * @param timeKey Time
     */
    public void setTimeKey(Time timeKey) {
        this.timeKey = timeKey;
    }

    /**
     * to get the studentLastName
     *
     * @return studentLastName
     */
    public String getStudentLastName() {
        return studentLastName;
    }

    /**
     * to set the studentLastName
     *
     * @param studentLastName String
     */
    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    /**
     * to get the sessionStatus
     *
     * @return sessionStatus Integer
     */
    public Integer getSessionStatus() {
        return sessionStatus;
    }

    /**
     * to set the sessionStatus
     *
     * @param sessionStatus Integer
     */
    public void setSessionStatus(Integer sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    /**
     * to get the sessionTopic
     *
     * @return sessionTopic
     */
    public String getSessionTopic() {
        return sessionTopic;
    }

    /**
     * to set the sessionTopic
     *
     * @param sessionTopic String
     */
    public void setSessionTopic(String sessionTopic) {
        this.sessionTopic = sessionTopic;
    }

    /**
     * to get the tutor_TutorID
     *
     * @return tutor_TutorID
     */
    public Integer getTutor_TutorID() {
        return tutor_TutorID;
    }

    /**
     * to set the tutor_TutorID
     *
     * @param tutor_TutorID Integer
     */
    public void setTutor_TutorID(Integer tutor_TutorID) {
        this.tutor_TutorID = tutor_TutorID;
    }

    /**
     * to get the course_CourseCode
     *
     * @return course_CourseCode
     */
    public String getCourse_CourseCode() {
        return course_CourseCode;
    }

    /**
     * to set the course_CourseCode
     *
     * @param course_CourseCode String
     */
    public void setCourse_CourseCode(String course_CourseCode) {
        this.course_CourseCode = course_CourseCode;
    }

    /**
     * to get the student_StudentID
     *
     * @return student_StudentID
     */
    public Integer getStudent_StudentID() {
        return student_StudentID;
    }

    /**
     * to set the student_StudentID
     *
     * @param student_StudentID Integer
     */
    public void setStudent_StudentID(Integer student_StudentID) {
        this.student_StudentID = student_StudentID;
    }

    /**
     * Constructor that takes SessionBuilder, assign the value of variables in
     * SessionBuilder to Session's variables
     *
     * @param builder SessionBuilder
     */
    public Session(SessionBuilder builder) {
        dateKey = builder.getDateKey();
        timeKey = builder.getTimeKey();
        studentLastName = builder.getStudentLastName();
        sessionStatus = builder.getSessionStatus();
        sessionTopic = builder.getSessionTopic();
        tutor_TutorID = builder.getTutor_TutorID();
        course_CourseCode = builder.getCourse_CourseCode();
        student_StudentID = builder.getStudent_StudentID();

    }

    /**
     * constructor that takes all variables
     *
     * @param dateKey Date
     * @param timeKey Time
     * @param studentLastName String
     * @param sessionStatus Integer
     * @param sessionTopic String
     * @param tutor_TutorID Integer
     * @param course_CourseCode String
     * @param student_StudentID Integer
     */
    public Session(Date dateKey, Time timeKey, String studentLastName, Integer sessionStatus, String sessionTopic, Integer tutor_TutorID, String course_CourseCode, Integer student_StudentID) {
        super();
        this.dateKey = dateKey;
        this.timeKey = timeKey;
        this.studentLastName = studentLastName;
        this.sessionStatus = sessionStatus;
        this.sessionTopic = sessionTopic;
        this.tutor_TutorID = tutor_TutorID;
        this.course_CourseCode = course_CourseCode;
        this.student_StudentID = student_StudentID;
    }
}
