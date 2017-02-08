package com.test.transitions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView1 = (TextView) findViewById(R.id.text1);
        final TextView textView2 = (TextView) findViewById(R.id.text2);
        final RelativeLayout parent = (RelativeLayout) findViewById(R.id.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
                    Fade fade = new Fade();
                    fade.setDuration(2000);
                    TransitionManager.beginDelayedTransition(parent);
                }

                textView1.setVisibility(textView1.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
                textView2.setVisibility(textView2.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);

            }
        });
    }
}
