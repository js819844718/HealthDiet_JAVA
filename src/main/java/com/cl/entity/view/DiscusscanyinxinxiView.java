package com.cl.entity.view;

import com.cl.entity.DiscusscanyinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 餐饮信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
@TableName("discusscanyinxinxi")
public class DiscusscanyinxinxiView  extends DiscusscanyinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusscanyinxinxiView(){
	}
 
 	public DiscusscanyinxinxiView(DiscusscanyinxinxiEntity discusscanyinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusscanyinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
