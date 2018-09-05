/**
 * File name: SessionBuilder.java
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
public class SessionBuilder {

    private Date dateKey;
    private Time timeKey;
    private String studentLastName;
    private Integer sessionStatus;
    private String sessionTopic;
    private Integer tutor_TutorID;
    private String course_CourseCode;
    private Integer student_StudentID;

    /**
     * to get the dateKey
     *
     * @return dateKey
     */
    public Date getDateKey() {
        return dateKey;
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
     * to get studentLastName
     *
     * @return studentLastName
     */
    public String getStudentLastName() {
        return studentLastName;
    }

    /**
     * to get the sessionStatus
     *
     * @return sessionStatus
     */
    public Integer getSessionStatus() {
        return sessionStatus;
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
     * to get the tutor_TutorID
     *
     * @return tutor_TutorID
     */
    public Integer getTutor_TutorID() {
        return tutor_TutorID;
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
     * to get the student_StudentID
     *
     * @return student_StudentID
     */
    public Integer getStudent_StudentID() {
        return student_StudentID;
    }

    private SessionBuilder() {

    }

    /**
     * to create a SessionBuilder
     *
     * @return SessionBuilder
     */
    public static SessionBuilder create() {
        return new SessionBuilder();
    }

    /**
     * to set the SessionBuilder dateKey
     *
     * @param dateKey Date
     * @return SessionBuilder
     */
    public SessionBuilder dateKey(Date dateKey) {
        this.dateKey = dateKey;
        return this;
    }

    /**
     * to set the SessionBuilder timeKey
     *
     * @param timeKey Time
     * @return SessionBuilder
     */
    public SessionBuilder timeKey(Time timeKey) {
        this.timeKey = timeKey;
        return this;
    }

    /**
     * to set the SessionBuilder studentLastName
     *
     * @param studentLastName String
     * @return SessionBuilder
     */
    public SessionBuilder studentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
        return this;
    }

    /**
     * to set the SessionBuilder sessionStatus
     *
     * @param sessionStatus Integer
     * @return SessionBuilder
     */
    public SessionBuilder sessionStatus(Integer sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }

    /**
     * to set the SessionBuilder sessionTopic
     *
     * @param sessionTopic String
     * @return SessionBuilder
     */
    public SessionBuilder sessionTopic(String sessionTopic) {
        this.sessionTopic = sessionTopic;
        return this;
    }

    /**
     * to set the SessionBuilder tutor_TutorID
     *
     * @param tutor_TutorID Integer
     * @return SessionBuilder
     */
    public SessionBuilder tutor_TutorID(Integer tutor_TutorID) {
        this.tutor_TutorID = tutor_TutorID;
        return this;
    }

    /**
     * to set the SessionBuilder course_CourseCode
     *
     * @param course_CourseCode String
     * @return SessionBuilder
     */
    public SessionBuilder course_CourseCode(String course_CourseCode) {
        this.course_CourseCode = course_CourseCode;
        return this;
    }

    /**
     * to set the SessionBuilder student_StudentID
     *
     * @param student_StudentID Integer
     * @return SessionBuilder
     */
    public SessionBuilder student_StudentID(Integer student_StudentID) {
        this.student_StudentID = student_StudentID;
        return this;
    }

    /**
     * to build an instance of Session
     *
     * @return Session
     */
    public Session build() {
        return new Session(this);
    }
}
