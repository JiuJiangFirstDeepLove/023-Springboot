package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiujinduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiujinduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiujinduView;


/**
 * 报修进度
 *
 * @author 
 * @email 
 * @date 2021-05-05 21:07:46
 */
public interface BaoxiujinduService extends IService<BaoxiujinduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiujinduVO> selectListVO(Wrapper<BaoxiujinduEntity> wrapper);
   	
   	BaoxiujinduVO selectVO(@Param("ew") Wrapper<BaoxiujinduEntity> wrapper);
   	
   	List<BaoxiujinduView> selectListView(Wrapper<BaoxiujinduEntity> wrapper);
   	
   	BaoxiujinduView selectView(@Param("ew") Wrapper<BaoxiujinduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiujinduEntity> wrapper);
   	
}

