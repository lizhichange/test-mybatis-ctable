package com.example.testmybatisctable.dal.dao;

import com.example.testmybatisctable.dal.model.WechatUser;
import com.example.testmybatisctable.dal.model.WechatUserExample;


import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatUserMapper {
    int insert(WechatUser record);

    int insertSelective(WechatUser record);

    List<WechatUser> selectByExample(WechatUserExample example);

    WechatUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WechatUser record, @Param("example") WechatUserExample example);

    int updateByExample(@Param("record") WechatUser record, @Param("example") WechatUserExample example);

    int updateByPrimaryKeySelective(WechatUser record);

    int updateByPrimaryKey(WechatUser record);

    int deleteByPrimaryKey(String userId);
}