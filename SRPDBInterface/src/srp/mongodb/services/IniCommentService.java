package srp.mongodb.services;

/*
 * @author season
 * �ṩԭʼ�������ݲ����Ľӿ�
 * */
public interface IniCommentService {

	/*
	 * ����һ����������
	 */
	void insertOne(String productId, String content, String time,
			String commentor, String source_url, String avatar,
			String[] imageUrls);

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
	 * @param pageIndex ��ҳ����
	 * 
	 * @return ����json��ʽ�������б�
	 */
	String getSome(String productId, String listType, int count,
 int pageIndex);

	
	/*
	 * ��������һ�����ݵı�־λ����ʾ�Ƿ񾭹����˴���
	 * 
	 * @param dirty 0��ʾδ���ˣ�1��ʾ�����ˣ�Ĭ��Ϊ0
	 * 
	 * @param inicommentId ԭʼ����Id
	 */
	void markFiltered(String inicommentId, int dirty);

	/*
	 * ��������һ�����ݵı�־λ����ʾ�Ƿ񾭹���з���
	 * 
	 * @param dirty 0��ʾδ����1��ʾ�Ѿ��������ˣ�Ĭ��Ϊ0
	 * 
	 * @param inicommentId ԭʼ����Id
	 */
	void markEmotionAnalysed(String inicommentId, int dirty);

}
