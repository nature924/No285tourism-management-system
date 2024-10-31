package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghupingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghupingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghupingjiaView;


/**
 * 用户评价
 *
 * @author 
 * @email 
 * @date 2021-04-17 10:00:42
 */
public interface YonghupingjiaService extends IService<YonghupingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghupingjiaVO> selectListVO(Wrapper<YonghupingjiaEntity> wrapper);
   	
   	YonghupingjiaVO selectVO(@Param("ew") Wrapper<YonghupingjiaEntity> wrapper);
   	
   	List<YonghupingjiaView> selectListView(Wrapper<YonghupingjiaEntity> wrapper);
   	
   	YonghupingjiaView selectView(@Param("ew") Wrapper<YonghupingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghupingjiaEntity> wrapper);
   	
}

