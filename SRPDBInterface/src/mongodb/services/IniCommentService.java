package mongodb.services;

/*
 * @author season
 * �ṩԭʼ�������ݲ����Ľӿ�
 * */
public interface IniCommentService {

	/*
	 * ����һ����������
	 */
	void insertOne(String productId,String content,String time,String commentor,String source_url);

	/*
	 * ����commentIdɾ��һ������
	 * @param commentId Ҫɾ�������۵�id
	 */
	void deleteOne(String commentId);

	/*
	 * ��ȡһϵ�п�����չʾ�����ۣ�
	 * @param productId ��ȡproductId��ָ��Ʒ������
	 * @param listType ���۵����з�ʽ��δ����
	 * @param count ��ȡ���۵�����
	 * @param lastCommentId ��ʾ����һ�����ۿ�ʼ���ؽ�������������� 
	 * @return ����json��ʽ�������б�
	 * */
	String getSome(String productId, String listType, int count,
			String lastCommentId);

	
	/*
	 * ��ȡ�Ƿ�����Ҫ���������
	 * */
	
	void unDefined_();
	
	/*
	 * ��������һ�����ݵı�־λ����ʾ�Ƿ񾭹�����
	 * 
	 * @param dirty 0��ʾδ����1��ʾ������ˣ�Ĭ��Ϊ0
	 * 
	 * @param inicommentId ԭʼ����Id
	 */
	void mark(String inicommentId, int dirty);

}
