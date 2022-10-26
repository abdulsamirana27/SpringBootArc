package com.example.demo.entities;

public class GenericResponse<T> {
		
	private String status;
    private String message;
    private T data;

    public GenericResponse(String status, String message, T data) {
        this.setStatus(status);
        this.setMessage(message);
        this.setData(data);
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
