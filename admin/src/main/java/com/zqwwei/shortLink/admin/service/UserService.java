package com.zqwwei.shortLink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zqwwei.shortLink.admin.dao.entity.UserDO;
import com.zqwwei.shortLink.admin.dto.resp.UserRespDTO;

/**
 * User Interface Layer
 */
public interface UserService extends IService<UserDO> {
    /**
     * get user info given its username
     *
     * @param username
     * @return user response entity
     */
    UserRespDTO getUserByUsername(String username);
}
