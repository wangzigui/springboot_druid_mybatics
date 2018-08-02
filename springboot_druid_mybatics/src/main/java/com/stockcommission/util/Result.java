package com.stockcommission.util;

public class Result<T> {
	 /** 编码 */
    private Integer code;

    /** 数据 */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

	@Override
	public String toString() {
		return "Result [code=" + code +  ", data=" + data + "]";
	}
    
    
}
