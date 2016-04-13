package mongodb.services;

/*
 * 关于用户数据的接口
 */
public interface UserService {

	/*
	 * 用户登录
	 * 
	 * @param account 用户账号
	 * 
	 * @param passwd 用户密码
	 * 
	 * @return 登录成功返回必要的用户信息，失败则返回失败信息
	 */
	String login(String account, String passwd);

	/*
	 * 用户注册接口，不包含个人信息
	 * 
	 * @param account 用户的账号，为手机号码或邮箱
	 * 
	 * @param passwd 注册用的密码
	 * 
	 * @return 注册成功返回必要的用户信息，失败则返回失败信息
	 */
	String register(String account, String passwd);

	/*
	 * 更改用户密码
	 * 
	 * @param uid 用户的uid
	 * 
	 * @param oldPwd 旧密码
	 * 
	 * @param newPwd 新密码
	 * 
	 * @return 返回一些提示信息
	 */
	String alterPasswd(String uid, String oldPwd, String newPwd);

	/*
	 * 通过uid获取用户的详细资料
	 * 
	 * @param uid 即用户id
	 * 
	 * @return 返回详细的用户信息
	 */
	String getDetailInfo(String uid);

	/*
	 * 更改用户的个人信息
	 * 
	 * @param uid 用户的id
	 */
	String updateInfo(String uid, String nickname, String mailAdd, String avatar);

}
