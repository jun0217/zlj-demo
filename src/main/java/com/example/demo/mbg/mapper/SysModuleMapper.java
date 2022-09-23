package com.example.demo.mbg.mapper;

import com.example.demo.mbg.model.SysModule;
import com.example.demo.mbg.model.SysModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysModuleMapper {
    int countByExample(SysModuleExample example);

    int deleteByExample(SysModuleExample example);

    int deleteByPrimaryKey(Integer bh);

    int insert(SysModule record);

    int insertSelective(SysModule record);

    List<SysModule> selectByExample(SysModuleExample example);

    SysModule selectByPrimaryKey(Integer bh);

    int updateByExampleSelective(@Param("record") SysModule record, @Param("example") SysModuleExample example);

    int updateByExample(@Param("record") SysModule record, @Param("example") SysModuleExample example);

    int updateByPrimaryKeySelective(SysModule record);

    int updateByPrimaryKey(SysModule record);
}