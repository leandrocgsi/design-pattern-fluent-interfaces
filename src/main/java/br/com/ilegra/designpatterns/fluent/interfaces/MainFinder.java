package br.com.ilegra.designpatterns.fluent.interfaces;

import br.com.ilegra.designpatterns.fluent.interfaces.fluentinterface.PersonFinder;
import br.com.ilegra.designpatterns.fluent.interfaces.traditional.TraditionalPersonFinder;

public class MainFinder {

    public static void main(String[] args) {
        traditionalWay();
        fluentInterfaceWay();
    }
    static TraditionalPersonFinder traditionalPersons;
    static PersonFinder persons;

    private static void traditionalWay() {
        traditionalPersons = new TraditionalPersonFinder();
        traditionalPersons.setFirstName("Jeff");
        traditionalPersons.setLastName("Koala");
        traditionalPersons.setIncludePhoto(true);
        traditionalPersons = (TraditionalPersonFinder) traditionalPersons.find();
    }

    private static void fluentInterfaceWay() {
        persons = (PersonFinder) new PersonFinder().firstName("Jeff").lastName("Koala").includePhoto().find();
    }
}
