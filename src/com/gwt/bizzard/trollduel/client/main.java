package com.gwt.bizzard.trollduel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class main implements EntryPoint {

    public void onModuleLoad() {
        TrollGallery w = new TrollGallery();
        RootPanel.get().add(w);
   }

}
