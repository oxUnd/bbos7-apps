/*
 * Application.java
 *
 * com.funny, 2018
 * 
 * Main Application
 */

package fanfou.funny;

import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.Dialog;

/**
 * 
 */
class Application extends UiApplication {
    public static void main(String[] args) {
        Application theApp = new Application();

        theApp.enterEventDispatcher();
        
    }
    
    public Application() {
        pushScreen(new HomeScreen());
    }

    public static void errorDialog(final String message) {
        UiApplication.getUiApplication().invokeLater(new Runnable() {
            public void run() {
                Dialog.alert(message);
            }
        });
    }
} 
