package com.xkit.ssm.dao;

import com.xkit.ssm.entity.Easybuy_product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Easybuy_productDAO {
    public List<Easybuy_product> qureyAllproduct();

    public int record();

    public List<Easybuy_product> qureyProductLimit(@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize);

}
