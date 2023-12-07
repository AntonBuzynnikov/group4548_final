package humanFriends.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PackAnimal extends Animal{
    List<String> workPerformed;
    int transportedWeight;
    public PackAnimal(int id,String name, String birthday, String breed) {
        super(id,name, birthday, breed);
    }
    public PackAnimal(int id, String name, String birthday, String breed, List<String> workPerformed,int transportedWeight){
        super(id, name, birthday, breed);
        this.transportedWeight = transportedWeight;
        this.workPerformed = workPerformed;
    }
    @Override
    public String toString() {
        return String.format("%d, %s, %s, %s, %s, Перевозимый вес: %d", getId(), getName(), getBirthday(),workPerformed,transportedWeight);
    }
}
