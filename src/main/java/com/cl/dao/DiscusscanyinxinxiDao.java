package com.cl.dao;

import com.cl.entity.DiscusscanyinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusscanyinxinxiView;


/**
 * 餐饮信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
public interface DiscusscanyinxinxiDao extends BaseMapper<DiscusscanyinxinxiEntity> {
	
	List<DiscusscanyinxinxiView> selectListView(@Param("ew") Wrapper<DiscusscanyinxinxiEntity> wrapper);

	List<DiscusscanyinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusscanyinxinxiEntity> wrapper);
	
	DiscusscanyinxinxiView selectView(@Param("ew") Wrapper<DiscusscanyinxinxiEntity> wrapper);
	

}
