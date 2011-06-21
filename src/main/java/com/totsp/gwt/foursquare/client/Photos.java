/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totsp.gwt.foursquare.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author robert.cooper
 */
public class Photos extends JavaScriptObject {
    
    protected Photos(){
        
    }
    
    
    public final native int getCount() /*-{ return this.count; }-*/;
    
}
