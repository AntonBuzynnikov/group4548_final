package humanFriends.repositories;

import java.util.ArrayList;
import java.util.List;

import humanFriends.models.Horse;

public class HorseRepository implements AnimalsRepository<Horse>{
    private final List<Horse> horses;

    public HorseRepository() {
        this.horses = new ArrayList<>();
    }

    @Override
    public void create(Horse animal) {
        horses.add(animal);
    }

    @Override
    public List<Horse> getAll() {
        return horses;
    }
    
}
