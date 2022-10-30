package com.zhengxiaolong.springcloudeurekaprovider8001.service.impl;

import com.zhengxiaolong.springcloudcommon.entity.Dept;
import com.zhengxiaolong.springcloudeurekaprovider8001.mapper.DeptMapper;
import com.zhengxiaolong.springcloudeurekaprovider8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public Dept get(Integer deptNo) {
        return deptMapper.selectByPrimaryKey(deptNo);
    }
    @Override
    public List<Dept> selectAll() {
        return deptMapper.GetAll();
    }
}
