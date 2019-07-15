package com.example.lib.e_abstract_factory.impClass;

import com.example.lib.e_abstract_factory.absClass.ExportFileApi;
import com.example.lib.e_abstract_factory.absClass.ExportOperate;

public class ExportExcelOperator extends ExportOperate {

	@Override
	public ExportFileApi newFileApi() {
		return new ExportExcelFile();
	}

}
