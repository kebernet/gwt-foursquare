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
public class Contact extends JavaScriptObject {
    protected Contact(){
        
    }
    public final native String getPhone() /*-{ return this.phone; }-*/;
    public final native String getTwitter() /*-{ return this.twitter; }-*/;
}
