package com.sjjybsgj.common.logging.model;

import java.io.Serializable;

public class LoggingEventExceptionKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event_exception.event_id
     *
     * @mbg.generated Fri Sep 15 16:14:57 CST 2017
     */
    private Long eventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event_exception.i
     *
     * @mbg.generated Fri Sep 15 16:14:57 CST 2017
     */
    private Short i;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table logging_event_exception
     *
     * @mbg.generated Fri Sep 15 16:14:57 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event_exception.event_id
     *
     * @return the value of logging_event_exception.event_id
     *
     * @mbg.generated Fri Sep 15 16:14:57 CST 2017
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event_exception.event_id
     *
     * @param eventId the value for logging_event_exception.event_id
     *
     * @mbg.generated Fri Sep 15 16:14:57 CST 2017
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event_exception.i
     *
     * @return the value of logging_event_exception.i
     *
     * @mbg.generated Fri Sep 15 16:14:57 CST 2017
     */
    public Short getI() {
        return i;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event_exception.i
     *
     * @param i the value for logging_event_exception.i
     *
     * @mbg.generated Fri Sep 15 16:14:57 CST 2017
     */
    public void setI(Short i) {
        this.i = i;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_exception
     *
     * @mbg.generated Fri Sep 15 16:14:57 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eventId=").append(eventId);
        sb.append(", i=").append(i);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}