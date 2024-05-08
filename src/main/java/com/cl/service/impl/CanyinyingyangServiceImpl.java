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


import com.cl.dao.CanyinyingyangDao;
import com.cl.entity.CanyinyingyangEntity;
import com.cl.service.CanyinyingyangService;
import com.cl.entity.view.CanyinyingyangView;

@Service("canyinyingyangService")
public class CanyinyingyangServiceImpl extends ServiceImpl<CanyinyingyangDao, CanyinyingyangEntity> implements CanyinyingyangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanyinyingyangEntity> page = this.selectPage(
                new Query<CanyinyingyangEntity>(params).getPage(),
                new EntityWrapper<CanyinyingyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanyinyingyangEntity> wrapper) {
		  Page<CanyinyingyangView> page =new Query<CanyinyingyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<CanyinyingyangView> selectListView(Wrapper<CanyinyingyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanyinyingyangView selectView(Wrapper<CanyinyingyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
