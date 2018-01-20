package usermanager.business.interf;

import usermanager.entity.UserBaseInfo;

public interface IUserBaseInfo {

	//插入一条用户基本信息
	public void insertUserInfo(UserBaseInfo userBaseInfo) throws Exception;
	
	//更新一条用户基本信息
	public void updateUserInfo(UserBaseInfo userBaseInfo) throws Exception;
}
