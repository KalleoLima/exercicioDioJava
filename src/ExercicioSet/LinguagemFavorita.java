package ExercicioSet;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String name;
    private int ano;
    private String ide;


    public LinguagemFavorita(String name, int ano, String ide) {
        this.name = name;
        this.ano = ano;
        this.ide = ide;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", ano=" + ano +
                ", ide='" + ide + '\'' +
                '}';
    }


    @Override
    public int compareTo(LinguagemFavorita o) {
        int nome = this.getName().compareTo(o.getName());
        if (nome != 0) return nome;
        int years = Integer.compare(this.getAno(),o.getAno());
        if (years != 0) return years;
        int ide = this.getIde().compareTo(o.getIde());
        return ide;
    }
}

