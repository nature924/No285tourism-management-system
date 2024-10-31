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


import com.dao.DingpiaoxinxiDao;
import com.entity.DingpiaoxinxiEntity;
import com.service.DingpiaoxinxiService;
import com.entity.vo.DingpiaoxinxiVO;
import com.entity.view.DingpiaoxinxiView;

@Service("dingpiaoxinxiService")
public class DingpiaoxinxiServiceImpl extends ServiceImpl<DingpiaoxinxiDao, DingpiaoxinxiEntity> implements DingpiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingpiaoxinxiEntity> page = this.selectPage(
                new Query<DingpiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DingpiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingpiaoxinxiEntity> wrapper) {
		  Page<DingpiaoxinxiView> page =new Query<DingpiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingpiaoxinxiVO> selectListVO(Wrapper<DingpiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingpiaoxinxiVO selectVO(Wrapper<DingpiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingpiaoxinxiView> selectListView(Wrapper<DingpiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingpiaoxinxiView selectView(Wrapper<DingpiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
