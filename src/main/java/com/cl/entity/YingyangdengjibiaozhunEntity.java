package com.cl.entity;

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
 * 营养等级标准
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
@TableName("yingyangdengjibiaozhun")
public class YingyangdengjibiaozhunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YingyangdengjibiaozhunEntity() {
		
	}
	
	public YingyangdengjibiaozhunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 等级名称
	 */
					
	private String dengjimingcheng;
	
	/**
	 * 标准名称
	 */
					
	private String biaozhunmingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 标准说明
	 */
					
	private String biaozhunshuoming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：等级名称
	 */
	public void setDengjimingcheng(String dengjimingcheng) {
		this.dengjimingcheng = dengjimingcheng;
	}
	/**
	 * 获取：等级名称
	 */
	public String getDengjimingcheng() {
		return dengjimingcheng;
	}
	/**
	 * 设置：标准名称
	 */
	public void setBiaozhunmingcheng(String biaozhunmingcheng) {
		this.biaozhunmingcheng = biaozhunmingcheng;
	}
	/**
	 * 获取：标准名称
	 */
	public String getBiaozhunmingcheng() {
		return biaozhunmingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：标准说明
	 */
	public void setBiaozhunshuoming(String biaozhunshuoming) {
		this.biaozhunshuoming = biaozhunshuoming;
	}
	/**
	 * 获取：标准说明
	 */
	public String getBiaozhunshuoming() {
		return biaozhunshuoming;
	}

}
