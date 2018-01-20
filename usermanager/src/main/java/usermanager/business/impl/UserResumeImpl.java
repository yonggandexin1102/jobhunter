package usermanager.business.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import usermanager.business.interf.IUserResume;
import usermanager.entity.UserBaseInfo;
import usermanager.entity.UserEduInfo;
import usermanager.entity.UserExtraInfo;
import usermanager.entity.UserInternInfo;
import usermanager.entity.UserResumeInfo;
import usermanager.mapper.UserBaseInfoMapper;
import usermanager.mapper.UserEduInfoMapper;
import usermanager.mapper.UserExtraInfoMapper;
import usermanager.mapper.UserInternInfoMapper;

@Component
public class UserResumeImpl implements IUserResume{
	
	@Resource
	private UserBaseInfoMapper userBaseInfoMapper;
	@Resource
	private UserEduInfoMapper userEduInfoMapper;
	@Resource
	private UserInternInfoMapper userInternInfoMapper;
	@Resource
	private UserExtraInfoMapper userExtraInfoMapper;

	@Override
	public UserResumeInfo getUserResume(String user_id) {
		// TODO Auto-generated method stub
		//通过调用各个表mapper接口，返回实体对象，赋值给userResumeInfo对象。
		UserBaseInfo userBaseInfo = userBaseInfoMapper.selectBaseInfoById(user_id);
		List<UserEduInfo> userEduInfoList = userEduInfoMapper.selectUserEduInfo(user_id);
		List<UserInternInfo> userInternInfoList = userInternInfoMapper.selectUserInternInfo(user_id);
		UserExtraInfo userExtraInfo = userExtraInfoMapper.selectUserEduInfo(user_id);
		UserResumeInfo userResumeInfo = new UserResumeInfo();
		userResumeInfo.setUserBaseInfo(userBaseInfo);
		userResumeInfo.setUserEduList(userEduInfoList);
		userResumeInfo.setUserInternList(userInternInfoList);
		userResumeInfo.setUserExtraInfo(userExtraInfo);
		return userResumeInfo;		
	}

	@Override
	public void deleteUserResume(String user_id) {
		// TODO Auto-generated method stub
		userBaseInfoMapper.deletUserBaseInfo(user_id);
		userEduInfoMapper.deleteUserEduInfo(user_id);
		userInternInfoMapper.deleteUserInternInfo(user_id);
		userExtraInfoMapper.deleteUserExtraInfo(user_id);
	}	
}
