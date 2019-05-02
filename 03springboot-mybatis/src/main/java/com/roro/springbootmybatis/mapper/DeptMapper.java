package com.roro.springbootmybatis.mapper;

import com.roro.springbootmybatis.bean.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {


    Dept findOne(Integer id);

    List<Dept> list();

    int save(Dept dept);

}
