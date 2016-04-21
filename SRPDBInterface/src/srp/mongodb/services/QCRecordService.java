package srp.mongodb.services;

/*
 * ��������¼���ݵĲ����ӿ�
 * */
public interface QCRecordService {

	/*
	 * ����һ���ʼ�����
	 * 
	 * @param qcItem �ʼ����Ŀ
	 * 
	 * @param qcDate �ʼ�����ڣ���ʽΪ��-��-��
	 * 
	 * @param productName �ʼ����Ʒ������
	 * 
	 * @param brand ��Ʒ��Ʒ��
	 * 
	 * @param isFined �ʼ��Ƿ�ͨ��
	 * 
	 * @param qcResult �ʼ�Ľ��������������ֵ�����
	 * 
	 * @param qcInstitude �ʼ����
	 */
	void insertOne(String qcItem, String productName,
			String brand, int isFined, String qcResult, String qcInstitude);

	/*
	 * ͨ�� qc��id��ȡ�ʼ��¼����ϸ��Ϣ
	 * 
	 * @qcIds ��Ҫ�õ���һ���ʼ챨���id
	 */
	String getSomeByIds(String... qcIds);

}
