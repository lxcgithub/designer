package designer.e_abstract_factory.impClass;

import designer.e_abstract_factory.absClass.ExportFileApi;
import designer.e_abstract_factory.absClass.ExportOperate;

public class ExportExcelOperator extends ExportOperate {

	@Override
	public ExportFileApi newFileApi() {
		return new ExportExcelFile();
	}

}
