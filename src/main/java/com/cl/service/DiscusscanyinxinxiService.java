package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusscanyinxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusscanyinxinxiView;


/**
 * 餐饮信息评论表
 *
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
public interface DiscusscanyinxinxiService extends IService<DiscusscanyinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusscanyinxinxiView> selectListView(Wrapper<DiscusscanyinxinxiEntity> wrapper);
   	
   	DiscusscanyinxinxiView selectView(@Param("ew") Wrapper<DiscusscanyinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusscanyinxinxiEntity> wrapper);
   	

}

