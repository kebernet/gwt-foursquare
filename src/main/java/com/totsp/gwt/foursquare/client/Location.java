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
public class Location extends JavaScriptObject {
    
    protected Location(){
        
    }
    
    public native final String getAddress() /*-{ return this.address; }-*/;
    
    public native final String getCrossStreet() /*-{ return this.crossStreet; }-*/;
    
    public native final String getCity() /*-{ return this.city; }-*/;
    
    public native final String getState() /*-{ return this.state; }-*/;
    
    public native final String getPostalCode() /*-{ return this.postalCode; }-*/;
    
    public native final String getCountry() /*-{ return this.country; }-*/;
    
    public native final double getLat() /*-{ return this.lat; }-*/;
    
    public native final double getLng() /*-{ return this.lng; }-*/;
    
    public final native int getDistance() /*-{ return this.distance; }-*/;

    
    
    
}
