package creation.builder;

public class Client {

	public static void main(String[] args) {
		NutritionFacts.Builder builder = new NutritionFacts.Builder(240, 8);
		builder.calories(100);
		builder.sodium(35);
		NutritionFacts nutritionFacts1 = builder.build();
		System.out.println(nutritionFacts1);

		NutritionFacts nutritionFacts2 = new NutritionFacts
				.Builder(240, 8)
				.calories(100)
				.build();
		System.out.println(nutritionFacts2);
	}

}
