package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChatEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChatVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChatView;


/**
 * 客服聊天表
 *
 * @author 
 * @email 
 * @date 2024-03-29 14:22:10
 */
public interface ChatService extends IService<ChatEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChatVO> selectListVO(Wrapper<ChatEntity> wrapper);
   	
   	ChatVO selectVO(@Param("ew") Wrapper<ChatEntity> wrapper);
   	
   	List<ChatView> selectListView(Wrapper<ChatEntity> wrapper);
   	
   	ChatView selectView(@Param("ew") Wrapper<ChatEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChatEntity> wrapper);
   	
}

//该接口扩展了MyBatis-Plus框架提供的IService接口，并提供了一系列方法用于操作客服聊天表（ChatEntity）的数据。