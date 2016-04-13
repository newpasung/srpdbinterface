package mongodb.services;

import java.util.Map;

/*
 * @author season
 * �ṩ��Ʒԭʼ���ݲ����Ľӿ�
 * */
public interface IniProductService {

	/*
	 * ����һ����Ʒԭʼ���ݣ���Ϊ����������豣�ֶ����ԣ��������ظ����ݣ������ظ����ݻ�ʧ��
	 * 
	 * @param name ��Ʒ������
	 * 
	 * @param category ��Ʒ�ķ���
	 * 
	 * @param imgUrls ��ƷͼƬ�ĵ�ַ
	 * 
	 * @param attrs ��Ʒ�����Զԣ���keyΪ��ɫ��valueΪ��ɫ
	 * 
	 * @param sourceUrl ��Ʒ��Ϣ��Դ��ַ
	 * 
	 * @param tags ����ƽ̨�ṩ����Ʒ���۹ؼ���
	 */
	void insertOne(String name, String category, String[] imgUrls,
			Map<String, String> attrs, String sourceUrl, String[] tags);

	/*
	 * ��ȡδ���������Ʒ����
	 * 
	 * @return ����δ�������Ʒ������������
	 */
	String getSomeUnhandled();

	/*
	 * �ж��Ƿ�����Ҫ����������ݣ��� �����ж�����δ�õ�
	 */
	void undefined_1();

}
