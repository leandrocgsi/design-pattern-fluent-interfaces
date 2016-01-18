package br.com.ilegra.designpatterns.fluent.interfaces.fluentinterface;

import java.util.ArrayList;
import java.util.List;

public class PersonFinder {
    
    private String firstName;
    private String lastName;
    private Boolean includePhoto;
    
    public List<Person> find(){
        return new ArrayList<Person>();
    }

    public PersonFinder firstName(String firstNameParam) {
        firstName = firstNameParam;
        return this;
    }

    public PersonFinder lastName(String lastNameParam) {
        lastName = lastNameParam;
        return this;
    }

    public PersonFinder includePhoto() {
        includePhoto = true;
        return this;
    }

    public void includePhoto(Boolean includePhoto) {
        this.includePhoto = includePhoto;
    }
        
}
