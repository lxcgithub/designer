package designer.e_abstract_factory.absClass;

/**
 * 抽象工厂：抽象工厂含有抽象产品的引用
 *         具体工厂含有具体产品的引用
 *         二者的具体连接逻辑在抽象工厂中实现
 * 具体执行操作api
 */
public abstract class ExportOperate {

	/**
	 * 实例化ExportFileApi
	 * @return
	 */
	public abstract ExportFileApi newFileApi();
	
	/**
	 * 导出数据
	 * @param data
	 */
	public void export(String data){
		ExportFileApi file = newFileApi();
		file.export(data);
	}
	
}
