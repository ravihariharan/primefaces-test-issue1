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

    private List<String> selectedOptions;

    @PostConstruct
    public void init() {
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

    }
}
