package usermanager.business.impl;

import usermanager.business.interf.IUserInternInfo;
import usermanager.entity.UserInternInfo;
import usermanager.mapper.UserInternInfoMapper;

public class UserInternInfoImpl implements IUserInternInfo {

	private UserInternInfoMapper userInternInfoMapper;
	@Override
	public void insertUserInternInfo(UserInternInfo userInternInfo) {
		// TODO Auto-generated method stub
		userInternInfoMapper.insertUserInternInfo(userInternInfo);
	}

	@Override
	public void updateUserInternInfo(UserInternInfo userInternInfo) {
		// TODO Auto-generated method stub
		userInternInfoMapper.updateUserInternInfo(userInternInfo);
	}

}
