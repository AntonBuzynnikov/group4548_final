package humanFriends.repositories;

import java.util.ArrayList;
import java.util.List;

import humanFriends.models.Dog;

public class DogRepository implements AnimalsRepository<Dog>{
    private final List<Dog> dogs;

    public DogRepository() {
        this.dogs = new ArrayList<>();
    }

    @Override
    public void create(Dog animal) {
        dogs.add(animal);
    }

    @Override
    public List<Dog> getAll() {
        return dogs;
    }
    
}
