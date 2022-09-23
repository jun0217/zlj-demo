package com.example.demo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class XkjcYjGcdConfig implements Serializable {
    private Integer bh;

    @ApiModelProperty(value = "预警观测点名称")
    private String name;

    @ApiModelProperty(value = "模块编号")
    private String module;

    @ApiModelProperty(value = "学科、学科群、院系、教师、教师群")
    private String subjectCode;

    @ApiModelProperty(value = "指标项编号")
    private String zbxBh;

    @ApiModelProperty(value = "指标项名称")
    private String zbxMc;

    @ApiModelProperty(value = "观测点编号")
    private String gcdBh;

    @ApiModelProperty(value = "观测点名称")
    private String gcdMc;

    @ApiModelProperty(value = "统计年份")
    private String nf;

    @ApiModelProperty(value = "时间类型(0-迄今为止 1-单年 2-时间窗口)")
    private String nfType;

    @ApiModelProperty(value = "预警值")
    private String threshold;

    @ApiModelProperty(value = "预警类型(1,大于等于；2小于等于)")
    private String type;

    @ApiModelProperty(value = "预警时间")
    private Date warnTime;

    @ApiModelProperty(value = "是否显示")
    private Integer isAlert;

    @ApiModelProperty(value = "是否有效")
    private Integer isExists;

    @ApiModelProperty(value = "预警观测点顺序")
    private Integer yjGcdOrder;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
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

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

    public String getNfType() {
        return nfType;
    }

    public void setNfType(String nfType) {
        this.nfType = nfType;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getWarnTime() {
        return warnTime;
    }

    public void setWarnTime(Date warnTime) {
        this.warnTime = warnTime;
    }

    public Integer getIsAlert() {
        return isAlert;
    }

    public void setIsAlert(Integer isAlert) {
        this.isAlert = isAlert;
    }

    public Integer getIsExists() {
        return isExists;
    }

    public void setIsExists(Integer isExists) {
        this.isExists = isExists;
    }

    public Integer getYjGcdOrder() {
        return yjGcdOrder;
    }

    public void setYjGcdOrder(Integer yjGcdOrder) {
        this.yjGcdOrder = yjGcdOrder;
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
        sb.append(", name=").append(name);
        sb.append(", module=").append(module);
        sb.append(", subjectCode=").append(subjectCode);
        sb.append(", zbxBh=").append(zbxBh);
        sb.append(", zbxMc=").append(zbxMc);
        sb.append(", gcdBh=").append(gcdBh);
        sb.append(", gcdMc=").append(gcdMc);
        sb.append(", nf=").append(nf);
        sb.append(", nfType=").append(nfType);
        sb.append(", threshold=").append(threshold);
        sb.append(", type=").append(type);
        sb.append(", warnTime=").append(warnTime);
        sb.append(", isAlert=").append(isAlert);
        sb.append(", isExists=").append(isExists);
        sb.append(", yjGcdOrder=").append(yjGcdOrder);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}