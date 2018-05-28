package com.sjjybsgj.common.user.model;

import java.io.Serializable;

public class UserRoleRel implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_ROLE_REL.REL_ID
     *
     * @mbg.generated Wed Sep 20 16:58:25 CST 2017
     */
    private String relId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_ROLE_REL.USER_ID
     *
     * @mbg.generated Wed Sep 20 16:58:25 CST 2017
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_ROLE_REL.ROLE_ID
     *
     * @mbg.generated Wed Sep 20 16:58:25 CST 2017
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_ROLE_REL
     *
     * @mbg.generated Wed Sep 20 16:58:25 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_ROLE_REL.REL_ID
     *
     * @return the value of USER_ROLE_REL.REL_ID
     *
     * @mbg.generated Wed Sep 20 16:58:25 CST 2017
     */
    public String getRelId() {
        return relId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_ROLE_REL.REL_ID
     *
     * @param relId the value for USER_ROLE_REL.REL_ID
     *
     * @mbg.generated Wed Sep 20 16:58:25 CST 2017
     */
    public void setRelId(String relId) {
        this.relId = relId == null ? null : relId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_ROLE_REL.USER_ID
     *
     * @return the value of USER_ROLE_REL.USER_ID
     *
     * @mbg.generated Wed Sep 20 16:58:25 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_ROLE_REL.USER_ID
     *
     * @param userId the value for USER_ROLE_REL.USER_ID
     *
     * @mbg.generated Wed Sep 20 16:58:25 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_ROLE_REL.ROLE_ID
     *
     * @return the value of USER_ROLE_REL.ROLE_ID
     *
     * @mbg.generated Wed Sep 20 16:58:25 CST 2017
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_ROLE_REL.ROLE_ID
     *
     * @param roleId the value for USER_ROLE_REL.ROLE_ID
     *
     * @mbg.generated Wed Sep 20 16:58:25 CST 2017
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE_REL
     *
     * @mbg.generated Wed Sep 20 16:58:25 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", relId=").append(relId);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}