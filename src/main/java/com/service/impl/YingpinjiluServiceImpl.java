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


import com.dao.YingpinjiluDao;
import com.entity.YingpinjiluEntity;
import com.service.YingpinjiluService;
import com.entity.vo.YingpinjiluVO;
import com.entity.view.YingpinjiluView;

@Service("yingpinjiluService")
public class YingpinjiluServiceImpl extends ServiceImpl<YingpinjiluDao, YingpinjiluEntity> implements YingpinjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingpinjiluEntity> page = this.selectPage(
                new Query<YingpinjiluEntity>(params).getPage(),
                new EntityWrapper<YingpinjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingpinjiluEntity> wrapper) {
		  Page<YingpinjiluView> page =new Query<YingpinjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingpinjiluVO> selectListVO(Wrapper<YingpinjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingpinjiluVO selectVO(Wrapper<YingpinjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingpinjiluView> selectListView(Wrapper<YingpinjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingpinjiluView selectView(Wrapper<YingpinjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
