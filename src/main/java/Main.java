import ArrayList.Crew;
import ArrayList.Intern;
import ArrayList.InternsRepository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //Check ArrayList
       System.out.println("Задаватор вопросов:");
       System.out.println ("Нажмите 'q' чтобы выйти, нажмите 'w' чтобы срандомить вопрос  " ) ;
        InternsRepository internsRepository = new InternsRepository();
        internsRepository.getAllInterns();
        Crew<Intern> spisok = internsRepository.getAllInterns();
       /*  System.out.println("Печатаем весь список");
        spisok.printAll();

     System.out.println(Arrays.toString(spisok.randomizeTwo()));
     System.out.println(spisok.getRandomizeList().size());*/

        char ch ;
        int code ;
        while ( -1 != (code = System.in.read()) )
        {
               ch = (char) code ;

               // выйти когда нажато 'q'
               if ( 'q' == ch )
               {
                System.exit ( 0 ) ;
               }
               if ( 'w' == ch )
               {
                //System.out.println(Arrays.toString(spisok.randomizeTwo()));
                System.out.println(spisok.randomTwo());
               }
               else
               {
                System.out.println (" Нажмите 'q' чтобы выйти, нажмите 'w' чтобы срандомить вопрос " ) ;
               }

        }

    }
}
