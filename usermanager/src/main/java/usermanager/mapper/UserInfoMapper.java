package usermanager.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
@Mapper
public interface UserInfoMapper
{
    /**
     * 根据用户名查询用户的基本信息
     * 
     * @param Name
     * @return
     * @Description:
     */
    @Select("SELECT UUID,USERNAME,U_PASSWORD FROM tbl_user_base_info where username = #{userName}")
    UserBaseInfo getUserBaseInfoByName(@Param("userName")String Name);
}
