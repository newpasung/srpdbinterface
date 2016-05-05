package srp.mongodb.services;

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
	 * @param account �û��˻�
	 * 
	 * @param oldPwd ������
	 * 
	 * @param newPwd ������
	 * 
	 * @return ����һЩ��ʾ��Ϣ
	 */
	String alterPasswd(String account, String oldPwd, String newPwd);

	/*
	 * ͨ��uid��ȡ�û�����ϸ����
	 * 
	 * @param account �û��˺�
	 * 
	 * @return ������ϸ���û���Ϣ
	 */
	String getDetailInfo(String account);

	/*
	 * �����û��ĸ�����Ϣ
	 * 
	 * @param uid �û��˺�
	 */
	String updateInfo(String account, String nickname, String mailAdd,
			String avatar);

	/*
	 * ��һ����Ʒ���޻�ᷦ
	 * 
	 * @param productId ��Ʒ��id
	 * 
	 * @param isFavour 0��ʾ�ᷦ��1��ʾ����
	 * 
	 * @param account user account
	 * 
	 * @return ����һЩ������ʱ����
	 */
	String favour(String productId, int isFavour, String account);

}
