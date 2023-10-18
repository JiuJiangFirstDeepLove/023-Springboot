package com.dao;

import com.entity.WuyeqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuyeqingkuangVO;
import com.entity.view.WuyeqingkuangView;


/**
 * 物业情况
 * 
 * @author 
 * @email 
 * @date 2021-05-05 21:07:46
 */
public interface WuyeqingkuangDao extends BaseMapper<WuyeqingkuangEntity> {
	
	List<WuyeqingkuangVO> selectListVO(@Param("ew") Wrapper<WuyeqingkuangEntity> wrapper);
	
	WuyeqingkuangVO selectVO(@Param("ew") Wrapper<WuyeqingkuangEntity> wrapper);
	
	List<WuyeqingkuangView> selectListView(@Param("ew") Wrapper<WuyeqingkuangEntity> wrapper);

	List<WuyeqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<WuyeqingkuangEntity> wrapper);
	
	WuyeqingkuangView selectView(@Param("ew") Wrapper<WuyeqingkuangEntity> wrapper);
	
}
