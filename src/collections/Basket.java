package collections;

import java.util.List;

import items.Fruit;

public class Basket {
	public List<Fruit> fruitBasket;

	public Basket(List<Fruit> fruitBasket) {
		this.fruitBasket = fruitBasket;
	}

	public Boolean addFruit(Fruit fruit) {
			return this.fruitBasket.add(fruit);
	}

	public Fruit removeFruit(Fruit fruit) {
		return this.fruitBasket.remove(this.fruitBasket.indexOf(fruit));
	}

	public Float calcPrice() {
		return (float) fruitBasket.stream().mapToDouble(Fruit::getPrice).sum();
	}

	public int totalItems() {
		return this.fruitBasket.size();
	}

}
