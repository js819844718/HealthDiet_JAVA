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

import com.cl.entity.CanyinxinxiEntity;
import com.cl.entity.view.CanyinxinxiView;

import com.cl.service.CanyinxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 餐饮信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-30 22:48:25
 */
@RestController
@RequestMapping("/canyinxinxi")
public class CanyinxinxiController {
    @Autowired
    private CanyinxinxiService canyinxinxiService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CanyinxinxiEntity canyinxinxi,
		HttpServletRequest request){
        EntityWrapper<CanyinxinxiEntity> ew = new EntityWrapper<CanyinxinxiEntity>();

		PageUtils page = canyinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canyinxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CanyinxinxiEntity canyinxinxi, 
		HttpServletRequest request){
        EntityWrapper<CanyinxinxiEntity> ew = new EntityWrapper<CanyinxinxiEntity>();

		PageUtils page = canyinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canyinxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CanyinxinxiEntity canyinxinxi){
       	EntityWrapper<CanyinxinxiEntity> ew = new EntityWrapper<CanyinxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( canyinxinxi, "canyinxinxi")); 
        return R.ok().put("data", canyinxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CanyinxinxiEntity canyinxinxi){
        EntityWrapper< CanyinxinxiEntity> ew = new EntityWrapper< CanyinxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( canyinxinxi, "canyinxinxi")); 
		CanyinxinxiView canyinxinxiView =  canyinxinxiService.selectView(ew);
		return R.ok("查询餐饮信息成功").put("data", canyinxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CanyinxinxiEntity canyinxinxi = canyinxinxiService.selectById(id);
		canyinxinxi.setClicktime(new Date());
		canyinxinxiService.updateById(canyinxinxi);
		canyinxinxi = canyinxinxiService.selectView(new EntityWrapper<CanyinxinxiEntity>().eq("id", id));
        return R.ok().put("data", canyinxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CanyinxinxiEntity canyinxinxi = canyinxinxiService.selectById(id);
		canyinxinxi.setClicktime(new Date());
		canyinxinxiService.updateById(canyinxinxi);
		canyinxinxi = canyinxinxiService.selectView(new EntityWrapper<CanyinxinxiEntity>().eq("id", id));
        return R.ok().put("data", canyinxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CanyinxinxiEntity canyinxinxi, HttpServletRequest request){
    	canyinxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(canyinxinxi);
        canyinxinxiService.insert(canyinxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CanyinxinxiEntity canyinxinxi, HttpServletRequest request){
    	canyinxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(canyinxinxi);
        canyinxinxiService.insert(canyinxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CanyinxinxiEntity canyinxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(canyinxinxi);
        canyinxinxiService.updateById(canyinxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        canyinxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,CanyinxinxiEntity canyinxinxi, HttpServletRequest request,String pre){
        EntityWrapper<CanyinxinxiEntity> ew = new EntityWrapper<CanyinxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = canyinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canyinxinxi), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 按收藏推荐
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,CanyinxinxiEntity canyinxinxi, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "yingyangjibie";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "canyinxinxi").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<CanyinxinxiEntity> canyinxinxiList = new ArrayList<CanyinxinxiEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                canyinxinxiList.addAll(canyinxinxiService.selectList(new EntityWrapper<CanyinxinxiEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<CanyinxinxiEntity> ew = new EntityWrapper<CanyinxinxiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = canyinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canyinxinxi), params), params));
        List<CanyinxinxiEntity> pageList = (List<CanyinxinxiEntity>)page.getList();
        if(canyinxinxiList.size()<limit) {
            int toAddNum = (limit-canyinxinxiList.size())<=pageList.size()?(limit-canyinxinxiList.size()):pageList.size();
            for(CanyinxinxiEntity o1 : pageList) {
                boolean addFlag = true;
                for(CanyinxinxiEntity o2 : canyinxinxiList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    canyinxinxiList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(canyinxinxiList.size()>limit) {
            canyinxinxiList = canyinxinxiList.subList(0, limit);
        }
        page.setList(canyinxinxiList);
        return R.ok().put("data", page);
    }







}
