package com.sjjybsgj.standard_db.model;

import java.io.Serializable;
import java.util.Date;

public class StandardDb implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column standard_db.DB_RULE_ID
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    private String dbRuleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column standard_db.DB_NAME
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    private String dbName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column standard_db.TABLE_NAME
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column standard_db.RULE_DATE
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    private Date ruleDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column standard_db.IF_VAILD
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    private Integer ifVaild;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table standard_db
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column standard_db.DB_RULE_ID
     *
     * @return the value of standard_db.DB_RULE_ID
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    public String getDbRuleId() {
        return dbRuleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column standard_db.DB_RULE_ID
     *
     * @param dbRuleId the value for standard_db.DB_RULE_ID
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    public void setDbRuleId(String dbRuleId) {
        this.dbRuleId = dbRuleId == null ? null : dbRuleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column standard_db.DB_NAME
     *
     * @return the value of standard_db.DB_NAME
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column standard_db.DB_NAME
     *
     * @param dbName the value for standard_db.DB_NAME
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    public void setDbName(String dbName) {
        this.dbName = dbName == null ? null : dbName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column standard_db.TABLE_NAME
     *
     * @return the value of standard_db.TABLE_NAME
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column standard_db.TABLE_NAME
     *
     * @param tableName the value for standard_db.TABLE_NAME
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column standard_db.RULE_DATE
     *
     * @return the value of standard_db.RULE_DATE
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    public Date getRuleDate() {
        return ruleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column standard_db.RULE_DATE
     *
     * @param ruleDate the value for standard_db.RULE_DATE
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    public void setRuleDate(Date ruleDate) {
        this.ruleDate = ruleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column standard_db.IF_VAILD
     *
     * @return the value of standard_db.IF_VAILD
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    public Integer getIfVaild() {
        return ifVaild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column standard_db.IF_VAILD
     *
     * @param ifVaild the value for standard_db.IF_VAILD
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    public void setIfVaild(Integer ifVaild) {
        this.ifVaild = ifVaild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard_db
     *
     * @mbg.generated Sun May 27 19:07:39 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dbRuleId=").append(dbRuleId);
        sb.append(", dbName=").append(dbName);
        sb.append(", tableName=").append(tableName);
        sb.append(", ruleDate=").append(ruleDate);
        sb.append(", ifVaild=").append(ifVaild);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}