/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totsp.gwt.foursquare.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 *
 * @author robert.cooper
 */
public class Category extends JavaScriptObject {
    
    protected Category(){
        
    }
    
    public native final String getId()/*-{ return this.id; }-*/;
    public native final String getName()/*-{ return this.name; }-*/;
    public native final String getPluralName()/*-{ return this.pluralName; }-*/;
    public native final String getIconURL()/*-{ return this.icon; }-*/;
    public native final JsArrayString getParents()/*-{return this.parents; }-*/;
    public native final boolean isPrimary()/*-{ return (true & this.primary) }-*/;
}
