package mongodb.services;

/*
 * @author season
 * 提供原始评论数据操作的接口
 * */
public interface IniCommentService {

	/*
	 * 插入一条评论数据
	 */
	void insertOne(String productId,String content,String time,String commentor,String source_url);

	/*
	 * 根据commentId删除一条评论
	 * @param commentId 要删除的评论的id
	 */
	void deleteOne(String commentId);

	/*
	 * 获取一系列可用于展示的评论，
	 * @param productId 获取productId所指商品的评论
	 * @param listType 评论的排列方式（未定）
	 * @param count 获取评论的数量
	 * @param lastCommentId 表示从哪一条评论开始返回结果，不包括自身 
	 * @return 返回json格式的评论列表
	 * */
	String getSome(String productId, String listType, int count,
			String lastCommentId);

	
	/*
	 * 获取是否有需要处理的评论
	 * */
	
	void unDefined_();
	
	/*
	 * 用来更改一个数据的标志位，表示是否经过处理
	 * 
	 * @param dirty 0表示未处理，1表示处理过了，默认为0
	 * 
	 * @param inicommentId 原始评论Id
	 */
	void mark(String inicommentId, int dirty);

}
