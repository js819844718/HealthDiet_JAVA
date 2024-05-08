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

import com.cl.entity.YingyangjibieEntity;
import com.cl.entity.view.YingyangjibieView;

import com.cl.service.YingyangjibieService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 营养级别
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
@RestController
@RequestMapping("/yingyangjibie")
public class YingyangjibieController {
    @Autowired
    private YingyangjibieService yingyangjibieService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YingyangjibieEntity yingyangjibie,
		HttpServletRequest request){
        EntityWrapper<YingyangjibieEntity> ew = new EntityWrapper<YingyangjibieEntity>();

		PageUtils page = yingyangjibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingyangjibie), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YingyangjibieEntity yingyangjibie, 
		HttpServletRequest request){
        EntityWrapper<YingyangjibieEntity> ew = new EntityWrapper<YingyangjibieEntity>();

		PageUtils page = yingyangjibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingyangjibie), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YingyangjibieEntity yingyangjibie){
       	EntityWrapper<YingyangjibieEntity> ew = new EntityWrapper<YingyangjibieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yingyangjibie, "yingyangjibie")); 
        return R.ok().put("data", yingyangjibieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YingyangjibieEntity yingyangjibie){
        EntityWrapper< YingyangjibieEntity> ew = new EntityWrapper< YingyangjibieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yingyangjibie, "yingyangjibie")); 
		YingyangjibieView yingyangjibieView =  yingyangjibieService.selectView(ew);
		return R.ok("查询营养级别成功").put("data", yingyangjibieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YingyangjibieEntity yingyangjibie = yingyangjibieService.selectById(id);
		yingyangjibie = yingyangjibieService.selectView(new EntityWrapper<YingyangjibieEntity>().eq("id", id));
        return R.ok().put("data", yingyangjibie);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YingyangjibieEntity yingyangjibie = yingyangjibieService.selectById(id);
		yingyangjibie = yingyangjibieService.selectView(new EntityWrapper<YingyangjibieEntity>().eq("id", id));
        return R.ok().put("data", yingyangjibie);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YingyangjibieEntity yingyangjibie, HttpServletRequest request){
    	yingyangjibie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yingyangjibie);
        yingyangjibieService.insert(yingyangjibie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YingyangjibieEntity yingyangjibie, HttpServletRequest request){
    	yingyangjibie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yingyangjibie);
        yingyangjibieService.insert(yingyangjibie);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YingyangjibieEntity yingyangjibie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yingyangjibie);
        yingyangjibieService.updateById(yingyangjibie);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yingyangjibieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
