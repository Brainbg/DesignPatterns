package com.brainbg.designpattern.Prototype;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.brainbg.designpattern.R;
import com.brainbg.designpattern.templateMethod.PersonalResume1;
import com.brainbg.designpattern.templateMethod.PersonalResume2;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail
 *     time   : 2019/08/03
 *     desc   : 原型模式使用
 * </pre>
 */
public class PrototypeActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_produceContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);
        setTitle("原型模式");
        initView();
    }

    private void initView() {
        findViewById(R.id.btn_create_resume1).setOnClickListener(this);
        findViewById(R.id.btn_create_resume2).setOnClickListener(this);
        tv_produceContent = findViewById(R.id.tv_produce_content);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_create_resume1:
                PersonalResume1 pr1 = new PersonalResume1();

                tv_produceContent.setText(pr1.createResume());
                break;

            case R.id.btn_create_resume2:
                PersonalResume2 pr2 = new PersonalResume2();
                tv_produceContent.setText(pr2.createResume());
                break;
        }

    }
}
