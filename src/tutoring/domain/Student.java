/**
 * File name: Student.java
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
public class Student {

    private Integer studentID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;

    /**
     * to get the studentID
     *
     * @return studentID
     */
    public Integer getStudentID() {
        return studentID;
    }

    /**
     * to set the studentID
     *
     * @param studentID Integer
     */
    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    /**
     * to get the lastname
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * to set the lastName
     *
     * @param lastName String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * to get the firstName
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * to set the firstName
     *
     * @param firstName String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * to get email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * to set the email
     *
     * @param email String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * to get the phoneNumber
     *
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * to set the phoneNumber
     *
     * @param phoneNumber String
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
