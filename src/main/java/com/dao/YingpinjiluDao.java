package com.dao;

import com.entity.YingpinjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingpinjiluVO;
import com.entity.view.YingpinjiluView;


/**
 * 应聘记录
 * 
 * @author 
 * @email 
 * @date 2023-01-28 08:43:10
 */
public interface YingpinjiluDao extends BaseMapper<YingpinjiluEntity> {
	
	List<YingpinjiluVO> selectListVO(@Param("ew") Wrapper<YingpinjiluEntity> wrapper);
	
	YingpinjiluVO selectVO(@Param("ew") Wrapper<YingpinjiluEntity> wrapper);
	
	List<YingpinjiluView> selectListView(@Param("ew") Wrapper<YingpinjiluEntity> wrapper);

	List<YingpinjiluView> selectListView(Pagination page,@Param("ew") Wrapper<YingpinjiluEntity> wrapper);
	
	YingpinjiluView selectView(@Param("ew") Wrapper<YingpinjiluEntity> wrapper);
	

}
