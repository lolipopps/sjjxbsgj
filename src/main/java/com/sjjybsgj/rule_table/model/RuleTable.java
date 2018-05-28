package com.sjjybsgj.rule_table.model;

import java.io.Serializable;

public class RuleTable implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_table.RULE_ID
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    private String ruleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_table.DB_NAME
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    private String dbName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_table.TABLE_NAME
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_table.CLOUMN_NAME
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    private String cloumnName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rule_table
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_table.RULE_ID
     *
     * @return the value of rule_table.RULE_ID
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_table.RULE_ID
     *
     * @param ruleId the value for rule_table.RULE_ID
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_table.DB_NAME
     *
     * @return the value of rule_table.DB_NAME
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_table.DB_NAME
     *
     * @param dbName the value for rule_table.DB_NAME
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    public void setDbName(String dbName) {
        this.dbName = dbName == null ? null : dbName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_table.TABLE_NAME
     *
     * @return the value of rule_table.TABLE_NAME
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_table.TABLE_NAME
     *
     * @param tableName the value for rule_table.TABLE_NAME
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_table.CLOUMN_NAME
     *
     * @return the value of rule_table.CLOUMN_NAME
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    public String getCloumnName() {
        return cloumnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_table.CLOUMN_NAME
     *
     * @param cloumnName the value for rule_table.CLOUMN_NAME
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    public void setCloumnName(String cloumnName) {
        this.cloumnName = cloumnName == null ? null : cloumnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_table
     *
     * @mbg.generated Mon May 28 15:03:50 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ruleId=").append(ruleId);
        sb.append(", dbName=").append(dbName);
        sb.append(", tableName=").append(tableName);
        sb.append(", cloumnName=").append(cloumnName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}