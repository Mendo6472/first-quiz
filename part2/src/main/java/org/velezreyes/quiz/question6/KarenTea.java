package org.velezreyes.quiz.question6;

public class KarenTea implements Drink{

    public KarenTea(){
    }

    @Override
    public String getName() {
        return "KarenTea";
    }

    @Override
    public double getPrice() {
        return 1.0;
    }

    @Override
    public boolean isFizzy() {
        return false;
    }
    
}
