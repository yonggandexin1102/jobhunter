package usermanager.business.interf;

import usermanager.entity.UserEduInfo;

public interface IUserEduInfo {

	//增加一条用户教育信息
	public void insertUserEduInfo(UserEduInfo userEduInfo);
	
	//更新一条用户教育信息
	public void updateUserEduInfo(UserEduInfo userEduInfo);
}
