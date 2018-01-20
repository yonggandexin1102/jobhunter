package usermanager.business.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import usermanager.business.interf.IUserEduInfo;
import usermanager.entity.UserEduInfo;
import usermanager.mapper.UserEduInfoMapper;
@Component
public class UserEduInfoImpl implements IUserEduInfo{
	@Resource
	private UserEduInfoMapper userEduInfoMapper;
	
	@Override
	public void insertUserEduInfo(UserEduInfo userEduInfo) {
		// TODO Auto-generated method stub
		userEduInfoMapper.insertUserEduInfo(userEduInfo);
		
	}

	@Override
	public void updateUserEduInfo(UserEduInfo userEduInfo) {
		// TODO Auto-generated method stub
		userEduInfoMapper.updateUserEduInfo();
	}

	
}
