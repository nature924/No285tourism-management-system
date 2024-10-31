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


import com.dao.JingdianxinxiDao;
import com.entity.JingdianxinxiEntity;
import com.service.JingdianxinxiService;
import com.entity.vo.JingdianxinxiVO;
import com.entity.view.JingdianxinxiView;

@Service("jingdianxinxiService")
public class JingdianxinxiServiceImpl extends ServiceImpl<JingdianxinxiDao, JingdianxinxiEntity> implements JingdianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingdianxinxiEntity> page = this.selectPage(
                new Query<JingdianxinxiEntity>(params).getPage(),
                new EntityWrapper<JingdianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingdianxinxiEntity> wrapper) {
		  Page<JingdianxinxiView> page =new Query<JingdianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingdianxinxiVO> selectListVO(Wrapper<JingdianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingdianxinxiVO selectVO(Wrapper<JingdianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingdianxinxiView> selectListView(Wrapper<JingdianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingdianxinxiView selectView(Wrapper<JingdianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
