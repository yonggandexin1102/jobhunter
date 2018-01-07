package usermanager.mapper;

import org.apache.ibatis.annotations.Select;

import usermanager.entity.UserBaseInfo;

/**
 * 用户信息的
 * 
 * @Title:
 * @Description:
 * @Author:chenmin
 * @Since:2018年1月7日
 * @Version:1.1.0
 */
public interface UserInfoMapper
{
    /**
     * 根据用户名查询用户的基本信息
     * 
     * @param Name
     * @return
     * @Description:
     */
    @Select("SELECT userId,username,pwd FROM tbl_users")
    UserBaseInfo getUserBaseInfoByName(String Name);
}
