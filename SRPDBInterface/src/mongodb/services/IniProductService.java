package mongodb.services;

import java.util.Map;

/*
 * @author season
 * 提供商品原始数据操作的接口
 * */
public interface IniProductService {

	/*
	 * 插入一条商品原始数据，因为这里的数据需保持独立性，不能有重复数据，所以重复数据会失败
	 * 
	 * @param name 商品的名称
	 * 
	 * @param category 商品的分类
	 * 
	 * @param imgUrls 商品图片的地址
	 * 
	 * @param attrs 商品的属性对，如key为颜色，value为红色
	 * 
	 * @param sourceUrl 商品信息来源网址
	 * 
	 * @param tags 电商平台提供的商品评价关键词
	 */
	void insertOne(String name, String category, String[] imgUrls,
			Map<String, String> attrs, String sourceUrl, String[] tags);

	/*
	 * 获取未经处理的商品数据
	 * 
	 * @return 返回未处理的商品数据所有数据
	 */
	String getSomeUnhandled();

	/*
	 * 判断是否有需要处理的新数据（（ 具体判断依据未得到
	 */
	void undefined_1();

}
