package org.primefaces.test;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TestViewCdi {

    private List<String> selectedOptions;

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
        System.out.println(selectedOptions);
        System.out.println(console);
    }

    public List<String> getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(List<String> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

}
