/**
 * File name: Course.java
 * Author: Feng Cheng, ID#:040719618
 * Course: CST8288 - OOP Design pattern
 * Project1
 * Date: 2018-07-07
 * Professor: George Kriger
 * Purpose: use of patterns, domain entities
 */
package tutoring.domain;

/**
 *
 * @author Feng
 */
public class Course {

    private String courseCode;
    private String courseName;
    private String courseDescription;

    /**
     * to get CourseCode
     *
     * @return courseCode
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * to set CourseCode
     *
     * @param courseCode String
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * to get CourseName
     *
     * @return courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * to set the courseName
     *
     * @param courseName String
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * to get the courseDescription
     *
     * @return courseDescription
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * to set the courseDescription
     *
     * @param courseDescription String
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

}
