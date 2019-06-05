package org.primefaces.test;

import java.beans.FeatureDescriptor;
import java.util.Iterator;

import javax.el.ELContext;
import javax.el.ELResolver;


public class IndexedValueCollectionELResolver extends ELResolver {
    
    public static void debug(Integer number, String method, String msg) {
        System.out.println(number + " : " + method + " : " + msg);
    }
    
    @Override
    public Object getValue(ELContext context, Object base, Object property) {
        debug(9, "getValue", "IndexedValueCollectionELResolver");
        return null;
    }

    @Override
    public Class<?> getType(ELContext context, Object base, Object property) {
        debug(9, "getType", "IndexedValueCollectionELResolver");
        return null;
    }

    @Override
    public void setValue(ELContext context, Object base, Object property, Object value) {
        debug(9, "setValue", "IndexedValueCollectionELResolver");

    }

    @Override
    public boolean isReadOnly(ELContext context, Object base, Object property) {
        debug(9, "isReadOnly", "IndexedValueCollectionELResolver");
        return false;
    }

    @Override
    public Iterator<FeatureDescriptor> getFeatureDescriptors(ELContext context, Object base) {
        debug(9, "getFeatureDescriptors", "IndexedValueCollectionELResolver");
        return null;
    }

    @Override
    public Class<?> getCommonPropertyType(ELContext context, Object base) {
        debug(9, "getCommonPropertyType", "IndexedValueCollectionELResolver");
        return null;
    }

}
