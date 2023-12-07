package humanFriends.controllers;

import java.util.List;

import humanFriends.models.Animal;

public interface AnimalController <T extends Animal>{
    List<T> getAll();

    void create(int id, String name, String birthday, String breed,List<String> commandList);
}
