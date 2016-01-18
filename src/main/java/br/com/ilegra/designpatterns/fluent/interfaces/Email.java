package br.com.ilegra.designpatterns.fluent.interfaces;

import br.com.ilegra.designpatterns.fluent.interfaces.fluentinterface.email.EmailMessage;

public class Email {

    public static void main(String[] args) {
        new EmailMessage()
                .from("leandro.goncalves@ilegra.com")
                .to("gambero@ilegra.com")
                .withSubject("EMail with Fluent Interface")
                .withBody("My Message")
                .send();
    }
}
