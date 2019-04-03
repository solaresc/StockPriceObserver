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

public interface Subject {



    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();

}