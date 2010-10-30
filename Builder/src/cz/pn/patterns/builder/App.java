package cz.pn.patterns.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Pavel
 * Date: 29.10.2010
 * Time: 10:06:11
 * To change this template use File | Settings | File Templates.
 */
public class App {
    public static void main (String[] args) {
       NutritionFacts cocaCola = new NutritionFacts.Builder(330,1).carbohydrate(50).fat(0).salt(1).build(); 
    }
}
