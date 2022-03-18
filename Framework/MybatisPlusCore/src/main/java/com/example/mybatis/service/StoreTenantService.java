package com.example.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatis.entity.StoreTenant;


/**
 * <p>
 * 店铺-租户 服务类
 * </p>
 *
 * @author 1246263205@qq.com
 * @since 2022-03-17
 */
public interface StoreTenantService extends IService<StoreTenant> {

    Object getOne(String name);

    Object getOne(Integer id);

}
