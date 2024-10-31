package com.dao;

import com.entity.YonghupingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghupingjiaVO;
import com.entity.view.YonghupingjiaView;


/**
 * 用户评价
 * 
 * @author 
 * @email 
 * @date 2021-04-17 10:00:42
 */
public interface YonghupingjiaDao extends BaseMapper<YonghupingjiaEntity> {
	
	List<YonghupingjiaVO> selectListVO(@Param("ew") Wrapper<YonghupingjiaEntity> wrapper);
	
	YonghupingjiaVO selectVO(@Param("ew") Wrapper<YonghupingjiaEntity> wrapper);
	
	List<YonghupingjiaView> selectListView(@Param("ew") Wrapper<YonghupingjiaEntity> wrapper);

	List<YonghupingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<YonghupingjiaEntity> wrapper);
	
	YonghupingjiaView selectView(@Param("ew") Wrapper<YonghupingjiaEntity> wrapper);
	
}
