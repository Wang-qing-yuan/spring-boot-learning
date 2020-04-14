package com.soft1851.springboot.aop.service;

import java.util.Map;

/**
 * (SysUser)表服务接口
 *
 * @author wqy
 */
public interface SysUserService {

    /**
     * 用户登录
     * @param id
     * @param password
     * @return
     */
    Map<String,Object> signIn(String id, String password);

}