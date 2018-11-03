package in.quallit.helper.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import in.quallit.helper.GenericHelper;

public class DateHelper {

	private static DateHelper dateHelper;

	private DateHelper() {
	}

	public static DateHelper getInstance() {
		if (GenericHelper.isNull(dateHelper)) {
			dateHelper = new DateHelper();
		}
		return dateHelper;
	}

	public static Date convertToDate(String strDate, DateFormat dateFormat)
			throws ParseException {
		return GenericHelper.isNull(strDate) ? null
				: getSimpleDateFormatter(dateFormat).parse(strDate);
	}

	public static String convertToString(Date date, DateFormat dateFormat) {
		return GenericHelper.isNull(date) ? null
				: getSimpleDateFormatter(dateFormat).format(date);
	}

	public static Date format(Date date, DateFormat dateFormat)
			throws ParseException {
		return convertToDate(convertToString(date, dateFormat), dateFormat);
	}

	public static String format(String strDate, DateFormat dateFormat)
			throws ParseException {
		return convertToString(convertToDate(strDate, dateFormat), dateFormat);
	}

	private static SimpleDateFormat getSimpleDateFormatter(
			DateFormat dateFormat) {
		return GenericHelper.isNull(dateFormat) ? new SimpleDateFormat()
				: new SimpleDateFormat(dateFormat.toString());
	}
}
