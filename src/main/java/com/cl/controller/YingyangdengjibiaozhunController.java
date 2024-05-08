package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.YingyangdengjibiaozhunEntity;
import com.cl.entity.view.YingyangdengjibiaozhunView;

import com.cl.service.YingyangdengjibiaozhunService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 营养等级标准
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
@RestController
@RequestMapping("/yingyangdengjibiaozhun")
public class YingyangdengjibiaozhunController {
    @Autowired
    private YingyangdengjibiaozhunService yingyangdengjibiaozhunService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YingyangdengjibiaozhunEntity yingyangdengjibiaozhun,
		HttpServletRequest request){
        EntityWrapper<YingyangdengjibiaozhunEntity> ew = new EntityWrapper<YingyangdengjibiaozhunEntity>();

		PageUtils page = yingyangdengjibiaozhunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingyangdengjibiaozhun), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YingyangdengjibiaozhunEntity yingyangdengjibiaozhun, 
		HttpServletRequest request){
        EntityWrapper<YingyangdengjibiaozhunEntity> ew = new EntityWrapper<YingyangdengjibiaozhunEntity>();

		PageUtils page = yingyangdengjibiaozhunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingyangdengjibiaozhun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YingyangdengjibiaozhunEntity yingyangdengjibiaozhun){
       	EntityWrapper<YingyangdengjibiaozhunEntity> ew = new EntityWrapper<YingyangdengjibiaozhunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yingyangdengjibiaozhun, "yingyangdengjibiaozhun")); 
        return R.ok().put("data", yingyangdengjibiaozhunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YingyangdengjibiaozhunEntity yingyangdengjibiaozhun){
        EntityWrapper< YingyangdengjibiaozhunEntity> ew = new EntityWrapper< YingyangdengjibiaozhunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yingyangdengjibiaozhun, "yingyangdengjibiaozhun")); 
		YingyangdengjibiaozhunView yingyangdengjibiaozhunView =  yingyangdengjibiaozhunService.selectView(ew);
		return R.ok("查询营养等级标准成功").put("data", yingyangdengjibiaozhunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YingyangdengjibiaozhunEntity yingyangdengjibiaozhun = yingyangdengjibiaozhunService.selectById(id);
		yingyangdengjibiaozhun = yingyangdengjibiaozhunService.selectView(new EntityWrapper<YingyangdengjibiaozhunEntity>().eq("id", id));
        return R.ok().put("data", yingyangdengjibiaozhun);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YingyangdengjibiaozhunEntity yingyangdengjibiaozhun = yingyangdengjibiaozhunService.selectById(id);
		yingyangdengjibiaozhun = yingyangdengjibiaozhunService.selectView(new EntityWrapper<YingyangdengjibiaozhunEntity>().eq("id", id));
        return R.ok().put("data", yingyangdengjibiaozhun);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YingyangdengjibiaozhunEntity yingyangdengjibiaozhun, HttpServletRequest request){
    	yingyangdengjibiaozhun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yingyangdengjibiaozhun);
        yingyangdengjibiaozhunService.insert(yingyangdengjibiaozhun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YingyangdengjibiaozhunEntity yingyangdengjibiaozhun, HttpServletRequest request){
    	yingyangdengjibiaozhun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yingyangdengjibiaozhun);
        yingyangdengjibiaozhunService.insert(yingyangdengjibiaozhun);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YingyangdengjibiaozhunEntity yingyangdengjibiaozhun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yingyangdengjibiaozhun);
        yingyangdengjibiaozhunService.updateById(yingyangdengjibiaozhun);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yingyangdengjibiaozhunService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
