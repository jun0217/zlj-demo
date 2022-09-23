package com.example.demo.mbg.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(value="学科表")
@TableName("xkjc_xk")
public class XkjcXk implements Serializable {
    @ApiModelProperty(value = "编号")
    @TableId(value = "bh", type = IdType.AUTO)
    private Integer bh;

    @ApiModelProperty(value = "学科编号")
    @TableField("xk_bh")
    private String xkBh;

    @ApiModelProperty(value = "学科名称")
    @TableField("xk_mc")
    private String xkMc;

    @ApiModelProperty(value = "本校学科排序")
    @TableField("xk_order")
    private Integer xkOrder;

    @ApiModelProperty(value = "创建用户id")
    @TableField("create_user")
    private String createUser;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "更新用户id")
    @TableField("update_user")
    private String updateUser;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "是否有效（1-有效 0-无效）")
    @TableField("is_exists")
    private Integer isExists;

    @ApiModelProperty(value = "是否esi学科（1-是 0-否）")
    @TableField("is_esi")
    private Integer isEsi;

    private static final long serialVersionUID = 1L;

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }

    public String getXkBh() {
        return xkBh;
    }

    public void setXkBh(String xkBh) {
        this.xkBh = xkBh;
    }

    public String getXkMc() {
        return xkMc;
    }

    public void setXkMc(String xkMc) {
        this.xkMc = xkMc;
    }

    public Integer getXkOrder() {
        return xkOrder;
    }

    public void setXkOrder(Integer xkOrder) {
        this.xkOrder = xkOrder;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Integer getIsExists() {
        return isExists;
    }

    public void setIsExists(Integer isExists) {
        this.isExists = isExists;
    }

    public Integer getIsEsi() {
        return isEsi;
    }

    public void setIsEsi(Integer isEsi) {
        this.isEsi = isEsi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bh=").append(bh);
        sb.append(", xkBh=").append(xkBh);
        sb.append(", xkMc=").append(xkMc);
        sb.append(", xkOrder=").append(xkOrder);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isExists=").append(isExists);
        sb.append(", isEsi=").append(isEsi);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}