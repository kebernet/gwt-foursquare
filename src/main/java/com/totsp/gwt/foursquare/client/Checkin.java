/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totsp.gwt.foursquare.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.Date;


/**
 *
 * @author robert.cooper
 */
public class Checkin extends JavaScriptObject {
    protected Checkin() {
    }

    final native String getCreatedAtAsString() /*-{
    return ""+this.createdAt;
    }-*/;
    
    public final Date getCreatedAt(){
        try{
            return new Date(Long.parseLong(this.getCreatedAtAsString()) * 1000);
        }catch(Exception e){
            GWT.log(null, e);
            return null;
        }
    }

    public final native String getId() /*-{ return this.id; }-*/;
    
    public final native String getType() /*-{ return this.type; }-*/;
    
    public final native Venue getVenue() /*-{ return this.venue; }-*/;
}
