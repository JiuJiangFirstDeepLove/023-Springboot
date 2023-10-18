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


import com.dao.BaoxiujinduDao;
import com.entity.BaoxiujinduEntity;
import com.service.BaoxiujinduService;
import com.entity.vo.BaoxiujinduVO;
import com.entity.view.BaoxiujinduView;

@Service("baoxiujinduService")
public class BaoxiujinduServiceImpl extends ServiceImpl<BaoxiujinduDao, BaoxiujinduEntity> implements BaoxiujinduService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiujinduEntity> page = this.selectPage(
                new Query<BaoxiujinduEntity>(params).getPage(),
                new EntityWrapper<BaoxiujinduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiujinduEntity> wrapper) {
		  Page<BaoxiujinduView> page =new Query<BaoxiujinduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiujinduVO> selectListVO(Wrapper<BaoxiujinduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiujinduVO selectVO(Wrapper<BaoxiujinduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiujinduView> selectListView(Wrapper<BaoxiujinduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiujinduView selectView(Wrapper<BaoxiujinduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
