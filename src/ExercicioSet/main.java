package ExercicioSet;

import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        Set<LinguagemFavorita> mylist = new TreeSet<>();

        mylist.add(new LinguagemFavorita("java", 1970, "intellij"));
        mylist.add(new LinguagemFavorita("python", 2000, "pycharm"));
        mylist.add(new LinguagemFavorita("c++", 2010, "vscode"));

System.out.println(mylist);








    }
}
