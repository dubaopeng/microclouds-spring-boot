package com.microclouds.dao;

import com.microclouds.pojo.Email;
import com.microclouds.pojo.EmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email
     *
     * @mbg.generated Sat Jan 12 14:49:18 CST 2019
     */
    long countByExample(EmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email
     *
     * @mbg.generated Sat Jan 12 14:49:18 CST 2019
     */
    int deleteByExample(EmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email
     *
     * @mbg.generated Sat Jan 12 14:49:18 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email
     *
     * @mbg.generated Sat Jan 12 14:49:18 CST 2019
     */
    int insert(Email record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email
     *
     * @mbg.generated Sat Jan 12 14:49:18 CST 2019
     */
    int insertSelective(Email record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email
     *
     * @mbg.generated Sat Jan 12 14:49:18 CST 2019
     */
    List<Email> selectByExample(EmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email
     *
     * @mbg.generated Sat Jan 12 14:49:18 CST 2019
     */
    Email selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email
     *
     * @mbg.generated Sat Jan 12 14:49:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") Email record, @Param("example") EmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email
     *
     * @mbg.generated Sat Jan 12 14:49:18 CST 2019
     */
    int updateByExample(@Param("record") Email record, @Param("example") EmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email
     *
     * @mbg.generated Sat Jan 12 14:49:18 CST 2019
     */
    int updateByPrimaryKeySelective(Email record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table email
     *
     * @mbg.generated Sat Jan 12 14:49:18 CST 2019
     */
    int updateByPrimaryKey(Email record);
}