package in.quallit.helper.date;

import in.quallit.helper.GenericHelper;

public class DateHelper {

	private static DateHelper dateHelper;
	
	private DateHelper() { }
	
	public static DateHelper getInstance() {
		if(GenericHelper.isNull(dateHelper)) {
			dateHelper = new DateHelper();
		}
		return dateHelper;
	}
}
