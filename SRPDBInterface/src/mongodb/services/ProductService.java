package mongodb.services;

import java.util.Map;

/*
 * �Թ�һ�������Ʒ���ݵĲ�����������������ݶ���ֱ��������ʾ��
 */
public interface ProductService {

	/*
	 * ��ȡһ����Ʒ����ϸ��Ϣ
	 * 
	 * @param productId ��Ʒ��productId
	 * 
	 * @return ����json��ʽ����Ʒ��ϸ��Ϣ,���ص��������ݸ���ʵ������
	 */
	String getOne(String productId);
	
	/*
	 * ��һ����Ʒ���޻�ᷦ
	 * 
	 * @param productId ��Ʒ��id
	 * 
	 * @param isFavour 0��ʾ�ᷦ��1��ʾ����
	 * 
	 * @return ����һЩ������ʱ����
	 */
	String favour(String productId, int isFavour);
	
	/*
	 * ����һ����Ʒ�����ݣ���Ϊ����������豣�ֶ����ԣ��������ظ����ݣ������ظ����ݻ�ʧ��
	 * 
	 * @param name ��Ʒ������
	 * 
	 * @param category ��Ʒ�ķ���
	 * 
	 * @param imgUrls ��ƷͼƬ�ĵ�ַ
	 * 
	 * @param attrs ��Ʒ�����Զԣ���keyΪ��ɫ��valueΪ��ɫ
	 */
	void insertOne(String name, String category, String[] imgUrls,
			Map<String, String> attrs);

	/*
	 * ��ȡ��Ʒ���Ƽ��۸���Ϣ
	 * 
	 * @param productId ��Ʒid
	 */
	String getPrices(String productId);

	/*
	 * ����һ����Ʒ�ļ۸�����
	 * 
	 * @param prouductId ��Ʒ��id
	 * 
	 * @param price ��Ʒ�ļ۸�
	 * 
	 * @param platform ��Ʒ�۸��Ӧ��ƽ̨
	 * 
	 * @param priceUrl �۸���Դ����ַ
	 */
	void updatePrice(String productId, double price, String platform,
			String priceUrl);

	/*
	 * ����һ����Ʒ��һ��������
	 * 
	 * @param productId ��Ʒ��id
	 * 
	 * @param attrName �ɵ���������
	 * 
	 * @param attrValue �ɵ�����ֵ
	 * 
	 * @param newValue �µ�����ֵ
	 */
	void alterAttr(String productId, String attrName, String attrValue,
			String newValue);

	/*
	 * ɾ��ĳ��Ʒ��һ������
	 * 
	 * @param ��Ʒ��id
	 * 
	 * @param attrName ���Ե����ƣ�����ɫ
	 * 
	 * @return undefined
	 */
	String removeAttr(String productId, String attrName);

	/*
	 * ɾ��ĳ���۸���Ƽ���Ϣ
	 * 
	 * @param productId ��Ʒ��id
	 * 
	 * @param priceId �۸���Ŀ��id
	 */
	void removeRecommendPrice(String productId, String priceId);

	/*
	 * ��ȡһ����Ʒ�Ĺؼ��ʣ��������ȴ�
	 * 
	 * @param productId ��Ʒid
	 * 
	 * @return ����json��ʽ��һ��ؼ���
	 */
	String getTags(String productId);

	/*
	 * ����һ����Ʒ�����������ݵó������ݣ��øжȣ�
	 * 
	 * @param productId ��Ʒ��id
	 * 
	 * @param score �øж�ֵ
	 */
	void updateCommentScore(String productId, double score);

}
