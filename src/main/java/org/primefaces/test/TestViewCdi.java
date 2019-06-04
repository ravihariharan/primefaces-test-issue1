package org.primefaces.test;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TestViewCdi {

    private String console;

    @PostConstruct
    public void init() {
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public void displayValue() {
        System.out.println("displayValue");
        System.out.println(console);

    }
}
