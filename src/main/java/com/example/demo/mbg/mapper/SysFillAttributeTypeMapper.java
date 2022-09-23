package com.example.demo.mbg.mapper;

import com.example.demo.mbg.model.SysFillAttributeType;
import com.example.demo.mbg.model.SysFillAttributeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFillAttributeTypeMapper {
    int countByExample(SysFillAttributeTypeExample example);

    int deleteByExample(SysFillAttributeTypeExample example);

    int deleteByPrimaryKey(String attributeCode);

    int insert(SysFillAttributeType record);

    int insertSelective(SysFillAttributeType record);

    List<SysFillAttributeType> selectByExample(SysFillAttributeTypeExample example);

    SysFillAttributeType selectByPrimaryKey(String attributeCode);

    int updateByExampleSelective(@Param("record") SysFillAttributeType record, @Param("example") SysFillAttributeTypeExample example);

    int updateByExample(@Param("record") SysFillAttributeType record, @Param("example") SysFillAttributeTypeExample example);

    int updateByPrimaryKeySelective(SysFillAttributeType record);

    int updateByPrimaryKey(SysFillAttributeType record);
}