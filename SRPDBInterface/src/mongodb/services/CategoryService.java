package mongodb.services;

import java.util.Map;

/*
 * ����Ʒ�ķ�����صĽӿ�
 * */
public interface CategoryService {

	/*
	 * @return ��json��ʽ�������е�Ŀ¼��ʾ��Ϊ { { parent : 'IT', child : ['phone','camera'] } }
	 */
	String getAllCategory();

	/*
	 * ͨ��Ŀ¼���ֻ�ȡ��Ʒ����
	 * 
	 * @param categoryName Ŀ¼����
	 * 
	 * @param count ���ض���������
	 * 
	 * @param showType ����ʲô���з�ʽ��δ���壩
	 * 
	 * @param listType �������ص����ݴ��ĸ���Ʒ��ʼ�������������id
	 * 
	 * @return ����json��ʽ����Ʒ�б�����
	 */
	String getProductsByCat(String categoryName, int count, int listType,
			String lastProId);
	
	/*
	 * ��ʼ����Ʒ��������
	 * 
	 * @param categories ͨ��map�ṹ��ʼ����Ʒ�������ݣ�map��keyΪ����������value������ӷ�����
	 */
	void iniCategory(Map<String, String[]> categories);
	

}
