package com.example.demo.mbg.mapper;

import com.example.demo.mbg.model.XkjcYjGcdConfig;
import com.example.demo.mbg.model.XkjcYjGcdConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XkjcYjGcdConfigMapper {
    int countByExample(XkjcYjGcdConfigExample example);

    int deleteByExample(XkjcYjGcdConfigExample example);

    int deleteByPrimaryKey(Integer bh);

    int insert(XkjcYjGcdConfig record);

    int insertSelective(XkjcYjGcdConfig record);

    List<XkjcYjGcdConfig> selectByExample(XkjcYjGcdConfigExample example);

    XkjcYjGcdConfig selectByPrimaryKey(Integer bh);

    int updateByExampleSelective(@Param("record") XkjcYjGcdConfig record, @Param("example") XkjcYjGcdConfigExample example);

    int updateByExample(@Param("record") XkjcYjGcdConfig record, @Param("example") XkjcYjGcdConfigExample example);

    int updateByPrimaryKeySelective(XkjcYjGcdConfig record);

    int updateByPrimaryKey(XkjcYjGcdConfig record);
}