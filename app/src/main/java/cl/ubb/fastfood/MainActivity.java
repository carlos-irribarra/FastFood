package cl.ubb.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button _button1, _button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _button1=findViewById(R.id.button1);
        _button2=findViewById(R.id.button2);

        _button1.setOnClickListener(this);
        _button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                startActivity(new Intent(getApplicationContext(), Menu.class));
                break;
            case R.id.button2:
                startActivity(new Intent(getApplicationContext(), info.class));
        }
    }
}
