package com.dao;

import com.entity.GangweileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GangweileixingVO;
import com.entity.view.GangweileixingView;


/**
 * 岗位类型
 * 
 * @author 
 * @email 
 * @date 2023-01-28 08:43:10
 */
public interface GangweileixingDao extends BaseMapper<GangweileixingEntity> {
	
	List<GangweileixingVO> selectListVO(@Param("ew") Wrapper<GangweileixingEntity> wrapper);
	
	GangweileixingVO selectVO(@Param("ew") Wrapper<GangweileixingEntity> wrapper);
	
	List<GangweileixingView> selectListView(@Param("ew") Wrapper<GangweileixingEntity> wrapper);

	List<GangweileixingView> selectListView(Pagination page,@Param("ew") Wrapper<GangweileixingEntity> wrapper);
	
	GangweileixingView selectView(@Param("ew") Wrapper<GangweileixingEntity> wrapper);
	

}
