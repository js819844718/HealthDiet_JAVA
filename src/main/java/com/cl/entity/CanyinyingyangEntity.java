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
 * 餐饮营养
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
@TableName("canyinyingyang")
public class CanyinyingyangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CanyinyingyangEntity() {
		
	}
	
	public CanyinyingyangEntity(T t) {
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
	 * 菜品名称
	 */
					
	private String caipinmingcheng;
	
	/**
	 * 菜品分类
	 */
					
	private String caipinfenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 卡路里(cal)
	 */
					
	private Double kaluli;
	
	/**
	 * 碳水(100g)
	 */
					
	private Double tanshui;
	
	/**
	 * 蛋白质(100g)
	 */
					
	private Double danbaizhi;
	
	/**
	 * 脂肪(100g)
	 */
					
	private Double zhifang;
	
	/**
	 * 营养素(100g)
	 */
					
	private Double yingyangsu;
	
	/**
	 * 营养级别
	 */
					
	private String yingyangjibie;
	
	
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
	 * 设置：菜品名称
	 */
	public void setCaipinmingcheng(String caipinmingcheng) {
		this.caipinmingcheng = caipinmingcheng;
	}
	/**
	 * 获取：菜品名称
	 */
	public String getCaipinmingcheng() {
		return caipinmingcheng;
	}
	/**
	 * 设置：菜品分类
	 */
	public void setCaipinfenlei(String caipinfenlei) {
		this.caipinfenlei = caipinfenlei;
	}
	/**
	 * 获取：菜品分类
	 */
	public String getCaipinfenlei() {
		return caipinfenlei;
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
	 * 设置：卡路里(cal)
	 */
	public void setKaluli(Double kaluli) {
		this.kaluli = kaluli;
	}
	/**
	 * 获取：卡路里(cal)
	 */
	public Double getKaluli() {
		return kaluli;
	}
	/**
	 * 设置：碳水(100g)
	 */
	public void setTanshui(Double tanshui) {
		this.tanshui = tanshui;
	}
	/**
	 * 获取：碳水(100g)
	 */
	public Double getTanshui() {
		return tanshui;
	}
	/**
	 * 设置：蛋白质(100g)
	 */
	public void setDanbaizhi(Double danbaizhi) {
		this.danbaizhi = danbaizhi;
	}
	/**
	 * 获取：蛋白质(100g)
	 */
	public Double getDanbaizhi() {
		return danbaizhi;
	}
	/**
	 * 设置：脂肪(100g)
	 */
	public void setZhifang(Double zhifang) {
		this.zhifang = zhifang;
	}
	/**
	 * 获取：脂肪(100g)
	 */
	public Double getZhifang() {
		return zhifang;
	}
	/**
	 * 设置：营养素(100g)
	 */
	public void setYingyangsu(Double yingyangsu) {
		this.yingyangsu = yingyangsu;
	}
	/**
	 * 获取：营养素(100g)
	 */
	public Double getYingyangsu() {
		return yingyangsu;
	}
	/**
	 * 设置：营养级别
	 */
	public void setYingyangjibie(String yingyangjibie) {
		this.yingyangjibie = yingyangjibie;
	}
	/**
	 * 获取：营养级别
	 */
	public String getYingyangjibie() {
		return yingyangjibie;
	}

}
