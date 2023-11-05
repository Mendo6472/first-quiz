package org.velezreyes.quiz.question6;

public class ScottCola implements Drink{

    public ScottCola() {
    }

    @Override
    public String getName() {
        return "ScottCola";
    }

    @Override
    public double getPrice() {
        return 0.75;
    }

    @Override
    public boolean isFizzy() {
        return true;
    }
    
}
