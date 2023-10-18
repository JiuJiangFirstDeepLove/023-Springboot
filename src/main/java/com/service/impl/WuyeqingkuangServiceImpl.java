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


import com.dao.WuyeqingkuangDao;
import com.entity.WuyeqingkuangEntity;
import com.service.WuyeqingkuangService;
import com.entity.vo.WuyeqingkuangVO;
import com.entity.view.WuyeqingkuangView;

@Service("wuyeqingkuangService")
public class WuyeqingkuangServiceImpl extends ServiceImpl<WuyeqingkuangDao, WuyeqingkuangEntity> implements WuyeqingkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuyeqingkuangEntity> page = this.selectPage(
                new Query<WuyeqingkuangEntity>(params).getPage(),
                new EntityWrapper<WuyeqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuyeqingkuangEntity> wrapper) {
		  Page<WuyeqingkuangView> page =new Query<WuyeqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuyeqingkuangVO> selectListVO(Wrapper<WuyeqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuyeqingkuangVO selectVO(Wrapper<WuyeqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuyeqingkuangView> selectListView(Wrapper<WuyeqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuyeqingkuangView selectView(Wrapper<WuyeqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
