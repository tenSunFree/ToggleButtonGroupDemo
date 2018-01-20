package com.example.administrator.togglebuttongroupdemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CustomCompoundToggleButton dutchFlowerFieldCustomCompoundToggleButton = null;
    boolean isClickDutchFlowerFieldCustomCompoundToggleButton = false;
    TextView dutchFlowerFieldTextView = null;

    CustomCompoundToggleButton frenchLavenderGrasslandCustomCompoundToggleButton = null;
    boolean isClickFrenchLavenderGrasslandCustomCompoundToggleButton = false;
    TextView frenchLavenderGrasslandTextView = null;

    CustomCompoundToggleButton indiaFlowerValleyNationalParkCustomCompoundToggleButton = null;
    boolean isClickIndiaFlowerValleyNationalParkCustomCompoundToggleButton = false;
    TextView indiaFlowerValleyNationalParkTextView = null;

    CustomCompoundToggleButton japanShibaSakuraCustomCompoundToggleButton = null;
    boolean isClickJapanShibaSakuraCustomCompoundToggleButton = false;
    TextView japanShibaSakuraTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dutchFlowerFieldTextView = findViewById(R.id.dutchFlowerFieldTextView);
        dutchFlowerFieldCustomCompoundToggleButton = findViewById(R.id.dutchFlowerFieldCustomCompoundToggleButton);
        dutchFlowerFieldCustomCompoundToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClickDutchFlowerFieldCustomCompoundToggleButton == false) {
                    handlerPostDelayed(dutchFlowerFieldTextView);
                    isClickDutchFlowerFieldCustomCompoundToggleButton = true;
                } else {
                    dutchFlowerFieldTextView.setVisibility(View.INVISIBLE);
                    isClickDutchFlowerFieldCustomCompoundToggleButton = false;
                }
            }
        });

        frenchLavenderGrasslandTextView = findViewById(R.id.frenchLavenderGrasslandTextView);
        frenchLavenderGrasslandCustomCompoundToggleButton = findViewById(R.id.frenchLavenderGrasslandCustomCompoundToggleButton);
        frenchLavenderGrasslandCustomCompoundToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClickFrenchLavenderGrasslandCustomCompoundToggleButton == false) {
                    handlerPostDelayed(frenchLavenderGrasslandTextView);
                    isClickFrenchLavenderGrasslandCustomCompoundToggleButton = true;
                } else {
                    frenchLavenderGrasslandTextView.setVisibility(View.INVISIBLE);
                    isClickFrenchLavenderGrasslandCustomCompoundToggleButton = false;
                }
            }
        });

        indiaFlowerValleyNationalParkTextView = findViewById(R.id.indiaFlowerValleyNationalParkTextView);
        indiaFlowerValleyNationalParkCustomCompoundToggleButton = findViewById(R.id.indiaFlowerValleyNationalParkCustomCompoundToggleButton);
        indiaFlowerValleyNationalParkCustomCompoundToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClickIndiaFlowerValleyNationalParkCustomCompoundToggleButton == false) {
                    handlerPostDelayed(indiaFlowerValleyNationalParkTextView);
                    isClickIndiaFlowerValleyNationalParkCustomCompoundToggleButton = true;
                } else {
                    indiaFlowerValleyNationalParkTextView.setVisibility(View.INVISIBLE);
                    isClickIndiaFlowerValleyNationalParkCustomCompoundToggleButton = false;
                }
            }
        });

        japanShibaSakuraTextView = findViewById(R.id.japanShibaSakuraTextView);
        japanShibaSakuraCustomCompoundToggleButton = findViewById(R.id.japanShibaSakuraCustomCompoundToggleButton);
        japanShibaSakuraCustomCompoundToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClickJapanShibaSakuraCustomCompoundToggleButton == false) {
                    handlerPostDelayed(japanShibaSakuraTextView);
                    isClickJapanShibaSakuraCustomCompoundToggleButton = true;
                } else {
                    japanShibaSakuraTextView.setVisibility(View.INVISIBLE);
                    isClickJapanShibaSakuraCustomCompoundToggleButton = false;
                }
            }
        });
    }

    public void handlerPostDelayed(final View view) {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                view.setVisibility(View.VISIBLE);
            }
        }, 700);
    }
}
