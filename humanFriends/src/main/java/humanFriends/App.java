package humanFriends;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import humanFriends.controllers.AllAnimalController;
import humanFriends.controllers.CamelController;
import humanFriends.controllers.CatController;
import humanFriends.controllers.CounterController;
import humanFriends.controllers.DogController;
import humanFriends.controllers.DonkeyController;
import humanFriends.controllers.HamsterController;
import humanFriends.controllers.HorseController;
import humanFriends.repositories.CamelRepository;
import humanFriends.repositories.CatRepository;
import humanFriends.repositories.DogRepository;
import humanFriends.repositories.DonkeyRepository;
import humanFriends.repositories.HamsterRepository;
import humanFriends.repositories.HorseRepository;
import humanFriends.services.AllAnimalsService;
import humanFriends.services.CamelService;
import humanFriends.services.CatService;
import humanFriends.services.CounterService;
import humanFriends.services.DogService;
import humanFriends.services.DonkeyService;
import humanFriends.services.HamsterService;
import humanFriends.services.HorseService;
import humanFriends.view.AllAnimalsView;
import humanFriends.view.AnimalView;
import humanFriends.view.CamelView;
import humanFriends.view.CatView;
import humanFriends.view.CounterView;
import humanFriends.view.DogView;
import humanFriends.view.DonkeyView;
import humanFriends.view.HamsterView;
import humanFriends.view.HorseView;


