package com.cl.dao;

import com.cl.entity.YingyangdengjibiaozhunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YingyangdengjibiaozhunView;


/**
 * 营养等级标准
 * 
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
public interface YingyangdengjibiaozhunDao extends BaseMapper<YingyangdengjibiaozhunEntity> {
	
	List<YingyangdengjibiaozhunView> selectListView(@Param("ew") Wrapper<YingyangdengjibiaozhunEntity> wrapper);

	List<YingyangdengjibiaozhunView> selectListView(Pagination page,@Param("ew") Wrapper<YingyangdengjibiaozhunEntity> wrapper);
	
	YingyangdengjibiaozhunView selectView(@Param("ew") Wrapper<YingyangdengjibiaozhunEntity> wrapper);
	

}
