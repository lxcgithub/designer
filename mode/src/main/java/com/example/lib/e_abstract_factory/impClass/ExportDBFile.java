package com.example.lib.e_abstract_factory.impClass;

import com.example.lib.e_abstract_factory.absClass.ExportFileApi;

/**
 * 具体产品
 * 数据库文件
 * @author Jason
 * QQ: 1476949583
 * @date 2016年12月16日
 * @version 1.0
 */
public class ExportDBFile implements ExportFileApi {

	@Override
	public void export(String data) {
		System.out.println("导出数据到数据库文件...");
	}

}
