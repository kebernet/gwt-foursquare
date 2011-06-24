/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totsp.gwt.foursquare.client;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.RootPanel;

import java.util.Date;


/**
 *
 * @author robert.cooper
 */
public class Foursquare {
    private static final String BASE_URL = "https://api.foursquare.com/v2/";
    private final String token;
    private int lastCallbackId = Math.abs(Random.nextInt());

    public Foursquare(String token) {
        this.token = token;
    }

    public void getCheckins(Date fromDate, Date toDate, Short limit, Integer offset, String userId,
        FoursquareCallback callback) {
        String callbackMethod = "foursquare_" + lastCallbackId++;
        createCallbackMethod(callbackMethod, callback);

        String url = BASE_URL + "users/" + userId + "/checkins?oauth_token=" + this.token + "&callback=" +
            callbackMethod;

        if (toDate != null) {
            url += ("&beforeTimestamp=" + (toDate.getTime() / 1000));
        }

        if (fromDate != null) {
            url += ("&afterTimestamp=" + (fromDate.getTime() / 1000));
        }

        if (limit != null) {
            assert limit < 250 : "Invalid value. Limit must be between 1 and 250";
            url += ("&limit=" + limit);
        }

        if (offset != null) {
            url += ("&offset=" + offset);
        }

        createScriptTag(url);
    }

    public void getMyCheckins(Date fromDate, Date toDate, Short limit, Integer offset, FoursquareCallback callback) {
        this.getCheckins(fromDate, toDate, limit, offset, "self", callback);
    }

    static native void createCallbackMethod(String callbackMethodName, FoursquareCallback callback) /*-{
    $wnd[callbackMethodName] = function( value ){
    callback.@com.totsp.peak.client.foursquare.FoursquareCallback::onResponse(Lcom/totsp/peak/client/foursquare/Result;)(value);
    }
    }-*/;

    static void createScriptTag(String url) {
        Element script = DOM.createElement("script");
        DOM.setElementAttribute(script, "src", url);
        DOM.setElementAttribute(script, "type", "text/javascript");
        DOM.appendChild(RootPanel.get().getElement(), script);
    }
}
