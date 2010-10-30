package cz.pn.samples.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Pavel
 * Date: 30.10.2010
 * Time: 21:57:51
 * To change this template use File | Settings | File Templates.
 */
public class SomeGenericSamples {
    private List<? extends Animal> animals;

    public void createRabbitList() {
        animals = new ArrayList<Rabbit>();
        Animal animal = animals.get(0);
    }

    public void reportRabbits() {
        List<Rabbit> rabbits = new ArrayList<Rabbit>();
        rabbits.add(new Rabbit());
        reportAnimal(rabbits);
    }

    public void reportAnimal(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getNumberOfLegs());
        }
    }
}
