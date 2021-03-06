package com.sjjybsgj.checked_log.mapper;

import com.sjjybsgj.checked_log.model.CheckedLog;
import com.sjjybsgj.checked_log.model.CheckedLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckedLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checked_log
     *
     * @mbg.generated Tue May 29 15:51:56 CST 2018
     */
    long countByExample(CheckedLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checked_log
     *
     * @mbg.generated Tue May 29 15:51:56 CST 2018
     */
    int deleteByExample(CheckedLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checked_log
     *
     * @mbg.generated Tue May 29 15:51:56 CST 2018
     */
    int deleteByPrimaryKey(String logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checked_log
     *
     * @mbg.generated Tue May 29 15:51:56 CST 2018
     */
    int insert(CheckedLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checked_log
     *
     * @mbg.generated Tue May 29 15:51:56 CST 2018
     */
    int insertSelective(CheckedLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checked_log
     *
     * @mbg.generated Tue May 29 15:51:56 CST 2018
     */
    List<CheckedLog> selectByExample(CheckedLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checked_log
     *
     * @mbg.generated Tue May 29 15:51:56 CST 2018
     */
    CheckedLog selectByPrimaryKey(String logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checked_log
     *
     * @mbg.generated Tue May 29 15:51:56 CST 2018
     */
    int updateByExampleSelective(@Param("record") CheckedLog record, @Param("example") CheckedLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checked_log
     *
     * @mbg.generated Tue May 29 15:51:56 CST 2018
     */
    int updateByExample(@Param("record") CheckedLog record, @Param("example") CheckedLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checked_log
     *
     * @mbg.generated Tue May 29 15:51:56 CST 2018
     */
    int updateByPrimaryKeySelective(CheckedLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checked_log
     *
     * @mbg.generated Tue May 29 15:51:56 CST 2018
     */
    int updateByPrimaryKey(CheckedLog record);
}