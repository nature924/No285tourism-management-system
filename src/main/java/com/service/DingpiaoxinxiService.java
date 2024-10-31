package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingpiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingpiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingpiaoxinxiView;


/**
 * 订票信息
 *
 * @author 
 * @email 
 * @date 2021-04-17 10:00:42
 */
public interface DingpiaoxinxiService extends IService<DingpiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingpiaoxinxiVO> selectListVO(Wrapper<DingpiaoxinxiEntity> wrapper);
   	
   	DingpiaoxinxiVO selectVO(@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);
   	
   	List<DingpiaoxinxiView> selectListView(Wrapper<DingpiaoxinxiEntity> wrapper);
   	
   	DingpiaoxinxiView selectView(@Param("ew") Wrapper<DingpiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingpiaoxinxiEntity> wrapper);
   	
}

