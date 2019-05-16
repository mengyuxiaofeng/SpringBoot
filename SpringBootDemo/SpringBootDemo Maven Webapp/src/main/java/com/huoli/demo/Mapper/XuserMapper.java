package com.huoli.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.huoli.demo.entity.Xuser;

@Mapper
public interface XuserMapper {
	List<Xuser> getAll();
    
    Xuser getOne(Long id);
 
    void insert(Xuser user);
 
    void update(Xuser user);
 
    void delete(Long id);
}
