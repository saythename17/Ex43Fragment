package com.icandothisallday2020.ex43fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    MyFragment fragment;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Fragment : (제작,외견-java+XML*LifeCycle*)==Activity + (사용)==View
        tv=findViewById(R.id.tv);
        //Fragment 를 관리하는 Manager 객체 소환
        manager=getSupportFragmentManager();
        fragment=(MyFragment) manager.findFragmentById(R.id.frag);
    }

    public void click(View view) {
        //MyFragment 안 TextView 변경
        //fragment.tv.setText("Change through MainActivity!");
        fragment.changeText("Nice!!!");
    }
    //MyFragment 안 Button 의 onClick 속성 콜백메소드
    public  void clickBtn2(View view){
        tv.setText("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
