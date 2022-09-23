package com.example.demo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class XkjcZbxGcdYj implements Serializable {
    private Integer bh;

    @ApiModelProperty(value = "预警观测点名称")
    private String yjGcdMc;

    @ApiModelProperty(value = "指标项编号")
    private String zbxBh;

    @ApiModelProperty(value = "指标项名称")
    private String zbxMc;

    @ApiModelProperty(value = "观测点编号")
    private String gcdBh;

    @ApiModelProperty(value = "观测点名称")
    private String gcdMc;

    @ApiModelProperty(value = "对应的后台指标")
    private String filter;

    @ApiModelProperty(value = "时间类型(0-迄今为止 1-单年 2-时间窗口)")
    private Integer timeType;

    @ApiModelProperty(value = "后台对应字段名")
    private String attributeNameInDb;

    @ApiModelProperty(value = "后台对应字段的值")
    private String attributeValue;

    private Date createTime;

    private String createUser;

    private String updateUser;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }

    public String getYjGcdMc() {
        return yjGcdMc;
    }

    public void setYjGcdMc(String yjGcdMc) {
        this.yjGcdMc = yjGcdMc;
    }

    public String getZbxBh() {
        return zbxBh;
    }

    public void setZbxBh(String zbxBh) {
        this.zbxBh = zbxBh;
    }

    public String getZbxMc() {
        return zbxMc;
    }

    public void setZbxMc(String zbxMc) {
        this.zbxMc = zbxMc;
    }

    public String getGcdBh() {
        return gcdBh;
    }

    public void setGcdBh(String gcdBh) {
        this.gcdBh = gcdBh;
    }

    public String getGcdMc() {
        return gcdMc;
    }

    public void setGcdMc(String gcdMc) {
        this.gcdMc = gcdMc;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Integer getTimeType() {
        return timeType;
    }

    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    public String getAttributeNameInDb() {
        return attributeNameInDb;
    }

    public void setAttributeNameInDb(String attributeNameInDb) {
        this.attributeNameInDb = attributeNameInDb;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bh=").append(bh);
        sb.append(", yjGcdMc=").append(yjGcdMc);
        sb.append(", zbxBh=").append(zbxBh);
        sb.append(", zbxMc=").append(zbxMc);
        sb.append(", gcdBh=").append(gcdBh);
        sb.append(", gcdMc=").append(gcdMc);
        sb.append(", filter=").append(filter);
        sb.append(", timeType=").append(timeType);
        sb.append(", attributeNameInDb=").append(attributeNameInDb);
        sb.append(", attributeValue=").append(attributeValue);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}