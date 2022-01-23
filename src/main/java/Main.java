import ArrayList.Crew;
import ArrayList.Intern;
import ArrayList.InternsRepository;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Check ArrayList
       System.out.println("Start Randomize Demonstration");
        InternsRepository internsRepository = new InternsRepository();
        internsRepository.getAllInterns();
        Crew<Intern> spisok = internsRepository.getAllInterns();
       /*  System.out.println("Печатаем весь список");
        spisok.printAll();*/

        System.out.println(Arrays.toString(spisok.randomizeTwo()));
        System.out.println(Arrays.toString(spisok.randomizeTwo()));
        System.out.println(Arrays.toString(spisok.randomizeTwo()));
        System.out.println(Arrays.toString(spisok.randomizeTwo()));
        System.out.println(Arrays.toString(spisok.randomizeTwo()));
        System.out.println(Arrays.toString(spisok.randomizeTwo()));
        System.out.println(Arrays.toString(spisok.randomizeTwo()));



    }
}
