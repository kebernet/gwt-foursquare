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
public class Stats extends JavaScriptObject {
    
    protected Stats(){
        
    }
    
    public final native int getCheckinsCount() /*-{ return this.checkinsCount; }-*/;
    
    public final native int getUsersCount() /*-{ return this.usersCount; }-*/;
    
    
}
