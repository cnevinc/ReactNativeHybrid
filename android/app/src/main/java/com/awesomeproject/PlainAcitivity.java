package com.awesomeproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.facebook.react.ReactActivity;
import com.facebook.react.devsupport.DevSettingsActivity;

/**
 * Created by nevin on 2017-12-22.
 */

public class PlainAcitivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plain);
        findViewById(R.id.bt_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlainAcitivity.this.startActivity(new Intent(PlainAcitivity.this,MainActivity.class));
            }
        });
        findViewById(R.id.bt_react).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlainAcitivity.this.startActivity(new Intent(PlainAcitivity.this,MyReactActivity.class));
            }
        });
        findViewById(R.id.bt_dev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlainAcitivity.this.startActivity(new Intent(PlainAcitivity.this,DevSettingsActivity.class));
            }
        });
    }
}
