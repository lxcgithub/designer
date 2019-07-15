package com.example.lib.e_abstract_factory.impClass;

import com.example.lib.e_abstract_factory.absClass.ExportOperate;
import com.example.lib.e_abstract_factory.absClass.ExportFileApi;

/**
 * 具体工厂
 * 导出数据库文件
 * @author Jason
 * QQ: 1476949583
 * @date 2016年12月16日
 * @version 1.0
 */
public class ExportDBOperator extends ExportOperate {

	@Override
	public ExportFileApi newFileApi() {
		return new ExportDBFile();
	}
	
	

}
