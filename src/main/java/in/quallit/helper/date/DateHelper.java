package in.quallit.helper.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import in.quallit.helper.GenericHelper;

public class DateHelper {

	private DateHelper() {
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

	public static long differenceInMilliseconds(Date startDate, Date endDate)
			throws ParseException {
		Date dateOne = format(
				GenericHelper.isNull(startDate) ? new Date() : startDate,
				DateFormat.YYYY_MM_DD_HH_MM_SS);
		Date dateTwo = format(
				GenericHelper.isNull(endDate) ? new Date() : endDate,
				DateFormat.YYYY_MM_DD_HH_MM_SS);
		long millis = 0;
		if (GenericHelper.isNotNull(dateOne)
				&& GenericHelper.isNotNull(dateTwo)) {
			millis = Math.abs(dateTwo.getTime() - dateOne.getTime());
		}
		return millis;
	}

	public static long differenceInSeconds(Date startDate, Date endDate)
			throws ParseException {
		return TimeUnit.SECONDS.convert(
				differenceInMilliseconds(startDate, endDate),
				TimeUnit.MILLISECONDS);
	}

	public static long differenceInMinutes(Date startDate, Date endDate)
			throws ParseException {
		return TimeUnit.MINUTES.convert(
				differenceInMilliseconds(startDate, endDate),
				TimeUnit.MILLISECONDS);
	}

	public static long differenceInHours(Date startDate, Date endDate)
			throws ParseException {
		return TimeUnit.HOURS.convert(
				differenceInMilliseconds(startDate, endDate),
				TimeUnit.MILLISECONDS);
	}

	public static long differenceInDays(Date startDate, Date endDate)
			throws ParseException {
		return TimeUnit.DAYS.convert(
				differenceInMilliseconds(startDate, endDate),
				TimeUnit.MILLISECONDS);
	}

	private static SimpleDateFormat getSimpleDateFormatter(
			DateFormat dateFormat) {
		return GenericHelper.isNull(dateFormat) ? new SimpleDateFormat()
				: new SimpleDateFormat(dateFormat.toString());
	}
}
