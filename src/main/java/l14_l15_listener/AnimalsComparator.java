package l14_l15_listener;

import java.util.Comparator;

import l14_l15_listener.animals.Animal;

public class AnimalsComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Animal animal1 = (Animal) o1;
        Animal animal2 = (Animal) o2;

        return animal1.getAge() - animal2.getAge();
    }
}
