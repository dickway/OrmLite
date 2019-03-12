package com.ydy.weidong.ormlite;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        ChargeDao chargeDao = new ChargeDao(this);
        for (int i = 1; i <= 10; i++) {
            @SuppressLint("SimpleDateFormat") Charge charge1 = new Charge(null, (new SimpleDateFormat("yyyy-mm-dd HH:MM:SS").format(new Date())), i * 10f);
            chargeDao.addCharge(charge1);
        }

        List<Charge> charges = chargeDao.queryAll();
        for (Charge charge : charges) {
            Log.i(TAG, "initData: charge" + charge.toString());
        }

    }
}
