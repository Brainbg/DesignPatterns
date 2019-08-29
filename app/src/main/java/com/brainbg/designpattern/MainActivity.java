package com.brainbg.designpattern;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.brainbg.designpattern.abstractFactory.AbstractFactoryActivity;
import com.brainbg.designpattern.builder.BuilderActivity;
import com.brainbg.designpattern.factoryMethod.FactoryActivity;
import com.brainbg.designpattern.simpleFactory.SimpleFactoryActivity;
import com.brainbg.designpattern.templateMethod.TemplateMethodActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        findViewById(R.id.btn_simple_factory).setOnClickListener(this);
        findViewById(R.id.btn_factory).setOnClickListener(this);
        findViewById(R.id.btn_abstact_factory).setOnClickListener(this);
        findViewById(R.id.btn_builder).setOnClickListener(this);
        findViewById(R.id.btn_prototype).setOnClickListener(this);

        findViewById(R.id.btn_template_method).setOnClickListener(this);

//        new AlertDialog.Builder(mContext).setIcon()
//                .setIconAttribute()
//                .setCancelable()
//                .setMessage()
//                .setMultiChoiceItems()
//                .create();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_simple_factory: //简单工厂模式
                startActivity(new Intent(mContext, SimpleFactoryActivity.class));
                break;
            case R.id.btn_factory://工厂方法模式
                startActivity(new Intent(mContext, FactoryActivity.class));
                break;
            case R.id.btn_abstact_factory://抽象工厂模式
                startActivity(new Intent(mContext, AbstractFactoryActivity.class));
                break;

            case R.id.btn_builder://建造者模式
                startActivity(new Intent(mContext, BuilderActivity.class));
                break;

            case R.id.btn_prototype://建造者模式
                startActivity(new Intent(mContext, BuilderActivity.class));
                break;

            case R.id.btn_template_method://模板方法模式
                startActivity(new Intent(mContext, TemplateMethodActivity.class));
                break;
        }
    }
}
