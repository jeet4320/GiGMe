package gigme.uta.com.gigme;

import android.os.Bundle;
import android.app.Activity;

public class MyGigs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_gigs);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
