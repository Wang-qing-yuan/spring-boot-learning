package com.soft1851.springboot.mbp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.springboot.mbp.entity.SysPermission;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wqy
 * @since 2020-04-16
 */
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    List<SysPermission> selectPermission (String user_id);
}
