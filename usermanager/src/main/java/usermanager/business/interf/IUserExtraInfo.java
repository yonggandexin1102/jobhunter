package usermanager.business.interf;

import usermanager.entity.UserExtraInfo;

public interface IUserExtraInfo {

	//增加一条用户额外信息
	public void InsertUserExtraInfo(UserExtraInfo userExtraInfo);
	
	//更新一条用户额外信息
	public void updateUserExtraInfo(UserExtraInfo userExtraInfo);
}
