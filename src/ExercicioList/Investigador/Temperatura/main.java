package ExercicioList.Investigador.Temperatura;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
double mediaTemp = 0;
double soma = 0;
        List<LogicaTemperatura> guardaTempEmes= new ArrayList<>();


        guardaTempEmes.add(new LogicaTemperatura("janeiro",2));
        guardaTempEmes.add(new LogicaTemperatura("fevereiro",4));
        guardaTempEmes.add(new LogicaTemperatura("março",20));
        guardaTempEmes.add(new LogicaTemperatura("abril",20));
        guardaTempEmes.add(new LogicaTemperatura("maio",30));
        guardaTempEmes.add(new LogicaTemperatura("junho",10));
for (LogicaTemperatura temp: guardaTempEmes){

     soma += temp.getTemperatura();

}

mediaTemp = soma / guardaTempEmes.size();
System.out.println("média semestral "+mediaTemp);

for (LogicaTemperatura tes: guardaTempEmes){

if (tes.getTemperatura() > mediaTemp){
    System.out.println("Mês: "+tes.getMes() +" temperatura do mês: "+tes.getTemperatura()+"°");
}

}
    }

}
