package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 车辆事故
 *
 * @author 
 * @email
 */
@TableName("cheliang_shigu")
public class CheliangShiguEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CheliangShiguEntity() {

	}

	public CheliangShiguEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 车辆
     */
    @TableField(value = "cheliang_id")

    private Integer cheliangId;


    /**
     * 事故编号
     */
    @TableField(value = "cheliang_shigu_uuid_number")

    private String cheliangShiguUuidNumber;


    /**
     * 事故名称
     */
    @TableField(value = "cheliang_shigu_name")

    private String cheliangShiguName;


    /**
     * 事故相关文件
     */
    @TableField(value = "cheliang_shigu_file")

    private String cheliangShiguFile;


    /**
     * 事故详情
     */
    @TableField(value = "cheliang_shigu_content")

    private String cheliangShiguContent;


    /**
     * 发生事故时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "cheliang_shigu_time")

    private Date cheliangShiguTime;


    /**
     * 处理时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "cheliang_shigu_chuli_time")

    private Date cheliangShiguChuliTime;


    /**
     * 保险
     */
    @TableField(value = "cheliang_shigu_baoxian_types")

    private Integer cheliangShiguBaoxianTypes;


    /**
     * 责任方
     */
    @TableField(value = "cheliang_shigu_zeren_types")

    private Integer cheliangShiguZerenTypes;


    /**
     * 处理结果
     */
    @TableField(value = "cheliang_shigu_chulijieguo_content")

    private String cheliangShiguChulijieguoContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：车辆
	 */
    public Integer getCheliangId() {
        return cheliangId;
    }
    /**
	 * 获取：车辆
	 */

    public void setCheliangId(Integer cheliangId) {
        this.cheliangId = cheliangId;
    }
    /**
	 * 设置：事故编号
	 */
    public String getCheliangShiguUuidNumber() {
        return cheliangShiguUuidNumber;
    }
    /**
	 * 获取：事故编号
	 */

    public void setCheliangShiguUuidNumber(String cheliangShiguUuidNumber) {
        this.cheliangShiguUuidNumber = cheliangShiguUuidNumber;
    }
    /**
	 * 设置：事故名称
	 */
    public String getCheliangShiguName() {
        return cheliangShiguName;
    }
    /**
	 * 获取：事故名称
	 */

    public void setCheliangShiguName(String cheliangShiguName) {
        this.cheliangShiguName = cheliangShiguName;
    }
    /**
	 * 设置：事故相关文件
	 */
    public String getCheliangShiguFile() {
        return cheliangShiguFile;
    }
    /**
	 * 获取：事故相关文件
	 */

    public void setCheliangShiguFile(String cheliangShiguFile) {
        this.cheliangShiguFile = cheliangShiguFile;
    }
    /**
	 * 设置：事故详情
	 */
    public String getCheliangShiguContent() {
        return cheliangShiguContent;
    }
    /**
	 * 获取：事故详情
	 */

    public void setCheliangShiguContent(String cheliangShiguContent) {
        this.cheliangShiguContent = cheliangShiguContent;
    }
    /**
	 * 设置：发生事故时间
	 */
    public Date getCheliangShiguTime() {
        return cheliangShiguTime;
    }
    /**
	 * 获取：发生事故时间
	 */

    public void setCheliangShiguTime(Date cheliangShiguTime) {
        this.cheliangShiguTime = cheliangShiguTime;
    }
    /**
	 * 设置：处理时间
	 */
    public Date getCheliangShiguChuliTime() {
        return cheliangShiguChuliTime;
    }
    /**
	 * 获取：处理时间
	 */

    public void setCheliangShiguChuliTime(Date cheliangShiguChuliTime) {
        this.cheliangShiguChuliTime = cheliangShiguChuliTime;
    }
    /**
	 * 设置：保险
	 */
    public Integer getCheliangShiguBaoxianTypes() {
        return cheliangShiguBaoxianTypes;
    }
    /**
	 * 获取：保险
	 */

    public void setCheliangShiguBaoxianTypes(Integer cheliangShiguBaoxianTypes) {
        this.cheliangShiguBaoxianTypes = cheliangShiguBaoxianTypes;
    }
    /**
	 * 设置：责任方
	 */
    public Integer getCheliangShiguZerenTypes() {
        return cheliangShiguZerenTypes;
    }
    /**
	 * 获取：责任方
	 */

    public void setCheliangShiguZerenTypes(Integer cheliangShiguZerenTypes) {
        this.cheliangShiguZerenTypes = cheliangShiguZerenTypes;
    }
    /**
	 * 设置：处理结果
	 */
    public String getCheliangShiguChulijieguoContent() {
        return cheliangShiguChulijieguoContent;
    }
    /**
	 * 获取：处理结果
	 */

    public void setCheliangShiguChulijieguoContent(String cheliangShiguChulijieguoContent) {
        this.cheliangShiguChulijieguoContent = cheliangShiguChulijieguoContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CheliangShigu{" +
            "id=" + id +
            ", cheliangId=" + cheliangId +
            ", cheliangShiguUuidNumber=" + cheliangShiguUuidNumber +
            ", cheliangShiguName=" + cheliangShiguName +
            ", cheliangShiguFile=" + cheliangShiguFile +
            ", cheliangShiguContent=" + cheliangShiguContent +
            ", cheliangShiguTime=" + cheliangShiguTime +
            ", cheliangShiguChuliTime=" + cheliangShiguChuliTime +
            ", cheliangShiguBaoxianTypes=" + cheliangShiguBaoxianTypes +
            ", cheliangShiguZerenTypes=" + cheliangShiguZerenTypes +
            ", cheliangShiguChulijieguoContent=" + cheliangShiguChulijieguoContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
