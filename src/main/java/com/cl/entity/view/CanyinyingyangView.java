package com.cl.entity.view;

import com.cl.entity.CanyinyingyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 餐饮营养
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
@TableName("canyinyingyang")
public class CanyinyingyangView  extends CanyinyingyangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CanyinyingyangView(){
	}
 
 	public CanyinyingyangView(CanyinyingyangEntity canyinyingyangEntity){
 	try {
			BeanUtils.copyProperties(this, canyinyingyangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
