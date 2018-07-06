package com.ezezbiz.effectivejava2ed.examples.item02.builder;

public class NutritionFacts {

    private  int servingSize;
    private  int servings;
    private  int calories;
    private  int fat;
    private  int sodium;
    private  int carbohydrate;

    public static final class NutritionFactsBuilder {
        private int servingSize;
        private int servings;
        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;

        private NutritionFactsBuilder() {
        }

        public NutritionFactsBuilder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public static NutritionFactsBuilder aNutritionFacts() {
            return new NutritionFactsBuilder();
        }

        public NutritionFactsBuilder withServingSize(int servingSize) {
            this.servingSize = servingSize;
            return this;
        }

        public NutritionFactsBuilder withServings(int servings) {
            this.servings = servings;
            return this;
        }

        public NutritionFactsBuilder withCalories(int calories) {
            this.calories = calories;
            return this;
        }

        public NutritionFactsBuilder withFat(int fat) {
            this.fat = fat;
            return this;
        }

        public NutritionFactsBuilder withSodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public NutritionFactsBuilder withCarbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            NutritionFacts nutritionFacts = new NutritionFacts();
            nutritionFacts.calories = this.calories;
            nutritionFacts.fat = this.fat;
            nutritionFacts.servings = this.servings;
            nutritionFacts.sodium = this.sodium;
            nutritionFacts.servingSize = this.servingSize;
            nutritionFacts.carbohydrate = this.carbohydrate;
            return nutritionFacts;
        }
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.NutritionFactsBuilder(240, 8)
                .withCalories(100)
                .withSodium(35)
                .withCarbohydrate(27).build();
    }
}
