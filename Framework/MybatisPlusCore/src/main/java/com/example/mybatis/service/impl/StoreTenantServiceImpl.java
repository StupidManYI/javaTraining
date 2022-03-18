package com.example.mybatis.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatis.dao.StoreTenantDao;
import com.example.mybatis.dao.StoreTenantMysqlConfigDao;
import com.example.mybatis.entity.StoreTenant;
import com.example.mybatis.service.StoreTenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 店铺-租户 服务实现类
 * </p>
 *
 * @author 1246263205@qq.com
 * @since 2022-03-17
 */
@Service
public class StoreTenantServiceImpl extends ServiceImpl<StoreTenantDao, StoreTenant> implements StoreTenantService {

    @Autowired
    private StoreTenantDao storeTenantDao;

    @Autowired
    private StoreTenantMysqlConfigDao storeTenantMysqlConfigDao;

    @Override
    public Object getOne(String name) {
        return storeTenantDao.selectOneByName(name );
    }

    @Override
    public Object getOne(Integer id) {
        return storeTenantDao.selectOneById(id);
    }


}
