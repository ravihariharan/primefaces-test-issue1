package org.primefaces.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UISelectItems;
import javax.faces.component.UISelectMany;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.model.SelectItem;

import org.primefaces.component.selectmanymenu.SelectManyMenu;
import org.primefaces.component.selectmanymenu.SelectManyMenuRenderer;

public class LeanSelectManyRenderer extends SelectManyMenuRenderer {

    public static void debug(Integer number, String method, String msg) {
        System.out.println(number + " : " + method + " : " + msg);
    }

    @Override
    public Object getConvertedValue(FacesContext context, UIComponent component, Object submittedValue) throws ConverterException {
        debug(1, "getConvertedValue", "submittedValue ");
        if(submittedValue !=null &&  submittedValue.getClass().isArray()) {
            //debug(1, "getConvertedValue", "submittedValue " + Arrays.deepToString((Object[]) submittedValue));
            //return JoinString((Object[]) submittedValue, ",");
        }
        return super.getConvertedValue(context, component, submittedValue);
    }

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        debug(3, "encodeEnd", "");
        super.encodeEnd(context, component);
    }

    @Override
    protected void encodeMarkup(FacesContext context, SelectManyMenu menu) throws IOException {
        debug(4, "encodeMarkup", "");
        super.encodeMarkup(context, menu);
    }

    @Override
    protected void encodeScript(FacesContext context, SelectManyMenu menu) throws IOException {
        debug(18, "encodeScript", "");
        super.encodeScript(context, menu);
    }

    @Override
    protected void encodeInput(FacesContext context, SelectManyMenu menu, String clientId, List<SelectItem> selectItems) throws IOException {
        debug(6, "encodeInput", "");
        super.encodeInput(context, menu, clientId, selectItems);
    }

    @Override
    protected void encodeList(FacesContext context, SelectManyMenu menu, List<SelectItem> selectItems) throws IOException {
        debug(14, "encodeList", "--");
        super.encodeList(context, menu, selectItems);
    }

    @Override
    protected void encodeItem(FacesContext context, SelectManyMenu menu, SelectItem option, Object values, Object submittedValues, Converter converter, boolean customContent, boolean showCheckbox)
            throws IOException {
        debug(17, "encodeItem", "");
        super.encodeItem(context, menu, option, values, submittedValues, converter, customContent, showCheckbox);
    }

    @Override
    protected void encodeSelectItems(FacesContext context, SelectManyMenu menu, List<SelectItem> selectItems) throws IOException {
        debug(7, "encodeSelectItems", "");
        super.encodeSelectItems(context, menu, selectItems);
    }

    @Override
    protected void encodeOption(FacesContext context, SelectManyMenu menu, SelectItem option, Object values, Object submittedValues, Converter converter) throws IOException {
        debug(11, "encodeOption", "");
        super.encodeOption(context, menu, option, values, submittedValues, converter);
    }

    @Override
    protected void encodeFilter(FacesContext context, SelectManyMenu menu) throws IOException {
        debug(1, "encodeFilter", "");
        super.encodeFilter(context, menu);
    }

    @Override
    protected String calculateWrapperHeight(SelectManyMenu menu, int itemSize) {
        debug(16, "calculateWrapperHeight", "");
        return super.calculateWrapperHeight(menu, itemSize);
    }

    @Override
    protected String getSubmitParam(FacesContext context, UISelectMany selectMany) {
        debug(1, "getSubmitParam", "");
        return super.getSubmitParam(context, selectMany);
    }

    @Override
    public void encodeChildren(FacesContext context, UIComponent component) throws IOException {
        debug(2, "encodeChildren", "");
        super.encodeChildren(context, component);
    }

    @Override
    public boolean getRendersChildren() {
        debug(1, "getRendersChildren", "");
        return super.getRendersChildren();
    }

    @Override
    public String getHighlighter() {
        debug(1, "getHighlighter", "");
        return super.getHighlighter();
    }

    @Override
    public void decode(FacesContext context, UIComponent component) {
        debug(1, "decode", "");
        super.decode(context, component);
    }

    @Override
    protected Object getValues(UIComponent component) {
        debug(8, "getValues", "");
        return super.getValues(component);
    }

    @Override
    protected Object getSubmittedValues(UIComponent component) {
        debug(10, "getSubmittedValues", "");
        return super.getSubmittedValues(component);
    }

    @Override
    protected List<SelectItem> getSelectItems(FacesContext context, UIInput component) {
        debug(5, "getSelectItems", "");
        return super.getSelectItems(context, component);
    }

    @Override
    protected SelectItem createSelectItem(FacesContext context, UISelectItems uiSelectItems, Object value, Object label) {
        debug(1, "createSelectItem", "");
        return super.createSelectItem(context, uiSelectItems, value, label);
    }

    @Override
    protected String getOptionAsString(FacesContext context, UIComponent component, Converter converter, Object value) throws ConverterException {
        debug(12, "getOptionAsString", "");
        return super.getOptionAsString(context, component, converter, value);
    }

    @Override
    protected Converter findImplicitConverter(FacesContext context, UIComponent component) {
        debug(1, "findImplicitConverter", "");
        return super.findImplicitConverter(context, component);
    }

    @Override
    protected Object coerceToModelType(FacesContext ctx, Object value, Class itemValueType) {
        debug(1, "coerceToModelType", "");
        return super.coerceToModelType(ctx, value, itemValueType);
    }

    @Override
    protected boolean isSelected(FacesContext context, UIComponent component, Object itemValue, Object valueArray, Converter converter) {
        debug(13, "isSelected", "");
        return super.isSelected(context, component, itemValue, valueArray, converter);
    }

    @Override
    protected int countSelectItems(List<SelectItem> selectItems) {
        debug(15, "countSelectItems", "");
        return super.countSelectItems(selectItems);
    }

    @Override
    protected int countSelectItems(SelectItem[] selectItems) {
        debug(1, "countSelectItems", "");
        return super.countSelectItems(selectItems);
    }

    @Override
    protected String[] validateSubmittedValues(FacesContext context, UIInput component, Object[] oldValues, String... submittedValues) throws FacesException {
        debug(1, "validateSubmittedValues", "");
        return super.validateSubmittedValues(context, component, oldValues, submittedValues);
    }

    /**
     * This method joins String[] into a single String using sDelim as delimeter. The inverse of Tok().
     * 
     * @param sStrs String[] to be joined
     * @param sDelim String to be used to separate result parts
     * @return String joined String
     **/
    public static String JoinString(final Object[] aStrs, final String sDelim)
    {
        if ((aStrs == null) || (aStrs.length == 0))
        {
            return "";
        }

        String useDelim = sDelim;
        if (sDelim == null)
        {
            useDelim = " ";
        }

        final StringBuffer sb = new StringBuffer();
        for (int i = 0, iMax = aStrs.length; i < iMax; i++)
        {
            if (i > 0)
            {
                sb.append(useDelim);
            }

            sb.append(aStrs[i]);
        }

        return sb.toString();
    }

    /**
     * This method breaks a single String sToks up into String[] using each character of sDelims as a separator. The inverse of
     * JoinString().
     * 
     * @param sToks String to be tokenized
     * @param sDelim characters to use as delimeters while tokenizing
     * @return String[] tokenized String parts
     **/
    public static String[] TokenizeString(final String sToks, final String sDelims)
    {
        if ((sToks == null) || (sToks.length() == 0))
        {
            return new String[0];
        }

        if ((sDelims == null) || (sDelims.length() == 0))
        {
            return new String[]
                {
                    sToks
                };
        }

        final List list = new ArrayList();
        final StringTokenizer oTok = new StringTokenizer(sToks, sDelims);
        while (oTok.hasMoreTokens())
        {
            list.add(oTok.nextToken());
        }

        final String retval[] = new String[list.size()];
        list.toArray(retval);
        return retval;
    }
}
