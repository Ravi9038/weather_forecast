package com.weatherforcast.helperBean;

public class Response {
	public static final String TYPE_SUCCESS = "S";
	public static final String TYPE_ERROR = "E";
	public static final String TYPE_WARNING = "W";
	public static final String TYPE_INFO = "I";
	public static final String FAILURE = "1111";
	public static final String SUCCESS = "0000";
	
	private String type;
	private String respCode;
	private String respMsg;
	private String respHdr;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	public String getRespHdr() {
		return respHdr;
	}

	public void setRespHdr(String respHdr) {
		this.respHdr = respHdr;
	}


//	@Override
//	public String toString() {
//		return "Response [type=" + type + ", respCode=" + respCode + ", respMsg=" + respMsg + ", respHdr=" + respHdr + "]";
//	}

}
