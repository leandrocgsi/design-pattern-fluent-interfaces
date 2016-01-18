package br.com.ilegra.designpatterns.fluent.interfaces;

import br.com.ilegra.designpatterns.fluent.interfaces.fluentinterface.PersonList;
import br.com.ilegra.designpatterns.fluent.interfaces.traditional.TraditionalPersonList;

public class TestPersonList {
        
    public static void main( String[] args ){        
        traditionalWay();        
        fluentInterfaceWay();
    }
    
    static TraditionalPersonList traditionalPersons;
    static PersonList persons;
    
    private static void traditionalWay() {
        traditionalPersons = new TraditionalPersonList();
        traditionalPersons.add("Steve Jobs");
        traditionalPersons.add("Borges");
        traditionalPersons.add("Jeff Koala");
        traditionalPersons.add("Miner");
        traditionalPersons.add("German");
        traditionalPersons.remove("Jeff Koala");
    }

    private static void fluentInterfaceWay() {
        persons = new PersonList()
                .add("Steve Jobs")
                .add("Borges")
                .add("Jeff Koala")
                .add("Miner")
                .add("German")
                .remove("Jeff Koala");
    }
}
