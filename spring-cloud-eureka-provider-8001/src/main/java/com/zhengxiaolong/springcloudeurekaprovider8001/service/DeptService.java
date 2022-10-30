package com.zhengxiaolong.springcloudeurekaprovider8001.service;

import com.zhengxiaolong.springcloudcommon.entity.Dept;

import java.util.List;

public interface DeptService {
    Dept get(Integer deptNo);
    List<Dept> selectAll();
}
