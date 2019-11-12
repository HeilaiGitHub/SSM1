package com.xkit.ssm.service;

import com.xkit.ssm.entity.Easybuy_product;

import java.util.List;

public interface Easybuy_productService {
    public List<Easybuy_product> qureyAllproduct();

    public int record();

    public List<Easybuy_product> qureyProductLimit(int pageIndex,int pageSize);
}
