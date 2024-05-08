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


import com.cl.dao.YingyangjibieDao;
import com.cl.entity.YingyangjibieEntity;
import com.cl.service.YingyangjibieService;
import com.cl.entity.view.YingyangjibieView;

@Service("yingyangjibieService")
public class YingyangjibieServiceImpl extends ServiceImpl<YingyangjibieDao, YingyangjibieEntity> implements YingyangjibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingyangjibieEntity> page = this.selectPage(
                new Query<YingyangjibieEntity>(params).getPage(),
                new EntityWrapper<YingyangjibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingyangjibieEntity> wrapper) {
		  Page<YingyangjibieView> page =new Query<YingyangjibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YingyangjibieView> selectListView(Wrapper<YingyangjibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingyangjibieView selectView(Wrapper<YingyangjibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
