package com.atguigu.bean;

public class Dept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.did
     *
     * @mbggenerated Wed Jul 29 14:42:15 CST 2020
     */
    private Integer did;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.dname
     *
     * @mbggenerated Wed Jul 29 14:42:15 CST 2020
     */
    private String dname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.did
     *
     * @return the value of dept.did
     *
     * @mbggenerated Wed Jul 29 14:42:15 CST 2020
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.did
     *
     * @param did the value for dept.did
     *
     * @mbggenerated Wed Jul 29 14:42:15 CST 2020
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.dname
     *
     * @return the value of dept.dname
     *
     * @mbggenerated Wed Jul 29 14:42:15 CST 2020
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.dname
     *
     * @param dname the value for dept.dname
     *
     * @mbggenerated Wed Jul 29 14:42:15 CST 2020
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
}