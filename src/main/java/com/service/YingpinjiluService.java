package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingpinjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingpinjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingpinjiluView;


/**
 * 应聘记录
 *
 * @author 
 * @email 
 * @date 2023-01-28 08:43:10
 */
public interface YingpinjiluService extends IService<YingpinjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingpinjiluVO> selectListVO(Wrapper<YingpinjiluEntity> wrapper);
   	
   	YingpinjiluVO selectVO(@Param("ew") Wrapper<YingpinjiluEntity> wrapper);
   	
   	List<YingpinjiluView> selectListView(Wrapper<YingpinjiluEntity> wrapper);
   	
   	YingpinjiluView selectView(@Param("ew") Wrapper<YingpinjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingpinjiluEntity> wrapper);
   	

}

