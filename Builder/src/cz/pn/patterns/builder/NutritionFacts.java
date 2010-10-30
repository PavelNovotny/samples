package cz.pn.patterns.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Pavel
 * Date: 29.10.2010
 * Time: 12:15:53
 * To change this template use File | Settings | File Templates.
 */
public class NutritionFacts {
    private int servingSize;
    private int servings;
    private int water;
    private int carbohydrate;
    private int sodium;
    private int salt;
    private int fat;

    public static class Builder {
        //required
        private int servingSize;
        private int servings;
        //optional
        private int water = 0;
        private int carbohydrate = 0;
        private int sodium = 0;
        private int salt = 0;
        private int fat = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder water(int val) {
            this.water = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }

        public Builder salt(int val) {
            this.salt = val;
            return this;
        }

        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servingSize;
        this.water = builder.water;
        this.carbohydrate = builder.carbohydrate;
        this.sodium = builder.sodium;
        this.salt = builder.salt;
        this.fat = builder.fat;
    }
}
