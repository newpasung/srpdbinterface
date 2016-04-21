package srp.mongodb.services;

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
	void insertOne(String name, String brand, String category,
			String[] imgUrls,
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
	 * 
	 * @param lastUpdatedTime ������ݸ���ʱ�䣬�����ô˺���ʱ��ʱ��
	 */
	void updatePrice(String productId, double price, String platform,
			String priceUrl, String lastUpdatedTime);

	/*
	 * ����һ����Ʒ��һ��������
	 * 
	 * @param productId ��Ʒ��id
	 * 
	 * @param attrName �ɵ���������
	 * 
	 * @param newValue �µ�����ֵ
	 */
	void alterAttr(String productId, String attrName, String newValue);

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
	 * @param tagsAndrate ��ʽΪ ��ۣ�10 ��ʾ�ؼ��ʼ������
	 */
	String setTagsandRate(String productId, Map<String, String> tagsAndrate);

	/*
	 * ��ȡһ����Ʒ�Ĺؼ��ʣ��������ȴ�
	 * 
	 * @param productId ��Ʒid
	 * 
	 * @return ����json��ʽ��һ��ؼ���
	 */
	String getTags(String productId);

}
