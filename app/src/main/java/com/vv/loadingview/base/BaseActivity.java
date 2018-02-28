package com.vv.loadingview.base;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.vv.loadingview.R;

/**
 * Created by ShenZhenWei on 18/2/27.
 */

public class BaseActivity extends AppCompatActivity{
    private Dialog loadbar = null;

    public void showProgressDialog() {
        if (loadbar == null) {
            loadbar = new Dialog(BaseActivity.this, R.style.load_dialog);
            LayoutInflater mInflater = BaseActivity.this.getLayoutInflater();
            View v = mInflater.inflate(R.layout.anim_load, null);
            loadbar.setContentView(v);
            loadbar.setCancelable(true);
            loadbar.show();
        } else {
            loadbar.show();
        }
    }
    public void closeProgressDialog() {
        if (loadbar != null) {
            if (loadbar.isShowing()) {
                loadbar.dismiss();
            }
        }
    }
}
