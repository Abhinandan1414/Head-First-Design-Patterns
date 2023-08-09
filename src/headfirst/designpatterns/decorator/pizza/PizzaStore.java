package headfirst.designpatterns.decorator.pizza;

public class PizzaStore {
 
	public static void main(String args[]) {
		Pizza pizza = new ThincrustPizza();
		Pizza cheesePizza = new Cheese(pizza);
		Pizza greekPizza = new Olives(cheesePizza);

		System.out.println(pizza.getDescription() 
				+ " $" + pizza.cost());
		System.out.println(cheesePizza.getDescription() 
				+ " $" + cheesePizza.cost());
		System.out.println(greekPizza.getDescription() 
				+ " $" + greekPizza.cost());

	}
}
