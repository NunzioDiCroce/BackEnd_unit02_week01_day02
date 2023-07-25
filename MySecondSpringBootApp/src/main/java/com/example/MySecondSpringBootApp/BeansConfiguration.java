package com.example.MySecondSpringBootApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BeansConfiguration {

	@Bean(name = "MargheritaPizza")
	Pizza getMargheritaPizza() {
		return new Pizza("Margherita Pizza", "tomato", "cheese", 1104, 4.99);
	}

	@Bean(name = "HawaiianPizza")
	Pizza getHawaiianPizza() {
		return new Pizza("Hawaiian Pizza", "tomato", "cheese", "ham", "pineapple", 1024, 6.49);
	}

	@Bean(name = "SalamiPizza")
	Pizza getSalamiPiazza() {
		return new Pizza("Salami Pizza", "tomato", "cheese", "salami", 1160, 5.99);
	}

	@Bean(name = "CustomPizza")
	Pizza getCustomPizza() {
		return new Pizza("Custom Pizza", "tomato", "cheese", "salami", "onion", 1104 + 86 + 22, 4.99 + 0.99 + 0.69,
				PizzaSize.LARGE);
	}

	@Bean(name = "Cheese")
	Topping getCheese() {
		return new Topping("Cheese", 92, 0.69);
	}

	@Bean(name = "Ham")
	Topping getHam() {
		return new Topping("Ham", 35, 0.99);
	}

	@Bean(name = "Onions")
	Topping getOnions() {
		return new Topping("Onions", 22, 0.69);
	}

	@Bean(name = "Pineapple")
	Topping getPineapple() {
		return new Topping("Pineapple", 24, 0.79);
	}

	@Bean(name = "Salami")
	Topping getSalami() {
		return new Topping("Salami", 86, 0.99);
	}

	@Bean(name = "Lemonade")
	Drink getLemonade() {
		return new Drink("Lemonade", "(0.33l)", 128, 1.29);
	}

	@Bean(name = "Water")
	Drink getWater() {
		return new Drink("Water", "(0.5l)", 0, 1.29);
	}

	@Bean(name = "Wine")
	Drink getWine() {
		return new Drink("Wine", "(0.75l, 13%)", 607, 7.49);
	}

	@Bean(name = "Shirt")
	Franchise getShirt() {
		return new Franchise("Shirt", 21.99);
	}

	@Bean(name = "Mug")
	Franchise getMug() {
		return new Franchise("Mug", 4.99);
	}

	@Bean(name = "Table01")
	Table getTable01() {
		return new Table("01", "4", TableStatus.FREE);
	}

	@Bean(name = "Table02")
	Table getTable02() {
		return new Table("02", "4", TableStatus.FREE);
	}

	@Bean(name = "Table03")
	Table getTable03() {
		return new Table("03", "8", TableStatus.FREE);
	}

	@Bean(name = "Table04")
	Table getTabl04() {
		return new Table("04", "8", TableStatus.FREE);
	}

	@Bean(name = "Table05")
	Table getTable05() {
		return new Table("05", "10", TableStatus.FREE);
	}
}
