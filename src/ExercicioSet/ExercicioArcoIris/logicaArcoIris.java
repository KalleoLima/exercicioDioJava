package ExercicioSet.ExercicioArcoIris;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class logicaArcoIris {
    public static void main(String[] args) {
        Set<ArcoIris> mylist = new TreeSet<>();
        mylist.add(new ArcoIris("vermelho"));
        mylist.add(new ArcoIris("laranja"));
        mylist.add(new ArcoIris("amarelo"));
        mylist.add(new ArcoIris("verde"));
        mylist.add(new ArcoIris("azul"));
        mylist.add(new ArcoIris("anil"));
        mylist.add(new ArcoIris("violeta"));
        System.out.println("quantidade de cores do arco-íris:  "+ mylist.size());

            System.out.println(mylist);



        // revertendo treeset
        Set<ArcoIris> reverso = ((TreeSet<ArcoIris>)mylist).descendingSet();
        System.out.println(reverso);

// exibir cores que começa com a letra v
       for (ArcoIris cor: mylist){
           if (cor.getArcoIris().startsWith("v")) {
               System.out.println(cor);
           }
       }
       System.out.println();
        Iterator<ArcoIris> ii =  mylist.iterator();
       while (ii.hasNext()){
           ArcoIris cores = ii.next();
          if (cores.getArcoIris().startsWith("v")){
               ii.remove();
              System.out.println(mylist);
           }

       }
       // removendo todo conjunto
       mylist.clear();

       System.out.println(mylist);









    }

}
