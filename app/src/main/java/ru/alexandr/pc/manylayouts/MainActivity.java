package ru.alexandr.pc.manylayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mBirthdayLayoutButton;
    private Button mSend;
    private EditText mEditTo;
    private EditText mEditDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBirthdayLayoutButton = (Button)findViewById(R.id.buttonBirthday);
        /*mBirthdayLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BirthdayActivity.class);
                startActivity(intent);
            }
        });*/

        mSend = (Button) findViewById(R.id.buttonSend);
        mEditTo = (EditText) findViewById(R.id.editTo);
        mEditDescription = (EditText) findViewById(R.id.editDescription);

        mSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BirthdayActivity.class);
                intent.putExtra("To", mEditTo.getText().toString());
                intent.putExtra("Desc", mEditDescription.getText().toString());
                startActivity(intent);
            }
        });
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }


}
