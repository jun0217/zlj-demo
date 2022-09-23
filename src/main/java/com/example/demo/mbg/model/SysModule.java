package com.example.demo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SysModule implements Serializable {
    private Integer bh;

    @ApiModelProperty(value = "模块Id")
    private Integer moduleid;

    @ApiModelProperty(value = "模块名称")
    private String moduleName;

    @ApiModelProperty(value = "分类 1-机构 2-学科 3-院系 4-教师")
    private Integer classify;

    @ApiModelProperty(value = "分类名称")
    private String classifyName;

    @ApiModelProperty(value = "统计表表名后缀")
    private String tjbBmSuffix;

    @ApiModelProperty(value = "观测表的jsonSetting字段值的name值")
    private String name;

    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getTjbBmSuffix() {
        return tjbBmSuffix;
    }

    public void setTjbBmSuffix(String tjbBmSuffix) {
        this.tjbBmSuffix = tjbBmSuffix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bh=").append(bh);
        sb.append(", moduleid=").append(moduleid);
        sb.append(", moduleName=").append(moduleName);
        sb.append(", classify=").append(classify);
        sb.append(", classifyName=").append(classifyName);
        sb.append(", tjbBmSuffix=").append(tjbBmSuffix);
        sb.append(", name=").append(name);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}