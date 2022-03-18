package com.example.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 店铺-租户
 * </p>
 *
 * @author 1246263205@qq.com
 * @since 2022-03-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ec_store_tenant")
public class StoreTenant implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer storeId;

    private String storeName;

    private LocalDateTime updateTime;

    private LocalDateTime createTime;

    private Boolean deleteStatus;

    private String remark;


    public static final String ID = "id";

    public static final String STORE_ID = "store_id";

    public static final String STORE_NAME = "store_name";

    public static final String UPDATE_TIME = "update_time";

    public static final String CREATE_TIME = "create_time";

    public static final String DELETE_STATUS = "delete_status";

    public static final String REMARK = "remark";

}
