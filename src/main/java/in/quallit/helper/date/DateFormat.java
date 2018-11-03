package in.quallit.helper.date;

import in.quallit.helper.GenericHelper;

public enum DateFormat {

	DD_MM_YYYY_HH_MM_SS,
	MM_DD_YYYY_HH_MM_SS,
	YYYY_MM_DD_HH_MM_SS,
	
	DD_MMM_YYYY_HH_MM_SS,
	YYYY_MMM_DD_HH_MM_SS,
	
	DD_MM_YYYY,
	MM_DD_YYYY,
	YYYY_MM_DD,
	
	DD_MMM_YYYY,
	YYYY_MMM_DD;
	
	@Override
	public String toString() {
		if(GenericHelper.isNotNull(this)) {
			if(this.equals(DD_MM_YYYY_HH_MM_SS)) {
				return "dd-MM-yyyy HH:mm:ss";
			} else if(this.equals(MM_DD_YYYY_HH_MM_SS)) {
				return "MM-dd-yyyy HH:mm:ss";
			} else if(this.equals(YYYY_MM_DD_HH_MM_SS)) {
				return "yyyy-MM-dd HH:mm:ss";
			} else if(this.equals(DD_MMM_YYYY_HH_MM_SS)) {
				return "dd-MMM-yyyy HH:mm:ss";
			} else if(this.equals(YYYY_MMM_DD_HH_MM_SS)) {
				return "yyyy-MMM-dd HH:mm:ss";
			} else if(this.equals(DD_MM_YYYY)) {
				return "dd-MM-yyyy";
			} else if(this.equals(MM_DD_YYYY)) {
				return "MM-dd-yyyy";
			} else if(this.equals(YYYY_MM_DD)) {
				return "yyyy-MM-dd";
			} else if(this.equals(DD_MMM_YYYY)) {
				return "dd-MMM-yyyy";
			} else if(this.equals(YYYY_MMM_DD)) {
				return "yyyy-MMM-dd";
			}
		}
		return "yyyy-MM-dd HH:mm:ss";
	}
	
}
