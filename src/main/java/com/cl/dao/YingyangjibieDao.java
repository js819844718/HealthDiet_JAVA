package com.cl.dao;

import com.cl.entity.YingyangjibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YingyangjibieView;


/**
 * 营养级别
 * 
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
public interface YingyangjibieDao extends BaseMapper<YingyangjibieEntity> {
	
	List<YingyangjibieView> selectListView(@Param("ew") Wrapper<YingyangjibieEntity> wrapper);

	List<YingyangjibieView> selectListView(Pagination page,@Param("ew") Wrapper<YingyangjibieEntity> wrapper);
	
	YingyangjibieView selectView(@Param("ew") Wrapper<YingyangjibieEntity> wrapper);
	

}
