package com.funtl.myshop.commons.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.funtl.myshop.commons.domain.TbUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbUserMapper extends BaseMapper<TbUser> {
    TbUser selectByPrimaryKey(long id);
}
