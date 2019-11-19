package com.xkit.ssm.service;

import com.xkit.ssm.entity.EasybuyProduct;

import java.util.List;

public interface Easybuy_productService {
    public List<EasybuyProduct> qureyAllproduct();

    public int record();

    public List<EasybuyProduct> qureyProductLimit(int pageIndex,int pageSize);
}
