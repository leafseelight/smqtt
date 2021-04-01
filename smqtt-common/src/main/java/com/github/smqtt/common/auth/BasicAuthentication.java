package com.github.smqtt.common.auth;

/**
 * @author luxurong
 * @date 2021/3/30 13:35
 * @description 认证类
 */
public interface BasicAuthentication {

    /**
     * 认证接口
     *
     * @param userName        用户名称
     * @param passwordInBytes 密钥
     * @return
     */
    boolean auth(String userName, byte[] passwordInBytes);
}
