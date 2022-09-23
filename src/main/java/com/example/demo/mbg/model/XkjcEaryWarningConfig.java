package com.example.demo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class XkjcEaryWarningConfig implements Serializable {
    private Integer bh;

    @ApiModelProperty(value = "预警观测点名称")
    private String name;

    @ApiModelProperty(value = "模块编号")
    private String dependsOn;

    @ApiModelProperty(value = "学科、院系、教师")
    private String code;

    @ApiModelProperty(value = "体系节点编号")
    private Long metricGroupNodeId;

    @ApiModelProperty(value = "体系节点名称")
    private String metricGroupNodeName;

    @ApiModelProperty(value = "观测点编号")
    private String metricId;

    @ApiModelProperty(value = "观测点名称")
    private String metricName;

    @ApiModelProperty(value = "统计年份(年、年区间)")
    private String nf;

    @ApiModelProperty(value = "时间类型(1: 存量 2: 年区间)")
    private String statisticsMethod;

    @ApiModelProperty(value = "预警值")
    private String threshold;

    @ApiModelProperty(value = "预警类型(1,大于等于；2小于等于)")
    private String type;

    @ApiModelProperty(value = "预警时间")
    private Date warnTime;

    @ApiModelProperty(value = "是否预警")
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

    public String getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(String dependsOn) {
        this.dependsOn = dependsOn;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getMetricGroupNodeId() {
        return metricGroupNodeId;
    }

    public void setMetricGroupNodeId(Long metricGroupNodeId) {
        this.metricGroupNodeId = metricGroupNodeId;
    }

    public String getMetricGroupNodeName() {
        return metricGroupNodeName;
    }

    public void setMetricGroupNodeName(String metricGroupNodeName) {
        this.metricGroupNodeName = metricGroupNodeName;
    }

    public String getMetricId() {
        return metricId;
    }

    public void setMetricId(String metricId) {
        this.metricId = metricId;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

    public String getStatisticsMethod() {
        return statisticsMethod;
    }

    public void setStatisticsMethod(String statisticsMethod) {
        this.statisticsMethod = statisticsMethod;
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
        sb.append(", dependsOn=").append(dependsOn);
        sb.append(", code=").append(code);
        sb.append(", metricGroupNodeId=").append(metricGroupNodeId);
        sb.append(", metricGroupNodeName=").append(metricGroupNodeName);
        sb.append(", metricId=").append(metricId);
        sb.append(", metricName=").append(metricName);
        sb.append(", nf=").append(nf);
        sb.append(", statisticsMethod=").append(statisticsMethod);
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