package com.xkit.ssm.service.impl;

import com.xkit.ssm.dao.EasybuyProductMapper;
import com.xkit.ssm.entity.EasybuyProduct;
import com.xkit.ssm.service.Easybuy_productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Easybuy_productServiceimpl implements Easybuy_productService {

    @Autowired
    private EasybuyProductMapper dao;

    @Override
    public List<EasybuyProduct> qureyAllproduct() {
        return dao.qureyAllproduct();
    }

    @Override
    public int record() {
        return dao.record();
    }

    @Override
    public List<EasybuyProduct> qureyProductLimit(int pageIndex, int pageSize) {
        return dao.qureyProductLimit((pageIndex-1)*pageSize,pageSize);
    }
}
