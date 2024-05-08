package com.cl.dao;

import com.cl.entity.CanyinyingyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CanyinyingyangView;


/**
 * 餐饮营养
 * 
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
public interface CanyinyingyangDao extends BaseMapper<CanyinyingyangEntity> {
	
	List<CanyinyingyangView> selectListView(@Param("ew") Wrapper<CanyinyingyangEntity> wrapper);

	List<CanyinyingyangView> selectListView(Pagination page,@Param("ew") Wrapper<CanyinyingyangEntity> wrapper);
	
	CanyinyingyangView selectView(@Param("ew") Wrapper<CanyinyingyangEntity> wrapper);
	

}