public class App {
    private static DogRepository dogRepository;
    private static DogService dogService;
    private static DogController dogController;
    private static DogView dogView = getDogView();
    private static CatRepository catRepository;
    private static CatService catService;
    private static CatController catController;
    private static CatView catView = getCatView();
    private static HamsterRepository hamsterRepository;
    private static HamsterService hamsterService;
    private static HamsterController hamsterController;
    private static HamsterView hamsterView = getHamsterView();
    private static HorseRepository horseRepository;
    private static HorseService horseService;
    private static HorseController horseController;
    private static HorseView horseView = getHorseView();
    private static DonkeyRepository donkeyRepository;
    private static DonkeyService donkeyService;
    private static DonkeyController donkeyController;
    private static DonkeyView donkeyView = getDonkeyView();
    private static CamelRepository camelRepository;
    private static CamelService camelService;
    private static CamelController camelController;
    private static CamelView camelView = getCamelView();
    private static AllAnimalsView allAnimalsView = getAllAnimalsView();
    private static Scanner scan = new Scanner(System.in);
    private static CounterService counterService;
    private static CounterController counterController;
    private static CounterView counterView = getCounterView();
    public static void run(){
        boolean flag = true;
        while(flag){
            System.out.print("\033[H\033[J");
            String[] menu = new String[]{"Показать список животных","Добавить новое животное","Показать список команд/выполняемых работ животного","Научить животное новым командам","Узнать количество животных","Закрыть приложение"};
            for (int i = 0; i < menu.length; i++) {
                int item = i + 1;
                System.out.println(String.format("%d. %s", item,menu[i]));
            }
            switch (scan.nextLine()) {
                case "1":
                    allAnimalsView.printAllAnimals();
                    System.out.println("Нажмите Enter");
                    scan.nextLine();
                    break;
                case "2":
                    System.out.print("\033[H\033[J");
                    counterView.add();
                    createAnimal();
                    break;
                case "3":
                    System.out.print("\033[H\033[J");
                    System.out.println("Введите ID животного, список действий которого хотите увидеть: ");
                    try {
                        int id = Integer.parseInt(scan.nextLine());
                        System.out.print("\033[H\033[J");
                        allAnimalsView.printCommands(id);
                        System.out.println("Нажмите Enter");
                        scan.nextLine();
                    } catch (Exception e) {
                        System.out.println("Введите целое число!");
                    }
                    break;
                case "4":
                    try {
                        System.out.print("\033[H\033[J");
                        System.out.println("Введите ID животного");
                        int id = Integer.parseInt(scan.nextLine());
                        String commandString = scan.nextLine();
                        allAnimalsView.createNewCommand(id, commandString);
                    } catch(Exception e){
                        System.out.println("Введите целое число!");
                    }
                    System.out.println("Нажмите Enter");
                    scan.nextLine();
                    break;
                case "5":
                    counterView.printCount();
                    System.out.println("Нажмите Enter");
                    scan.nextLine();
                    break;
                case "6":
                    System.out.print("\033[H\033[J");
                    try {
                        System.out.print("Закрытие приложения");
                        for (int i = 0; i < 5; i++) {
                            Thread.sleep(500);
                            System.out.print(".");
                        }
                        System.out.print("\033[H\033[J");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    flag = false;
                    break;
                default:
                    System.out.println("Введите правильный пункт!");
                    break;
            }
        }
    }
    private static DogView getDogView(){
        dogRepository = new DogRepository();
        dogService = new DogService(dogRepository);
        dogController = new DogController(dogService);
        return new DogView(dogController);
    }
    private static CatView getCatView(){
        catRepository = new CatRepository();
        catService = new CatService(catRepository);
        catController = new CatController(catService);
        return new CatView(catController);
    }
    private static HamsterView getHamsterView(){
        hamsterRepository = new HamsterRepository();
        hamsterService = new HamsterService(hamsterRepository);
        hamsterController = new HamsterController(hamsterService);
        return new HamsterView(hamsterController);
    }
    private static HorseView getHorseView(){
        horseRepository = new HorseRepository();
        horseService = new HorseService(horseRepository);
        horseController = new HorseController(horseService);
        return new HorseView(horseController);
    }
    private static DonkeyView getDonkeyView(){
        donkeyRepository = new DonkeyRepository();
        donkeyService = new DonkeyService(donkeyRepository);
        donkeyController = new DonkeyController(donkeyService);
        return new DonkeyView(donkeyController);
    }
    private static CamelView getCamelView(){
        camelRepository = new CamelRepository();
        camelService = new CamelService(camelRepository);
        camelController = new CamelController(camelService);
        return new CamelView(camelController);
    }
    private static AllAnimalsView getAllAnimalsView(){
        AllAnimalsService allAnimalsService = new AllAnimalsService(dogService, catService,hamsterService,horseService,donkeyService,camelService);
        AllAnimalController animalController = new AllAnimalController(allAnimalsService);
        return new AllAnimalsView(animalController);

    }
    private static CounterView getCounterView(){
        counterService = new CounterService();
        counterController = new CounterController(counterService);
        return new CounterView(counterController);
    }
    /*
     * Возможно ли сделать динамический switch-case?
     * Например, в список typeAnimal добавляется Попугай и он же добавляется
     * в "switch-case"
     */
    private static void createAnimal(){
        String[] typeAnimal = {"Собака","Кошка","Хомяк","Лошадь","Осёл","Верблюд"};
        for (int i = 0; i < typeAnimal.length; i++) {
            int item = i+1;
            System.out.println(String.format("%d. %s",item,typeAnimal[i]));
            }
            switch (scan.nextLine()) {
                case "1":
                    choice(dogView);
                    break;
                case "2":
                    choice(catView);
                    break;
                case "3":
                    choice(hamsterView);
                    break;
                case "4":
                    choice(horseView);
                    break;
                case "5":
                    choice(donkeyView);
                    break;
                case "6":
                    choice(camelView);
                    break;
                default:
                    System.out.println("Введите правильный пункт");
                    System.out.println("Нажмите Enter");
                    scan.nextLine();
                    break;
                }
    }
    private static void choice(AnimalView animalView){
                    System.out.print("\033[H\033[J");
                    System.out.println("Введите имя, дату рождения(дд.мм.гггг) и породу через запятую");
                    String[] animal = scan.nextLine().split(",");
                    System.out.println("Введите команды через запятую(если их нет, напишите \"НЕТ\")");
                    List<String> commands = new ArrayList<>(Arrays.asList(scan.nextLine().split(",")));
                    try{
                        animalView.create(allAnimalsView.getMaxId()+1,animal[0], animal[1], animal[2],commands);
                    } catch(Exception e){
                        System.out.println("Введите все пункты правильно!");
                        System.out.println("Нажмите Enter");
                        scan.nextLine();
                    }
                    
    }
}
