package com.study.zhai.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<VpItemBean> list = new ArrayList<>();
        VpItemBean bean = new VpItemBean();
        bean.setDesc("1111");
        bean.setImgResId(R.drawable.splash);
        bean.setTestColorResId(R.color.colorAccent);
        bean.setVisible(View.VISIBLE);

        VpItemBean bean2 = new VpItemBean();
        bean2.setDesc("2222");
        bean2.setImgResId(R.drawable.ic_launcher);
        bean2.setTestColorResId(R.color.colorPrimary);
        bean2.setVisible(View.GONE);

        list.add(bean);
        list.add(bean2);

        ViewPager2 viewPager2 = findViewById(R.id.viewpager);
        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
        MyAdapter adapter = new MyAdapter(list, this);
        viewPager2.setAdapter(adapter);

    }
}
