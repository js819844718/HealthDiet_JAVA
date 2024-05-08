package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YingyangjibieEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YingyangjibieView;


/**
 * 营养级别
 *
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
public interface YingyangjibieService extends IService<YingyangjibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingyangjibieView> selectListView(Wrapper<YingyangjibieEntity> wrapper);
   	
   	YingyangjibieView selectView(@Param("ew") Wrapper<YingyangjibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingyangjibieEntity> wrapper);
   	

}

