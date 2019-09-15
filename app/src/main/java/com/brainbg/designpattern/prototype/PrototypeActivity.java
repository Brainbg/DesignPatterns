package com.brainbg.designpattern.prototype;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.brainbg.designpattern.R;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail
 *     time   : 2019/08/03
 *     desc   : 原型模式使用
 * </pre>
 */
public class PrototypeActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_test_content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);
        setTitle("原型模式");
        initView();
    }

    private void initView() {
        findViewById(R.id.btn_test_clone).setOnClickListener(this);
        tv_test_content = findViewById(R.id.tv_test_content);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_test_clone:
                Prototype prototype = new Prototype();
                try {
                    prototype.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }

                break;
        }

    }
}
