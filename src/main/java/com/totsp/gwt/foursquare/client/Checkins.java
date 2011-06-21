/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totsp.gwt.foursquare.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 *
 * @author robert.cooper
 */
public class Checkins extends JavaScriptObject{
    
    protected Checkins(){
        
    }
    
    public final native int getCount() /*-{ return this.count; }-*/;
    
    public final native JsArray<Checkin> getItems() /*-{ return this.items; }-*/;
    
}
