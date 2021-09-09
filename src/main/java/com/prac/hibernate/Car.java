package com.prac.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Car {
	private String model;
	private String color;

	@Column(name = "CAR_MODEL")
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "CAR_COLOR")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
