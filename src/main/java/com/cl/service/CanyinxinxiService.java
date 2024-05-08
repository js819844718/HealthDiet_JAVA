package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.CanyinxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CanyinxinxiView;


/**
 * 餐饮信息
 *
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
public interface CanyinxinxiService extends IService<CanyinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanyinxinxiView> selectListView(Wrapper<CanyinxinxiEntity> wrapper);
   	
   	CanyinxinxiView selectView(@Param("ew") Wrapper<CanyinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanyinxinxiEntity> wrapper);
   	

}

