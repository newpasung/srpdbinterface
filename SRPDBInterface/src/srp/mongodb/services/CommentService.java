package srp.mongodb.services;

/*
 * ����֮����������ݵĲ����ӿ�
 * */
public interface CommentService {

	/*
	 * ����һ����������
	 */
	void insertOne(String productId, String content, String time,
			String commentor, String source_url, String[] imgurlsInComment,
			String avatar);

	/*
	 * ����commentIdɾ��һ������
	 * @param commentId Ҫɾ�������۵�id
	 */
	void deleteOne(String commentId);

	/*
	 * ��ȡһϵ�п�����չʾ�����ۣ�
	 * 
	 * @param productId ��ȡproductId��ָ��Ʒ������
	 * 
	 * @param listType ���۵����з�ʽ��δ����
	 * 
	 * @param count ��ȡ���۵�����
	 * 
	 * @param pageIndex ��ҳ������
	 * 
	 * @return ����json��ʽ�������б�
	 */
	String getSome(String productId, String listType, int count,
 int pageIndex);

}