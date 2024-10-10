package com.java.objectclone;

public class Address {

	public String cityName;

	public Address() {
		super();
	}

	public Address(String cityName) {
		super();
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + "]";
	}
}
