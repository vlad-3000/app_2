package com.example.logapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyLogSystem";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = findViewById(R.id.button);
        Button two = findViewById(R.id.button2);
        Button three = findViewById(R.id.button3);
        Button four = findViewById(R.id.button4);
        Button five = findViewById(R.id.button5);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfo("INFO Alert: Проверьте логи для большей информации");
                logMessage("Какая-то инфомарция!");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfo("ERROR Alert: Проверьте логи для большей информации");
                logError("Какая-то ошибка!");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfo("VERBOSE Alert: Проверьте логи для большей информации");
                logVerbose("Какая-то подробность!");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfo("DEBUG Alert: Проверьте логи для большей информации");
                logDebug("Какая-то отладка!");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfo("WARNING Alert: Проверьте логи для большей информации");
                logWarning("Какое-то предупреждение!");
            }
        });
    }
    private void showInfo(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
    public void logMessage(String message) {
        Log.i(TAG, message);
    }

    public void logError(String errorMessage) {
        Log.e(TAG, errorMessage);
    }

    public void logVerbose(String verboseMessage) {
        Log.v(TAG, verboseMessage);
    }

    public void logDebug(String debugMessage) {
        Log.d(TAG, debugMessage);
    }

    public void logWarning(String warningMessage) {
        Log.w(TAG, warningMessage);
    }

}