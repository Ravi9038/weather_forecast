package com.weatherforcast.helperBean;

import java.util.ArrayList;
import java.util.List;

public class BaseResponse<T> {

	private List<T> data;
	private Response response;
	private Errors errors;

	public List<T> getData() {
		if (data == null) {
			data = new ArrayList<T>();
		}
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Response getResponse() {
		if (response == null) {
			response = new Response();
		}
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public Errors getErrors() {
		if (errors == null) {
			errors = new Errors();
		}
		return errors;
	}

	public void setErrors(Errors errors) {
		this.errors = errors;
	}

}

