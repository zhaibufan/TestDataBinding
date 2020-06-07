package com.study.zhai.test;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

/**
 * DataBinding自定义属性
 *
 * View的有些属性通过databinding进行设置不生效，这个时候需要通过自定义属性来使其生效,
 * 这个自定义属性的方法可以写在任何地方,但建议统一写在一个类中，方便维护管理
 *
 * @author zhaixiaofan
 * @date 2020-06-07 16:58
 */
public class DataBindingCustomAttr {

    @BindingAdapter({"android:background"})
    public static void setBackground(View view, int resId) {
        view.setBackgroundResource(resId);
    }

    @BindingAdapter({"android:src"})
    public static void setImagViewSrc(ImageView imageView, int resId) {
        imageView.setImageResource(resId);
    }

    @BindingAdapter({"android:textColor"})
    public static void setTextColors(TextView textView, int resId) {
        textView.setTextColor(textView.getContext().getResources().getColor(resId));
    }
}
