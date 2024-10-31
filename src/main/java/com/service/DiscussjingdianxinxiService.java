package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingdianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingdianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingdianxinxiView;


/**
 * 景点信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 10:00:42
 */
public interface DiscussjingdianxinxiService extends IService<DiscussjingdianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingdianxinxiVO> selectListVO(Wrapper<DiscussjingdianxinxiEntity> wrapper);
   	
   	DiscussjingdianxinxiVO selectVO(@Param("ew") Wrapper<DiscussjingdianxinxiEntity> wrapper);
   	
   	List<DiscussjingdianxinxiView> selectListView(Wrapper<DiscussjingdianxinxiEntity> wrapper);
   	
   	DiscussjingdianxinxiView selectView(@Param("ew") Wrapper<DiscussjingdianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingdianxinxiEntity> wrapper);
   	
}

