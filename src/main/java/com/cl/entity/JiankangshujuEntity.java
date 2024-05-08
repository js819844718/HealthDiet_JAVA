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
 * 健康数据
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
@TableName("jiankangshuju")
public class JiankangshujuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangshujuEntity() {
		
	}
	
	public JiankangshujuEntity(T t) {
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
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 身高
	 */
					
	private String shengao;
	
	/**
	 * 体重
	 */
					
	private String tizhong;
	
	/**
	 * 血糖
	 */
					
	private String xuetang;
	
	/**
	 * 心率
	 */
					
	private String xinlv;
	
	/**
	 * 血压
	 */
					
	private String xueya;
	
	/**
	 * 胆固醇
	 */
					
	private String danguchun;
	
	/**
	 * 过敏食物
	 */
					
	private String guominshiwu;
	
	/**
	 * 疾病史
	 */
					
	private String jibingshi;
	
	/**
	 * 记录日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiluriqi;
	
	
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
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：身高
	 */
	public void setShengao(String shengao) {
		this.shengao = shengao;
	}
	/**
	 * 获取：身高
	 */
	public String getShengao() {
		return shengao;
	}
	/**
	 * 设置：体重
	 */
	public void setTizhong(String tizhong) {
		this.tizhong = tizhong;
	}
	/**
	 * 获取：体重
	 */
	public String getTizhong() {
		return tizhong;
	}
	/**
	 * 设置：血糖
	 */
	public void setXuetang(String xuetang) {
		this.xuetang = xuetang;
	}
	/**
	 * 获取：血糖
	 */
	public String getXuetang() {
		return xuetang;
	}
	/**
	 * 设置：心率
	 */
	public void setXinlv(String xinlv) {
		this.xinlv = xinlv;
	}
	/**
	 * 获取：心率
	 */
	public String getXinlv() {
		return xinlv;
	}
	/**
	 * 设置：血压
	 */
	public void setXueya(String xueya) {
		this.xueya = xueya;
	}
	/**
	 * 获取：血压
	 */
	public String getXueya() {
		return xueya;
	}
	/**
	 * 设置：胆固醇
	 */
	public void setDanguchun(String danguchun) {
		this.danguchun = danguchun;
	}
	/**
	 * 获取：胆固醇
	 */
	public String getDanguchun() {
		return danguchun;
	}
	/**
	 * 设置：过敏食物
	 */
	public void setGuominshiwu(String guominshiwu) {
		this.guominshiwu = guominshiwu;
	}
	/**
	 * 获取：过敏食物
	 */
	public String getGuominshiwu() {
		return guominshiwu;
	}
	/**
	 * 设置：疾病史
	 */
	public void setJibingshi(String jibingshi) {
		this.jibingshi = jibingshi;
	}
	/**
	 * 获取：疾病史
	 */
	public String getJibingshi() {
		return jibingshi;
	}
	/**
	 * 设置：记录日期
	 */
	public void setJiluriqi(Date jiluriqi) {
		this.jiluriqi = jiluriqi;
	}
	/**
	 * 获取：记录日期
	 */
	public Date getJiluriqi() {
		return jiluriqi;
	}

}
