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

public class Order {
	protected String number;
	protected Table table;
	protected OrderStatus orderStatus;

}