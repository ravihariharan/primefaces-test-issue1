package org.primefaces.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named
@RequestScoped
public class TestViewCdi {

    private String testString;

    private String console;

    private String console2;

    private List<SelectItem> cars;

    private List<String> selectedOptions;

    @PostConstruct
    public void init() {
        testString = "Welcome to PrimeFaces (from CDI!) !!!";

        cars = new ArrayList<SelectItem>();
        cars.add(new SelectItem("5123456789012345", "5123456789012345"));
        cars.add(new SelectItem("5123456789012346", "5123456789012346"));
        cars.add(new SelectItem("5123456789012347", "5123456789012347"));
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public List<SelectItem> getCars() {
        return cars;
    }

    public void setCars(List<SelectItem> cars) {
        this.cars = cars;
    }

    public String getConsole2() {
        return console2;
    }

    public void setConsole2(String console2) {
        this.console2 = console2;
    }

    public List<String> getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(List<String> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    public void displayValue() {
        System.out.println("displayValue");
        System.out.println(selectedOptions);

        System.out.println("console " + console);
    }
}
