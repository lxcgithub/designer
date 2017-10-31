package designer.e_abstract_factory.impClass;

import designer.e_abstract_factory.absClass.ExportFileApi;
import designer.e_abstract_factory.absClass.ExportOperate;

public class ExportFileOperator extends ExportOperate {

	@Override
	public ExportFileApi newFileApi() {
		return new ExportTextFile();
	}
	
}
