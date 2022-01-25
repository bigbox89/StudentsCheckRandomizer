package ArrayList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InternsRepository {

    //Метод для считывания списка пользователей из файла
    private Crew<Intern> getInternsFromFile() throws FileNotFoundException {
        String inputFileName = "interns2.txt";

        Crew<Intern> internsList = new Crew<Intern>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            reader.lines().forEach(line -> {
                Intern internFromTxt = new Intern(line);
                internsList.add(internFromTxt);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return internsList;
    }

    public Crew<Intern> getAllInterns() throws FileNotFoundException {
        return getInternsFromFile();
    }
}
