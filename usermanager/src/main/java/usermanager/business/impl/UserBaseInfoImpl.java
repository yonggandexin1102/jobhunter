package usermanager.business.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import usermanager.business.interf.IUserBaseInfo;
import usermanager.entity.UserBaseInfo;
import usermanager.mapper.UserBaseInfoMapper;

@Component
public class UserBaseInfoImpl implements IUserBaseInfo{
	@Resource
	UserBaseInfoMapper userBaseInfoMapper;
	@Override
	public void insertUserInfo(UserBaseInfo userBaseInfo) throws Exception {
		// TODO Auto-generated method stub
		userBaseInfoMapper.insertUserBaseInfo(userBaseInfo);
		
	}

	@Override
	public void updateUserInfo(UserBaseInfo userBaseInfo) throws Exception {
		// TODO Auto-generated method stub
		userBaseInfoMapper.updateUserBaseInfo(userBaseInfo);
	}

	
}
