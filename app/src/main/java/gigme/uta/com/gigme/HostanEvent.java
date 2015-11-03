package gigme.uta.com.gigme;

import android.os.Bundle;
import android.app.Activity;

public class HostanEvent extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostan_event);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
