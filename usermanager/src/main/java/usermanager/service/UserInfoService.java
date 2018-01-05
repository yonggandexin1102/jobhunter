package usermanager.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
public class UserInfoService
{
    
    @RequestMapping("/greeting")
    public UserBaseInfo getBaseInfo(@RequestParam(value = "id") String id)
    {
        return null;
        
    }
}
