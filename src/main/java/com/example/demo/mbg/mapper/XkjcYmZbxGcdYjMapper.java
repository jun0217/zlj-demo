package com.example.demo.mbg.mapper;

import com.example.demo.mbg.model.XkjcYmZbxGcdYj;
import com.example.demo.mbg.model.XkjcYmZbxGcdYjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XkjcYmZbxGcdYjMapper {
    int countByExample(XkjcYmZbxGcdYjExample example);

    int deleteByExample(XkjcYmZbxGcdYjExample example);

    int deleteByPrimaryKey(Integer bh);

    int insert(XkjcYmZbxGcdYj record);

    int insertSelective(XkjcYmZbxGcdYj record);

    List<XkjcYmZbxGcdYj> selectByExample(XkjcYmZbxGcdYjExample example);

    XkjcYmZbxGcdYj selectByPrimaryKey(Integer bh);

    int updateByExampleSelective(@Param("record") XkjcYmZbxGcdYj record, @Param("example") XkjcYmZbxGcdYjExample example);

    int updateByExample(@Param("record") XkjcYmZbxGcdYj record, @Param("example") XkjcYmZbxGcdYjExample example);

    int updateByPrimaryKeySelective(XkjcYmZbxGcdYj record);

    int updateByPrimaryKey(XkjcYmZbxGcdYj record);
}