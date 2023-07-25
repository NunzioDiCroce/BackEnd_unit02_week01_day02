package com.example.MySecondSpringBootApp;

import java.time.LocalDateTime;

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
	protected LocalDateTime time;
	protected OrderStatus orderStatus;
	protected Table table;
	protected String seats;
	// lista elementi menu con variazioni e campo note per ciascun elemento
	protected double orderPrice; // con coperti come parametro

}