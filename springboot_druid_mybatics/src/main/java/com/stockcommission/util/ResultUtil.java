package com.stockcommission.util;

@SuppressWarnings("rawtypes")
public class ResultUtil {
	@SuppressWarnings("unchecked")
	public static Result success(Object object) {
		Result result = new Result();
		result.setCode(0);
		result.setData(object);
		return result;
	}

	public static Result error(int code) {
		Result result = new Result();
		result.setCode(code);
		return result;
	}
}
