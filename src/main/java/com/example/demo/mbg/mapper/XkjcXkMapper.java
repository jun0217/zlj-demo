package com.example.demo.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.mbg.model.XkjcXk;
import com.example.demo.mbg.model.XkjcXkExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface XkjcXkMapper extends BaseMapper<XkjcXk> {
    int countByExample(XkjcXkExample example);

    int deleteByExample(XkjcXkExample example);

    int deleteByPrimaryKey(Integer bh);

    int insert(XkjcXk record);

    int insertSelective(XkjcXk record);

    List<XkjcXk> selectByExample(XkjcXkExample example);

    XkjcXk selectByPrimaryKey(Integer bh);

    int updateByExampleSelective(@Param("record") XkjcXk record, @Param("example") XkjcXkExample example);

    int updateByExample(@Param("record") XkjcXk record, @Param("example") XkjcXkExample example);

    int updateByPrimaryKeySelective(XkjcXk record);

    int updateByPrimaryKey(XkjcXk record);

}
