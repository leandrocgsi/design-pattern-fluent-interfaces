package br.com.ilegra.designpatterns.fluent.interfaces.fluentinterface.email;

import br.com.ilegra.designpatterns.fluent.interfaces.fluentinterface.PersonFinder;


public class EmailMessage {
    
private String _from;
private String _to;
private String _subject;
private String _body;
    
    public EmailMessage from(String from) {
        _from = from;        
        return this;
    }
    public EmailMessage to(String to) {
        _to = to;
        return this;
    }
    public EmailMessage withSubject(String subject) {
        _subject = subject;
        return this;
    }
    public EmailMessage withBody(String body) {
        _body = body;
        return this;
    }
    public void send() {
        System.out.println("Email enviado");
    }

}
