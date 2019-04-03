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

import java.text.DecimalFormat;

import java.util.HashMap;

import java.util.Map;

public class PricesDisplay implements Observer, DisplayElement {

    private String tickerSymbols[];

    private String portfolio;

    private Subject priceData;

    private Map < String, Double > prices;





    public PricesDisplay(String portfolio, PriceData pricedata)

    {

        this.portfolio = portfolio;

        this.priceData = pricedata;

        prices = new HashMap < String, Double > ();

        priceData.registerObserver(this);

    }



    @Override

    public void display() {

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Portfolio #" + portfolio + ", ");

        for (int i = 0; i < tickerSymbols.length; i++) {

            System.out.print(tickerSymbols[i] + " = " + df.format(prices.get(tickerSymbols[i])) + ", ");

        }

        System.out.println("");

    }

    @Override

    public void update(Map < String, Double > prices) {

        this.prices = prices;

        display();

    }

    public void setStocks(String[] strings) {

        this.tickerSymbols = strings;



    }



}