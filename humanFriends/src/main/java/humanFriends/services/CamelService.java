package humanFriends.services;

import java.util.List;

import humanFriends.models.Camel;
import humanFriends.repositories.AnimalsRepository;

public class CamelService implements AnimalService<Camel>{
    private final AnimalsRepository<Camel> camelRepository;

    public CamelService(AnimalsRepository<Camel> camelRepository) {
        this.camelRepository = camelRepository;
    }

    @Override
    public List<Camel> getAll() {
        return camelRepository.getAll();
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        camelRepository.create(new Camel(id, name, birthday, breed, commandList, 0));
    }
}
