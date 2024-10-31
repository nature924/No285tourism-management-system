package com.dao;

import com.entity.DingpiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingpiaoxinxiVO;
import com.entity.view.DingpiaoxinxiView;


/**
 * 订票信息
 * 
 * @author 
 * @email 
 * @date 2021-04-17 10:00:42
 */
public interface DingpiaoxinxiDao extends BaseMapper<DingpiaoxinxiEntity> {
	
	List<DingpiaoxinxiVO> selectListVO(@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);
	
	DingpiaoxinxiVO selectVO(@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);
	
	List<DingpiaoxinxiView> selectListView(@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);

	List<DingpiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);
	
	DingpiaoxinxiView selectView(@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);
	
}
