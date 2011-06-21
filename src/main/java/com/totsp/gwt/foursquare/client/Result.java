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
public class Result extends JavaScriptObject {
    protected Result() {
    }
    
    

    public final native Meta getMeta() /*-{return this.meta; }-*/;
    public final native Response getResponse() /*-{return this.response; }-*/;
    
    
}
