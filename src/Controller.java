import java.util.Scanner;

public class Controller {
    public static void run(){
        Task t1 = new Task("Купить машину", "Антон", 3, "19.05");
        Task t2 = new Task();
        Task t3 = new Task("Пригласить друзей", "Антон", 3, "19.05");
        Task t4 = new Task("Купить торт", "Антон", 1, "19.05");
        Task t5 = new Task("Приготовить сюрприз", "Антон", 2, "19.05");
        Planner myP = new Planner();
        myP.add(t1);
        myP.add(t2);
        myP.add(t3);
        myP.add(t4);
        myP.add(t5);
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        Add add = new Add(scanner);
        UserInterface userInterface = new UserInterface(scanner, menu, myP, add);
        userInterface.start();
    }
}
