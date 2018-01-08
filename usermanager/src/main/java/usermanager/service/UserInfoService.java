package usermanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import usermanager.business.interf.IUserBaseInfo;
import usermanager.entity.UserBaseInfo;

/**
 * 
 * @Title:
 * @Description:
 * @Author:chenmin
 * @Since:2018年1月5日
 * @Version:1.1.0
 */
@RestController
@RequestMapping("/userManager/userBaseInfo")
public class UserInfoService
{
    private IUserBaseInfo userBaseInfo;
    
    @Autowired
    public UserInfoService(IUserBaseInfo userBaseInfo)
    {
        super();
        this.userBaseInfo = userBaseInfo;
    }

    @RequestMapping("/greeting")
    public UserBaseInfo getBaseInfo(@RequestParam(value = "id") String id)
    {
        return null;
        
    }
    
    public IUserBaseInfo getUserBaseInfo()
    {
        return userBaseInfo;
    }

    public void setUserBaseInfo(IUserBaseInfo userBaseInfo)
    {
        this.userBaseInfo = userBaseInfo;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/verify-user")
    public boolean verifyUser(@RequestBody UserBaseInfo userBaseInfo) {
        System.out.println(userBaseInfo.getUserId());
        return this.userBaseInfo.validateUser(userBaseInfo);
    }
}
