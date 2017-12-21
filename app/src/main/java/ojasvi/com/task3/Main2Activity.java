package ojasvi.com.task3;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;


public class Main2Activity extends AppCompatActivity {

    public String s1 ="Second Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        Snackbar snackbar = Snackbar
                .make(relativeLayout, s1, Snackbar.LENGTH_LONG);

        snackbar.show();
    }
}
