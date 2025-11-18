package ExercicioSet.ExercicioArcoIris;

public class ArcoIris implements Comparable<ArcoIris> {
    private String arcoIris;

    public ArcoIris(String arcoIris) {
        this.arcoIris = arcoIris;
    }

    public String getArcoIris() {
        return arcoIris;
    }

    public void setArcoIris(String arcoIris) {
        this.arcoIris = arcoIris;
    }

    @Override
    public String toString() {
        return "ArcoIris{" +
                "arcoIris='" + arcoIris + '\'' +
                '}';
    }

    @Override
    public int compareTo(ArcoIris arco) {
        return this.getArcoIris().compareTo(arco.getArcoIris());
    }

}
