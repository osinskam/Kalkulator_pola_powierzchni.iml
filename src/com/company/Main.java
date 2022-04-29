package com.company;

public class Main {

    public static void main(String[] args) {
	Kolo kolo = new Kolo(4);
        System.out.println(kolo.obliczPowierzchnie());

        Kwadrat kwadrat = new Kwadrat(10);
        System.out.println(kwadrat.obliczPowierzchnie());
        System.out.println(kwadrat.obliczObwod());
        System.out.println("Cool");
    }
}

class Kwadrat implements Ksztalt {
    double dlugoscBoku;

    Kwadrat (double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public double obliczPowierzchnie() {
        return dlugoscBoku * dlugoscBoku;
    }

    @Override
    public double obliczObwod() {

        return dlugoscBoku * 4;
    }
}
class Kolo implements Ksztalt {
    double promien;
    Kolo(double promien) {

        this.promien = promien;
    }

    @Override
    public double obliczPowierzchnie() {

        return Math.PI * promien * promien;
    }

    @Override
    public double obliczObwod() {

        return 2 * Math.PI * promien;
    }
}