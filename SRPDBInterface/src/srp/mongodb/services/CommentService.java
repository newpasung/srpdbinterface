package srp.mongodb.services;

/*
 * ����֮����������ݵĲ����ӿ�
 * */
public interface CommentService {

	public static int LISTTYPE_DEFAULT = 0;// Ĭ�ϵ����з�ʽ
	public static int ITEMCOUNT_DEFAULT = 10;// һ������Ĭ�Ϸ���ʮ������
	public static int PAGEINDEX_DEFAULT = 1;// Ĭ�Ϸ��ص�һҳ����
	
	/*
	 * ����һ����������
	 * 
	 * @param productId ��Ʒid
	 * 
	 * @param content ��������
	 * 
	 * @param time ���۵�ʱ��
	 * 
	 * @param commentor ������
	 * 
	 * @param source_url ������Դ��ַ
	 * 
	 * @param imgurlsInComment ���������ͼƬ��ַ
	 * 
	 * @param avatar ������ͷ��
	 * 
	 * @param rate �������۵����֣���Χ��1-10
	 */
	String insertOne(String productId, String content, String time,
			String commentor, String source_url, String[] imgurlsInComment,
			String avatar, String rate);

	/*
	 * ����commentIdɾ��һ������
	 * @param commentId Ҫɾ�������۵�id
	 */
	String deleteOne(String commentId);

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
	String getSome(String productId, int listType, int count,
 int pageIndex);

}
