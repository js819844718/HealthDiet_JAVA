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


import com.cl.dao.CanyinxinxiDao;
import com.cl.entity.CanyinxinxiEntity;
import com.cl.service.CanyinxinxiService;
import com.cl.entity.view.CanyinxinxiView;

@Service("canyinxinxiService")
public class CanyinxinxiServiceImpl extends ServiceImpl<CanyinxinxiDao, CanyinxinxiEntity> implements CanyinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanyinxinxiEntity> page = this.selectPage(
                new Query<CanyinxinxiEntity>(params).getPage(),
                new EntityWrapper<CanyinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanyinxinxiEntity> wrapper) {
		  Page<CanyinxinxiView> page =new Query<CanyinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<CanyinxinxiView> selectListView(Wrapper<CanyinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanyinxinxiView selectView(Wrapper<CanyinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
