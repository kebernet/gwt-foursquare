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
public class Response extends JavaScriptObject {
    
    
    protected Response() {
    }
    
    public final native Checkins getCheckins() /*-{return this.checkins; }-*/;
}
