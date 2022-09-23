package com.example.demo.mbg.mapper;

import com.example.demo.mbg.model.XkjcZbxGcdYj;
import com.example.demo.mbg.model.XkjcZbxGcdYjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XkjcZbxGcdYjMapper {
    int countByExample(XkjcZbxGcdYjExample example);

    int deleteByExample(XkjcZbxGcdYjExample example);

    int deleteByPrimaryKey(Integer bh);

    int insert(XkjcZbxGcdYj record);

    int insertSelective(XkjcZbxGcdYj record);

    List<XkjcZbxGcdYj> selectByExample(XkjcZbxGcdYjExample example);

    XkjcZbxGcdYj selectByPrimaryKey(Integer bh);

    int updateByExampleSelective(@Param("record") XkjcZbxGcdYj record, @Param("example") XkjcZbxGcdYjExample example);

    int updateByExample(@Param("record") XkjcZbxGcdYj record, @Param("example") XkjcZbxGcdYjExample example);

    int updateByPrimaryKeySelective(XkjcZbxGcdYj record);

    int updateByPrimaryKey(XkjcZbxGcdYj record);
}