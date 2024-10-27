package com.entity.view;

import com.entity.YingpinjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 应聘记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-28 08:43:10
 */
@TableName("yingpinjilu")
public class YingpinjiluView  extends YingpinjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingpinjiluView(){
	}
 
 	public YingpinjiluView(YingpinjiluEntity yingpinjiluEntity){
 	try {
			BeanUtils.copyProperties(this, yingpinjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
