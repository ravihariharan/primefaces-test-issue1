package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable
{

    private String           testString;

    private String           console;

    private String           console2;

    private List<SelectItem> cars;

    @PostConstruct
    public void init()
    {
        testString = "Welcome to PrimeFaces!!!";

        cars = new ArrayList<SelectItem>();
        cars.add(new SelectItem("5123456789012345", "5123456789012345"));
        cars.add(new SelectItem("5123456789012346", "5123456789012346"));
        cars.add(new SelectItem("5123456789012347", "5123456789012347"));
    }

    public String getTestString()
    {
        return testString;
    }

    public void setTestString(String testString)
    {
        this.testString = testString;
    }

    public String getConsole()
    {
        return console;
    }

    public void setConsole(String console)
    {
        this.console = console;
    }

    public List<SelectItem> getCars()
    {
        return cars;
    }

    public void setCars(List<SelectItem> cars)
    {
        this.cars = cars;
    }

    public String getConsole2()
    {
        return console2;
    }

    public void setConsole2(String console2)
    {
        this.console2 = console2;
    }

}
