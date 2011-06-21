/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totsp.gwt.foursquare.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Frame;


/**
 *
 * @author robert.cooper
 */
public class FoursquareAuthenticator {
    private static final String BASE_URL = "https://foursquare.com/oauth2/authenticate?client_id=CLIENT_ID&response_type=token&redirect_uri=";

    public static void doAuthentication(String clientId, final AuthenticatorCallback callback) {
        final DialogBox box = new DialogBox();
        Frame frame = new Frame();
        int h = (int) (Window.getClientHeight() * .9);
        int w = (int) (Window.getClientWidth() * .9);
        box.setWidth(w + "px");

        box.setHeight(h + "px");
        box.setWidget(frame);
        frame.setWidth((w - 20) + "px");
        frame.setHeight((h - 20) + "px");

        String url = BASE_URL.replaceAll("CLIENT\\_ID", clientId) + URL.encodeComponent(GWT.getModuleBaseURL()+"4sq.html");
        frame.setUrl(url);
        box.center();
        registerCallback(new AuthenticatorCallback() {
                @Override
                public void onFailure(String reason) {
                    box.hide();
                    callback.onFailure(reason);
                }

                @Override
                public void onSuccess(String token) {
                    box.hide();
                    callback.onSuccess(token);
                }
            });
        box.show();
    }

    private static native void registerCallback(AuthenticatorCallback callback) /*-{
    $wnd["_foursquareToken"] = function(token) {
    callback.@com.totsp.peak.client.foursquare.FoursquareAuthenticator.AuthenticatorCallback::onSuccess(Ljava/lang/String;)(token);
    }
    $wnd["_fourssquareError"] = function(error) {
    callback.@com.totsp.peak.client.foursquare.FoursquareAuthenticator.AuthenticatorCallback::onFailure(Ljava/lang/String;)(token);
    }
    }-*/;

    public static interface AuthenticatorCallback {
        public void onFailure(String reason);

        public void onSuccess(String token);
    }
}
