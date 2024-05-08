package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.CanyinyingyangEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CanyinyingyangView;


/**
 * 餐饮营养
 *
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
public interface CanyinyingyangService extends IService<CanyinyingyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanyinyingyangView> selectListView(Wrapper<CanyinyingyangEntity> wrapper);
   	
   	CanyinyingyangView selectView(@Param("ew") Wrapper<CanyinyingyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanyinyingyangEntity> wrapper);
   	

}

