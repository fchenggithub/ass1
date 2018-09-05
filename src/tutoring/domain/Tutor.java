/**
 * File name: Tutor.java
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
public class Tutor {

    private Integer tutorID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    private String status;
    private Integer experience_ExperienceID;

    /**
     * to get the tutorID
     *
     * @return tutorID
     */
    public Integer getTutorID() {
        return tutorID;
    }

    /**
     * to set the tutorID
     *
     * @param tutorID Integer
     */
    public void setTutorID(Integer tutorID) {
        this.tutorID = tutorID;
    }

    /**
     * to get lastName
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * to set lastName
     *
     * @param lastName String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * to get firstName
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
     * to get the email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * to set email
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

    /**
     * to get the status
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * to set the status
     *
     * @param status String
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * to get the experience_ExperienceID
     *
     * @return experience_ExperienceID
     */
    public Integer getExperience_ExperienceID() {
        return experience_ExperienceID;
    }

    /**
     * to set the experience_ExperienceID
     *
     * @param experience_ExperienceID Integer
     */
    public void setExperience_ExperienceID(Integer experience_ExperienceID) {
        this.experience_ExperienceID = experience_ExperienceID;
    }
}
