package humanFriends.view;

import java.util.List;

public interface AnimalView {
    void create(int id, String name, String birthday, String breed,List<String> commandList);
}
