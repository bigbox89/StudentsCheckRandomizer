import ArrayList.Crew;
import ArrayList.Intern;
import ArrayList.InternsRepository;
import java.io.IOException;

import static ArrayList.Crew.ANSI_RED;
import static ArrayList.Crew.ANSI_RESET;

public class Main {
    public static void main(String[] args) throws IOException {
        //Check ArrayList
        System.out.println("Задаватор вопросов:");
        System.out.println("Нажмите 'q' чтобы выйти, нажмите 'w' чтобы срандомить вопрос, нажмите 'v' чтобы посмотреть кто не задавал вопроса, нажмите 'o' чтобы посмотреть кто не отвечал");
        InternsRepository internsRepository = new InternsRepository();
        internsRepository.getAllInterns();
        Crew<Intern> spisok = internsRepository.getAllInterns();

        char ch;
        int code;
        while (-1 != (code = System.in.read())) {
            ch = (char) code;

            // выйти когда нажато 'q'
            if ('q' == ch) {
                System.exit(0);
            }
            if ('w' == ch) {
                System.out.println(ANSI_RED + spisok.randomTwo() + ANSI_RESET);
            }
            if ('v' == ch) {
                System.out.print("Список тех, кто не задавал вопрос: ");
                System.out.println(spisok.getRandomizeListV().size());
                for (Integer x : spisok.getRandomizeListV())
                    System.out.println(spisok.get((int) x).getName() + " " + spisok.get((int) x).getLastName() + " из команды " + spisok.get((int) x).getCom());
            }
            if ('o' == ch) {
                System.out.print("Список тех, кто не отвечал: ");
                System.out.println(spisok.getRandomizeListO().size());
                for (Integer x : spisok.getRandomizeListO())
                    System.out.println(spisok.get((int) x).getName() + " " + spisok.get((int) x).getLastName() + " из команды " + spisok.get((int) x).getCom());
            }
        }
    }
}
