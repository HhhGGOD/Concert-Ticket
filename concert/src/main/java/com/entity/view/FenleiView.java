package com.entity.view;

import com.entity.FenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-29 14:22:10
 */
@TableName("fenlei")
public class FenleiView  extends FenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FenleiView(){
	}
 
 	public FenleiView(FenleiEntity fenleiEntity){
 	try {
			BeanUtils.copyProperties(this, fenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}


//后端将数据库中的分类表数据转换为视图实体，以便后续返回给前端或进行其他操作。