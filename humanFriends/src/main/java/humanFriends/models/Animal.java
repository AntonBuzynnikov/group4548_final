package humanFriends.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {
    private int id;
    private String name;
    private String birthday;
    private String breed;
    public Animal(int id,String name, String birthday, String breed){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.breed = breed;
    }

}
