package com.wbg.swager.dao;

import com.wbg.swager.entity.Apiresponse;
import java.util.List;

public interface ApiresponseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiresponse
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiresponse
     *
     * @mbg.generated
     */
    int insert(Apiresponse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiresponse
     *
     * @mbg.generated
     */
    Apiresponse selectByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiresponse
     *
     * @mbg.generated
     */
    List<Apiresponse> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiresponse
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Apiresponse record);
}