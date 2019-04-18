package com.hym.mapper;

import com.hym.po.Specil;

import java.util.List;
import java.util.Map;

public interface SpecilMapper {
    //分页查询
    List<Specil> findSpecilSplit(Map<String,Object> map);
}
