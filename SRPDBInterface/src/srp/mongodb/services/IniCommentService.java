package srp.mongodb.services;

/*
 * @author season
 * �ṩԭʼ�������ݲ����Ľӿ�
 * */
public interface IniCommentService {

	/*
	 * ����һ����������
	 */
	String insertOne(String productId, String content, String time,
			String commentor, String source_url, String avatar,
			String[] imageUrls, String rate);

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
	 * @param pageIndex ��ҳ����
	 * 
	 * @return ����json��ʽ�������б�
	 */
	String getSome(String productId, int listType, int count,
 int pageIndex);

	
	/*
	 * ��������һ�����ݵı�־λ����ʾ�Ƿ񾭹����˴���
	 * 
	 * @param dirty 0��ʾδ���ˣ�1��ʾ�����ˣ�Ĭ��Ϊ0
	 * 
	 * @param inicommentId ԭʼ����Id
	 */
	String markFiltered(String inicommentId, int dirty);

	/*
	 * ��������һ�����ݵı�־λ����ʾ�Ƿ񾭹���з���
	 * 
	 * @param dirty 0��ʾδ����1��ʾ�Ѿ��������ˣ�Ĭ��Ϊ0
	 * 
	 * @param inicommentId ԭʼ����Id
	 */
	String markEmotionAnalysed(String inicommentId, int dirty);

}
