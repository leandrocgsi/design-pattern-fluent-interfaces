package br.com.ilegra.designpatterns.fluent.interfaces.fluentinterface;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    
    private List<String> persons;

    public PersonList() {
        persons = new ArrayList<String>();
    }
        
    public PersonList add(String person){
        persons.add(person);
        return this;
    }
    
    public PersonList remove(String person){
        persons.remove(person);
        return this;
    }
}