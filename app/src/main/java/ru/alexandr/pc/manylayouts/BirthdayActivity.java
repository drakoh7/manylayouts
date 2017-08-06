package ru.alexandr.pc.manylayouts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayActivity extends AppCompatActivity {

    private TextView mThat;
    private String mTo = null;
    private String mDesc = null;
    private Date date = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mThat = (TextView) findViewById(R.id.textThat);
        mTo = getIntent().getExtras().getString("To");
        mDesc = getIntent().getExtras().getString("Desc");

        String sDate = new SimpleDateFormat("hh:mm:ss").format(date) + "\n";

        if(mTo == null && mDesc != null)
            mThat.setText(sDate + "Неизвестный передал Вам " + mDesc);
        else if(mTo != null && mDesc == null)
            mThat.setText(sDate + mTo + " Вам ничего не передал");
        else if (mTo != null && mDesc != null)
            mThat.setText(sDate + mTo + " передал Вам: " + mDesc);
        else
            mThat.setText(sDate + "Никто ничего не передавал...");


    }

}
