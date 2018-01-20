package usermanager.business.interf;

import usermanager.entity.UserResumeInfo;

public interface IUserResume {

	//获取用户简历
	public UserResumeInfo getUserResume(String user_id);
	
	//删除用户简历
	public void deleteUserResume(String user_id);
}
