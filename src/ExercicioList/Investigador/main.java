package ExercicioList.Investigador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int soma = 0;
        Scanner input = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima??");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");


   for(String per: perguntas) {
       System.out.println(per);
       String simOrNao = input.nextLine();
       if (simOrNao.equalsIgnoreCase("sim")){
           soma += 1;
       }
   }
   if (soma == 2){
       System.out.println("ela é suspeita");
   } else if (soma == 3 || soma == 4  ) {
       System.out.println("ela é cúmplice!");

   }else if (soma == 5) {
       System.out.println("ela é assassina");

   }

















    }
}
