package humanFriends.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public abstract class Pet extends Animal {
    List<String> commands;
    public Pet(int id,String name, String birthday,String breed, List<String> commands){
        super(id,name,birthday,breed);
        this.commands = commands;
    }
    @Override
    public String toString() {
        return String.format("%d, %s, %s, %s, %s", getId(),getName(),getBirthday(),getBreed(), commands);
    }
}
