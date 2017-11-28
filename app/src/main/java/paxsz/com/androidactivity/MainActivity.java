package paxsz.com.androidactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button start_normal_activity;
    private Button start_dialog_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        start_normal_activity = (Button) findViewById(R.id.start_normal_activity);
        start_dialog_activity = (Button) findViewById(R.id.start_dialog_activity);

        start_normal_activity.setOnClickListener(this);
        start_dialog_activity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_normal_activity:
                
                break;
            case R.id.start_dialog_activity:

                break;
        }
    }
}
