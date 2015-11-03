package gigme.uta.com.gigme;

import android.os.Bundle;
import android.app.Activity;

public class EventDetails extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
