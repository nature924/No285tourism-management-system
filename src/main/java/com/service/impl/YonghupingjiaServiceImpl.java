package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YonghupingjiaDao;
import com.entity.YonghupingjiaEntity;
import com.service.YonghupingjiaService;
import com.entity.vo.YonghupingjiaVO;
import com.entity.view.YonghupingjiaView;

@Service("yonghupingjiaService")
public class YonghupingjiaServiceImpl extends ServiceImpl<YonghupingjiaDao, YonghupingjiaEntity> implements YonghupingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghupingjiaEntity> page = this.selectPage(
                new Query<YonghupingjiaEntity>(params).getPage(),
                new EntityWrapper<YonghupingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghupingjiaEntity> wrapper) {
		  Page<YonghupingjiaView> page =new Query<YonghupingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghupingjiaVO> selectListVO(Wrapper<YonghupingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghupingjiaVO selectVO(Wrapper<YonghupingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghupingjiaView> selectListView(Wrapper<YonghupingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghupingjiaView selectView(Wrapper<YonghupingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
