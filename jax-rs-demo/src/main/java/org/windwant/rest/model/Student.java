package org.windwant.rest.model;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.id
     *
     * @mbg.generated Wed Dec 20 10:25:19 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.name
     *
     * @mbg.generated Wed Dec 20 10:25:19 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.age
     *
     * @mbg.generated Wed Dec 20 10:25:19 CST 2017
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.id
     *
     * @return the value of students.id
     *
     * @mbg.generated Wed Dec 20 10:25:19 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.id
     *
     * @param id the value for students.id
     *
     * @mbg.generated Wed Dec 20 10:25:19 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.name
     *
     * @return the value of students.name
     *
     * @mbg.generated Wed Dec 20 10:25:19 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.name
     *
     * @param name the value for students.name
     *
     * @mbg.generated Wed Dec 20 10:25:19 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.age
     *
     * @return the value of students.age
     *
     * @mbg.generated Wed Dec 20 10:25:19 CST 2017
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.age
     *
     * @param age the value for students.age
     *
     * @mbg.generated Wed Dec 20 10:25:19 CST 2017
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}