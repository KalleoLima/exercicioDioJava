package Temperatura;

public class LogicaTemperatura {
String Mes;
double temperatura;


    public LogicaTemperatura(String mes, int temperatura) {
        this.Mes = mes;
        this.temperatura = temperatura;
    }


    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "Mes='" + Mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}
