package com.windcoder.qy.moudle.system.biz.service;

import com.windcoder.qy.common.core.entity.PageResult;
import com.windcoder.qy.module.system.api.dto.UserPageReqDTO;
import com.windcoder.qy.module.system.api.dto.UserSaveReqDTO;
import com.windcoder.qy.module.system.dao.entity.user.SysUserDO;
import jakarta.validation.Valid;

public interface SysUserService {
    /**
     * 创建用户
     *
     * @param createReqDTO 用户信息
     * @return 用户编号
     */
    Long createUser(@Valid UserSaveReqDTO createReqDTO);

    /**
     * 修改用户
     *
     * @param updateReqDTO 用户信息
     */
    void updateUser(@Valid UserSaveReqDTO updateReqDTO);

    /**
     * 删除用户
     *
     * @param id 用户编号
     */
    void deleteUser(Long id);

    /**
     * 通过用户 ID 查询用户
     *
     * @param id 用户ID
     * @return 用户对象信息
     */
    SysUserDO selectUser(Long id);

    /**
     * 通过用户名查询用户
     *
     * @param username 用户名
     * @return 用户对象信息
     */
    SysUserDO selectUserByUsername(String username);

    /**
     * 获得用户分页列表
     *
     * @param reqDTO 分页条件
     * @return 分页列表
     */
    PageResult<SysUserDO> selectUserPage(UserPageReqDTO reqDTO);

}
