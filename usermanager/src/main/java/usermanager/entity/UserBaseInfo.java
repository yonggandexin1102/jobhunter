package usermanager.entity;

/**
 * 用户基本信息
 * 
 * @Title:
 * @Description:
 * @Author:chenmin
 * @Since:2018年1月7日
 * @Version:1.1.0
 */
public class UserBaseInfo
{
    /**
     * 用户名，本网站中唯一。
     */
    private String userName;
    
    /**
     * 用户id，用32位UUID标识
     */
    private String userId;
    
    /**
     * 用户密码
     */
    private String password;
    
    public String getUserName()
    {
        return userName;
    }
    
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    public String getUserId()
    {
        return userId;
    }
    
    public void setUserId(String userId)
    {
        this.userId = userId;
    }
    
    public String getPwd()
    {
        return password;
    }
    
    public void setPwd(String pwd)
    {
        this.password = pwd;
    }
    
}
