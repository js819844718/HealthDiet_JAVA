package com.cl.entity.view;

import com.cl.entity.YingyangdengjibiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 营养等级标准
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
@TableName("yingyangdengjibiaozhun")
public class YingyangdengjibiaozhunView  extends YingyangdengjibiaozhunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingyangdengjibiaozhunView(){
	}
 
 	public YingyangdengjibiaozhunView(YingyangdengjibiaozhunEntity yingyangdengjibiaozhunEntity){
 	try {
			BeanUtils.copyProperties(this, yingyangdengjibiaozhunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
