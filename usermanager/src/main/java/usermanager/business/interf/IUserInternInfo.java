package usermanager.business.interf;

import usermanager.entity.UserInternInfo;

public interface IUserInternInfo {

	//增加一条用户实习信息
	public void insertUserInternInfo(UserInternInfo userInternInfo);
	
	//更新一条用户实习信息
	public void updateUserInternInfo(UserInternInfo userInternInfo);
	
}
