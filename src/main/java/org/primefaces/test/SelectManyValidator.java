package org.primefaces.test;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("SelectManyValidator")
public class SelectManyValidator implements Validator {
    
    public static void debug(Integer number, String method, String msg) {
        System.out.println(number + " : " + method + " : " + msg);
    }

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        debug(0, "validate", "SelectManyValidator " + value);
    }

}
