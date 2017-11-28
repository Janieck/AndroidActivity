package paxsz.com.androidactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button start_normal_activity;
    private Button start_dialog_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showLog("onCreate");
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
                Intent normal = new Intent(this, NormalActivity.class);
                startActivity(normal);
                break;
            case R.id.start_dialog_activity:
                Intent dialog = new Intent(this,DialogActivity.class);
                startActivity(dialog);
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        showLog("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showLog("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showLog("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showLog("onRestart");
    }

    private void showLog(String log) {
        Log.e("MainActivity", log);
    }
}
