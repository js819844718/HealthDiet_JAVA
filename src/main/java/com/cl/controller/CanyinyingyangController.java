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

import com.cl.entity.CanyinyingyangEntity;
import com.cl.entity.view.CanyinyingyangView;

import com.cl.service.CanyinyingyangService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * @deprecated 餐饮营养 后端接口
 * @author zhangjiangshuai
 * @date 2024-04-30
 *
 */

@RestController
@RequestMapping("/canyinyingyang")
public class CanyinyingyangController {
    @Autowired
    private CanyinyingyangService canyinyingyangService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CanyinyingyangEntity canyinyingyang,
                @RequestParam(required = false) Double kalulistart,
                @RequestParam(required = false) Double kaluliend,
		HttpServletRequest request){
        EntityWrapper<CanyinyingyangEntity> ew = new EntityWrapper<CanyinyingyangEntity>();
                if(kalulistart!=null) ew.ge("kaluli", kalulistart);
                if(kaluliend!=null) ew.le("kaluli", kaluliend);

		PageUtils page = canyinyingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canyinyingyang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CanyinyingyangEntity canyinyingyang, 
                @RequestParam(required = false) Double kalulistart,
                @RequestParam(required = false) Double kaluliend,
		HttpServletRequest request){
        EntityWrapper<CanyinyingyangEntity> ew = new EntityWrapper<CanyinyingyangEntity>();
                if(kalulistart!=null) ew.ge("kaluli", kalulistart);
                if(kaluliend!=null) ew.le("kaluli", kaluliend);

		PageUtils page = canyinyingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canyinyingyang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CanyinyingyangEntity canyinyingyang){
       	EntityWrapper<CanyinyingyangEntity> ew = new EntityWrapper<CanyinyingyangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( canyinyingyang, "canyinyingyang")); 
        return R.ok().put("data", canyinyingyangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CanyinyingyangEntity canyinyingyang){
        EntityWrapper< CanyinyingyangEntity> ew = new EntityWrapper< CanyinyingyangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( canyinyingyang, "canyinyingyang")); 
		CanyinyingyangView canyinyingyangView =  canyinyingyangService.selectView(ew);
		return R.ok("查询餐饮营养成功").put("data", canyinyingyangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CanyinyingyangEntity canyinyingyang = canyinyingyangService.selectById(id);
		canyinyingyang = canyinyingyangService.selectView(new EntityWrapper<CanyinyingyangEntity>().eq("id", id));
        return R.ok().put("data", canyinyingyang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CanyinyingyangEntity canyinyingyang = canyinyingyangService.selectById(id);
		canyinyingyang = canyinyingyangService.selectView(new EntityWrapper<CanyinyingyangEntity>().eq("id", id));
        return R.ok().put("data", canyinyingyang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CanyinyingyangEntity canyinyingyang, HttpServletRequest request){
    	canyinyingyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(canyinyingyang);
        canyinyingyangService.insert(canyinyingyang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CanyinyingyangEntity canyinyingyang, HttpServletRequest request){
    	canyinyingyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(canyinyingyang);
        canyinyingyangService.insert(canyinyingyang);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CanyinyingyangEntity canyinyingyang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(canyinyingyang);
        canyinyingyangService.updateById(canyinyingyang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        canyinyingyangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
