package ui;

import domain.model.Vak;

public class VakkenMain {

    public static void main(String[] args) {
        Vak bop = new Vak("BOP", 5);
        Vak oop = new Vak("OOP", 6);
        Vak algo = new Vak("Algo", 3);
        Vak web1 = new Vak("Web1", 4);
        Vak web2 = new Vak("Web2", 3);
        Vak pd = new Vak("Probleemoplossend Denken", 3);


        System.out.println("Dit vak moet je eerst studeren: " + "...");
        System.out.println("Dit vak moet je nu studeren: " + "...");
        System.out.println("Deze vakken moet ik nog allemaal studeren: ");

    }

}
