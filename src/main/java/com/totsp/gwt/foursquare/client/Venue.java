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
public class Venue extends JavaScriptObject {
    protected Venue() {
    }

    public final native String getId() /*-{ return this.id; }-*/;

    public final native String getName() /*-{ return this.name; }-*/;
    
    public final native Contact getContact() /*-{ return this.contact; }-*/;
    
    public final native Location getLocation() /*-{ return this.location; }-*/;
    
    public final native JsArray<Category> getCategories() /*-{ return this.categories; }-*/;
    
    public native final boolean isVerified()/*-{ return (true & this.verified) }-*/;
    
    public final native int getTodos() /*-{ return this.todos; }-*/;
    
    public final native int getBeenHere() /*-{ return this.beenHere; }-*/;
    
    public final native String getShortUrl() /*-{ return this.shortUrl; }-*/;
    
    
    
}
