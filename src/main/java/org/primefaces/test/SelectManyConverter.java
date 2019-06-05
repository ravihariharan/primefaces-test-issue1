package org.primefaces.test;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("SelectManyConverter")
public class SelectManyConverter implements Converter {

    public static void debug(Integer number, String method, String msg) {
        System.out.println(number + " : " + method + " : " + msg);
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        debug(0, "getAsObject", "SelectManyConverter Object : " + value);
        return value;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        debug(0, "getAsString", "SelectManyConverter String : " + value);
        return (String) value;
    }

}
