package srp.mongodb.services;

import java.util.Map;

public interface OuterCommentorService {
	
	
	/*
	 * ����һ�����������ݣ������Ѿ����ڵĻ������ظ�����
	 * 
	 * @param name �û���
	 * 
	 * @param platform �������ĸ�ƽ̨
	 * 
	 * @param info ��������Ϣ��key-value
	 * 
	 * @return �����˵���Ϣ
	 */
	String insertOne(String name, String platform, Map<String, String> info);
	
}
