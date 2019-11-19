package com.xkit.ssm.dao;

import com.xkit.ssm.entity.EasybuyUserAddress;
import com.xkit.ssm.entity.EasybuyUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EasybuyUserAddressMapper {
    long countByExample(EasybuyUserAddressExample example);

    int deleteByExample(EasybuyUserAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EasybuyUserAddress record);

    int insertSelective(EasybuyUserAddress record);

    List<EasybuyUserAddress> selectByExample(EasybuyUserAddressExample example);

    EasybuyUserAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EasybuyUserAddress record, @Param("example") EasybuyUserAddressExample example);

    int updateByExample(@Param("record") EasybuyUserAddress record, @Param("example") EasybuyUserAddressExample example);

    int updateByPrimaryKeySelective(EasybuyUserAddress record);

    int updateByPrimaryKey(EasybuyUserAddress record);
}