package humanFriends.view;

import humanFriends.controllers.AllAnimalController;

public class AllAnimalsView {
    private final AllAnimalController animalController;

    public AllAnimalsView(AllAnimalController animalController) {
        this.animalController = animalController;
    }
    public void printAllAnimals(){
        System.out.println("Список всех животных");
        System.out.println("================================");
        animalController.getAllAnimals().forEach(System.out::println);
        System.out.println("================================");
    }
    public int getMaxId(){
        return animalController.getMaxId();
    }
    public void printCommands(int id){
        System.out.println(animalController.getCommands(id));
    }
    public void createNewCommand(int id, String command){
        animalController.createNewCommand(id, command);
    }
    
}
