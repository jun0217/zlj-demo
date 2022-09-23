package com.example.demo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class XkjcYmZbxGcdYj implements Serializable {
    private Integer bh;

    @ApiModelProperty(value = "页面编号")
    private String ymBh;

    @ApiModelProperty(value = "页面名称")
    private String ymMc;

    @ApiModelProperty(value = "指标项编号")
    private String zbxBh;

    @ApiModelProperty(value = "观测点编号")
    private String gcdBh;

    @ApiModelProperty(value = "预警观测点编号")
    private String yjGcdBh;

    @ApiModelProperty(value = "是否有效")
    private Integer isExists;

    @ApiModelProperty(value = "是否选中")
    private Integer isChecked;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private static final long serialVersionUID = 1L;

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }

    public String getYmBh() {
        return ymBh;
    }

    public void setYmBh(String ymBh) {
        this.ymBh = ymBh;
    }

    public String getYmMc() {
        return ymMc;
    }

    public void setYmMc(String ymMc) {
        this.ymMc = ymMc;
    }

    public String getZbxBh() {
        return zbxBh;
    }

    public void setZbxBh(String zbxBh) {
        this.zbxBh = zbxBh;
    }

    public String getGcdBh() {
        return gcdBh;
    }

    public void setGcdBh(String gcdBh) {
        this.gcdBh = gcdBh;
    }

    public String getYjGcdBh() {
        return yjGcdBh;
    }

    public void setYjGcdBh(String yjGcdBh) {
        this.yjGcdBh = yjGcdBh;
    }

    public Integer getIsExists() {
        return isExists;
    }

    public void setIsExists(Integer isExists) {
        this.isExists = isExists;
    }

    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bh=").append(bh);
        sb.append(", ymBh=").append(ymBh);
        sb.append(", ymMc=").append(ymMc);
        sb.append(", zbxBh=").append(zbxBh);
        sb.append(", gcdBh=").append(gcdBh);
        sb.append(", yjGcdBh=").append(yjGcdBh);
        sb.append(", isExists=").append(isExists);
        sb.append(", isChecked=").append(isChecked);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}