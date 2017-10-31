package designer.e_abstract_factory.impClass;

import designer.e_abstract_factory.absClass.ExportFileApi;

public class ExportExcelFile implements ExportFileApi {

	@Override
	public void export(String data) {
		System.out.println("Excel表格");
	}

}
