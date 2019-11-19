package com.xkit.ssm.dao;

import com.xkit.ssm.entity.EasybuyUser;
import com.xkit.ssm.entity.EasybuyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EasybuyUserMapper {
    long countByExample(EasybuyUserExample example);

    int deleteByExample(EasybuyUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EasybuyUser record);

    int insertSelective(EasybuyUser record);

    List<EasybuyUser> selectByExample(EasybuyUserExample example);

    EasybuyUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EasybuyUser record, @Param("example") EasybuyUserExample example);

    int updateByExample(@Param("record") EasybuyUser record, @Param("example") EasybuyUserExample example);

    int updateByPrimaryKeySelective(EasybuyUser record);

    int updateByPrimaryKey(EasybuyUser record);

    public EasybuyUser Login(EasybuyUser user);

    public List<EasybuyUser> selectUser();

    public int qureyUser(String name);

    public List<EasybuyUser> selectUserBypage(@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize,@Param("user") EasybuyUser user);

    public int count(EasybuyUser user);

    public int deleteUser(int id);
}