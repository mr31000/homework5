package com.example.homework5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
      private int[] count = {0};
    public void btnClick(View view)
    {
        TextView tv1 =  findViewById(R.id.tv);
        Button btn1 = findViewById(R.id.btn);
        count[0]++;
        if (count[0] > 6) {
            btn1.setText("BOOM !");
            count[0] = 0;
        } else
            tv1.setText("This is a click number: " + count[0]);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
}
