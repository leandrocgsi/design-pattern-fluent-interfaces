package br.com.ilegra.designpatterns.fluent.interfaces.traditional;

import java.util.ArrayList;
import java.util.List;

public class TraditionalPersonFinder {
    
    private String firstName;
    private String lastName;
    private Boolean includePhoto;
    
    public List<TraditionalPerson> find(){
        return new ArrayList<TraditionalPerson>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getIncludePhoto() {
        return includePhoto;
    }

    public void setIncludePhoto(Boolean includePhoto) {
        this.includePhoto = includePhoto;
    }
        
}
