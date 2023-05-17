package boo.activitydemo;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by hbill on 26/06/2016.
 */
public class Display extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
    }
}
