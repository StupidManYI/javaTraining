package com.example.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 店铺-租户-mysql-配置
 * </p>
 *
 * @author 1246263205@qq.com
 * @since 2022-03-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ec_store_tenant_mysql_config")
public class StoreTenantMysqlConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer tenantId;

    private String tenantMysqlUrl;

    private String tenantMysqlDatabaseName;

    private String tenantMysqlUsername;

    private String tenantMysqlPassword;

    private String tenantMysqlDriverClassName;

    private LocalDateTime updateTime;

    private LocalDateTime createTime;

    private Boolean deleteStatus;

    private String remark;


    public static final String ID = "id";

    public static final String TENANT_ID = "tenant_id";

    public static final String TENANT_MYSQL_URL = "tenant_mysql_url";

    public static final String TENANT_MYSQL_DATABASE_NAME = "tenant_mysql_database_name";

    public static final String TENANT_MYSQL_USERNAME = "tenant_mysql_username";

    public static final String TENANT_MYSQL_PASSWORD = "tenant_mysql_password";

    public static final String TENANT_MYSQL_DRIVER_CLASS_NAME = "tenant_mysql_driver_class_name";

    public static final String UPDATE_TIME = "update_time";

    public static final String CREATE_TIME = "create_time";

    public static final String DELETE_STATUS = "delete_status";

    public static final String REMARK = "remark";

}
