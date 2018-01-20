package usermanager.business.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import usermanager.business.interf.IUserBaseInfo;
import usermanager.entity.UserBaseInfo;
import usermanager.mapper.UserInfoMapper;

/**
 * 
 * @Title:
 * @Description:
 * @Author:chenmin
 * @Since:2018年1月5日
 * @Version:1.1.0
 */
@Component
public class UserBaseInfoImpl implements IUserBaseInfo
{
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public boolean validateUser(UserBaseInfo userBaseInfo)
    {
        UserBaseInfo userInfo = userInfoMapper.getUserBaseInfoByName(userBaseInfo.getUserName());
        // 当前判断用户是否正确在java中进行，也可以使用sql语句来完成。
        if (userInfo == null || userInfo.getPwd()!= userBaseInfo.getPwd()) {
            return false;
        }
        
        return true;            
    }
}
