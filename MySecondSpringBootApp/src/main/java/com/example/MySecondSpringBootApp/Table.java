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

public class Table {
	protected String number;
	protected String seats;
	protected TableStatus tableStatus;

}