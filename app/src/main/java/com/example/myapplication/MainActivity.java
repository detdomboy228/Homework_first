package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float coat = 70;
    float coat_sale = 77;
    float hat = 25;
    float hat_sale = 37;
    float suit = 53;
    float suit_sale = 44;
    float shirt = 19;
    float shirt_sale = 0;
    float shoes = 41;
    float shoes_sale = 32;
    float capital = 312;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView flag = findViewById(R.id.txt_flag);
        TextView count = findViewById(R.id.txt_count);
        if (check()) {
            flag.setText("Да, денег хватит.");
        } else {
            flag.setText("Нет, денег не хватит.");
        }
        count.setText(calculation());
    }

    public boolean check() {
        return coat * (100 - coat_sale) / 100 + hat * (100 - hat_sale) /
                100 + suit * (100 - suit_sale) / 100 + shirt * (100 - shirt_sale) /
                100 + shoes * (100 - shoes_sale) / 100 <= capital;
    }

    public String calculation() {
        if (check()) {
            return "Остаток средств: " + (capital - (coat * (100 - coat_sale) / 100 + hat * (100 - hat_sale) /
                    100 + suit * (100 - suit_sale) / 100 + shirt * (100 - shirt_sale) /
                    100 + shoes * (100 - shoes_sale) / 100)) + " серебряных монет.";
        }
        else {
            return "-";
        }
    }
}