package cn.edu.butterknife.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.iv_dog)
    ImageView iv_dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        iv_dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"点击了图片",Toast.LENGTH_SHORT).show();
            }
        });
    }

//    @OnClick(R.id.tv_text1)
//    public void translate(){
//        Toast.makeText(this, "点击了我", Toast.LENGTH_SHORT).show();
//        iv_dog.animate().scaleXBy(0.5f).scaleXBy(0.5f).alphaBy(0.3f).setDuration(2000).start();
//    }
}
