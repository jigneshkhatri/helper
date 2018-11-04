package in.quallit.helper;

import java.util.Collection;

public class GenericHelper {

	private GenericHelper() {
	}

	public static boolean isNull(Object obj) {
		return obj == null;
	}

	public static boolean isNotNull(Object obj) {
		return !isNull(obj);
	}

	public static boolean isEmpty(Object obj) {
		if (isNull(obj)) {
			return true;
		} else {
			if (obj instanceof String) {
				return ((String) obj).equals("");
			} else if (obj instanceof Collection) {
				return ((Collection<?>) obj).isEmpty();
			} else {
				return false;
			}
		}
	}

	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}

	public static boolean isNumeric(Object obj) {
		if (isNull(obj)) {
			return false;
		} else {
			return obj instanceof Number;
		}
	}

	public static boolean isString(Object obj) {
		if (isNull(obj)) {
			return false;
		} else {
			return obj instanceof String;
		}
	}

	public static boolean isZero(Object obj) {
		if (!isNumeric(obj)) {
			return false;
		} else {
			if (obj instanceof Float) {
				return obj.equals(0f);
			} else if (obj instanceof Double) {
				return obj.equals(0d);
			} else if (obj instanceof Long) {
				return obj.equals(0l);
			} else if (obj instanceof Integer) {
				return obj.equals(0);
			} else if (obj instanceof Byte) {
				return obj.equals((byte) 0);
			} else if (obj instanceof Short) {
				return obj.equals((short) 0);
			} else {
				return false;
			}
		}
	}

	public static boolean isNotZero(Object obj) {
		return !isZero(obj);
	}

	public static boolean isNegativeNumber(Object obj) {
		if (!isNumeric(obj)) {
			return false;
		} else {
			if (obj instanceof Float) {
				return ((Float) obj) < 0f;
			} else if (obj instanceof Double) {
				return ((Double) obj) < 0d;
			} else if (obj instanceof Long) {
				return ((Long) obj) < 0l;
			} else if (obj instanceof Integer) {
				return ((Integer) obj) < 0;
			} else if (obj instanceof Byte) {
				return ((Byte) obj) < 0;
			} else if (obj instanceof Short) {
				return ((Short) obj) < 0;
			} else {
				return false;
			}
		}
	}

	public static boolean isPositiveNumber(Object obj) {
		return !isNegativeNumber(obj);
	}

	public static boolean getBooleanValue(Boolean obj) {
		if (isNull(obj)) {
			return false;
		}
		return obj.booleanValue();
	}
}
