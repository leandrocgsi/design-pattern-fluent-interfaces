package br.com.ilegra.designpatterns.fluent.interfaces.traditional;

import java.util.ArrayList;
import java.util.List;

public class TraditionalPersonList {
    
    private List<String> persons;

    public TraditionalPersonList() {
        persons = new ArrayList<String>();
    }
        
    public void add(String person){
        persons.add(person);
    }
    
    public void remove(String person){
        persons.remove(person);        
    }

}
