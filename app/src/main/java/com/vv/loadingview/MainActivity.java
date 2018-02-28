package com.vv.loadingview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vv.loadingview.base.BaseActivity;

public class MainActivity extends BaseActivity {
    private Button btnShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShow=findViewById(R.id.btn_show);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProgressDialog();
            }
        });


    }
}
