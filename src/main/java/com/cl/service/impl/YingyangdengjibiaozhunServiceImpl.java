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


import com.cl.dao.YingyangdengjibiaozhunDao;
import com.cl.entity.YingyangdengjibiaozhunEntity;
import com.cl.service.YingyangdengjibiaozhunService;
import com.cl.entity.view.YingyangdengjibiaozhunView;

@Service("yingyangdengjibiaozhunService")
public class YingyangdengjibiaozhunServiceImpl extends ServiceImpl<YingyangdengjibiaozhunDao, YingyangdengjibiaozhunEntity> implements YingyangdengjibiaozhunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingyangdengjibiaozhunEntity> page = this.selectPage(
                new Query<YingyangdengjibiaozhunEntity>(params).getPage(),
                new EntityWrapper<YingyangdengjibiaozhunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingyangdengjibiaozhunEntity> wrapper) {
		  Page<YingyangdengjibiaozhunView> page =new Query<YingyangdengjibiaozhunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YingyangdengjibiaozhunView> selectListView(Wrapper<YingyangdengjibiaozhunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingyangdengjibiaozhunView selectView(Wrapper<YingyangdengjibiaozhunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
