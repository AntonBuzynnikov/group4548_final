package humanFriends.models;

import java.util.List;

public class Horse extends PackAnimal{

    public Horse(int id,String name, String birthday, String breed, List<String> workPerformed, int transportedWeight) {
        super(id,name, birthday, breed, workPerformed, transportedWeight);
    }
    
}
