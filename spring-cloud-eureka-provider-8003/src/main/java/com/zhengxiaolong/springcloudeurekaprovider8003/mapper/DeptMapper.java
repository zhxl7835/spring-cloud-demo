package com.zhengxiaolong.springcloudeurekaprovider8003.mapper;

import com.zhengxiaolong.springcloudcommon.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    //根据主键获取数据
    Dept selectByPrimaryKey(Integer deptNo);
    //获取表中的全部数据
    List<Dept> GetAll();
}