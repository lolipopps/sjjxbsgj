package com.sjjybsgj.stardard_table.model;

import java.io.Serializable;
import java.util.Date;

public class StardardTable implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stardard_table.COLUMN_RULE_ID
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    private String columnRuleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stardard_table.DB_NAME
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    private String dbName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stardard_table.TABLE_CODE
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    private String tableCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stardard_table.TABLE_NAME
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stardard_table.COLUMN_NAME
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    private String columnName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stardard_table.COLUMN_INDEX
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    private Integer columnIndex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stardard_table.COLUMN_TYPE
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    private String columnType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stardard_table.POSTION
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    private String postion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stardard_table.CLOUMN_COMMENT
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    private String cloumnComment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stardard_table.RULE_DATE
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    private Date ruleDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stardard_table
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stardard_table.COLUMN_RULE_ID
     *
     * @return the value of stardard_table.COLUMN_RULE_ID
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public String getColumnRuleId() {
        return columnRuleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stardard_table.COLUMN_RULE_ID
     *
     * @param columnRuleId the value for stardard_table.COLUMN_RULE_ID
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public void setColumnRuleId(String columnRuleId) {
        this.columnRuleId = columnRuleId == null ? null : columnRuleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stardard_table.DB_NAME
     *
     * @return the value of stardard_table.DB_NAME
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stardard_table.DB_NAME
     *
     * @param dbName the value for stardard_table.DB_NAME
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public void setDbName(String dbName) {
        this.dbName = dbName == null ? null : dbName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stardard_table.TABLE_CODE
     *
     * @return the value of stardard_table.TABLE_CODE
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public String getTableCode() {
        return tableCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stardard_table.TABLE_CODE
     *
     * @param tableCode the value for stardard_table.TABLE_CODE
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public void setTableCode(String tableCode) {
        this.tableCode = tableCode == null ? null : tableCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stardard_table.TABLE_NAME
     *
     * @return the value of stardard_table.TABLE_NAME
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stardard_table.TABLE_NAME
     *
     * @param tableName the value for stardard_table.TABLE_NAME
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stardard_table.COLUMN_NAME
     *
     * @return the value of stardard_table.COLUMN_NAME
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stardard_table.COLUMN_NAME
     *
     * @param columnName the value for stardard_table.COLUMN_NAME
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stardard_table.COLUMN_INDEX
     *
     * @return the value of stardard_table.COLUMN_INDEX
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public Integer getColumnIndex() {
        return columnIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stardard_table.COLUMN_INDEX
     *
     * @param columnIndex the value for stardard_table.COLUMN_INDEX
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public void setColumnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stardard_table.COLUMN_TYPE
     *
     * @return the value of stardard_table.COLUMN_TYPE
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stardard_table.COLUMN_TYPE
     *
     * @param columnType the value for stardard_table.COLUMN_TYPE
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType == null ? null : columnType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stardard_table.POSTION
     *
     * @return the value of stardard_table.POSTION
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public String getPostion() {
        return postion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stardard_table.POSTION
     *
     * @param postion the value for stardard_table.POSTION
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public void setPostion(String postion) {
        this.postion = postion == null ? null : postion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stardard_table.CLOUMN_COMMENT
     *
     * @return the value of stardard_table.CLOUMN_COMMENT
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public String getCloumnComment() {
        return cloumnComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stardard_table.CLOUMN_COMMENT
     *
     * @param cloumnComment the value for stardard_table.CLOUMN_COMMENT
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public void setCloumnComment(String cloumnComment) {
        this.cloumnComment = cloumnComment == null ? null : cloumnComment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stardard_table.RULE_DATE
     *
     * @return the value of stardard_table.RULE_DATE
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public Date getRuleDate() {
        return ruleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stardard_table.RULE_DATE
     *
     * @param ruleDate the value for stardard_table.RULE_DATE
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    public void setRuleDate(Date ruleDate) {
        this.ruleDate = ruleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stardard_table
     *
     * @mbg.generated Sun May 27 19:04:09 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", columnRuleId=").append(columnRuleId);
        sb.append(", dbName=").append(dbName);
        sb.append(", tableCode=").append(tableCode);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", columnIndex=").append(columnIndex);
        sb.append(", columnType=").append(columnType);
        sb.append(", postion=").append(postion);
        sb.append(", cloumnComment=").append(cloumnComment);
        sb.append(", ruleDate=").append(ruleDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}