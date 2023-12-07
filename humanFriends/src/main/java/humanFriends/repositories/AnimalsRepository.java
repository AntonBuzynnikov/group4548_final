package humanFriends.repositories;

import java.util.List;

import humanFriends.models.Animal;

public interface AnimalsRepository <T extends Animal>{
    void create(T animal);
    List<T> getAll();
} 
