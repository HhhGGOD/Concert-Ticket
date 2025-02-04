package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YanchanghuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YanchanghuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YanchanghuiView;


/**
 * 演唱会
 *
 * @author 
 * @email 
 * @date 2024-03-29 14:22:10
 */
public interface YanchanghuiService extends IService<YanchanghuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YanchanghuiVO> selectListVO(Wrapper<YanchanghuiEntity> wrapper);
   	
   	YanchanghuiVO selectVO(@Param("ew") Wrapper<YanchanghuiEntity> wrapper);
   	
   	List<YanchanghuiView> selectListView(Wrapper<YanchanghuiEntity> wrapper);
   	
   	YanchanghuiView selectView(@Param("ew") Wrapper<YanchanghuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YanchanghuiEntity> wrapper);
   	
}


//接口扩展了MyBatis-Plus框架提供的IService接口，并提供了一系列方法用于操作演唱会（YanchanghuiEntity）的数据。