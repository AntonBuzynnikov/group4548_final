package humanFriends.services;

import java.util.List;

import humanFriends.models.Dog;
import humanFriends.repositories.AnimalsRepository;
public class DogService implements AnimalService<Dog>{
    private final AnimalsRepository<Dog> dogRepository;
    public DogService(AnimalsRepository<Dog> dogRepository) {
        this.dogRepository = dogRepository;
    }
    

    @Override
    public List<Dog> getAll() {
        return dogRepository.getAll();
    }

    @Override
    public void create(int id, String name, String birthday, String breed,List<String> commandList) {
        dogRepository.create(new Dog(id, name, birthday, breed,commandList));
        
    }
    
}
