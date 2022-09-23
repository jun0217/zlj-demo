package com.example.demo.mbg.pojo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jun
 * @Des TODO
 * @Date 2022/2/22 14:22
 **/
@HeadRowHeight(value = 35) // 表头行高
@ContentRowHeight(value = 25) // 内容行高
@Data
public class XkjcXKPOJO implements Serializable {
    @ExcelProperty(value = {"学科信息","编号"},order = 10)
    private Integer bh;

    @ExcelProperty(value = {"学科信息","学科编号"},order = 10)
    private String xkBh;

    @ExcelProperty(value = {"学科信息","学科名称"},order = 10)
    private String xkMc;

    @ExcelProperty(value = {"学科信息","本校学科排序"},order = 10)
    private Integer xkOrder;

    @ExcelProperty(value = {"学科信息","创建用户id"},order = 10)
    private String createUser;

    @ExcelProperty(value = {"学科信息","创建时间"},order = 10)
    @DateTimeFormat("yyyy-MM-dd")
    private Date createTime;

    @ExcelProperty(value = {"学科信息","更新用户id"},order = 10)
    private String updateUser;

    @ExcelProperty(value = {"学科信息","更新时间"},order = 10)
    //@ExcelIgnore 忽略此列 也可动态指定哪些输出
    private Date updateTime;

    @ExcelProperty(value = {"学科信息","是否有效（1-有效 0-无效）"},order = 10)
    private Integer isExists;

    @ExcelProperty(value = {"学科信息","是否esi学科（1-是 0-否）"},order = 10)
    private Integer isEsi;

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
}
