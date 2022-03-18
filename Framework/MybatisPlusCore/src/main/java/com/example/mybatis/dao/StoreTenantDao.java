package com.example.mybatis.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatis.entity.StoreTenant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 店铺-租户 Mapper 接口
 * </p>
 *
 * @author 1246263205@qq.com
 * @since 2022-03-17
 */
@Mapper
public interface StoreTenantDao extends BaseMapper<StoreTenant> {

    @Select("select * from ec_store_tenant where id=#{id} ")
    List<StoreTenant> selectOneById(@Param("id") Integer id);

    @Select("select * from ec_store_tenant where store_name= #{name} ")
    List<StoreTenant> selectOneByName(@Param("name") String name);


}
