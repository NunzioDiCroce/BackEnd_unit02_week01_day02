package com.example.MySecondSpringBootApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Slf4j

public class Drink {
	protected String name;
	protected String size;
	protected double calories;
	protected double price;

//	public Drink(String _name, String _size, double _calories, double _price) {
//		this.name = _name;
//		this.size = _size;
//		this.calories = _calories;
//		this.price = _price;
//	}

//	@Override
//	public String toString() {
//		return name + ", " + size + ", " + calories + ", " + price;
//	}
}