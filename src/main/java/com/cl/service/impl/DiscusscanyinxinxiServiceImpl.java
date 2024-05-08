package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.DiscusscanyinxinxiDao;
import com.cl.entity.DiscusscanyinxinxiEntity;
import com.cl.service.DiscusscanyinxinxiService;
import com.cl.entity.view.DiscusscanyinxinxiView;

@Service("discusscanyinxinxiService")
public class DiscusscanyinxinxiServiceImpl extends ServiceImpl<DiscusscanyinxinxiDao, DiscusscanyinxinxiEntity> implements DiscusscanyinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusscanyinxinxiEntity> page = this.selectPage(
                new Query<DiscusscanyinxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusscanyinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusscanyinxinxiEntity> wrapper) {
		  Page<DiscusscanyinxinxiView> page =new Query<DiscusscanyinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusscanyinxinxiView> selectListView(Wrapper<DiscusscanyinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusscanyinxinxiView selectView(Wrapper<DiscusscanyinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
