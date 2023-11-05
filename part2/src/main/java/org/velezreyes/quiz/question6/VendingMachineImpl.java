package org.velezreyes.quiz.question6;

import java.util.ArrayList;

public class VendingMachineImpl implements VendingMachine{

  private static VendingMachine instance;
  private double money;
  private ArrayList<Drink> drinks;

  private VendingMachineImpl() {
    this.money = 0;
    this.drinks = new ArrayList<>();
    drinks.add(new ScottCola());
    drinks.add(new KarenTea());
  }

  public static VendingMachine getInstance() {
    if (instance == null) {
      instance = new VendingMachineImpl();
    }
    return instance;
  }

  @Override
  public void insertQuarter() {
    this.money += 0.25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    Drink drink = null;
    for (Drink d : drinks) {
      if (d.getName().equalsIgnoreCase(name)) {
        drink = d;
        break;
      }
    }
    if (drink == null) {
      throw new UnknownDrinkException();
    }
    double cost = drink.getPrice();
    if(this.money < cost){
      throw new NotEnoughMoneyException();
    }
    this.money -= cost;
    return drink;
  }
}
