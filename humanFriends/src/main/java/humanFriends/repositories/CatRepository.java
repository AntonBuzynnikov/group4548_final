package humanFriends.repositories;

import java.util.ArrayList;
import java.util.List;

import humanFriends.models.Cat;

public class CatRepository implements AnimalsRepository<Cat>{
    private final List<Cat> cats;

    public CatRepository() {
        this.cats = new ArrayList<>();
    }

    @Override
    public void create(Cat animal) {
        cats.add(animal);
    }

    @Override
    public List<Cat> getAll() {
        return cats;
    }
    
}
