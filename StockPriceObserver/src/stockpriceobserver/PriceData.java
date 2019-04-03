/***************************************************************
******
 Author : Caleb Solares
 Course : COP4814
 Professor : Caryl Rahn
 Program : Assignment 3
 Purpose : Using a stock portfolio model, design interfaces and classes that implement the Observer Pattern.
 Due Date : 12/2/2018
 Certification:
 I hereby certify that this work is my own and none of it is the work of any other person.
 ..........{ Caleb Solares }..........
****************************************************************
*****/

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Map;

public class PriceData implements Subject {



    private Map < String, Double > prices;

    private ArrayList < Observer > observers;



    public PriceData() {

        prices = new HashMap < String, Double > ();

        observers = new ArrayList < Observer > ();

    }



    public void pricesChanged()

    {

        notifyObserver();

    }

    @Override

    public void registerObserver(Observer o) {

        observers.add(o);



    }

    @Override

    public void removeObserver(Observer o) {

        int i = observers.indexOf(o);

        if (i >= 0)

            observers.remove(i);



    }

    @Override

    public void notifyObserver() {

        for (int i = 0; i < observers.size(); i++)

        {

            Observer observer = (Observer) observers.get(i);

            observer.update(prices);

        }



    }



    public void setPrices(Map < String, Double > newPrices)

    {

        this.prices = newPrices;

        pricesChanged();

    }



    public Map < String, Double > getPrices()

    {

        return prices;

    }

}