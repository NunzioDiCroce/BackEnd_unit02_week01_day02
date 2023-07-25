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

public class Franchise {
	protected String name;
	protected double price;

//	public Franchise(String _name, double _price) {
//		this.name = _name;
//		this.price = _price;
//	}

//	@Override
//	public String toString() {
//		return name + ", " + price;
//	}
}