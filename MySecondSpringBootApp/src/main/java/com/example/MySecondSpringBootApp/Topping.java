package com.example.MySecondSpringBootApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Slf4j

public class Topping {
	protected String name;
	protected double calories;
	protected double price;

	public Topping(String _name, double _calories, double _price) {
		this.name = _name;
		this.calories = _calories;
		this.price = _price;
	}

	@Override
	public String toString() {
		return name + ", " + calories + ", " + price;
	}
}