package fanfou.funny;

import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.component.Dialog;
import net.rim.device.api.ui.component.RichTextField;

class HomeScreen extends MainScreen {
    public HomeScreen() {
        setTitle("funny is share.");

        add(new RichTextField("Hello World!", Field.NON_FOCUSABLE));
    }

    public void close() {
        Dialog.alert("Close Now");
        super.close();
    }
}
