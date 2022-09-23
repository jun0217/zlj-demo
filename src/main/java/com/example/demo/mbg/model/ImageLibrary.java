package com.example.demo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ImageLibrary implements Serializable {
    @ApiModelProperty(value = "画像库编号")
    private Integer bh;

    @ApiModelProperty(value = "模块Id")
    private String moduleId;

    @ApiModelProperty(value = "模块名称")
    private String moduleName;

    @ApiModelProperty(value = "画像库名称")
    private String imageName;

    @ApiModelProperty(value = "学科模块(01-校季、02-校内)")
    private String subjectAnalysis;

    @ApiModelProperty(value = "学科模块-校内(01-按成果定义 02-按教师定义)")
    private String subjectStatisticalCaliber;

    @ApiModelProperty(value = "机构：筛选的多个学校")
    private String schoolCodes;

    @ApiModelProperty(value = "学科模块-校季：筛选的单个学科；校内：所选的学科群名")
    private String subjectCode;

    @ApiModelProperty(value = "学科模块-校内：筛选的多个学科；校季：选择的多个学校")
    private String subjectCodes;

    @ApiModelProperty(value = "是否选中 0否1是")
    private Integer isChecked;

    @ApiModelProperty(value = "创建人")
    private String createUser;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改人")
    private String updateUser;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getSubjectAnalysis() {
        return subjectAnalysis;
    }

    public void setSubjectAnalysis(String subjectAnalysis) {
        this.subjectAnalysis = subjectAnalysis;
    }

    public String getSubjectStatisticalCaliber() {
        return subjectStatisticalCaliber;
    }

    public void setSubjectStatisticalCaliber(String subjectStatisticalCaliber) {
        this.subjectStatisticalCaliber = subjectStatisticalCaliber;
    }

    public String getSchoolCodes() {
        return schoolCodes;
    }

    public void setSchoolCodes(String schoolCodes) {
        this.schoolCodes = schoolCodes;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectCodes() {
        return subjectCodes;
    }

    public void setSubjectCodes(String subjectCodes) {
        this.subjectCodes = subjectCodes;
    }

    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bh=").append(bh);
        sb.append(", moduleId=").append(moduleId);
        sb.append(", moduleName=").append(moduleName);
        sb.append(", imageName=").append(imageName);
        sb.append(", subjectAnalysis=").append(subjectAnalysis);
        sb.append(", subjectStatisticalCaliber=").append(subjectStatisticalCaliber);
        sb.append(", schoolCodes=").append(schoolCodes);
        sb.append(", subjectCode=").append(subjectCode);
        sb.append(", subjectCodes=").append(subjectCodes);
        sb.append(", isChecked=").append(isChecked);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}