package com.icandothisallday2020.ex43fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {
    TextView tv;
    Button btn,btn2;
    //MainActivity 's onCreate 역할 method
    //Fragment 가 화면에 보일 뷰들을 리턴 하는 콜백(자동호출)메소드
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //fragment 가 보여줄 View 생성
        View view=inflater.inflate(R.layout.fragment_my,container,false);
        //container 한테 붙일건데/false: 지금은 안붙임---  null 쓰는 것과 비슷
        //만들어진 뷰 안에있는 TextView & Button 참조
        tv=view.findViewById(R.id.tv);
        btn=view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Change!");
            }
        });
        btn2=view.findViewById(R.id.btn2);
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //이 프레그먼트를 보여주는 액티비티의 TextView 제어
//                //1.액티비티 참조
//                MainActivity activity=(MainActivity) getActivity();
//                activity.tv.setText("!!!!!!!!!");
//            }        });
        return view;//만든 뷰 리턴
    }
    public void changeText(String msg){
        tv.setText(msg);
    }
}
