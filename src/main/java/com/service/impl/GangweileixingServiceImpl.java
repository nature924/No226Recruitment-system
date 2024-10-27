package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GangweileixingDao;
import com.entity.GangweileixingEntity;
import com.service.GangweileixingService;
import com.entity.vo.GangweileixingVO;
import com.entity.view.GangweileixingView;

@Service("gangweileixingService")
public class GangweileixingServiceImpl extends ServiceImpl<GangweileixingDao, GangweileixingEntity> implements GangweileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GangweileixingEntity> page = this.selectPage(
                new Query<GangweileixingEntity>(params).getPage(),
                new EntityWrapper<GangweileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GangweileixingEntity> wrapper) {
		  Page<GangweileixingView> page =new Query<GangweileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GangweileixingVO> selectListVO(Wrapper<GangweileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GangweileixingVO selectVO(Wrapper<GangweileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GangweileixingView> selectListView(Wrapper<GangweileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GangweileixingView selectView(Wrapper<GangweileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
