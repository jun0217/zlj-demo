package com.example.demo.mbg.mapper;

import com.example.demo.mbg.model.XkjcEaryWarningConfig;
import com.example.demo.mbg.model.XkjcEaryWarningConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XkjcEaryWarningConfigMapper {
    int countByExample(XkjcEaryWarningConfigExample example);

    int deleteByExample(XkjcEaryWarningConfigExample example);

    int deleteByPrimaryKey(Integer bh);

    int insert(XkjcEaryWarningConfig record);

    int insertSelective(XkjcEaryWarningConfig record);

    List<XkjcEaryWarningConfig> selectByExample(XkjcEaryWarningConfigExample example);

    XkjcEaryWarningConfig selectByPrimaryKey(Integer bh);

    int updateByExampleSelective(@Param("record") XkjcEaryWarningConfig record, @Param("example") XkjcEaryWarningConfigExample example);

    int updateByExample(@Param("record") XkjcEaryWarningConfig record, @Param("example") XkjcEaryWarningConfigExample example);

    int updateByPrimaryKeySelective(XkjcEaryWarningConfig record);

    int updateByPrimaryKey(XkjcEaryWarningConfig record);
}