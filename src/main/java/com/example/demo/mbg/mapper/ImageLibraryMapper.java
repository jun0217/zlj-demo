package com.example.demo.mbg.mapper;

import com.example.demo.mbg.model.ImageLibrary;
import com.example.demo.mbg.model.ImageLibraryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageLibraryMapper {
    int countByExample(ImageLibraryExample example);

    int deleteByExample(ImageLibraryExample example);

    int deleteByPrimaryKey(Integer bh);

    int insert(ImageLibrary record);

    int insertSelective(ImageLibrary record);

    List<ImageLibrary> selectByExample(ImageLibraryExample example);

    ImageLibrary selectByPrimaryKey(Integer bh);

    int updateByExampleSelective(@Param("record") ImageLibrary record, @Param("example") ImageLibraryExample example);

    int updateByExample(@Param("record") ImageLibrary record, @Param("example") ImageLibraryExample example);

    int updateByPrimaryKeySelective(ImageLibrary record);

    int updateByPrimaryKey(ImageLibrary record);
}