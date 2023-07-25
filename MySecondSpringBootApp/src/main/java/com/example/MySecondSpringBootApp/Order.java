package com.example.MySecondSpringBootApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	protected List<Pizza> pizzas = new ArrayList<>();
	protected Map<Pizza, String> pizzaNotes = new HashMap<>();

	protected List<Drink> drinks = new ArrayList<>();
	protected Map<Drink, String> drinkNotes = new HashMap<>();

	protected double orderPrice; // con coperti come parametro

	public void addPizza(Pizza _pizza) {
		pizzas.add(_pizza);
	}

	public void addPizzaNote(Pizza _pizza, String _pizzaNote) {
		pizzaNotes.put(_pizza, _pizzaNote);
	}

	public void addDrink(Drink _drink) {
		drinks.add(_drink);
	}

	public void addDrinkNote(Drink _drink, String _drinkNote) {
		drinkNotes.put(_drink, _drinkNote);
	}

}