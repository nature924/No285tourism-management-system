package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JingdianxinxiEntity;
import com.entity.view.JingdianxinxiView;

import com.service.JingdianxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 景点信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-17 10:00:42
 */
@RestController
@RequestMapping("/jingdianxinxi")
public class JingdianxinxiController {
    @Autowired
    private JingdianxinxiService jingdianxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JingdianxinxiEntity jingdianxinxi,
		HttpServletRequest request){
        EntityWrapper<JingdianxinxiEntity> ew = new EntityWrapper<JingdianxinxiEntity>();
		PageUtils page = jingdianxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingdianxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JingdianxinxiEntity jingdianxinxi, HttpServletRequest request){
        EntityWrapper<JingdianxinxiEntity> ew = new EntityWrapper<JingdianxinxiEntity>();
		PageUtils page = jingdianxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingdianxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JingdianxinxiEntity jingdianxinxi){
       	EntityWrapper<JingdianxinxiEntity> ew = new EntityWrapper<JingdianxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jingdianxinxi, "jingdianxinxi")); 
        return R.ok().put("data", jingdianxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JingdianxinxiEntity jingdianxinxi){
        EntityWrapper< JingdianxinxiEntity> ew = new EntityWrapper< JingdianxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jingdianxinxi, "jingdianxinxi")); 
		JingdianxinxiView jingdianxinxiView =  jingdianxinxiService.selectView(ew);
		return R.ok("查询景点信息成功").put("data", jingdianxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JingdianxinxiEntity jingdianxinxi = jingdianxinxiService.selectById(id);
        return R.ok().put("data", jingdianxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JingdianxinxiEntity jingdianxinxi = jingdianxinxiService.selectById(id);
        return R.ok().put("data", jingdianxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        JingdianxinxiEntity jingdianxinxi = jingdianxinxiService.selectById(id);
        if(type.equals("1")) {
        	jingdianxinxi.setThumbsupnum(jingdianxinxi.getThumbsupnum()+1);
        } else {
        	jingdianxinxi.setCrazilynum(jingdianxinxi.getCrazilynum()+1);
        }
        jingdianxinxiService.updateById(jingdianxinxi);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JingdianxinxiEntity jingdianxinxi, HttpServletRequest request){
    	jingdianxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingdianxinxi);
        jingdianxinxiService.insert(jingdianxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody JingdianxinxiEntity jingdianxinxi, HttpServletRequest request){
    	jingdianxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingdianxinxi);
        jingdianxinxiService.insert(jingdianxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JingdianxinxiEntity jingdianxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jingdianxinxi);
        jingdianxinxiService.updateById(jingdianxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jingdianxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JingdianxinxiEntity> wrapper = new EntityWrapper<JingdianxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jingdianxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
