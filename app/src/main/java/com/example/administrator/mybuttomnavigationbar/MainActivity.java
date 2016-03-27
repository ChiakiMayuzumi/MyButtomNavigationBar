package com.example.administrator.mybuttomnavigationbar;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);


        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);



        BottomNavigationBar bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        bottomNavigationBar
                //.setMode(BottomNavigationBar.MODE_CLASSIC)
                .addItem(new BottomNavigationItem(R.drawable.ic_calendar_2, "日历").setActiveColor(R.color.colorQingTai))
                .addItem(new BottomNavigationItem(R.drawable.ic_know_2,"知道").setActiveColor(R.color.colorQingTai))
                .addItem(new BottomNavigationItem(R.drawable.ic_house,"社区").setActiveColor(R.color.colorQingTai))
                .addItem(new BottomNavigationItem(R.drawable.ic_user,"我的").setActiveColor(R.color.colorQingTai))
                .initialise();


        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                if (position == 0) {
                    textView.setText("你点击了日历界面");
                } else if (position == 1) {
                textView.setText("你点击了知道界面");
                }else if(position == 2) {
                    textView.setText("你点击了社区界面");
                }
                else if(position == 3) {
                    textView.setText("你点击了我的界面");
                }

            }

            @Override
            public void onTabUnselected(int position) {
            }

            @Override
            public void onTabReselected(int position) {
                if (position == 0) {
                    textView.setText("你又一次点击了日历界面");
                } else if (position == 1) {
                    textView.setText("你又一次点击了知道界面");
                }else if(position == 2) {
                    textView.setText("你又一次点击了社区界面");
                }
                else if(position == 3) {
                    textView.setText("你又一次点击了我的界面");
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
