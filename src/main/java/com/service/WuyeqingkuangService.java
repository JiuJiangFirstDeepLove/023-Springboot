package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuyeqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuyeqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuyeqingkuangView;


/**
 * 物业情况
 *
 * @author 
 * @email 
 * @date 2021-05-05 21:07:46
 */
public interface WuyeqingkuangService extends IService<WuyeqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuyeqingkuangVO> selectListVO(Wrapper<WuyeqingkuangEntity> wrapper);
   	
   	WuyeqingkuangVO selectVO(@Param("ew") Wrapper<WuyeqingkuangEntity> wrapper);
   	
   	List<WuyeqingkuangView> selectListView(Wrapper<WuyeqingkuangEntity> wrapper);
   	
   	WuyeqingkuangView selectView(@Param("ew") Wrapper<WuyeqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuyeqingkuangEntity> wrapper);
   	
}

