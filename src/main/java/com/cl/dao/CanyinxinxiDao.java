package com.cl.dao;

import com.cl.entity.CanyinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CanyinxinxiView;


/**
 * 餐饮信息
 * 
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
public interface CanyinxinxiDao extends BaseMapper<CanyinxinxiEntity> {
	
	List<CanyinxinxiView> selectListView(@Param("ew") Wrapper<CanyinxinxiEntity> wrapper);

	List<CanyinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CanyinxinxiEntity> wrapper);
	
	CanyinxinxiView selectView(@Param("ew") Wrapper<CanyinxinxiEntity> wrapper);
	

}
