package cn.edu.butterknife.butterknife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.iv_dog)
    ImageView ivDog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        ivDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "点击了图片", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @OnClick(R.id.tv_text1)
    public void translate(){
        Toast.makeText(this, "点击了我", Toast.LENGTH_SHORT).show();
        ivDog.animate().scaleXBy(0.5f).scaleXBy(0.5f).alphaBy(0.3f).setDuration(2000).start();
    }

    @OnClick(R.id.tv_text2)
    public void Enter(){
        startActivity(new Intent(this,SecondActivity.class));
        finish();
    }
}
