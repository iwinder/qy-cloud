package com.windcoder.qy.moudle.system.biz.service.impl;

import com.windcoder.qy.common.core.entity.PageResult;
import com.windcoder.qy.module.system.api.dto.UserPageReqDTO;
import com.windcoder.qy.module.system.api.dto.UserSaveReqDTO;
import com.windcoder.qy.module.system.dao.entity.user.SysUserDO;
import com.windcoder.qy.moudle.system.biz.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SysUserServiceImpl implements SysUserService {
    @Override
    public Long createUser(UserSaveReqDTO createReqDTO) {
        return null;
    }

    @Override
    public void updateUser(UserSaveReqDTO updateReqDTO) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public SysUserDO selectUser(Long id) {
        return null;
    }

    @Override
    public SysUserDO selectUserByUsername(String username) {
        return null;
    }

    @Override
    public PageResult<SysUserDO> selectUserPage(UserPageReqDTO reqDTO) {
        return null;
    }
}
