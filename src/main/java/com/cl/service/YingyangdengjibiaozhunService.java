package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YingyangdengjibiaozhunEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YingyangdengjibiaozhunView;


/**
 * 营养等级标准
 *
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
public interface YingyangdengjibiaozhunService extends IService<YingyangdengjibiaozhunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingyangdengjibiaozhunView> selectListView(Wrapper<YingyangdengjibiaozhunEntity> wrapper);
   	
   	YingyangdengjibiaozhunView selectView(@Param("ew") Wrapper<YingyangdengjibiaozhunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingyangdengjibiaozhunEntity> wrapper);
   	

}

