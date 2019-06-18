package creation.builder;

public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;

	public NutritionFacts(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
	}

	@Override
	public String toString() {
		return "NutritionFacts{" +
				"servingSize=" + servingSize +
				", servings=" + servings +
				", calories=" + calories +
				", fat=" + fat +
				", sodium=" + sodium +
				'}';
	}

	public static class Builder {
		private final int servingSize;
		private final int servings;

		private int calories;
		private int fat;
		private int sodium;

		// 필수 인자
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			this.calories = val;

			return this;
		}

		public Builder fat(int val) {
			this.fat = val;

			return this;
		}

		public Builder sodium(int val) {
			this.sodium = val;

			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}
}
