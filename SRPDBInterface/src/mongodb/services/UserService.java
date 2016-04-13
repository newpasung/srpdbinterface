package mongodb.services;

/*
 * �����û����ݵĽӿ�
 */
public interface UserService {

	/*
	 * �û���¼
	 * 
	 * @param account �û��˺�
	 * 
	 * @param passwd �û�����
	 * 
	 * @return ��¼�ɹ����ر�Ҫ���û���Ϣ��ʧ���򷵻�ʧ����Ϣ
	 */
	String login(String account, String passwd);

	/*
	 * �û�ע��ӿڣ�������������Ϣ
	 * 
	 * @param account �û����˺ţ�Ϊ�ֻ����������
	 * 
	 * @param passwd ע���õ�����
	 * 
	 * @return ע��ɹ����ر�Ҫ���û���Ϣ��ʧ���򷵻�ʧ����Ϣ
	 */
	String register(String account, String passwd);

	/*
	 * �����û�����
	 * 
	 * @param uid �û���uid
	 * 
	 * @param oldPwd ������
	 * 
	 * @param newPwd ������
	 * 
	 * @return ����һЩ��ʾ��Ϣ
	 */
	String alterPasswd(String uid, String oldPwd, String newPwd);

	/*
	 * ͨ��uid��ȡ�û�����ϸ����
	 * 
	 * @param uid ���û�id
	 * 
	 * @return ������ϸ���û���Ϣ
	 */
	String getDetailInfo(String uid);

	/*
	 * �����û��ĸ�����Ϣ
	 * 
	 * @param uid �û���id
	 */
	String updateInfo(String uid, String nickname, String mailAdd, String avatar);

}
