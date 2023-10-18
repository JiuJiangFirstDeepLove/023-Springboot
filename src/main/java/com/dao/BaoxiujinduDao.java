package com.dao;

import com.entity.BaoxiujinduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiujinduVO;
import com.entity.view.BaoxiujinduView;


/**
 * 报修进度
 * 
 * @author 
 * @email 
 * @date 2021-05-05 21:07:46
 */
public interface BaoxiujinduDao extends BaseMapper<BaoxiujinduEntity> {
	
	List<BaoxiujinduVO> selectListVO(@Param("ew") Wrapper<BaoxiujinduEntity> wrapper);
	
	BaoxiujinduVO selectVO(@Param("ew") Wrapper<BaoxiujinduEntity> wrapper);
	
	List<BaoxiujinduView> selectListView(@Param("ew") Wrapper<BaoxiujinduEntity> wrapper);

	List<BaoxiujinduView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiujinduEntity> wrapper);
	
	BaoxiujinduView selectView(@Param("ew") Wrapper<BaoxiujinduEntity> wrapper);
	
}
