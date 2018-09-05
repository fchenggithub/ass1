/**
 * File name: Experience.java
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
public class Experience {

    private Integer experienceID;
    private String description;

    /**
     * to get experienceID
     *
     * @return experienceID
     */
    public Integer getExperienceID() {
        return experienceID;
    }

    /**
     * to set experienceID
     *
     * @param experienceID Integer
     */
    public void setExperienceID(Integer experienceID) {
        this.experienceID = experienceID;
    }

    /**
     * to get description
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * to set description
     *
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
